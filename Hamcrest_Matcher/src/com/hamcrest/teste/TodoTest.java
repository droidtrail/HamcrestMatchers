package com.hamcrest.teste;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasProperty;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.samePropertyValuesAs;

import org.junit.Test;

import com.hamcrest.java.Todo;

public class TodoTest {

	@Test
	public void objectHasSummaryProperty() {

		Todo todo = new Todo(1, "Learn Hamcrest", "Important");
		assertThat(todo, hasProperty("summary"));

	}

	@Test
	public void objectHasCorrectSummaryValue() {

		Todo todo = new Todo(1, "Learn Hamcrest", "Important");
		assertThat(todo, hasProperty("summary", equalTo("Learn Hamcrest")));
	}

	@Test
	public void objectHasSameProperties() {
		Todo todo001 = new Todo(1, "Learn Hamcrest", "Important");
		Todo todo002 = new Todo(1, "Learn Hamcrest", "Important");

		assertThat(todo001, samePropertyValuesAs(todo002));
	}

}
