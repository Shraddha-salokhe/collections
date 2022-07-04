package UserMenu;

import java.util.Scanner;

public class UserMenuClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);//...>scan the value from input stream
		//scanner scans the standard input...here system.in...means keyboard input
		int selection = 1;
//		selection = input.nextInt();
		
		while(selection!=4) {
		System.out.println("Choose from these options");
		System.out.println("1. add a user specified file");
		System.out.println("2. delete a user specified file");
		System.out.println("3. search a user specified file");
		System.out.println("4. Quit");
		
		selection = input.nextInt();
		
		switch(selection) {  //....>passing the variable
		case 1:
			System.out.println("Option 1 selected");
			break;
		case 2:
			System.out.println("Option 2 2selected");
			break;
		case 3:	
			System.out.println("Option 3 selected");
			break;
		case 4:
			System.exit(0);
			break;
			
			default:  //....>if nothing is matching then printed default
				System.out.println("Wrong option");
			
		}
	}

}
}