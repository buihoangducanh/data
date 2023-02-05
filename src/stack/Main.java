package stack;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();

		// System.out.println(stack.empty());

		stack.push("Minecraft");
		stack.push("Skyrim");
		stack.push("Randomgame");
		stack.push("BorderLand");

		System.out.println(stack.empty());

		//String myFavGame = stack.peek();

		System.out.println(stack.search("Randomgame"));

	}
}
