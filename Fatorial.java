import java.util.Scanner;
public class Fatorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int quant, cont=1;
		long resp=1;
		char val='s';
		
		while(val=='s'||val=='S'){
			val='n';
			System.out.print("Digite o número fatorial a calculado: ");
			quant = scan.nextInt();
			
			while(quant<0){
				System.out.print("Digite um número válido: ");
				quant = scan.nextInt();
			}
			
			while(quant>=cont){
				resp*=cont;
				cont++;
			}
			System.out.println("Fatorial de "+quant+" = "+resp);
			
			/*if(quant==0){
					System.out.println("Fatorial de "+quant+" = "+resp);
			}else{
				while(quant>=cont){
					resp=resp*cont;
					cont++;
					System.out.println(resp);
				}
				System.out.println("Fatorial de "+quant+" = "+resp);
			}*/
			
			
			System.out.print("Gostaria de executar o programa novamento(S/N): ");
			val = scan.next().charAt(0);
		}
		
		scan.close();
	}

}
