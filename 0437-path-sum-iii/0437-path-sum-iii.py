# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
from collections import defaultdict

# Definition for a binary tree node.
class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

class Solution(object):
    def pathSum(self, root, targetSum):
        self.count = 0
        summ = 0
        sumMap = defaultdict(int)

        def traverseTree(curr, summ):
            if not curr:
                return
            
            summ += curr.val
            
            if summ == targetSum :
                self.count += 1

            if sumMap.get(summ - targetSum):
                self.count += sumMap[summ - targetSum]

            sumMap[summ] += 1
            
            traverseTree(curr.left, summ)
            traverseTree(curr.right, summ)


            if sumMap.get(summ):
                sumMap[summ] -= 1


        traverseTree(root, 0)
        return self.count