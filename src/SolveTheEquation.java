class SolveTheEquation {

    // https://leetcode.com/problems/solve-the-equation/
    public String solveEquation(String equation) {
        String[] exp = equation.split("=");
        int[] left = evaluateExpression(exp[0]);
        int[] right = evaluateExpression(exp[1]);
        // ax = b;
        int a = left[0] - right[0];
        int b = right[1] - left[1];
        if (a == 0 && b == 0) return "Infinite solutions";
        if (a == 0) return "No solution";
        return String.format("x=%d",b/a);
    }

    private int[] evaluateExpression(String exp) {
        // ax + b
        int a = 0, b = 0;
        String[] tokens = exp.split("(?=[+-])");
        for (String t : tokens) {
            if (t.equals("+x") || t.equals("x")) a += 1;
            else if (t.equals("-x")) a -= 1;
            else if (t.contains("x")) a += Integer.parseInt(t.substring(0, t.indexOf("x")));
            else b += Integer.parseInt(t);
        }
        return new int[]{a, b};
    }

    public static void main(String[] args) {
        String s = "x+5-3+x=6+x-2";
        s = "x=x";
        s = "2x=x";
        s = "2x+3x-6x=x+2";
        s = "x=x+2";
        System.out.println(new SolveTheEquation().solveEquation(s));
    }
}