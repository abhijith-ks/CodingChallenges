package io.abhijith.challenges;

/**
 * You are given a m*n 2D grid initialized with these three possible values.
 * -1 -> A wall or an obstacle
 * 0 -> A gate
 * INF -> Infinity means an empty room.
 * 
 * Fill each empty room with the distance to its nearest gate.
 * If it is impossible to reach a gate, it should be filled with INF
 * 
 * @author i332773
 *
 */

public class WallsAndGates {
	
	int INF = Integer.MAX_VALUE;
	
	int[][] grid = new int[][] {{INF, -1, 0, INF},
								{INF, INF, INF, -1},
								{INF, -1, INF, -1},
								{0, -1, INF, INF}};
	
	public void findSolution() {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[i].length; j++) {
				if(grid[i][j] == 0) {
					dfs(i,j,0);
				}
			}
		}
		
		for(int i = 0; i < grid.length; i++) {
			System.out.println();
			for(int j = 0; j < grid[i].length; j++) {
				System.out.print(grid[i][j] + " ");
			}
		}
	}
	
	public void dfs(int i, int j, int sum) {
		
		if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] < sum) {
			return;
		}
		
		grid[i][j] = Math.min(grid[i][j], sum);
		
		sum += 1;
		dfs(i + 1, j, sum);
		dfs(i - 1, j, sum);
		dfs(i, j + 1, sum);
		dfs(i, j - 1, sum);
		
	}

}
