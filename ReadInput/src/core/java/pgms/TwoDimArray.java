package core.java.pgms;

public class TwoDimArray {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{1,2,1},{2,3,5}};
		for(int i=0;i<=2;i++) {
			for(int j=0;j<=2;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
