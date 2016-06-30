package at.fhj.itm;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/**
		 * create new StringStack
		 */
		StringStack stack = new StringStack();
		
		// push some elements on stack
		stack.push("a");
		stack.push("b");
		stack.push("c");
		stack.push("d");
		stack.push("e");
		stack.push("f");
		stack.push("g");
		stack.push("h");
		stack.push("i");
		stack.push("j");
		
		
		
		//output which element is deleted
		System.out.println("Es wurde das Element " + stack.pop() + " gelöscht");
		
		
		
		
		
		
	}

}
