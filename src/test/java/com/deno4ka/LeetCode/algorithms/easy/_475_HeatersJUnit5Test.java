package com.deno4ka.LeetCode.algorithms.easy;

import com.deno4ka.LeetCode.model.Heaters;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.stream.Stream;


public class _475_HeatersJUnit5Test {

	private _475_Heaters heatersImpl = new _475_Heaters();

	@DisplayName("Should find minimum radius")
	@ParameterizedTest(name = "test #{index}")
	@MethodSource({"useCases", "useCasesFromFile"})
	void findRadius(int[] a, int[] b, int expected) {
		assertEquals(expected, heatersImpl.findRadius(a, b));
	}

	private static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new int[]{1, 2, 3}, new int[]{1}, 2),
				Arguments.of(new int[]{1, 2, 3}, new int[]{2}, 1),
				Arguments.of(new int[]{1, 2, 3, 4}, new int[]{1, 4}, 1),
				Arguments.of(new int[]{1}, new int[]{1, 2, 3, 4}, 0),
				Arguments.of(new int[] {1,2,3,5,15}, new int[] {2,30}, 13),
				Arguments.of(new int[] {1,5}, new int[] {10}, 9),
				Arguments.of(new int[]{1,5}, new int[]{2}, 3),
				Arguments.of(new int[]{282_475_249,622_650_073,984_943_658,144_108_930,470_211_272,101_027_544,457_850_878,458_777_923},
						new int[]{823_564_440,115_438_165,784_484_492,74_243_042,114_807_987,137_522_503,441_282_327,16_531_729,823_378_840,143_542_612}, 161_834_419),
				Arguments.of(new int[]{474_833_169,264_817_709,998_097_157,817_129_560},
						new int[]{197_493_099,404_280_278,893_351_816,505_795_335}, 104_745_341),
				Arguments.of(new int[] {282_475_249,622_650_073,984_943_658,144_108_930,470_211_272,101_027_544,457_850_878,458_777_923},
						new int[] {823_564_440,115_438_165,784_484_492,74_243_042,114_807_987,137_522_503,441_282_327,16_531_729,823_378_840,143_542_612}, 161_834_419)
		);
	}

	private static Stream<Arguments> useCasesFromFile() throws IOException {
		Arguments[] arguments = getHeaterArguments();
		return Stream.of(arguments);
	}

	private static Arguments[] getHeaterArguments() throws IOException {
		String input = FileUtils.readFileToString(new File("src/main/resources/_475_Heaters.txt"), Charset.forName("ASCII"));
		ObjectMapper mapper = new ObjectMapper();
		Heaters[] testCases = mapper.readValue(input, Heaters[].class);
		return Arrays.stream(testCases).map((el) -> Arguments.of(el.getHouses(), el.getHeaters(), el.getExpected())).toArray(Arguments[]::new);
	}

}