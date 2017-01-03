import java.util.Scanner;
class MatrixSuperMarket {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		//Normal variable declaration
		int zero = 0;
		
		
		//Vector declaration
		//Supermarket
		String place[] = new String[5];
		//Products
		String product[] = new String[10];
		double mediumPrice[] = new double[10];
		
		//Comparation Matrix
		double price[][] = new double[10][5];
		
		
		//check the validation read condiction 
		for(int i = 0; i < 5; i++){
			do{
				System.out.print("Insert the name of place number " + (i+1) + ": ");
				place[i] = scan.next();
				if(place[i].equals("")){
					System.out.println("Insert valid name!");
				}
			}while(place[i].equals(""));
		}
		
		for(int i = 0; i < 10; i++){
			do{
				System.out.print("Insert the name of product number " + (i+1) + ": ");
				product[i] = scan.next();
				if(product[i].equals("")){
					System.out.println("Insert valid name!");
				}
			}while(product[i].equals(""));
		}
		
		for(int i = 0; i < 5; i++){
			for(int j = 0; j < 10; j++){
				do{
					System.out.print("How much is " + product[j] + " at " + place[i] + "?");
					price[j][i] = scan.nextDouble();
					if(price[j][i] < 0){
						System.out.println("Value invalid!");
					}
				}while(price[j][i] < 0);
				mediumPrice[j] += price[j][i];
				if(price[j][i] == 0){
					zero++;
				}
			}
		}
		
		for(int i = 0; i < 10; i++){
			System.out.println("The medium price of " + product[i] + " is : $" + (mediumPrice[i]/10) );
		}
		
		System.out.println(zero + " products has value = $0,00.");
		
	
		
		scan.close();
		
	}

}