import java.util.*;
public class TriangValEx3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Def scan
		Scanner scan = new Scanner(System.in);
		
		//Def var
		double t1, t2, t3;
		
		//Read data
		System.out.print("Digite a medida do 1º lado do triângulo: ");
		t1 = scan.nextDouble();
		System.out.print("Digite a medida do 2º lado do triângulo: ");
		t2 = scan.nextDouble();
		System.out.print("Digite a medida do 3º lado do triângulo: ");
		t3 = scan.nextDouble();
	
		//Data process
		if(t1+t2<t3 && t1+t3<t2 && t2+t3<t1){
			System.out.println("Triângulo inválido!");
		}else{
			//System.out.println("Triângulo válido!");
			if(t1 == t2 && t2 == t3){
				System.out.println("Triângulo equilátero!");
			}else if(t1 == t2 || t1 == t3 || t2 == t3){
				System.out.println("Triângulo isósceles!");
			}else{
				System.out.println("Triângulo escaleno!");
			}
		}
	
		//Scan close
		scan.close();
	}

}
