import java.util.Scanner;
public class IMC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		
		//Variaveis
		
		double peso, imc, maiorAltura = -1, somaAltura = 0, media = 0, percent, contAcima = 0;
		int contOB = 0, contPI = 0, i;
		char resp;
		
		String nome[] = new String[35];
		double altura[] = new double[35];
		
		//loop para 35 pessoas
		
		for(i = 0; i < 35; i++){
			//Titulo
			System.out.println("Aluno " + (i+1));
			System.out.println("---------------------------------");
			
			//Receber e validar o nome
			do{
				System.out.print("Nome: ");
				nome[i] = scan.nextLine();
				
				if(nome[i].equals("")){
					System.out.println("Digite um nome válido!");
				}
			}while(nome[i].equals(""));
			
			//receber e validar nome
			do{
				System.out.println("Altura de " + nome[i] + ": ");
				altura[i] = scan.nextDouble();
				if(altura[i] < 0 || altura[i] > 3){
					System.out.println("Digite um valor válido!");
				}
			}while(altura[i] < 0 || altura[i] > 3);
			
			
			//receber e validar peso
			do{
				System.out.println("Digite o peso de " + nome[i] + ": ");
				peso = scan.nextDouble();
				
				if(peso < 0 || peso > 500){
					System.out.println("Digite um valor válido!");
				}
			}while(peso < 0 || peso > 500);
			
			//processamento
			imc = peso / (altura[i]*altura[i]);
			
			if(imc <= 18.5){
				System.out.println("Abaixo do peso ideal.");
			}else if(imc <= 24.9){
				System.out.println("Peso Ideal.");
				contPI++;
			}else if(imc <= 29.9){
				System.out.println("Sobrepeso.");
			}else{
				System.out.println("Obesidade.");
				contOB++;
			}
			
			//resultados finais
			somaAltura += altura[i];
			if(altura[i] > maiorAltura){
				maiorAltura = altura[i];
			}
			
			do{
				System.out.print("Deseja finalizar (S/Para sim - N/Para não): ");
				resp = scan.next().charAt(0);
			}while(resp != 'N' || resp != 'S');
			
			if(resp == 'S'){
				break;
			}
			
			scan.nextLine();
		}
		
		if(i < 35){
			i++;
		}
		
		media = somaAltura / i;
		System.out.println("A média de altura do alunos é: " + media);
		System.out.println(contOB + " alunos estão Obesos!");
		percent = contPI * 100 / i;
		System.out.println(percent + "% dos alunos estão no peso ideal.");
		
		
		System.out.println("Nomes dos alunos com maior nota:");
		for(int j = 0; j < i; j++){
			//contar acima da média
			if(altura[i] < media){
				contAcima++;
			}
			//Exibir maior altura
			if(altura[j] == maiorAltura){
				System.out.println(nome[j]);
			}
		}

	}

}
