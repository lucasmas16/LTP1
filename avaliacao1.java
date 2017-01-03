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
			System.out.print("Digite o nome do funcionário: ");
			nome = scan.next();
			do{
				System.out.println("Digite o salário de "+nome+": ");
				sal = scan.nextDouble();
					
				
				if(sal <= 0){
					System.out.println("Digite um valor válido!");
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
			
			System.out.println("O salário final de "+nome+" é R$"+sal+"!");
			System.out.println("________________________________________\n");
			System.out.print("Deseja fazer uma nova inserção? (s/n): ");
			val = scan.next().charAt(0);
			
		}while(val == 's');
		
		System.out.println("A média dos novos salários é: R$"+(salSoma/totalFun));
		System.out.println("A soma de todos os salários é de R$"+salSoma+"!");
		System.out.println(imp+" funcionários pagaram 7,5% de imposto.");
		System.out.println(((100*naoAum)/totalFun)+"% dos funcionários não tiveram aumento.");
		System.out.println(maiorFun+" recebeu o maior salário!");
		System.out.println(menorFun+" recebeu o menor salário!");
		
		scan.close();
	}

}
