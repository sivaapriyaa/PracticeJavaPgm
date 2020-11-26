package com.statements.loop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=s.nextInt();
		for(int i=1;i<=10;i++)
		{
			int ans=i*num;
			System.out.println(num+"x"+i+"="+ans);
		}
		

	}

}
