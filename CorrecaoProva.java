import java.util.*;
public class CorrecaoProva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		//declaracao de variavel inteira
		int cod = 0, quantComp = 0, quantAsp = 0, quantDip = 0, quantIbu = 0, quantTyl = 0, cont=0, contAsp=0, contDip=0;
		//declaracao de valores reais
		double valorVenda=0.0, valorTotal=0.0;
		
		//execucao do loop principal
		do{
			do{//validador do codigo do produto
				System.out.print("1 - Aspirina\n2 - Dipirona\n3 - Ibuprofeno\n4 - Tylenol\nDigite o código do produto desejado: ");
				cod = scan.nextInt();
				if(cod<1 || cod>5){
					System.out.println("Digite um valor válido!");
				}
			}while(cod<1 || cod>5);
			
			if(cod == 5){//finalizador do programa
				break;
			}
			
			do{//validador de quantidade de produtos comprados
				System.out.print("Digite a quantidade desejada: ");
				quantComp = scan.nextInt();
				if(quantComp<1){
					System.out.println("Digite uma quatidade válida.");
				}
			}while(quantComp<1);
			
			
			//identifica o produto e executa contadores e adiciona no valor total da venda
			if(cod == 1){
				quantAsp = quantAsp + quantComp;
				contAsp++;
				System.out.println("Sua compra tem um valor total de R$"+(7.5*quantComp));
				valorVenda = (7.5*quantComp)+valorVenda;
			}else if(cod == 2){
				contDip++;
				quantDip = quantDip + quantComp;
				System.out.println("Sua compra tem um valor total de R$"+(2.9*quantComp));
				valorVenda = (2.9*quantComp)+valorVenda;
			}else if(cod == 3){
				quantIbu = quantIbu + quantComp;
				System.out.println("Sua compra tem um valor total de R$"+(9.5*quantComp));
				valorVenda = (9.5*quantComp)+valorVenda;
			}else{
				quantTyl = quantTyl + quantComp;
				System.out.println("Sua compra tem um valor total de R$"+(12.8*quantComp));
				valorVenda = (12.8*quantComp)+valorVenda;
			}
			
			//mensagem executada a cada venda
			System.out.println("Obrigado, volte sempre!\n\n______________________________________________________\n");
			
			cont ++; //contador de vendas usado para calcular média
		
				
		}while(true);
		
		//caso tenha sido feita alguma venda ele calcula a media, exibe a quantidade de venda de asp e dip e verifica o produto mais vendido
		if(cont>0){
			
			System.out.println("A média geral de vendas foi: R$"+(valorVenda/cont));
			System.out.println(contAsp+" pessoas compraram Aspirina.\n"+contDip+" pessoas compraram Dipirona.");
			
			//verifica o produto mais vendido
			if((quantAsp>=quantDip) && (quantAsp>=quantIbu) && (quantAsp>=quantTyl)){
				System.out.println("O remédio mais vendido foi a Aspirina!");
			}else if((quantDip>=quantIbu) &&(quantDip>=quantTyl)){
				System.out.println("O remédio mais vendido foi a Dipirona!");
			}else if(quantIbu>=quantTyl){
				System.out.println("O remédio mais vendido foi Ibuprofeno!");				
			}else{
				System.out.println("O remédio mais vendido foi a Tylenol!");
			}
			
			
			
		}else{
			System.out.println("Nenhuma venda foi realizada!");
		}
		
		scan.close();
	}

}
