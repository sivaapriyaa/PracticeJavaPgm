package core.java.pgms;

import java.util.Arrays;

public class ArrayClone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3};
		int b[]=a.clone();
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
			//Array to String
		}
		System.out.println("Array to String"+Arrays.toString(a));
	}

}
