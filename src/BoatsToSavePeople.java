import java.util.Arrays;

class BoatsToSavePeople {

    // https://leetcode.com/problems/boats-to-save-people/
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count = 0;
        int i = 0, j = people.length - 1;
        while (i <= j) {
            count++;
            if (people[i] + people[j] <= limit) {
                i++;
            }
            j--;
        }
        return count;
    }

    public static void main(String[] args) {
        int[] people = {3,2,2,1};
        int limit = 3;
        System.out.println(new BoatsToSavePeople().numRescueBoats(people, limit));
    }
}