package week05.lab;

public class QueueCustomer_Test {

	public static void main(String[] args) {
		constructor_a();
	}

	private static void constructor_a() {
		System.out.println("\nconstructor_a");
		QueueCustomer queue =new QueueCustomer(10);
		System.out.println(queue);
	}

}
