import java.util.*;
public class MostrarSequencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int sequencia;
		double soma=0;
		int nTermos=0;
		char val = 'n';
		
		for(;;){
			for(;;){
				System.out.print("Qual sequencia deseja executar (1/2): ");
				sequencia = scan.nextInt();
				if(sequencia==1||sequencia==2){
					break;
				}
			}
			
			switch(sequencia){
			
			case 1:

					soma=0;
					nTermos=0;
					
					System.out.print("Digite o n�mero de termos da 1� sequencia deseja consultar:");
					nTermos = scan.nextInt();
					while(nTermos<=0){
						System.out.print("\nDigite um n�mero v�lido:");
					}
					for(int i = 1; i<=nTermos; i++){
						System.out.print("O "+i+"� termo �: ");
						System.out.println((i+i-1.)/(i*i));
						soma+=(i+i-1.)/(i*i);
					}
					System.out.println("\nA soma dos elementos �: "+soma);
					break;
			case 2:
					
					soma=0;
				    nTermos=0;
					
					System.out.print("Digite o n�mero de termos da 2� sequencia deseja consultar:");
					nTermos = scan.nextInt();
					while(nTermos<=0){
						System.out.print("\nDigite um n�mero v�lido:");
					}
					for(int i = 1; i<=nTermos; i++){
						System.out.print("O "+i+"� termo �: ");
						System.out.println((i*i*i)/(i*Math.pow(10, (i-1))));
						soma+=(i*i*i)/(i*Math.pow(10, (i-1)));
					}
					System.out.println("\nA soma dos elementos �: "+soma);
					break;
			}
			System.out.print("\n\n Deseja executar novamente(S/N): ");
			val = scan.next().charAt(0);
			if(val=='n'||val=='N'){
				break;
			}
			
		}
	}
}
