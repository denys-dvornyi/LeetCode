package com.deno4ka.LeetCode.algorithms.easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class _876_MiddleOfTheLinkedListTest {

	private final _876_MiddleOfTheLinkedList middleOfTheLinkedList = new _876_MiddleOfTheLinkedList();

	@DisplayName("Return the middle node of the linked list. If there are two middle nodes, return the second middle node")
	@ParameterizedTest(name = "test #{index}: linked list \"{0}\", middle node \"{1}\"")
	@MethodSource({"useCases"})
	public void middleNode(_876_MiddleOfTheLinkedList.ListNode head, _876_MiddleOfTheLinkedList.ListNode expected) {
		Assertions.assertEquals(expected, middleOfTheLinkedList.middleNode(head));
	}

	public static Stream<Arguments> useCases() {
		return Stream.of(
				Arguments.of(
						new _876_MiddleOfTheLinkedList.ListNode(1, new _876_MiddleOfTheLinkedList.ListNode(2,
						new _876_MiddleOfTheLinkedList.ListNode(3, new _876_MiddleOfTheLinkedList.ListNode(4,
						new _876_MiddleOfTheLinkedList.ListNode(5))))),
						new _876_MiddleOfTheLinkedList.ListNode(3, new _876_MiddleOfTheLinkedList.ListNode(4,
								new _876_MiddleOfTheLinkedList.ListNode(5)))
						),
				Arguments.of(
						new _876_MiddleOfTheLinkedList.ListNode(1, new _876_MiddleOfTheLinkedList.ListNode(2,
						new _876_MiddleOfTheLinkedList.ListNode(3, new _876_MiddleOfTheLinkedList.ListNode(4,
						new _876_MiddleOfTheLinkedList.ListNode(5, new _876_MiddleOfTheLinkedList.ListNode(6)))))),
						new _876_MiddleOfTheLinkedList.ListNode(4, new _876_MiddleOfTheLinkedList.ListNode(5,
								new _876_MiddleOfTheLinkedList.ListNode(6)))
						)
		);
	}

}
