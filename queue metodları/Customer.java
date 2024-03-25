package week05.lab;

public class Customer {

	public static final double ARRIVAL_PROBABILITY = 0.5;
	public static final double PRIORITY_LOW_PROBABILITY = 0.5;
	public static final int PRIORITY_HIGH = 1;
	public static final int PRIORITY_LOW = 0;
	private static int counter = 0;

	private int priority;
	private String otherInfo;
	private int timeArrival;

	public static Customer arrival() {
		int priority;
		double d;
		d = Math.random();
		if (d < PRIORITY_LOW_PROBABILITY) {
			priority = PRIORITY_LOW;
		} else {
			priority = PRIORITY_HIGH;
		}
		String otherInfo = "C" + ++counter;
		Customer customer = new Customer(priority, otherInfo);
		return customer;
	}

	public Customer(int priority, String otherInfo) {
		this.priority = priority;
		this.otherInfo = otherInfo;
	}

	public int getPriority() {
		return priority;
	}

	public String getOtherInfo() {
		return otherInfo;
	}

	public int getTimeArrival() {
		return timeArrival;
	}

	public void setTimeArrival(int timeArrival) {
		this.timeArrival = timeArrival;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("[Customer");
		sb.append(" priority:" + priority);
		sb.append(" otherInfo:" + otherInfo);
		sb.append(" timeArrival:" + timeArrival);
		sb.append("]");
		return sb.toString();
	}

}
