
class MinimumScoreTriangulationOfPolygon {
    public int minScoreTriangulation(int[] A) {
        int l=A.length;
        int[][] dp = new int[l][l];
        for(int i = l-3; i >= 0; i--){
            for(int j = i+2; j < l; j++){
                for(int k = i+1; k < j; k++){
                    if(dp[i][j] == 0)
                        dp[i][j] = dp[i][k] + dp[k][j] + A[i]*A[j]*A[k];
                    else
                        dp[i][j] = Math.min(dp[i][k] + dp[k][j] + A[i]*A[j]*A[k], dp[i][j]);
                }
            }
        }
        return dp[0][l-1];
    }

    public static void main(String[] args) {
        int A[] = {3,7,4,5};
        System.out.println(new MinimumScoreTriangulationOfPolygon().minScoreTriangulation(A));
    }
}