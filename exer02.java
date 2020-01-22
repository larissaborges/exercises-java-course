import java.util.Scanner;
// indica o maior dos números informados
public class exer02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
			System.out.println("Digite o primeiro número: ");
				int num1 = scan.nextInt();
			System.out.println("Digite o segundo número: ");
				int num2 = scan.nextInt();
				
			if (num1 > num2) {
				System.out.println(num1 + " é maior.");
			} else {
				System.out.println(num2 + " é maior.");
			}
	}

}
