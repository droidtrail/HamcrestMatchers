package com.hamcrestMatcher;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.Test;

public class Teste001 {

	static boolean a;
	static boolean b;

	@Test
	public void main() {

		assertThat(a, equalTo(b));
		assertThat(a, is(equalTo(b)));
		assertThat(a, is(b));

	}

}
