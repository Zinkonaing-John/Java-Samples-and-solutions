package Chapter01;

import java.util.Random;
import java.util.Stack;

interface IStack{
	public void push(int item);
	public int pop();
}

class FixedStack implements IStack{
	
	int stack[];
	int tos;
	
	public FixedStack(int size) {
		
		stack = new int[size];
		tos = -1;
	}
	

	@Override
	public void push(int item) {
		stack[++tos] = item;
		
		
	}

	@Override
	public int pop() {
		
		return stack[tos--];
	}
	
}

public class Stack_interface {

	public static void main(String[] args) {
		
		FixedStack mystack = new FixedStack(10);
		
		Random r = new Random();
		
		
		for(int i=0; i<10; i++) {
			//mystack.push(r.nextInt(10));
			int data = r.nextInt(10);
			mystack.push(data);
			System.out.println(data+" ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=0; i<10; i++) {
			int data =mystack.pop();
			System.out.println(data+" ");
		}
		
		Stack ss = new Stack();
		ss.push(10);

	}

}
