//Lucas Manoel Assis Santos

import java.util.*;
public class SalarioEx3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double sal;
		char sex;
		
		System.out.print("H - Homem\nM - Mulher\nDigite o sexo do funcionário: ");
		sex = scan.next().charAt(0);
		
		System.out.print("Digite o sálario base do funcionário: ");
		sal = scan.nextDouble();
		
		if((sex == 'H' || sex == 'M') && sal >= 0){
			if(sal <= 1500){
				sal = sal*1.1;
			}else if(sal <= 5000){
				sal = sal*1.15;
			}if(sex == 'M'){
				sal = sal + 150;
			}
			System.out.println("O funcionário recebe R$"+sal+" de salário.");
		}else{
			System.out.println("Entrada inválida!");
		}
		
		scan.close();
	}

}
