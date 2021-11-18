package com.deno4ka.LeetCode.algorithms.easy;

/*
In a deck of cards, each card has an integer written on it.
Return true if and only if you can choose X >= 2 such that it is possible to split the entire deck into 1 or more groups of cards, where:
Each group has exactly X cards.
All the cards in each group have the same integer.

Example 1:
Input: deck = [1,2,3,4,4,3,2,1]
Output: true
Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].

Example 2:
Input: deck = [1,1,1,2,2,2,3,3]
Output: false
Explanation: No possible partition.

Example 3:
Input: deck = [1]
Output: false
Explanation: No possible partition.

Example 4:
Input: deck = [1,1]
Output: true
Explanation: Possible partition [1,1].

Example 5:
Input: deck = [1,1,2,2,2,2]
Output: true
Explanation: Possible partition [1,1],[2,2],[2,2].

Constraints:
1 <= deck.length <= 10(4)
0 <= deck[i] < 10(4)
*/

public class _914_XOfAKindInADeckOfCards {

	private static final int MAX_DECK_SIZE = 10_000;

//	Runtime: 2 ms, faster than 99.58% & Memory Usage: 39.4 MB, less than 54.03%
	public boolean hasGroupsSizeX(int[] deck) {
		if (deck.length < 2) return false;
		int[] cardGroups = new int[MAX_DECK_SIZE];
		for (int card : deck) {
			cardGroups[card]++;
		}
		int minCardsInGroup = MAX_DECK_SIZE;
		for (int card : deck) {
			minCardsInGroup = Math.min(minCardsInGroup, cardGroups[card]);
		}
		int commonDivisor = 2;
		boolean hasCommonDivisor;
		while (commonDivisor <= minCardsInGroup) {
			hasCommonDivisor = true;
			for (int cardGroup : cardGroups) {
				if (cardGroup == 1) {
					return false;
				} else if (cardGroup > 1) {
					if (cardGroup % commonDivisor != 0) {
						commonDivisor++;
						hasCommonDivisor = false;
						break;
					}
				}
			}
			if (hasCommonDivisor) {
				return true;
			}
		}
		return false;
	}

}
