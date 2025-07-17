package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _482_LicenseKeyFormattingTest {

    private final _482_LicenseKeyFormatting licenseKeyFormatting = new _482_LicenseKeyFormatting();

    public static Stream<Arguments> useCases() {
        return Stream.of(
                Arguments.of("5F3Z-2e-9-w", 4, "5F3Z-2E9W"),
                Arguments.of("2-5g-3-J", 2, "2-5G-3J")
        );
    }

    @DisplayName("Format the string according to the rules")
    @ParameterizedTest(name = "test #{index}: license {0}, format {1} -> expected license {2}")
    @MethodSource({"useCases"})
    public void licenseKeyFormatting(String S, int K, String expected) {
        assertEquals(expected, licenseKeyFormatting.licenseKeyFormatting(S, K));
    }

}
