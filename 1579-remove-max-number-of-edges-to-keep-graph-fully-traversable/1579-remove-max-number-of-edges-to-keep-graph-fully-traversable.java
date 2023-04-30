class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
    Arrays.sort(edges, (a, b) -> b[0] - a[0]);
    UF A = new UF(n);
    UF B = new UF(n);
    int res = 0;
    for(int[] edge : edges){
        if(edge[0] == 3){
            //alice and bob
            boolean a = A.union(edge[1] - 1, edge[2] - 1);
            boolean b = B.union(edge[1] - 1, edge[2] - 1); 
            if(!a && !b){
                res++;
            }
        }else if(edge[0] == 2){
            //bob
            if(!B.union(edge[1] - 1, edge[2] - 1)){
                res++;
            }
        }else{
            //alice
            if(!A.union(edge[1] - 1, edge[2] - 1)){
                res++;
            }
        }
    }
    return B.united() && A.united() ? res : -1;
}

class UF{
    int count;
    int[] arr;
    public UF(int n){
        count = n;
        arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = i;
        }
    }

    int find(int a){
        if(a != arr[a]){
            arr[a] = find(arr[a]);
        }
        return arr[a];
    }

    boolean union(int a, int b){
        if(find(a) != find(b)){
            arr[find(a)] = find(b);
            count--;
            return true;
        }
        return false;
    }

    boolean united(){
        return count == 1;
    }
}
}