package com.statements.loop;

import java.util.Scanner;

public class NaturalNos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number");
Scanner s=new Scanner(System.in);
int input = s.nextInt();
int sum=0;
for(int i=1;i<=input;i++) {
	sum=sum+i;
	System.out.println("The Number is "+i+" Sum is "+sum);
}
	}

}
