package ipt;

public class ReverseProgram {
	public  static void Task1(String s) {    // avaj na si margorp
		String result = "";
		String[] arr = s.split(" ");
		for (int i = 0; i < arr.length; i++) {
			String rev = "";
			int j = arr[i].length() - 1;
			
			while (j >= 0) {
				char ch = arr[i].charAt(j);
				rev = rev + ch;
				j--;
	     }
			result = result + rev +" " ;
	}
		System.out.println(result);
	 }


	public static void Task2(String s) {         // program is an java
			String [] arr = s.split(" ");
		for(int i=arr.length-1; i>=0;i--) {
		System.out.print(arr[i]+" ");	
		}
		System.out.println();

	}
	public static void main(String[] args) {
	  String s = "java is an program";
	    Task1(s);
	    Task2(s);
	}
	} 



