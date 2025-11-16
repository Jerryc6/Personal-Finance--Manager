import java.util.Scanner;

public class code{

	public void first_page(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Personal Finance Manager");
	
		System.out.println("[+] Add Transaction");
		String transac = sc.nextLine();


		while(true){

		     if(transac.equals("+")){
			System.out.println("Enter amount :");
			int amount = sc.nextInt();

			String cat1 = "[1] Dining ";
			String cat2 = "[2] Expense";
			System.out.println("Select Category: " + cat1 + cat2);
			int choice = sc.nextInt();

			switch(choice){
				case 1:
					System.out.println("Dining");
				case 2:
					System.out.println("Expense");

			}

			System.out.println("Enter date: ");
			String date = sc.nextLine();

			System.out.println("Description :");
			String disc = sc.nextLine();

			break;

		     }else{
			System.out.println("Please press [+]");
			continue;
		     }  

	        }
	}
		

	public static void main(String[]args){
		code c = new code();
		c.first_page();
	}

}
