package ipt;

public class FindOddInArray {
	public static void main(String[] args) {
		int arr[]= {1,27,3,23,4,5,66,7,88,9,90,10,45,337,22,111,456,34};
		int a;
		   System.out.println("Odd num:");
		    for(a=0; a<arr.length; a++) {                 //a=0; 0<arr.length; a++
		    	if(arr[a]%2!=0) {                        // 3/2!=0; 23/2!=0;....
		    		System.out.print(arr[a]+" ");
		    	}
		    }
		    
		    System.out.println("Even num:");
		    for(a=0; a<arr.length; a++) {
		    	if(arr[a]%2==0) {                       // 4/2=0; 66/2=0;.......
		    		System.out.print(arr[a]+" ");
		    	}
		    }
	}

}
