package ipt;

public class TryCatch01 {
	public static void MultiCatch() {
		System.out.println("------Single try multi catch block------");
		try {
			String s = "sangee"; // String s1 = null; 
			System.out.println(s.charAt(7));

		} catch (StringIndexOutOfBoundsException a) {
			System.out.println("String Index Out Of Bound Exception ");
		} catch (ArithmeticException b) {
			System.out.println("Arithmetic Exception ");
		} catch (NullPointerException c) {
			System.out.println("Null Pointer Exception ");
		}
	}

	public static void MultiTry() {
		System.out.println("-------multi try single catch block--------");
		try {
			int a = 10, b = 0;

			try {
				int c = a / b;
				System.out.println(c);
			}

			catch (ArithmeticException d) {
				System.out.println("Arithmetic Exception");
			}
		} catch (NullPointerException d) {
			System.out.println("Null pointer Exception");
		}
	}

	public static void Final_Without_catch() {
		System.out.println("--------Final Without catch--------");
		String g = "sangeeth";
		try {
			
		} finally {
			System.out.println("not mandatory to use catch block ");
			System.out.println(" Final_Without_catch: " + g);
		}
		System.out.println("-------Final Without TRY BLOCk--------");
		System.out.println("Finally block execute to the try block exits so must we can " + "use try block");
	}

	public static void main(String[] args) {
		MultiCatch();
		MultiTry();
		Final_Without_catch();

	}

}



