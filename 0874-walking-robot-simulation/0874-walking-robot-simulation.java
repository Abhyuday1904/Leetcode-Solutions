class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        int[][] dirs = {{1, 0}, {0, -1}, {-1, 0}, {0, 1}};
        Set<String> obstacleSet = new HashSet<>();

        for (int[] obs : obstacles) {
            obstacleSet.add(obs[0] + "," + obs[1]);
        }

        int idx = 3, x = 0, y = 0, res = 0;

        for (int e : commands) {
            if (e == -2) {
                idx = (3 + idx) % 4;
            } else if (e == -1) {
                idx = (1 + idx) % 4;
            } else {
                int dx = dirs[idx][0], dy = dirs[idx][1];
                for (int dis = 0; dis < e; ++dis) {
                    int nx = x + dx, ny = y + dy;
                    String k = nx + "," + ny;
                    if (obstacleSet.contains(k)) break;
                    x = nx;
                    y = ny;
                    res = Math.max(res, x * x + y * y);
                }
            }
        }

        return res;
    }
}