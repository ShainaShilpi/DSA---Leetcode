class Solution {
    public int[] shortestToChar(String S, char C) {
        int num[] = new int[S.length()];
        int prev = Integer.MIN_VALUE / 2;
        for(int i = 0;i < S.length(); i++){
            if(S.charAt(i) == C){
                prev = i;
            }
            num[i] = i - prev;
        }
        prev = Integer.MAX_VALUE / 2;
        for(int j = S.length() - 1; j >= 0; j--){
            if(S.charAt(j) == C){
                prev = j;
            }
            num[j] = Math.min(num[j],prev - j);
        }
        return num;
    }
}