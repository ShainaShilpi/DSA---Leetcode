class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> list = new ArrayList<>(stones.length);
        for(int s : stones) list.add(s);
        while(list.size() > 1){
            Collections.sort(list);
            int a = list.remove(list.size() - 1);
            int b = list.remove(list.size() - 1);
            if(a != b){
                a -= b;
                list.add(a);
            }
        }
        return list.size() == 0 ? 0 : list.get(0);
    }
}