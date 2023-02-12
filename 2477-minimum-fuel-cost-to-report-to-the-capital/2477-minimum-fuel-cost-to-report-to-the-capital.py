class Solution:
    def minimumFuelCost(self, roads: List[List[int]], seats: int) -> int:
        graph = defaultdict(list)
        for a, b in roads:
            graph[a].append(b)
            graph[b].append(a)
        ans = [0]
        
        def dfs(curr: int, prev: int) -> int:
            people = 1
            for neighbor in graph[curr]:
                if neighbor == prev:
                    continue
                people += dfs(neighbor, curr)
            ans[0] += (people+ seats - 1) // seats if curr != 0 else 0 
            return people
        
        _ = dfs(0, 0)
        return ans[0]
