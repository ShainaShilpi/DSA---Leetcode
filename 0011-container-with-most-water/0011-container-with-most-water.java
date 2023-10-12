class Solution {
  public int maxArea(int height[]) {
    int maxarea = 0;
    int n = height.length;
    int leftIndex = 0;
    int rightIndex = n - 1;
    while (leftIndex < rightIndex) {
        int minHeight = Math.min(height[leftIndex], height[rightIndex]);
        maxarea = Math.max(maxarea, (rightIndex - leftIndex) * minHeight);
        if(height[leftIndex] < height[rightIndex])
            leftIndex = leftIndex + 1;
        else
            rightIndex = rightIndex - 1;
        }
    return maxarea;
}
}


// class Solution {
//   public int maxArea(int[] height) {
//     int ans = 0;
//     int l = 0;
//     int r = height.length - 1;

//     while (l < r) {
//       final int minHeight = Math.min(height[l], height[r]);
//       ans = Math.max(ans, minHeight * (r - l));
//       if (height[l] < height[r])
//         ++l;
//       else
//         --r;
//     }

//     return ans;
//   }
// }
