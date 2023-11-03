class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> operations = new ArrayList<>();
        int index = 0;

        for (int i = 1; i <= n; i++) {
            if (index == target.length) {
                break;
            }

            operations.add("Push");

            if (target[index] == i) {
                index++;
            } else {
                operations.add("Pop");
            }
        }

        return operations;
    }
}