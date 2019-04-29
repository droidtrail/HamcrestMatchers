package com.hamcrestMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.arrayWithSize;
import static org.hamcrest.Matchers.arrayContaining;

import org.junit.Test;

public class HamcrestParaMatrizes {

	@Test
	public void arrayHasSizeOf4() {

		Integer[] ints = new Integer[] { 7, 5, 12, 16 };
		assertThat(ints, arrayWithSize(4));

	}

	@Test
	public void arrayContainsNumbersInGivenOrder() {

		Integer[] ints = new Integer[] { 7, 5, 12, 16 };
		assertThat(ints, arrayContaining(7, 5, 12, 16));

	}

}
