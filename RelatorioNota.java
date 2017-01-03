import java.util.*;
public class RelatorioNota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner (System.in);

		//Variables declaration
		
		//Simple variables
		int score = -1,		//Temp variable to student
			i, 				//cont
			total = 0;		//Total score of all students
		
		double media = 0;	//Medium score of class
		
		//Vectors
		int scores[] = new int [11];	//vector that stores how many students took that grade
		
		

		//loop to initialize the vector
		for (i = 0; i < 11 ; i++) {
			scores[i] = 0;
		}

		
		//loop to read score student by student
		for (i = 0; i < 75 ; i++) {
			//validation loop admit -1 to exit or grades between 0 and 10
			do {
				System.out.print("Enter any grade between 0 and 10 or -1 to exit: ");
				score = leia.nextInt();
				
				if (score < -1 || score > 10){
					System.out.println("Invalid value!");
				}
				
			} while (score < -1 || score > 10);
			
			//if user entered with -1, the break is activated
			if (score == -1) {
				break;
			}
			
			//sum this scores with others to calculate the medium
			total += score;
			
			//sum 1 to calculate how many students took that score 
			scores[score]++;

		}
		
		//take the medium
		if (i > 0) {
			media = total / i;
		}
		
		//Print the vector showing number of students by score
		for (i = 0; i < 11; i++) {
			System.out.println(scores[i]+ " students took "+ i + ".");
		}	
		
		//Print medium
		System.out.println("The medium of class was: " + media);



		leia.close();

	}

}
