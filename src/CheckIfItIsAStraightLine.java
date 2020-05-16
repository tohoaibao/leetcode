
public class CheckIfItIsAStraightLine {


    public boolean checkStraightLine(int[][] coordinates) {
        int n = coordinates.length;
        if (n <= 2) {
            return true;
        }

        int a = coordinates[0][1] - coordinates[1][1];
        int b = -(coordinates[0][0] - coordinates[1][0]);

        int x0 = coordinates[0][0];
        int y0 = coordinates[0][1];
        for (int i = 2; i < n; i++) {
            int x = coordinates[i][0];
            int y = coordinates[i][1];
            int fx = a*(x - x0) + b*(y - y0);

            if (fx != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int coordinates[][] = {{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}};
//        int coordinates[][] = {{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}};

        System.out.println(new CheckIfItIsAStraightLine().checkStraightLine(coordinates));
    }
}
