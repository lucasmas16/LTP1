import java.util.*;
public class LucasManoelAssisSantos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int prod = 0,	//C�digo do produto
			quant = 0,	//Quantidade do produto
			qasp = 0,	//Quantidade de aspirinas vendidas
			qdip = 0,	//Quantidade de Dipironas vendidas
			qibu = 0,	//Quantidade de Ibuprofenos vendidos
			qtyl = 0,	//Quantidade de Tylenois vendidos
			cont = 0,	//Contador do n�mero de vendas
			contasp = 0,//Contador de n�mero de compras onde foram vendidas aspirinas
			contdip = 0;//Contador de n�mero de compras onde foram vendidas dipironas
		double vendas = 0;//Valor total das vendas somadas durante a execu��o
		
		
		//Loop central do programa
		do{
			
			//L� e valida o c�digo do produto
			do{
				System.out.print("Digite o c�digo do produto desejado\n\n1 - Aspirina\n2 - Dipirona\n3 - Ibuprofeno\n4 - Tylenol\n\n5 - Finalizar programa!\n\nC�digo:");
				prod = scan.nextInt();
				if(prod < 1 || prod > 5){
					System.out.println("\nDigite um c�digo v�lido.");
				}
			}while(prod < 1 || prod > 5);
			
			//Finaliza o programa
			if(prod == 5){
				break;
			}
			
			//L� e valida a quantidade
			do{
				System.out.print("Digite a quantidade desejada:");
				quant = scan.nextInt();
				if(quant < 1){
					System.out.println("Digite uma quatidade v�lida.");
				}
			}while(quant < 1);
			
			//Exibe o valor total da compra e alimenta os contadores
			if(prod == 1){
				qasp = qasp + quant;
				contasp++;
				System.out.println("Sua compra tem um valor total de R$"+(7.5*quant));
				vendas = (7.5*quant)+vendas;
			}else if(prod == 2){
				contdip++;
				qdip = qdip + quant;
				System.out.println("Sua compra tem um valor total de R$"+(2.9*quant));
				vendas = (2.9*quant)+vendas;
			}else if(prod == 3){
				qibu = qibu + quant;
				System.out.println("Sua compra tem um valor total de R$"+(9.5*quant));
				vendas = (9.5*quant)+vendas;
			}else{
				qtyl = qtyl + quant;
				System.out.println("Sua compra tem um valor total de R$"+(12.8*quant));
				vendas = (12.8*quant)+vendas;
			}
			
			System.out.println("Obrigado, volte sempre!\n\n______________________________________________________\n");
			
			cont ++;
		}while(true);
		
		//Verifica se houve alguma venda
		if(cont > 0){
			System.out.println("A m�dia geral de vendas foi: R$"+(vendas/cont));
			System.out.println(contasp+" pessoas compraram Aspirina.\n"+contdip+" pessoas compraram Dipirona.");
			
			//Verifica o maior valor
			if(qasp > qdip){//Amanda - n�o dava para simplificar?
				if(qasp > qibu){
					if(qasp > qtyl){
						System.out.println("O rem�dio mais vendido foi a Aspirina!");
					}else{
						System.out.println("O rem�dio mais vendido foi a Tylenol!");
					}
				}else if(qibu > qtyl){
					System.out.println("O rem�dio mais vendido foi Ibuprofeno!");
				}else{
					System.out.println("O rem�dio mais vendido foi Tylenol!");
				}
			}else if(qdip > qibu){
				if(qdip >  qtyl){
					System.out.println("O rem�dio mais vendido foi a Dipirona!");
				}else{
					System.out.println("O rem�dio mais vendido foi a Tylenol!");
				}
			}else{
				if(qibu > qtyl){
					System.out.println("O rem�dio mais vendido foi Ibuprofeno!");
				}else{
					System.out.println("O rem�dio mais vendido foi Tylenol!");
				}
			}
			
			
		}else{
			System.out.println("Voc� n�o vendeu nada!");
		}
		
		scan.close();
	}

}
