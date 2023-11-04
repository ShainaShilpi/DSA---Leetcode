class Solution {
    public int getLastMoment(int n, int[] left, int[] right) {
        int maxLeft = 0;
        int maxRight = 0;
    
        for (int ant : left) {
            maxLeft = Math.max(maxLeft, ant);
        }

        for (int ant : right) {
            maxRight = Math.max(maxRight, n - ant);
        }

        return Math.max(maxLeft, maxRight);
    }
}