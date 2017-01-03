import java.util.*;
public class Matriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//variables
		
		//simple
		int l = 0, c = 0;
		double soma;
		
		//vector
		String nomeLoja[] = new String[7];
		
		//matrix
		int notas[][] = new int[3][4];
		
		//values attribution
		//attribution operator
		soma = 45*9;
		nomeLoja[2] ="EPA";
		nomeLoja[1] = "Supernosso";
		
		for(l=0; l>7; l++){
			nomeLoja[l] = "";
			
		}
		
		//matrix
		//using scan or normal attribution
		for(l = 0; l < 3; l++){
			for(c = 0; c < 4; c++){
				notas[l][c] = 0;
				notas[l][c] = scan.nextInt();
			}
		}
		
		//using values
		//normal variables
		System.out.println("The sum is: "+soma);
		
		//vector
		for(l = 0; l < 7; l++){
			System.out.println(nomeLoja[l]);
		}
		
		//matrix
		for(l = 0; l < 3; l++){
			for(c = 0; c < 4; c++){
				System.out.println(notas[l][c]);
				soma += notas[l][c];
			}
		}
		
		
		
		scan.close();
	}

}
