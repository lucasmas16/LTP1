import java.util.*;
public class CompraMacas {

	public static void main(String[] args) {
		// Scan var def
		Scanner scan = new Scanner(System.in);
		
		// Var def
		int un;
		double sum;
		
		// Msg print and scan data
		System.out.print("Digite o número de maçãs que deseja comprar: ");
		un = scan.nextInt();
		
		// Result process
		if(un >= 12){
			sum = un;
		} else {
			sum = un * 1.3;
		}
		
		// Print result
		System.out.println("O valor total da sua compra é: R$" + sum	 +"0");
		
		// Scan var end
		scan.close();
	}

}
