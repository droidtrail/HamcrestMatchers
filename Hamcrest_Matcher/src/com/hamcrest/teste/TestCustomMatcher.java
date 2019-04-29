package com.hamcrest.teste;

import org.junit.Test;

import com.hamcrest.java.RegexMatcher;

import static org.hamcrest.MatcherAssert.assertThat;

public class TestCustomMatcher {

	@Test
	public void testRegularExpressionMatcher() {
		String s = "aaabbbaaaa";
		assertThat(s, RegexMatcher.matchesRegex("a*b*a*"));
	}

}
