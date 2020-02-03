//Atribuindo valores à um vetor A e um vetor B
import java.util.Scanner;

public class exer10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++){
		
		System.out.println("Digite um valor para a posição: " + i);
		vetorA[i] = scan.nextInt();
		
		vetorB[i] = vetorA[i];
		}
		
		System.out.print("Valores do Vetor A: ");
		for (int i=0; i<vetorA.length; i++){
			System.out.print(vetorA[i] + " ");
		}
			System.out.println();
			
			System.out.print("Valores do Vetor B: ");
			for (int i=0; i<vetorB.length; i++){
				System.out.print(vetorB[i] + " "); 
			}
			
		}
	}
