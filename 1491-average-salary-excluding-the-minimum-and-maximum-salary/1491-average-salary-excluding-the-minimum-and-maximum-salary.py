class Solution:
    def average(self, salary: List[int]) -> float:
        
        max_salary = max(salary)
        
        min_salary = min(salary)
        
        salary_sum = 0
        count = 0
        for s in salary:
            if s != min_salary and s != max_salary:
                salary_sum += s
                count += 1
                
        
        return salary_sum / count 