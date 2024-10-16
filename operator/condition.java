package operator;

public class condition {
	public static void main(String[] args) {
		int day = 5;
		System.out.println("monday");
		switch (day) {
		case 1:
			System.out.println("monday");
			break;
			
		case 2:
			System.out.println("tuesday");
			break;
			
		case 3:
			System.out.println("wednesday");
			break;
			
		case 4:
			System.out.println("thuresday");
			break;
			
		case 5:
			System.out.println("friday");
			break;
			
		case 6:
			System.out.println("saturday");
			break;
			
		case 7:
			System.out.println("sunday");
			break;
			
			default:
				System.out.println("the value from 1 to 7");
				break;
		}
	}
}
