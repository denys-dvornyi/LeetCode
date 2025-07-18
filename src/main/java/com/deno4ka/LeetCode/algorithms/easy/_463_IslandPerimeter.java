package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given a map in form of a two-dimensional integer grid where 1 represents land and 0 represents water.
Grid cells are connected horizontally/vertically (not diagonally).
The grid is completely surrounded by water, and there is exactly one island (i.e., one or more connected land cells).
The island doesn't have "lakes" (water inside that isn't connected to the water around the island).
One cell is a square with side length 1. The grid is rectangular, width and height don't exceed 100. Determine the perimeter of the island.

Example:
Input:
[[0,1,0,0],
 [1,1,1,0],
 [0,1,0,0],
 [1,1,0,0]]
Output: 16
*/

public class _463_IslandPerimeter {

    public int islandPerimeter(int[][] grid) {
        int result = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                int landCounter = 0;
                if (grid[i][j] == 1) {
                    if (j - 1 < 0 || grid[i][j - 1] == 0) { // check left
                        landCounter++;
                    }
                    if (i - 1 < 0 || grid[i - 1][j] == 0) { // check up
                        landCounter++;
                    }
                    if (j + 1 > grid[i].length - 1 || grid[i][j + 1] == 0) { // check right
                        landCounter++;
                    }
                    if (i + 1 > grid.length - 1 || grid[i + 1][j] == 0) { // check down
                        landCounter++;
                    }
                    result += landCounter;
                }
            }
        }
        return result;
    }

}