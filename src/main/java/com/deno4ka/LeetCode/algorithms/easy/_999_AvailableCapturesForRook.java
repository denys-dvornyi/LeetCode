package com.deno4ka.LeetCode.algorithms.easy;

/*
On an 8 x 8 chessboard, there is exactly one white rook 'R' and some number of white bishops 'B', black pawns 'p', and empty squares '.'.
When the rook moves, it chooses one of four cardinal directions (north, east, south, or west), then moves in that direction until it chooses to stop,
reaches the edge of the board, captures a black pawn, or is blocked by a white bishop.
A rook is considered attacking a pawn if the rook can capture the pawn on the rook's turn.
The number of available captures for the white rook is the number of pawns that the rook is attacking.
Return the number of available captures for the white rook.

Example 1:
Input: board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","R",".",".",".","p"],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: In this example, the rook is attacking all the pawns.

Example 2:
Input: board = [[".",".",".",".",".",".",".","."],[".","p","p","p","p","p",".","."],[".","p","p","B","p","p",".","."],[".","p","B","R","B","p",".","."],[".","p","p","B","p","p",".","."],[".","p","p","p","p","p",".","."],[".",".",".",".",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 0
Explanation: The bishops are blocking the rook from attacking any of the pawns.

Example 3:
Input: board = [[".",".",".",".",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".","p",".",".",".","."],["p","p",".","R",".","p","B","."],[".",".",".",".",".",".",".","."],[".",".",".","B",".",".",".","."],[".",".",".","p",".",".",".","."],[".",".",".",".",".",".",".","."]]
Output: 3
Explanation: The rook is attacking the pawns at positions b5, d6, and f5.

Constraints:
board.length == 8
board[i].length == 8
board[i][j] is either 'R', '.', 'B', or 'p'
There is exactly one cell with board[i][j] == 'R'
*/

public class _999_AvailableCapturesForRook {

	private static final char ROOK = 'R';
	private static final char BISHOP = 'B';
	private static final char PAWN = 'p';

//	Runtime: 0 ms, faster than 100.00% & Memory Usage: 36.5 MB, less than 45.59%
	public int numRookCaptures(char[][] board) {
		int[] rookCoordinates = findRook(board);
		if (rookCoordinates == null) return 0;
		int rookCaptures = 0;
		for (int i = rookCoordinates[0]; i >= 0; i--) { // check left side from rook
			if (BISHOP == board[i][rookCoordinates[1]]) {
				break;
			} else if (PAWN == board[i][rookCoordinates[1]]) {
				rookCaptures++;
				break;
			}
		}
		for (int i = rookCoordinates[0]; i < board.length; i++) { // check right side from rook
			if (BISHOP == board[i][rookCoordinates[1]]) {
				break;
			} else if (PAWN == board[i][rookCoordinates[1]]) {
				rookCaptures++;
				break;
			}
		}
		for (int i = rookCoordinates[1]; i >= 0; i--) { // check top side from rook
			if (BISHOP == board[rookCoordinates[0]][i]) {
				break;
			} else if (PAWN == board[rookCoordinates[0]][i]) {
				rookCaptures++;
				break;
			}
		}
		for (int i = rookCoordinates[1]; i < board[rookCoordinates[0]].length; i++) { // check bottom side from rook
			if (BISHOP == board[rookCoordinates[0]][i]) {
				break;
			} else if (PAWN == board[rookCoordinates[0]][i]) {
				rookCaptures++;
				break;
			}
		}
		return rookCaptures;
	}

	private int[] findRook(char[][] board) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (ROOK == board[i][j]) {
					return new int[]{i, j};
				}
			}
		}
		return null;
	}

}
