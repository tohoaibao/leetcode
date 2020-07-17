import java.util.*;

class Twitter {

    /** Initialize your data structure here. */
    private static int timeStamp = 0;
    private Map<Integer, User> userMap;
    public Twitter() {
        userMap = new HashMap<>();
    }

    /** Compose a new tweet. */
    public void postTweet(int userId, int tweetId) {
        if (!userMap.containsKey(userId)) {
            User user = new User(userId);
            userMap.put(userId, user);
        }
        userMap.get(userId).post(tweetId);
    }

    /** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
    public List<Integer> getNewsFeed(int userId) {
        List<Integer> res = new ArrayList<>();
        if (!userMap.containsKey(userId)) return res;

        Set<Integer> users = userMap.get(userId).followedSet;
        PriorityQueue<Tweet> q = new PriorityQueue<>((a, b) -> b.time - a.time);
        for (int user : users) {
            Tweet t = userMap.get(user).tweetHead;
            if (t != null) {
                q.add(t);
            }
        }
        int i = 0;
        while (!q.isEmpty() && i < 10) {
            Tweet t = q.poll();
            res.add(t.id);
            if (t.next != null) {
                q.add(t.next);
            }
            i++;
        }

        return res;
    }

    /** Follower follows a followee. If the operation is invalid, it should be a no-op. */
    public void follow(int followerId, int followeeId) {
        if (!userMap.containsKey(followerId)) {
            User user = new User(followerId);
            userMap.put(followerId, user);
        }
        if (!userMap.containsKey(followeeId)) {
            User user = new User(followeeId);
            userMap.put(followeeId, user);
        }
        userMap.get(followerId).follow(followeeId);
    }

    /** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
    public void unfollow(int followerId, int followeeId) {
        if (userMap.containsKey(followerId)) {
            userMap.get(followerId).unfollow(followeeId);
        }
    }

    // OO design so User can follow, unfollow and post itself
    public class User {
        public int id;
        public Set<Integer> followedSet;
        public Tweet tweetHead;

        public User(int id) {
            this.id = id;
            this.followedSet = new HashSet<>();
            this.tweetHead = null;
            //follow itself
            follow(id);
        }

        // everytime user post a new tweet, add it to the head of tweet list.
        public void post(int tweetId) {
            Tweet tweet = new Tweet(tweetId);
            tweet.next = tweetHead;
            tweetHead = tweet;
        }

        public void follow(int id) {
            followedSet.add(id);
        }

        public void unfollow(int id) {
            if (id == this.id) return;
            followedSet.remove(id);
        }
    }

    // Tweet link to next Tweet so that we can save a lot of time
    // when we execute getNewsFeed(userId)
    private class Tweet {
        public int id;
        public int time;
        public Tweet next;

        public Tweet(int id) {
            this.id = id;
            this.time = timeStamp++;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Twitter twitter = new Twitter();
        twitter.postTweet(1, 5);
        twitter.unfollow(1, 1);
        System.out.println(Arrays.toString(twitter.getNewsFeed(1).toArray()));
    }
}

/**
 * Your Twitter object will be instantiated and called as such:
 * Twitter obj = new Twitter();
 * obj.postTweet(userId,tweetId);
 * List<Integer> param_2 = obj.getNewsFeed(userId);
 * obj.follow(followerId,followeeId);
 * obj.unfollow(followerId,followeeId);
 */