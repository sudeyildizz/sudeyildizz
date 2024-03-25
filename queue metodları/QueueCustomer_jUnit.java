package week05.lab;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QueueCustomer_jUnit {

	@Test
	void q_0() {
		System.out.println("\nq_0");
		QueueCustomer queue = new QueueCustomer(3);
		/**/System.out.println(queue);
		String expected = "[QueueCustomer size:0 head:0 tail:0 [null, null, null]]";
		String actual = queue.toString();
		assertEquals(expected, actual);
	}

	@Test
	void q_1() {
		System.out.println("\nq_1");
		QueueCustomer queue = new QueueCustomer(3);
		Customer customer = new Customer(1, "alice");
		queue.enqueue(customer);
		/**/System.out.println(queue);
		String expected = "[QueueCustomer size:1 head:0 tail:1 [[Customer priority:1 otherInfo:alice timeArrival:0], null, null]]";
		String actual = queue.toString();
		assertEquals(expected, actual);
	}
	//void q_2() {
		//System.out.println("\nq_2");
		//QueueCustomer queue = new QueueCustomer(3);
		//Customer customer = new Customer(1, "sude");
		//queue.enqueue(customer);
		//System.out.println(queue);
		//String expected = "[QueueCustomer size:2 head:1 tail:2 [[Customer priority:1 otherInfo:alice timeArrival:0], null, null]]";
		//String actual = queue.toString();
		//assertEquals(expected, actual);
	//}

}
