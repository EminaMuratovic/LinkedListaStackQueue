
public class Test {
	public static void main(String[] args) {
		System.out.println("Stack: \n");
		StackInt test = new StackInt();
		System.out.println(test.getSize());
		test.push(1);
		test.push(2);
		test.push(3);
		System.out.println(test.getSize());
		System.out.println(test.peek());
		System.out.println(test.contains(3));
		System.out.println(test.pop());
		System.out.println(test.contains(3));
		System.out.println(test.getSize());
		System.out.println(test.contains(1));
		System.out.println(test.contains(2));
		System.out.println(test.pop());
		System.out.println(test.pop());
		//System.out.println(test.pop());
		
		System.out.println("Queue: \n");
		QueueInt test1 = new QueueInt();
		System.out.println(test1.getSize());
		test1.push(1);
		test1.push(2);
		test1.push(3);
		System.out.println(test1.getSize());
		System.out.println(test1.peek());
		System.out.println(test1.contains(3));
		System.out.println(test1.pop());
		System.out.println(test1.contains(3));
		System.out.println(test1.getSize());
		System.out.println(test1.contains(1));
		System.out.println(test1.contains(2));
		System.out.println(test1.pop());
		System.out.println(test1.pop());
		//System.out.println(test1.pop());
	}

}
