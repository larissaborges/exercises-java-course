import java.util.Scanner;
//indica se o número informado é positivo ounegativo
public class exer03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		System.out.println("Digite um número: ");
			int num = scan.nextInt();
			
			if (num >= 0) {
				System.out.println("o número é positivo.");
			} else {
				System.out.println("o número é negativo.");

			}
	}

}
