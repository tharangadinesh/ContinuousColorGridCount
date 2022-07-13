package com.eyepax.continuouscolorgridcount;

public class ColorGridCounter {

	private int rows;
	private int cols;

	private String visited[][];
	private String result[][];

	private int COUNT = 0;

	public ColorGridCounter() {}

	public ColorGridCounter(int rows, int cols) {
		super();
		this.rows = rows;
		this.cols = cols;
		this.visited = new String [rows][cols];;
		this.result = new String [rows][cols];;
	}

	public static void count(String grid [][], int row, int col) {

		ColorGridCounter colorGridCounter = new ColorGridCounter(row, col);

		colorGridCounter.largestRegion(grid);

	}

	private void largestRegion(String[][] grid) {

		String currentColor = "";

		for (int i = 0; i < rows; i++){

			for (int j = 0; j < cols; j++){

				if (!currentColor.isEmpty()) {

					if (!currentColor.equals( grid[i][j] )) {
						currentColor = grid[i][j];
						COUNT = 0;
						restResult();
					} else {
						COUNT++;
						result[i][j] = currentColor;
					}

				} else {
					currentColor = grid[i][j];
					COUNT++;
					result[i][j] = currentColor;
				}
			}
		}

		print();
	}

	private void restResult() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				result[i][j] = ".";
			}
		}
	}

	private void resetVisited() {
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				visited[i][j] = ".";
			}
		}
	}

	private void print() {

	}

}
