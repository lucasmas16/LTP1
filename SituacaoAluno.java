import java.util.Scanner;

public class SituacaoAluno {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double nota = 0, total = 0;
		int aprovado = 0, reprovado = 0, especial = 0;
		String nome;
		char rep = 'S';
		
		do{
			
			do{
				System.out.print("Digite o nome do aluno: ");
				nome = scan.next();
				System.out.print("Digite a nota de "+nome+": ");
				nota = scan.nextDouble();
				
				if(nota < 0 || nota > 100){
					System.out.println("Digite um valor válido para a nota de "+nome+".");
				}
				
			}while(nota < 0 || nota > 100);
			
			total = total + nota;
			
			if(nota >= 60){
				System.out.println(nome+" está aprovado!");
				aprovado ++;
			}else if(nota < 60 && nota >= 25){
				System.out.println(nome+" está em exame especial!");
				especial ++;
			}else{
				System.out.println(nome+" está reprovado!");
				reprovado ++;
			}
			
			do{
				System.out.println("Deseja executar o programa para outro aluno? S/N");
				rep = scan.next().charAt(0);
			}while(rep  != 'S' && rep != 'N');
			
			if(rep == 'N'){
				break;
			}
			
		}while(true);
		
		System.out.println("O número de alunos aprovados foi de: "+aprovado+" alunos");
		System.out.println("O número de alunos em especial foi de: "+especial+" alunos");
		System.out.println("O número de alunos reprovados foi de: "+reprovado+" alunos");
		System.out.println("A nota total da turma foi: "+total);
		System.out.println("A média foi de: "+((total)/(aprovado+especial+reprovado)));
		System.out.println("A porcentagem de reprovação foi de :"+(((double)reprovado/(aprovado+especial+reprovado))*100)+"%");
		
		scan.close();
	}

	private static int doubleValue(int reprovado) {
		// TODO Auto-generated method stub
		return 0;
	}

}
