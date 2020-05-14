
public class ContainerWithMostWater {

    public int maxArea(int[] height) {
        int n = height.length;
        int maxArea = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            int w = r - l;
            int h = Math.min(height[l], height[r]);
            maxArea = Math.max(maxArea, w*h);
            if (height[l] < height[r]) {
                l++;
            } else {
                r--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
        int arr[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(new ContainerWithMostWater().maxArea(arr));
    }
}
