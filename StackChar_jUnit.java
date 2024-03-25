package week04.lab;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.MethodName.class)


/**
 * Test cases for {@code StackChar}.
 * 
 * @author bingol
 */
class StackChar_jUnit {

	@Test
	void stack_constructor() {
		System.out.println("\nstack_constructor");
		StackChar stack = new StackChar(10);
		String expected = "[StackChar: top:0]";
		String actual = stack.canonical();
		/**/System.out.println("expected:" + expected);
		/**/System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

	/*
	 * empty()
	 */

	@Test
	void stack_empty() {
		System.out.println("\nstack_constructor");
		StackChar stack = new StackChar(10);
		boolean expected = true;
		boolean actual = stack.empty();
		/**/System.out.println("expected:" + expected);
		/**/System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

	@Test
	void stack_empty_not() {
		System.out.println("\nstack_empty_not");
		StackChar stack = new StackChar(10);
		stack.push('a');
		boolean expected = false;
		boolean actual = stack.empty();
		/**/System.out.println("expected:" + expected);
		/**/System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

	/*
	 * pop
	 */

	@Test
	void stack_pop_ab_1() {
		System.out.println("\nstack_pop_ab_1");
		StackChar stack = new StackChar(10);
		stack.push('a');
		stack.push('b');
		char c = stack.pop();
		String expected = "b" + " " + "[StackChar: top:1, 1:a]";
		String actual = c + " " + stack.canonical();
		/**/System.out.println("expected:" + expected);
		/**/System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

	/*
	 * push()
	 */

	@Test
	void stack_push_ab() {
		System.out.println("\nstack_push_ab");
		StackChar stack = new StackChar(10);
		stack.push('a');
		stack.push('b');
		String expected = "[StackChar: top:2, 1:a, 2:b]";
		String actual = stack.canonical();
		/**/System.out.println("expected:" + expected);
		/**/System.out.println("actual  :" + actual);
		assertEquals(expected, actual);
	}

}
