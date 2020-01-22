
public class exer09 {
// Tendo a populaçao A 80000 habitantes e crescendo 3% ao ano e a população B 200000 habitantes e crescendo 1.5% ao ano,
// informe em quantos anos a populaçao A ultrapassará a população B.
	
	public static void main(String[] args) {
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while (popA < popB) {
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont++;
		}
		
		System.out.println("População A: " + popA);
		System.out.println("População B: " + popB);
		System.out.println("População A levaria " + cont + " anos para ultrapassar a população B.");

	}

}