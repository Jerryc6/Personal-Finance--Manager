import java.util.Scanner;

public class code{

	public void first_page(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Personal Finance Manager");
	
		System.out.println("[+] Track income & Expenses");
		String transac = sc.nextLine();


		while(true){

		     if(transac.equals("+")){

			String categories1 = "income";
			String categories2 = "expenses";

			System.out.println("Type: income or expenses");
			String categ = sc.nextLine();


			if(categories1.equals("income")){
				System.out.println("Enter Date: ");
				String date = sc.nextLine();

				System.out.println("Enter Description: ");
				String description = sc.nextLine();

				System.out.println("Enter Amount: ");
				int amount = sc.nextInt();
			
			}else if(categories2.equals("expenses")){
				System.out.println("Enter Date: ");
				String date1 = sc.nextLine();

				System.out.println("Enter Description: ");
				String description1 = sc.nextLine();

				System.out.println("Enter Amount: ");
				int amount1 = sc.nextInt();
			}


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
