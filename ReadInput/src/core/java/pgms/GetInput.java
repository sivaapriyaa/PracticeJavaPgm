package core.java.pgms;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class GetInput {

	public static void main(String[] args) throws IOException {
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//Scanner s=new Scanner(System.in);
		System.out.println("Enter the current month");
		//String month= br.readLine();
		//String month=s.nextLine();
		String month=System.console().readLine();
		System.out.println("The current month is:"+month);
		

	}

}
