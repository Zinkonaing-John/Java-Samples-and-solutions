package chapter02;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

interface MyQueue{
	
	void insertion(int n);
	int deletion();
	boolean isEmpty();
}

class FIFOQueue implements MyQueue{
	
	private Queue<Integer> queue;
	
	 public FIFOQueue() {
	        this.queue = new LinkedList<>();
		
	}

	@Override
	public void insertion(int n) {
		
		if(queue.size() < 10) {
			queue.offer(n);
		}else {
			System.out.println("Queue is full! Cannot insert more than 10 numbers.");
		}
		
	}

	@Override
	public int deletion() {
		if (!queue.isEmpty()) {
			return queue.poll();
		}else {
			System.out.println("Queue is empty!");
			return -1;
		}
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return queue.isEmpty();
	}
		
}
 	
 	


public class MyQueueTask3 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		MyQueue q = new FIFOQueue();
		
		System.out.println("*** Queue ***");
		
		System.out.print("Enter 5 numbers :");
		for(int i=0; i < 5; i++) {
			q.insertion(s.nextInt());
		}
		s.close();
		
		System.out.print("FIFO Output :");
		while(!q.isEmpty()) {
			System.out.print(q.deletion()+ " ");
			
		}
		
	
	}

}
