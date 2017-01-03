import java.util.*;
public class ComandoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int cont=0, nota=0;
		String nome;
		
		while(cont<7){
			System.out.print("Digite o nome do aluno: ");
			nome=scan.next();
			
			System.out.print("Digite a nota de "+nome+": ");
			nota=scan.nextInt();
			
			while(nota<0||nota>100){
				System.out.print("Digite uma nota válida para "+nome+": ");
				nota=scan.nextInt();
			}
			
			if(nota>=60){
				System.out.println("APROVADO!");
			}else{
				System.out.println("REPROVADO!");
			}
			cont++;
		}
		
		scan.close();
	}

}
