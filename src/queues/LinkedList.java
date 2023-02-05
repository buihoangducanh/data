package queues;

public class LinkedList {
	public static void main(String[] args) {
		
		java.util.LinkedList<String> linkedList = new java.util.LinkedList<String>();
		
		linkedList.push("A");
		linkedList.push("B");
		linkedList.push("C");
		linkedList.push("D");
		linkedList.push("F");
		
		linkedList.pop();
		System.out.println(linkedList);
	}
}
