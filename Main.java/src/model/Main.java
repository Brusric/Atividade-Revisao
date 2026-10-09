package model;
import model.Aluno;

public class Main {
	public static void main (String[] args) {
		Aluno a1 = new Aluno("vazio", 0,0);
				a1.setNome("Vinicius");
				a1.setMatricula(67);
				a1.setNotaFinal(10);
				System.out.println("Nome: " + a1.getNome());
				System.out.println("Matricula: " + a1.getMatricula());
				System.out.println("Nota Final: " + a1.getNotaFinal());
	}

}
