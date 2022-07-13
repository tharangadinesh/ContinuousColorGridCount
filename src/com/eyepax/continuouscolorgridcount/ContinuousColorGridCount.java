package com.eyepax.continuouscolorgridcount;

import java.util.Scanner;

public class ContinuousColorGridCount {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int rows = scan.nextInt();
		int cols = scan.nextInt();
		int colorCount = scan.nextInt();

		ColorGrid colorGrid = new ColorGrid(rows, cols, colorCount);

		String grid [][] = colorGrid.createGrid();

		ColorGridCounter.count(grid, rows, cols);

		scan.close();

	}


}
