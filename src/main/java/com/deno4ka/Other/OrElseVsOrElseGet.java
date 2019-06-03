package com.deno4ka.Other;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OrElseVsOrElseGet {

	public static void main(String[] args) {
		List<String> collection = new ArrayList<>();
		collection.add("One");
		collection.add("Two");
		collection.add("Three");
		collection.add(null);
		//		collection.forEach((el) -> System.out.println(Optional.ofNullable(el).orElse(generateString())) );
		collection.forEach((el) -> System.out.println(Optional.ofNullable(el).orElseGet(OrElseVsOrElseGet::generateString)) );

	}

	private static String generateString() {
		System.out.println("generateString()");
		return "test";
	}

}
