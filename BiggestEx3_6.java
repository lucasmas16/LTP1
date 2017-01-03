import java.util.*;
public class BiggestEx3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		double n1, n2, n3, result;
		result = 0;
		
		System.out.print("Digite um número real: ");
		n1 = scan.nextDouble();
		System.out.print("Digite outro número real: ");
		n2 = scan.nextDouble();
		System.out.print("Digite outro número real: ");
		n3 = scan.nextDouble();
		
		if(n1>n2 && n1>n3){
			result = n1;
		}else if(n2>n3){
			result = n2;
		}else{
			result = n3;
		}
		
		System.out.println("O maior número é: "+ result);
		
		scan.close();
	}

}
