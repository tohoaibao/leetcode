class RectangleOverlap {

    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        return !(rec1[2] <= rec2[0] ||   // left
                rec1[3] <= rec2[1] ||   // bottom
                rec1[0] >= rec2[2] ||   // right
                rec1[1] >= rec2[3]);    // top
    }

    public static void main(String[] args) {
//        int[] rec1 = {0,0,2,2}, rec2 = {1,1,3,3};
//        int[] rec1 = {0,0,1,1}, rec2 = {1,0,2,1};
        int[] rec1 = {11,12,13,13}, rec2 = {17,1,17,19};
        System.out.println(new RectangleOverlap().isRectangleOverlap(rec1, rec2));
    }
}