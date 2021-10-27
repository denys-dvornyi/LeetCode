package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _748_ShortestCompletingWordTest {

	private final _748_ShortestCompletingWord shortestCompletingWord = new _748_ShortestCompletingWord();

	@DisplayName("Return the shortest completing word in words")
	@ParameterizedTest(name = "test #{index}: licensePlate \"{0}\", words \"{1}\", expected \"{2}\"")
	@MethodSource({"useCases"})
	public void shortestCompletingWord(String licensePlate, String[] words, String expected) {
		Assertions.assertEquals(expected, shortestCompletingWord.shortestCompletingWord(licensePlate, words));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of("1s3 PSt", new String[]{"step","steps","stripe","stepple"}, "steps"),
				Arguments.of("1s3 456", new String[]{"looks","pest","stew","show"}, "pest"),
				Arguments.of("Ah71752", new String[]{"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"}, "husband"),
				Arguments.of("OgEu755", new String[]{"enough","these","play","wide","wonder","box","arrive","money","tax","thus"}, "enough"),
				Arguments.of("iMSlpe4", new String[]{"claim","consumer","student","camera","public","never","wonder","simple","thought","use"}, "simple")
		);
	}

}
