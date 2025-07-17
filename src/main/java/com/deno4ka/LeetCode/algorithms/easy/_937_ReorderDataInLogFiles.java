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

import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class _937_ReorderDataInLogFiles {

    //	my version
//	Runtime: 13 ms, faster than 20.77% & Memory Usage: 39.9 MB, less than 36.25%
    public String[] reorderLogFiles(String[] logs) {
        if (logs == null || logs.length < 2) return logs;
        Set<Log> result = new TreeSet<>();
        int digitOrder = 1;
        for (String log : logs) {
            if ('0' <= log.charAt(log.length() - 1) && log.charAt(log.length() - 1) <= '9') {
                result.add(new DigitLog(log, digitOrder++));
            } else {
                result.add(new LetterLog(log));
            }
        }
        return result.stream().map(Log::toString).collect(Collectors.toList()).toArray(new String[]{});
    }

    private boolean isDigit(String s) {
        return Character.isDigit(s.charAt(s.length() - 1));
    }

    class Log implements Comparable<Log> {

        private final String identifier;
        private final String value;

        public Log(String log) {
            String[] logParts = log.split(" ", 2);
            this.identifier = logParts[0];
            this.value = logParts[1];
        }

        @Override
        public int compareTo(Log log) {
            if (this.getClass() == DigitLog.class && log.getClass() == LetterLog.class) {
                return 1;
            } else if (this.getClass() == LetterLog.class && log.getClass() == DigitLog.class) {
                return -1;
            } else if (this.getClass() == DigitLog.class && log.getClass() == DigitLog.class) {
                return Integer.compare(((DigitLog) this).order, ((DigitLog) log).order);
            } else {
                int result = this.value.compareTo(log.value);
                if (result == 0) {
                    result = this.identifier.compareTo(log.identifier);
                }
                return result;
            }
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


//	best from leet.code starts
//	Runtime: 2 ms, faster than 99.74% & Memory Usage: 39.1 MB, less than 95.68%
//	public String[] reorderLogFiles(String[] logs) {
//		String[] output = new String[logs.length];
//		int digitIndex = logs.length - 1;
//		int letterIndex = 0;
//		for (int i = logs.length - 1; i >= 0; --i) {
//			if (isDigit(logs[i])) {
//				output[digitIndex--] = logs[i];
//			} else {
//				output[letterIndex++] = logs[i];
//			}
//		}
//
//		// Sort letters
//		Arrays.sort(output, 0, letterIndex, (o1, o2) -> {
//			String o1Sub = o1.substring(o1.indexOf(' ') + 1);
//			String o2Sub = o2.substring(o2.indexOf(' ') + 1);
//			int diff = o1Sub.compareTo(o2Sub);
//			if (diff == 0) {
//				return o1.compareTo(o2);
//			} else {
//				return diff;
//			}
//		});
//
//		return output;
//	}

    class DigitLog extends Log {

        private final int order;

        public DigitLog(String log, int order) {
            super(log);
            this.order = order;
        }
    }

}
