import java.util.Scanner;
//indica se o usuário informado é masculino ou feminino
public class exer04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		System.out.println("Digite 'F' para feminino e 'M' para masculino: ");
		String input = scan.next();
		
		if(input.equalsIgnoreCase("f")) {
			System.out.println("Usuário feminino.");
		} 
		else if (input.equalsIgnoreCase("m")) {
			System.out.println("Usuário masculino.");
		}
		else {
			System.out.println("Não é uma letra válida.");

		}
	}

}
