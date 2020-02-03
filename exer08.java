import java.util.Scanner;
// informe um nome com mais de 3 caracteres e uma idade maior que 0 e menor que 100.
public class exer08 {

	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in); 
		boolean infoValidas = false;
		String nome;
		int idade;
		
		do {
		System.out.println("Digite seu nome:");		
		nome = scan.nextLine();
		
		if(nome.length() >= 3) {
			infoValidas = true;
			System.out.println("Seu nome é: " + nome);
		} else {
			System.out.println("O nome precisa de no mínimo 3 caracteres. Digite novamente:");

		} 
		} while (!infoValidas);
		
		infoValidas = false;
		
		do {
			System.out.println("Digite sua idade:");		
			idade = scan.nextInt();
			
			if(idade >= 0 && idade <= 100) {
				infoValidas = true;
				System.out.println("Sua idade é: " + idade);
			} else {
				System.out.println("A idade precisa ser entre 0 e 100.");

			} 
			} while (!infoValidas);
	}

}