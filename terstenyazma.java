package odevpackage;

import java.util.Scanner;

public class terstenyazma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		String kelime=scanner.nextLine();
		char[] arr=kelime.toCharArray();
				
		for(int i=arr.length-1;i>=0;i--) {
			System.out.print(arr[i]);
		}
	}

}
