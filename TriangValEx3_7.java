import java.util.*;
public class TriangValEx3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Def scan
		Scanner scan = new Scanner(System.in);
		
		//Def var
		double t1, t2, t3;
		
		//Read data
		System.out.print("Digite a medida do 1� lado do tri�ngulo: ");
		t1 = scan.nextDouble();
		System.out.print("Digite a medida do 2� lado do tri�ngulo: ");
		t2 = scan.nextDouble();
		System.out.print("Digite a medida do 3� lado do tri�ngulo: ");
		t3 = scan.nextDouble();
	
		//Data process
		if(t1+t2<t3 && t1+t3<t2 && t2+t3<t1){
			System.out.println("Tri�ngulo inv�lido!");
		}else{
			//System.out.println("Tri�ngulo v�lido!");
			if(t1 == t2 && t2 == t3){
				System.out.println("Tri�ngulo equil�tero!");
			}else if(t1 == t2 || t1 == t3 || t2 == t3){
				System.out.println("Tri�ngulo is�sceles!");
			}else{
				System.out.println("Tri�ngulo escaleno!");
			}
		}
	
		//Scan close
		scan.close();
	}

}
