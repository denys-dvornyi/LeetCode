package com.deno4ka.LeetCode.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Heaters {

	@JsonProperty("houses")
	private int[] houses;

	@JsonProperty("heaters")
	private int[] heaters;

	@JsonProperty("expected")
	private int expected;

	public int[] getHouses() {
		return houses;
	}

	public void setHouses(int[] houses) {
		this.houses = houses;
	}

	public int[] getHeaters() {
		return heaters;
	}

	public void setHeaters(int[] heaters) {
		this.heaters = heaters;
	}

	public int getExpected() {
		return expected;
	}

	public void setExpected(int expected) {
		this.expected = expected;
	}

}