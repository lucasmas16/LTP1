import java.util.*;
public class EUP {
	public static void main(String[] args) {
		//Declaração do scan
		Scanner scan = new Scanner(System.in);
		//Declaração de variáveis
		int idade;
		String nome;
		//Entrada de dados
		//Nome
		System.out.print("Digite sua nome: ");
		nome = scan.nextLine();
		//Idade
		System.out.print("Digite sua idade: ");
		idade = scan.nextInt();
		//Impressão de resultado
		System.out.print("Seu nome é " + nome + ".\nSua idade em dias é "+(idade * 365)+".");
	}
}