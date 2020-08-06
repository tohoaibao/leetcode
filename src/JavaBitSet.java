import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSet {

    // https://www.hackerrank.com/challenges/java-bitset/problem
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        BitSet b1 = new BitSet(N);
        BitSet b2 = new BitSet(M);
        BitSet[] bitSets = new BitSet[3];
        bitSets[1] = b1;
        bitSets[2] = b2;
        while (M-- > 0) {
            String op = sc.next();
            int x = sc.nextInt();
            int y = sc.nextInt();
            switch (op) {
                case "AND":
                    bitSets[x].and(bitSets[y]);
                    break;
                case "OR":
                    bitSets[x].or(bitSets[y]);
                    break;
                case "XOR":
                    bitSets[x].xor(bitSets[y]);
                    break;
                case "FLIP":
                    bitSets[x].flip(y);
                    break;
                case "SET":
                    bitSets[x].set(y);
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
        sc.close();
    }
}