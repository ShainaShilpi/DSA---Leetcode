class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        combineHelper(1, n, k, current, result);
        return result;
    }

    private void combineHelper(int start, int n, int k, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            combineHelper(i + 1, n, k - 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Solution combinations = new Solution();
        int n1 = 4, k1 = 2;
        System.out.println(combinations.combine(n1, k1));

        int n2 = 1, k2 = 1;
        System.out.println(combinations.combine(n2, k2));
    }
}