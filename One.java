import java.util.Scanner;

public class One {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		System.out.println("Enter the Sentence");
		String str = scn.nextLine();
		String arr[]=str.split(" ");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+" : "+arr[i].length());
		}
	}

}
