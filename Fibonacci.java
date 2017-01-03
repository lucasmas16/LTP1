import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int quant, cont=1;
		long n1=0, n2=1, temp;
		char val='s';
		
		while(val=='s'||val=='S'){
			val='n';
			System.out.print("Digite a quantidade de números a serem calculados: ");
			quant = scan.nextInt();
			
			while(quant<=0){
				System.out.print("Digite um número válido: ");
				quant = scan.nextInt();
			}
			
			while(quant>=cont){
				System.out.println(cont+"º termo: "+n1);
				cont++;
				temp=n1;
				n1=n2;
				n2=n1+temp;
			}
			System.out.print("Gostaria de executar o programa novamento(S/N): ");
			val = scan.next().charAt(0);
		}
		
		scan.close();
	}

}
