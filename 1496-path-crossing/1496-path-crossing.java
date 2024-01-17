class Solution {

    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
      
        for (int index = 0; index < path.length(); ++index) {
            char direction = path.charAt(index);
          
            switch (direction) {
                case 'N':
                    y--;
                    break;
                case 'S':
                    y++;
                    break;
                case 'E':
                    x++;
                    break;
                case 'W':
                    x--;
                    break;
            }
          
            int hash = y * 20000 + x;
          
            if (!visited.add(hash)) {
                return true;
            }
        }
      
        return false;
    }
}