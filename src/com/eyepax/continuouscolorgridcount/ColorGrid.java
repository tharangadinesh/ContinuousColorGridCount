package com.eyepax.continuouscolorgridcount;

import java.util.Random;

public class ColorGrid {

	static Random random = new Random();

	private int col;
	private int row;
	private int colorCount;

	public ColorGrid(int col, int row, int colorCount) {
		super();
		this.col = col;
		this.row = row;
		this.colorCount = colorCount;
	}

	public String[][] createGrid() {

		String grid [][] = new String[row][col];
		String[] mColors = getColors(colorCount);

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				grid[i][j] = mColors[random.nextInt(mColors.length)];
			}
		}

		return grid;
	}

	// Method (abilities: things the object can do)
	private String[] getColors(int colorCount) {

		String[] mColors = new String[colorCount];

		for (int i = 0; i < colorCount; i++) {
			mColors[i] = String.format("#%06x", random.nextInt(256*256*256));
		}

		return mColors;
	}
}
