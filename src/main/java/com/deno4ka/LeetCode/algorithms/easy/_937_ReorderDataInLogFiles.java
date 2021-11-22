package com.deno4ka.LeetCode.algorithms.easy;

/*
You are given an array of logs. Each log is a space-delimited string of words, where the first word is the identifier.
There are two types of logs:
Letter-logs: All words (except the identifier) consist of lowercase English letters.
Digit-logs: All words (except the identifier) consist of digits.
Reorder these logs so that:
The letter-logs come before all digit-logs.
The letter-logs are sorted lexicographically by their contents.
If their contents are the same, then sort them lexicographically by their identifiers.
The digit-logs maintain their relative ordering.
Return the final order of the logs.

Example 1:
Input: logs = ["dig1 8 1 5 1","let1 art can","dig2 3 6","let2 own kit dig","let3 art zero"]
Output: ["let1 art can","let3 art zero","let2 own kit dig","dig1 8 1 5 1","dig2 3 6"]
Explanation:
The letter-log contents are all different, so their ordering is "art can", "art zero", "own kit dig".
The digit-logs have a relative order of "dig1 8 1 5 1", "dig2 3 6".

Example 2:
Input: logs = ["a1 9 2 3 1","g1 act car","zo4 4 7","ab1 off key dog","a8 act zoo"]
Output: ["g1 act car","a8 act zoo","ab1 off key dog","a1 9 2 3 1","zo4 4 7"]

Constraints:
1 <= logs.length <= 100
3 <= logs[i].length <= 100
All the tokens of logs[i] are separated by a single space.
logs[i] is guaranteed to have an identifier and at least one word after the identifier.
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class _937_ReorderDataInLogFiles {

	public String[] reorderLogFiles(String[] logs) {
		if (logs == null || logs.length < 2) return logs;
		Set<Log> result = new TreeSet<>();
		for (String log : logs) {
			if ('0' <= log.charAt(log.length() - 1) && log.charAt(log.length() - 1) <= '9') {
				result.add(new DigitLog(log));
			} else {
				result.add(new LetterLog(log));
			}
		}
		return result.stream().map(Log::toString).collect(Collectors.toList()).toArray(new String[]{});
	}

	class Log implements Comparable<Log> {

		private String identifier;
		private String value;

		public Log(String log) {
			String[] logParts = log.split(" ", 2);
			this.identifier = logParts[0];
			this.value = logParts[1];
		}

		@Override
		public int compareTo(Log log) {
			if (log.getClass() == LetterLog.class) {
				return 1;
			}
			return 0;
		}

		@Override
		public String toString() {
			return identifier + " " + value;
		}
	}

	class LetterLog extends Log {
		public LetterLog(String log) {
			super(log);
		}
	}

	class DigitLog extends Log {
		public DigitLog(String log) {
			super(log);
		}
	}

}
