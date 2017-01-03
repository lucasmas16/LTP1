import java.util.*;
public class Lista4Ex1 {
	public static void main(String[]args){
		
		Scanner scan = new Scanner(System.in);
		
		int idade,
			contador = 1,
			contJunior = 0,
			contAdulto,
			maiorIdade,
			menorIdade,
			tempo,
			somaTempo;
		double mediaTempo,
			   percentualAdulto;
		
		do{
			System.out.println("Aluno - " + contador);
			
			do{
				System.out.println("Idade (de 0 até 120): ");
				idade = scan.nextInt();
				
				if(idade < 0 || idade > 120){
					System.out.println("Idade invalida!");
				}
			}while(idade < 0 || idade > 120);
			
			if(idade < 16){
				System.out.println("Classificação Júnior.");
			}else if(idade < 65){
				System.out.println("Classificação Adulto.");
				
			}
			
			contador++;
		}while(contador <= 100);
		
	}
}
