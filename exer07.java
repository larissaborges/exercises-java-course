import java.util.Scanner;

public class exer07 {

	public static void main(String[] args) {
Scanner scan = new Scanner (System.in); 
		
		boolean infoValidas = false;
		
		do {
		System.out.println("Digite seu nome de usuário:");		
		String User = scan.nextLine();
		System.out.println("Digite sua senha:");		
		String Senha = scan.nextLine();
		
		if (User.equalsIgnoreCase(Senha)) {
			System.out.println("Senha igual ao nome de usuário, digite novamente.");
		} else {
			infoValidas = true;
			System.out.println("Senha e usuário válidos!");
		}
		} while (!infoValidas);
	}

}
