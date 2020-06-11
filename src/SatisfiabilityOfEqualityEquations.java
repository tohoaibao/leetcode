class SatisfiabilityOfEqualityEquations {

    // https://leetcode.com/problems/satisfiability-of-equality-equations/
    /*
        We can solve this problem by DFS or Union Find.

        First pass all "==" equations.
        Union equal letters together
        Now we know which letters must equal to the others.

        Second pass all "!=" inequations,
        Check if there are any contradict happens.
     */

    int[] uf = new int[26];
    public boolean equationsPossible(String[] equations) {
        for (int i = 0; i < 26; i++) {
            uf[i] = i;
        }
        for (String e: equations) {
            if (e.charAt(1) == '=') {
                uf[find(e.charAt(0) - 'a')] = find(e.charAt(3) - 'a');
            }
        }
        for (String e: equations) {
            if (e.charAt(1) == '!' &&
                    find(e.charAt(0)-'a') == find(e.charAt(3) - 'a')) {
                return false;
            }
        }

        return true;
    }

    private int find(int x) {
        if (x != uf[x]) {
            uf[x] = find(uf[x]);
        }
        return uf[x];
    }

    public static void main(String[] args) {
        String[] input = {"a==b","b==c","a==c"};
        System.out.println(new SatisfiabilityOfEqualityEquations().equationsPossible(input));
    }
}