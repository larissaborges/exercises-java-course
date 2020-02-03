//Matriz com 4 notas de 3 alunos
public class exer12 {
	public static void main(String[] args) {
		double[][] notasAlunos = new double [3][4];
		
		notasAlunos [0][0] = 10;
		notasAlunos [0][1] = 8;
		notasAlunos [0][2] = 0;
		notasAlunos [0][3] = 9;
		
		notasAlunos [1][0] = 6;
		notasAlunos [1][1] = 7.5;
		notasAlunos [1][2] = 8;
		notasAlunos [1][3] = 10;
		
		notasAlunos [2][0] = 9.5;
		notasAlunos [2][1] = 8;
		notasAlunos [2][2] = 7;
		notasAlunos [2][3] = 10;
		
		
		for(int i=0; i<notasAlunos.length; i++) {
			for(int j=0; j<notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j]);
			}
		}
					
	}
}
