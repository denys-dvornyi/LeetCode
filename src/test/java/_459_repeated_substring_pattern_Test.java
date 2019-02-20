import com.deno4ka.LeetCode.algorithms.easy._459_repeated_substring_pattern;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Repeated Substring Pattern #459")
public class _459_repeated_substring_pattern_Test {

	private _459_repeated_substring_pattern repeatedSubstringPattern = new _459_repeated_substring_pattern();

//	@Test
	void testNull() {
		assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(null));
	}

//	@Test
	void testEmpty() {
		assertFalse(repeatedSubstringPattern.repeatedSubstringPattern(""));
	}

//	@Test
	void testOneLetterWord() {
		assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("a"));
		assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("b"));
		assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("z"));
	}

//	@Test
	void testExampleOne() {
		assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("abab"));
	}

//	@Test
	void testExampleTwo() {
		assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("aba"));
	}

//	@Test
	void testExampleThree() {
		assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("abcabcabcabc"));
	}

//	@Test
	void testExampleFour() {
		assertFalse(repeatedSubstringPattern.repeatedSubstringPattern("abac"));
	}

	@Test
	void testExampleFive() {
		assertTrue(repeatedSubstringPattern.repeatedSubstringPattern("ababab"));
	}

}