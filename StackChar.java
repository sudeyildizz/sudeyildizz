package week04.lab;

import java.util.Arrays;

/**
 * Stack of {@code char} in array implementation. Note that {@code arr[0]} is
 * not used.
 * 
 * See CLRS for discussion.
 * 
 * @author bingol
 */
public class StackChar {

	private char[] arr;
	private int top;

	public StackChar(int size) {
		// size + 1 since arr[0] is not used.
		arr = new char[size + 1];
		top = 0;
	}

	/**
	 * Returns {@code true} if stack is empty; {@code false} otherwise.
	 * 
	 * @return
	 */
	public boolean empty() {
		// below ~~~~~~~~~~~~~~~~~ V
		if (top == 0) {
			return true;
		} else
			return false;

		// TODO here
		// above ~~~~~~~~~~~~~~~~~ A
	}

	/**
	 * Adds {@code element} to the stack.
	 * 
	 * @param element
	 */
	public void push(char element) {
		// TODO check for overflow
		if (top == arr.length - 1)
			return;

		arr[++top] = element;
//		push(element);
//		 int size = 0;
//		if (top == size) {
//		  System.out.print("overflow"); 
//		  }
//		 else {
//		 top = top + 1;
//		arr[top]=element;
//		}
		// below ~~~~~~~~~~~~~~~~~ V
		// TODO here

		// above ~~~~~~~~~~~~~~~~~ A
	}

	/**
	 * Deletes the {@code element} at the top of the stack; returns the
	 * {@code element}.
	 * 
	 * @return
	 */
	public char pop() {
		// TODO check for underflow
		if (empty()) {
			System.out.print("underflow");
		} else {
			top = top - 1;
			return arr[top + 1];
		}
		// below ~~~~~~~~~~~~~~~~~ V
		// TODO here
		return 0;

		// return 'a';
		// above ~~~~~~~~~~~~~~~~~ A
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[StackChar:");
		sb.append(" top:" + top + " ");
		sb.append(Arrays.toString(arr));
		sb.append("]");
		return sb.toString();
	}

	/**
	 * A canonical representation used for jUnit tests
	 * 
	 * @return
	 */
	public String canonical() {
		StringBuilder sb = new StringBuilder("[StackChar:");
		sb.append(" top:" + top);
		// i=1 since arr[0] is not used
		for (int i = 1; i <= top; i++) {
			sb.append(", " + i + ":" + arr[i]);
		}
		sb.append("]");
		return sb.toString();
	}

}
