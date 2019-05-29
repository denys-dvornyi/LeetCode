package com.deno4ka.Other;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FailFastVsFailSafe {

	public static void main(String[] args) {
		List<String> collection = new ArrayList<>();
		collection.add("One");
		collection.add("Two");
		collection.add("Three");
//		failFast(collection);
		failSafe(collection);
	}

	private static void failFast(List<String> collection) {
		System.out.println("failFast()");
		Iterator<String> iterator = collection.iterator();
		collection.remove(0);
		while (iterator.hasNext()) {
			String next =  iterator.next();
			System.out.println(next);
			iterator.remove();
		}
	}

	private static void failSafe(List<String> collection) {
		System.out.println("start failSafe()");
		collection.stream().forEach((el) -> {
			collection.remove(0);
			System.out.println(el);
		});
		System.out.println("finish failSafe()");
	}

}
