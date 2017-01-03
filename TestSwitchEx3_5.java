import java.util.*;
public class TestSwitchEx3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Def Scan
		Scanner scan = new Scanner(System.in);
		
		//Def Var
		char choose;
		double n1, n2;
		
		//Read data
		System.out.print("Digite um número real: ");
		n1 = scan.nextDouble();
		System.out.print("Digite outro número real: ");
		n2 = scan.nextDouble();
		
		System.out.print("Para somar digite 'A' para multiplicar digite 'B': ");
		choose = scan.next().charAt(0);
	
		//Data process
		switch (choose) {
			case 'A':
				System.out.println("O resultado da soma é: "+(n1+n2));
				break;
			case 'B':
				System.out.println("O resultado da multiplicação é: "+(n1*n2));
				break;
			default:
				System.out.println("Você digitou uma opção inválida!");
		}
		
		//Scan close
		scan.close();
	}

}
