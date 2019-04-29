package com.hamcrest.teste;

import static org.hamcrest.text.IsEmptyString.isEmptyString;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.text.IsEmptyString.isEmptyOrNullString;

import org.junit.Test;

public class StringMatcherTest {

	@Test
	public void isStringEmpty() {

		String stringToTest = "";
		assertThat(stringToTest, isEmptyString());

	}

	@Test
	public void isStringEmptyOfNull() {

		String stringToTest = "";
		assertThat(stringToTest, isEmptyOrNullString());

	}
}
