class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        generateSubsets(nums, 0, current, result);
        return result;
    }

    private void generateSubsets(int[] nums, int index, List<Integer> current, List<List<Integer>> result) {
        result.add(new ArrayList<>(current));

        for (int i = index; i < nums.length; i++) {
            current.add(nums[i]);
            generateSubsets(nums, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter the unique elements one by one:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        Solution subsets = new Solution();
        List<List<Integer>> result = subsets.subsets(nums);

        System.out.println("All possible subsets:");
        for (List<Integer> subset : result) {
            System.out.println(subset);
        }
    }
}