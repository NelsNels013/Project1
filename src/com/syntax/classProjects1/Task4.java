package com.syntax.classProjects1;

public class Task4 {
	
	public static void main(String[] args) {
		
		int[][] num = { { 10, 12, 85, 36 }, { 51, 11, 52 }, { 100, 150, 165 } };

				for (int i = 0; i < num.length; i++) {
					for (int j = 0; j < num[i].length; j++) {
						if (num[i][j] % 2 == 0) {
							System.out.print(num[i][j] + " ");
						}
					}
				}
	}
}
