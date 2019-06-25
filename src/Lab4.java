import java.util.Scanner;

public class Lab4 {
	public static void main(String[] args) {
		
		//variables
		Scanner in = new Scanner(System.in);//accept input
		int userNum; //store user value
		char choice = 'Y'; //test user choice to continue
		String flare = "=======";//flare for table formating
		
		do {
			
			//prompt user for input
			System.out.println("Enter an integer:");
			userNum = in.nextInt();
			
			//format text to create table
			System.out.printf("%-10s %-10s %-10s\n", "Number","Squared", "Cubed");
			System.out.printf("%-10s %-10s %-10s\n", flare, flare, flare);
			
			//calculate table up to user entry, then squares,then cubes
			for(int i = 1; i <= userNum; i++)
			{
				System.out.printf("%-10d %-10d %-10d\n", i, (i * i), (i * i * i));
			}
			
			//multiplication table heading
			System.out.printf("\n%-30s\n", "Multiplication Table");
			System.out.printf("%-30s\n", "==============================");
			
			//calculate multiplication table up to user entry
			for(int acc = 1; acc <= userNum; acc++)
			{
				for(int j = 1; j <= userNum; j++)
				{
					System.out.printf("%-5d", acc * j);
					if(j == userNum)
					{System.out.print("\n");}
				}
			}
			
			//Prompt user for response to continue
			System.out.println("Continue? (y/n)");
			choice = in.next().toUpperCase().charAt(0);
			
		}while(choice == 'Y');
		
		
		//close scanner object
		in.close();
		
	}
	
	public boolean nearHundred(int n) {
		  
		  if(n >= 90 & n <= 110 || n >= 190 & n <= 210)
		    return true;
		  else
		    return false;
		}
}
