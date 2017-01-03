import java.util.*;

public class ComandosBasicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//Declarar Variáveis
		int idade;
		String nomeAluno;
		float salario;
		char letra;
		
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		
		System.out.print("Digite seu salário: ");
		salario = scan.nextFloat();
		
		System.out.print("Digite seu nome: ");
		nomeAluno = scan.nextLine();
		
		/*
		//Imprime uma variável
		int x = 99;	
		System.out.println("O conteudo da variável é: "+x+"\nO dobro da variável é: "+(x*2));
		
		
		//Imprime meu nome
		System.out.print("Lucas ");
		System.out.print("Santos");
		*/
	}

}
