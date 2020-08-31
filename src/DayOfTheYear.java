class DayOfTheYear {
    // https://leetcode.com/problems/day-of-the-year/
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8));
        int[] A = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
        int ans = A[month-1] + day;
        if(month > 2 && year%4==0 && (year%100!=0 || year%400==0)) ans++;
        return ans;
    }

    public static void main(String[] args) {
        String date = "2019-02-10";
        date = "2003-03-01";
        date = "2004-03-01";
        System.out.println(new DayOfTheYear().dayOfYear(date));
    }
}