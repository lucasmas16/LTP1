import java.util.Scanner;

public class avaliacao1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		char val = 's';
		String nome, maiorFun = "", menorFun = "";
		int totalFun = 0, imp = 0, naoAum = 0;
		double sal = 0, salSoma = 0, maiorSal = 0, menorSal = 99999999;
		
		do{
			System.out.print("Digite o nome do funcion�rio: ");
			nome = scan.next();
			do{
				System.out.println("Digite o sal�rio de "+nome+": ");
				sal = scan.nextDouble();
					
				
				if(sal <= 0){
					System.out.println("Digite um valor v�lido!");
				}
			}while(sal <= 0);
			
			if(sal <= 1500){
				sal = sal * 1.15;
			}else if(sal <= 5000){
				sal = sal * 1.1;
			}else if(sal <= 10000){
				sal = sal * 1.05;
			}else{
				naoAum ++;
			}
			
			if(sal <= 7500){
				sal = sal * 0.925;
				imp ++;
			}else{
				sal = sal * 0.89;
			}
			
			if(sal > maiorSal){
				maiorSal = sal;
				maiorFun = nome;
			}
			if(sal < menorSal){
				menorSal = sal;
				menorFun = nome;
			}
			
			salSoma = salSoma + sal;
			
			totalFun ++;
			
			System.out.println("O sal�rio final de "+nome+" � R$"+sal+"!");
			System.out.println("________________________________________\n");
			System.out.print("Deseja fazer uma nova inser��o? (s/n): ");
			val = scan.next().charAt(0);
			
		}while(val == 's');
		
		System.out.println("A m�dia dos novos sal�rios �: R$"+(salSoma/totalFun));
		System.out.println("A soma de todos os sal�rios � de R$"+salSoma+"!");
		System.out.println(imp+" funcion�rios pagaram 7,5% de imposto.");
		System.out.println(((100*naoAum)/totalFun)+"% dos funcion�rios n�o tiveram aumento.");
		System.out.println(maiorFun+" recebeu o maior sal�rio!");
		System.out.println(menorFun+" recebeu o menor sal�rio!");
		
		scan.close();
	}

}
