package com.statements.loop;

import java.util.Scanner;

public class SumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int sum=0,avg=0;
System.out.println("Enter the 10 numbers");

for(int i=1;i<=10;i++) {
	int input=s.nextInt();
	sum=sum+input;
	avg =sum/10;
}
System.out.println("Sum of 10 nos is "+sum+"and average is "+avg);

	}

}
