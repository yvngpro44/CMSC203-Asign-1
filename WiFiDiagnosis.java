/*
 * Class: CMSC203 
 * Instructor:
 * Description: (Give a brief description for each Class)
 * Due: 2/14/2022
 * Platform/compiler:
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here: Elvis Gomez
*/
import java.util.Scanner;
public class WiFiDiagnosis {
	public static void main(String[] args) {
		String pick;
		// get input
		Scanner sc = new Scanner(System.in);
		//display diagnosis
			System.out.println("If you have a problem with internet connectivity, this WiFi Diagnosis might work."
					+ "\nFirst step: reboot your computer" + "\nAre you able to connect with the internet? (yes or no)");
			//input
			pick = sc.nextLine();
			// if not yes or no display error
			while(!pick.equalsIgnoreCase("yes") && !(pick.equalsIgnoreCase("no"))) {
				System.out.println("Please enter valid choice ");
				pick=sc.nextLine();
			}
			// if yes print done
			if(pick.equalsIgnoreCase("yes")) 
				System.out.println("Done");
			// if not yes display next steps
			else
			{
				System.out.println("Reboot the router and try again"
						+ "\nDid that fix the problem? ");
				pick = sc.nextLine();
				// if not yes & no 
				while (!pick.equalsIgnoreCase("yes") && !(pick.equalsIgnoreCase("no"))) {
					System.out.println("Please enter valid choice ");
					pick=sc.nextLine();
			}
				// if yes than print done
			if (pick.equalsIgnoreCase("yes")) 
				System.out.println("Done");
			// if not yes display next steps
			else {
				System.out.println("Please make sure cables are connected and power is connecting to the router"
						+ "\nDid that fix the problem? ");
				// get input
				pick = sc.nextLine();
				// if not yes or no display error to user
				while (!pick.equalsIgnoreCase("yes") && !(pick.equalsIgnoreCase("no"))) {
					System.out.println("Please enter valid choice ");
					pick=sc.nextLine();
			}
				// if yes display done
				if (pick.equalsIgnoreCase("yes")) 
					System.out.println("Done");
				//if not yes display next steps
				else {
					System.out.println("Move the computer closer to the router and try again"
							+ "\nDid that fix the problem? ");
					pick = sc.nextLine();
					// if not yes or no display error
					while (!pick.equalsIgnoreCase("yes") && !(pick.equalsIgnoreCase("no"))) {
						System.out.println("Please enter valid choice ");
						pick=sc.nextLine();
						// if yes display done
				}if (pick.equalsIgnoreCase("yes")) 
					System.out.println("Done");
				// if not yes display contact isp
				else {
					System.out.println("Please Contact your ISP ");
					pick = sc.nextLine();
					
					while (!pick.equalsIgnoreCase("yes") && !(pick.equalsIgnoreCase("no"))) {
						System.out.println("Please enter valid choice ");
						pick=sc.nextLine();
						// if user pick yes or no display done
				}if (pick.equalsIgnoreCase("yes") || pick.equalsIgnoreCase("no"))
					System.out.println("Done");
			
				
		
						}
					}
				}
			}
		}
}
