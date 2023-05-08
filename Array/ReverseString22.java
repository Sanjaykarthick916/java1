package Array;

public class ReverseString22 {
	public static void Task1(String s) {
		String[] arr = s.split(" ");
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		public static void Task2(String s) {
	     String[] arr = s.split(" ");
	     for(int i = arr.length-1; i>=0; i--) {
	    	 if(arr[i] == arr[0]) {
	    	 System.out.println(arr[i]);
	      }else {
	    	  System.out.print(arr[i]+"*");
	      }
	     }
		}
		public static void Task3(String s) {
			String[] arr = s.split(" ");
			for(int i= arr.length-1; i>=0; i--) {
				arr[i]= arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
				System.out.print(arr[i]+" ");
			}
			System.out.println();
	}
		public static void Task4(String s) {
	      String[] arr = s.split(" ");
	      for(int i=0; i< arr.length; i++) {
	    		arr[i]= arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
	    		
				System.out.print(arr[i]+" ");
		}
		}
		public static void main(String[] args) {
			String s = "every thing will be 123 alright";
			Task1(s);
			Task2(s);
			Task3(s);
			Task4(s);
		}
	}

	


