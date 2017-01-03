import java.util.Scanner;
public class NotaAluno {
	public static void main(String[] args) {
		// Scan var def
		Scanner scan = new Scanner(System.in);
		
		// Var def
		int nota;
		
		// Msg print and scan data
		System.out.print("Digite sua nota: ");
		nota = scan.nextInt();
		
		// Result process and print
		if(nota >= 60){
			System.out.println("Aluno aprovado!");
		} else if (nota >= 25) {
			System.out.println("Aluno em exame especial!");
		} else {
			System.out.println("Aluno reprovado!");
		}
				
		// Scan var end
		scan.close();
	}
}
