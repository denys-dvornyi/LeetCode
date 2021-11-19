package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _929_UniqueEmailAddressesTest {

	private final _929_UniqueEmailAddresses uniqueEmailAddresses = new _929_UniqueEmailAddresses();

	@DisplayName("Return the number of different addresses that actually receive mails")
	@ParameterizedTest(name = "test #{index}: emails \"{0}\", number of unique emails \"{1}\"")
	@MethodSource({"useCases"})
	public void numUniqueEmails(String[] emails, int expected) {
		Assertions.assertEquals(expected, uniqueEmailAddresses.numUniqueEmails(emails));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}, 2),
				Arguments.of(new String[]{"a@leetcode.com","b@leetcode.com","c@leetcode.com"}, 3)
		);
	}

}
