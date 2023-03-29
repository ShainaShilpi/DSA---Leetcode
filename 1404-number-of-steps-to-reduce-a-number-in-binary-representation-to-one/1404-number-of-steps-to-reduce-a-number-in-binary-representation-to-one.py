class Solution:
  def numSteps(self, s: str) -> int:
    ans = 0
    chars = [c for c in s]

    # All trailing 0s can be popped by 1 step.
    while chars[-1] == '0':
      chars.pop()
      ans += 1

    if ''.join(chars) == '1':
      return ans

    return ans + 1 + sum(1 if c == '1' else 2 for c in chars)