import java.util.*;
public class EUP {
	public static void main(String[] args) {
		//Declara��o do scan
		Scanner scan = new Scanner(System.in);
		//Declara��o de vari�veis
		int idade;
		String nome;
		//Entrada de dados
		//Nome
		System.out.print("Digite sua nome: ");
		nome = scan.nextLine();
		//Idade
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		//Impress�o de resultado
		System.out.print("Seu nome � " + nome + ".\nSua idade em dias � "+(idade * 365)+".");
	}
}