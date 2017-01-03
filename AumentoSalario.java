import java.util.*;
public class AumentoSalario {

	public static void main(String[] args) {
		
		//Def scan var
		Scanner scan = new Scanner(System.in);
		
		//Def var
		int cont = 0, fun = 0;
		double total = 0;
		
		//Show msg
		System.out.println("-----------------------------------------------\n--------Aluno: Lucas Manoel Assis Santos-------\n-----------------------------------------------\n-----------------------------------------------\n---------PROGRAMA DE CALCULO DE SALÁRIO--------\n-----------------------------------------------\n\n");
		
		//Read "funcionários" numbers
		System.out.print("Digite o número de funcionários: ");
		fun = scan.nextInt();
		
		//Def var vector
		double[] sal = new double[fun];
		
		//Read vector val
		do{
			do{
				System.out.print("Digite o "+(cont+1)+"º sálario: ");
				sal[cont] = scan.nextDouble();
		//Validation term about sal
				if(sal[cont] <= 0){
					System.out.println("Digite um valor válido!");
				}
			}while(sal[cont] <= 0 ); //Validation term about sal
			
		//improve 25% sal
			sal[cont] = sal[cont]*1.25;
		//add sal value to total
			total = total +sal[cont];

			cont++;
		}while(cont < fun);	//Number of fun verification
		
		//cont rest
		cont = 0;
		
		System.out.println("\n-----------------------------------------------\n");
		
		//Show final sal to user
		do{
			System.out.println("O "+(cont+1)+"º sálario corrigido é R$"+sal[cont]);
			cont++;
		}while(cont < fun);	//Number of fun verification
		
		System.out.println("\n-----------------------------------------------\n");
		
		//Show total value of sal
		System.out.println("O salário total dos funcionários é de R$"+total);
		
		//Calculate the sal averege and show to user
		System.out.println("A média do sálarios é de R$"+(total/fun));
		
		//scan var close
		scan.close();
	}

}
