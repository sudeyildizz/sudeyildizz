package week05.lab;

import java.util.Arrays;

//based on Horstmann

/**
 * Queue implemented as circular queue on array
 * 
 * @author bingol
 */
public class QueueCustomer {

	private Customer[] array;
	private int head;
	private int tail; // next available location
	private int size;

	public QueueCustomer(int capacity) {
		array = new Customer[capacity];
		head = 0;
		tail = 0;
		size = 0;
	}

	public void enqueue(Customer element) {
		// below ~~~~~~~~~~~~~~~~~ V
		// TODO here
		//Customer x = null;
		
		 array[tail] = element;
		 if (tail == array.length-1) {
		 tail = 0;
		 }
		 else {
		 tail = tail + 1;
		 }
		 size++;
		// above ~~~~~~~~~~~~~~~~~ A
	}

	public Customer dequeue() {
		// below ~~~~~~~~~~~~~~~~~ V
		// TODO here
		
		 Customer Customer = array[head];
		 if (head == array.length-1) {
		 head = 0;
		 }
		 else {
		 head = head + 1;
		 }
		 size--;
		
		return Customer;
		// above ~~~~~~~~~~~~~~~~~ A
	}

	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[QueueCustomer");
		sb.append(" size:" + size);
		sb.append(" head:" + head);
		sb.append(" tail:" + tail);
		sb.append(" " + Arrays.toString(array));
		sb.append("]");
		return sb.toString();
	}

}
