package techiedelight;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SortElementByFrequentlyAndIndex {

    // http://www.techiedelight.com/sort-elements-by-their-frequency-and-index/
    public void sortByFrequentlyAndIndex(int[] A) {
        if (A == null || A.length < 2) return;
        Map<Integer, Data> map = new HashMap<>();
        for (int i = 0; i < A.length; i++) {
            Data data = map.get(A[i]);
            if (data != null) {
                data.freq++;
            } else {
                map.put(A[i], new Data(A[i], 1, i));
            }
        }

        Data[] values = map.values().toArray(new Data[0]);
        Arrays.sort(values);

        int idx = 0;
        for (Data d : values) {
            while (d.freq-- > 0) {
                A[idx++] = d.value;
            }
        }
    }

    class Data implements Comparable<Data>{
        int value, freq, idx;
        public Data(int value, int freq, int idx) {
            this.value = value;
            this.freq = freq;
            this.idx = idx;
        }

        @Override
        public int compareTo(Data o) {
            // diff freq -> more coming first
            if (this.freq != o.freq) {
                return o.freq - this.freq;
            }

            // same freq -> less idx coming first
            return this.idx - o.idx;
        }
    }

    public static void main(String[] args) {
        int[] A = {3, 3, 1, 1, 1, 8, 3, 6, 8, 7, 8};
        new SortElementByFrequentlyAndIndex().sortByFrequentlyAndIndex(A);
        System.out.println(Arrays.toString(A));
    }
}