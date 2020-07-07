import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class CourseScheduleI {

    // https://leetcode.com/problems/course-schedule/
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // adjacency list
        List<Integer>[] graph = new ArrayList[numCourses];
        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        int[] indegree = new int[numCourses];
        for (int[] e : prerequisites) {
            graph[e[0]].add(e[1]);
            indegree[e[1]]++;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }

        // BFS traversal until finish all course or can't take more courses
        while (!q.isEmpty()) {
            int node = q.poll();
            for (int c : graph[node]) {
                indegree[c]--;
                if (indegree[c] == 0) {
                    q.add(c);
                }
            }
            numCourses--;
        }

        return numCourses == 0;
    }

    public static void main(String[] args) {
        int n = 4;
        int[][] prerequisites ={{1,0},{2,0},{3,1},{3,2}};
        System.out.println(new CourseScheduleI().canFinish(n, prerequisites));
    }
}