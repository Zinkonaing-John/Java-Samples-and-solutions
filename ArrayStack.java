package Chapter01;

import java.util.Arrays;

public class ArrayStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int data[] = {9,1,7,8,10,2,5,6,14,52};
		System.out.println(Arrays.toString(data));
		
//		for(int i=0; i<data.length; i++) {
//			System.out.print(data[i]+ " ");
//			
//			
//		}
//		System.out.println();
//		
//		System.out.println(Arrays.toString(data));
		
//		for(int i=0; i<data.length; i++) {
//			
//			for(int j=i+1; j<data.length; j++) {
//				
//				int tmp = 0;
//				
//				if(data[i]>data[j]) {
//					tmp = data[j];
//					data[j]= data[i];
//					data[i] = tmp;
//				}
//				
//			}
//		}
		Arrays.sort(data);
		System.out.println(Arrays.toString(data));
		
		int r = Arrays.binarySearch(data, 100);
		System.out.println(r);
	}

}
