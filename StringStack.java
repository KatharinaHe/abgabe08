package at.fhj.itm;

import java.util.ArrayList;
import java.util.List;

/**
 * Stack Implementation of <code>Stack</code> Interface.
 * supports String Values and can be initialized with a maximum number
 * of items.
 *  
 *  Notice of Christian Finker: all perfect!
 *  
 * @see Stack
 * @author Katharina Herzele
 */
public class StringStack implements Stack
{
	List<String> stack = new ArrayList<String>();
	private int max_elements = 10; //maximum of elements 

	/**
	 * Tests if this stack is empty.
	 * @return boolean  true -> is empty
	 */
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return stack.isEmpty();
	}

	/**
	 * Pushes an item onto the top of this stack.
	 * 
	 * if Stack is full return an error message
	 * 
	 * @param item
	 */
	@Override
	public void push(String item) {
		// TODO Auto-generated method stub
		//When list is not empty
		if(stack.size() <max_elements){
			//add element
			stack.add(item);
		}else{//else put out error
			System.out.println("Stack hat maximale Anzahl an Elementen erreicht");
		}
		
	}

	/**
	 * Removes the object at the top of this stack and returns that
	 * object as the value of this function.
	 * 
	 * if Stack is empty return an error message
	 */
	@Override
	public String pop() {
		// TODO Auto-generated method stub
		//When Stack is not empty
		if(stack.isEmpty() ==false){
			//get last element
			String tmp = stack.get(stack.size()-1);
			//remove element on top
			stack.remove(stack.size()-1);
			return tmp;
		}else{
			return "Stack ist leer!";
		}
		
		
	}
	
}
