class Solution:
    def numberOfArrays(self, s: str, k: int) -> int:
        MOD = 1e9+7        
        dp = [-1]*len(s)        

        def findAns(ind):            
            '''Top down Dynamic Programming'''            
            nonlocal s, k            
           
            if ind == len(s):                
                return 1                        
            
            if s[ind] == '0':                
                return 0                        
            
            if dp[ind] != -1:                
                return dp[ind]                        
          
            num = 0            
            res = 0            
            for i in range(ind, len(s)):                
                num = (num*10) + int(s[i])                
                if 1 <= num <= k:                    
                    res = int((res + findAns(i+1))%MOD)                
                elif num > k:                    
                    break                        

            dp[ind] = res   # memoize            
            return res
        return findAns(0)
        
        
