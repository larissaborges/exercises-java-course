//Exercício básico sobre classes, objetos e atributos
public class exer13 {

	public static void main(String[] args) {
		Lampada lampada = new Lampada();
		
		lampada.modelo = "A60";
		lampada.tensao = "Bivolt";
		lampada.garantiaMeses = 36;
		lampada.potencia = 7;
		lampada.cor = "Amarela";
		lampada.tipoLuz = "Amarela";
		lampada.tipoAbajur = true;
		
		lampada.tipos = new String[5];
		lampada.tipos[0] = "Abajur";
		lampada.tipos[1] = "Lampeões";

		System.out.println("Modelo da lampada: " + lampada.modelo);
		System.out.println("Tensão da lampada: " + lampada.tensao);
		System.out.println("Tempo de garantia da lampada: " + lampada.garantiaMeses);
		System.out.println("Potência da lampada: " + lampada.potencia);
		System.out.println("Cor da lampada: " + lampada.cor);
		System.out.println("Tipo de luz da lampada: " + lampada.tipoLuz);

	}

}
