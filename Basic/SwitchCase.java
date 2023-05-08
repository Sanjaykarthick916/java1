package Basic;

public class SwitchCase {
	public static void main(String[] args) {
		
		String attend = "od";  

		switch (attend) {
		case "p":
			System.out.println("class attend");
			break;
		case "od":
			System.out.println("on duty");
			break;
		case"absent":
			System.out.println("not present");
			break;
		default:
			System.out.println("no class");
			break;
		}
		}

}
