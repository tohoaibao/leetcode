class DayOfTheWeek {

    /*
        String A[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month - 1, day);
        int index = calendar.get(Calendar.DAY_OF_WEEK);
        return A[index-1];
     */
    public String dayOfTheWeek(int day, int month, int year) {
        String weekDays[] = {"Friday", "Saturday","Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        int monthDays[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int days = 0;

        for (int i = 1971; i < year; i++) {
            days += isLeapYear(i) ? 366 : 365;
        }

        if (isLeapYear(year)) {
            monthDays[1] = 29;
        }
        for (int i = 1; i < month; i++) {
            days += monthDays[i - 1];
        }

        days += day - 1;

        return weekDays[days%7];
    }

    private boolean isLeapYear(int year) {
        return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
    }

    public static void main(String[] args) {
        System.out.println(new DayOfTheWeek().dayOfTheWeek(30, 5, 2020));
    }
}