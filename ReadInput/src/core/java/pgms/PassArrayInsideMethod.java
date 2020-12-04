package core.java.pgms;

public class PassArrayInsideMethod {
public void sum(int arr[]) {
	int res=arr[0];
	for(int i=1;i<arr.length;i++) {
		res=res+arr[i];
	}
	System.out.println(res);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassArrayInsideMethod pass=new PassArrayInsideMethod();
		int a[]= {1,2,3,4,5};
		pass.sum(a);

	}

}
