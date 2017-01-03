import java.util.*;
public class Gabarito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		//variaveis
		int i, j, notas[] = new int[250], maiorNota = -1, cont60 = 0, contAcima = 0;
		char gabarito [] = new char[10], resp;
		String nomes[] = new String[250];
		double soma = 0, media;
		
		// solicitar gabarito
				
		for(i=0; i<10; i++){
			do{
				System.out.print("Resposta da " +(i+1)+ "ª questão: ");
				gabarito[i] = scan.next().charAt(0);
				
				if(gabarito[i] < 'a' || gabarito[i] > 'e'){
					System.out.println("Digite uma resposta valida!");
				}
			}while(gabarito[i] < 'a' || gabarito[i] > 'e');
		}
		
		
		//recebimento da nota dos alunos
		
		for(j=0; j<250; j++){
			System.out.print("Digite o nome do "+(j+1)+"´º aluno: ");
			nomes[j] = scan.next();
			
			//break para finalizacao de progama
			if(nomes[j].equals("Fim")){
				break;
			}
			
			//Leitura de gabarito do aluno x
			for(i=0; i<10; i++){
				//validacao de resposta
				do{
					System.out.print("Digite a resposta que "+nomes[j]+" digitou para a questao "+(i+1)+": ");
					resp = scan.next().charAt(0);
					if(resp<'a'||resp>'e'){
						System.out.println("Digite uma resposta valida!");
					}
				}while(resp<'a'||resp>'e');
				
				//contador do pontos do aluno x
				if(resp == gabarito[i]){
					notas[j]++;
				}
			}
			
			//exibe nota do aluno
			System.out.println("A nota final de "+nomes[j]+" é: "+notas[j]+".");
			
			//soma nota com o total
			soma += notas[j];
			
			//verifica se a nota do aluno e maior caso seja substitui a maior nota
			if(notas[j] > maiorNota){
				maiorNota = notas[j];
			}
			
			//verifica se o aluno esta acima da media
			if(notas[j]>6){
				cont60++;
			}
			
		}
		
		//resultados finais
		
		if(j==0){
			System.out.println("Nao houve participacao");
		}else{
			//calcula e exibe a media
			media = soma / j;
			System.out.println("Media da turma: "+media);
			
			System.out.println("Alunos com a maior nota: "+maiorNota);
			for(i=0; i<j; i++){
				//exibe alunos com a maior nota
				if(notas[i]==maiorNota){
					System.out.println(nomes[i]);
				}
				//conta notas acima da media
				if(notas[1]>media){
					contAcima++;
				}
			}
			
			System.out.println((cont60*100/j)+"% dos alunos ficaram acima da media.");
			System.out.println(contAcima+" alunos ficaram acima da media da turma.");
			
			scan.close();
		}
		
	}

}
