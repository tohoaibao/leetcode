class StudentAttendanceRecordI {

    public boolean checkRecord(String s) {
        int n = s.length();
        int nA = 0, nL = 0;
        int i = 0;
        while (i < n) {
            nA = s.charAt(i) == 'A' ? nA + 1 : nA;
            nL = s.charAt(i) == 'L' ? nL + 1 : 0;
            if (nA > 1 || nL > 2) return false;
            i++;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(new StudentAttendanceRecordI().checkRecord("LALL"));
    }
}