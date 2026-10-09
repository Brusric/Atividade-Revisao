package br.edu.fatecpg.encapsulamento.model;
import br.edu.fatecpg.encapsulamento.model.Carro;
public class Main {
	public static void main(String[] args) {
		Carro c1 = new Carro("Ford", "Ka",2022);
		
		System.out.println("Marca: " + c1.marca);
		System.out.println("Modelo: " + c1.modelo);
		System.out.println("Ano: " + c1.ano);
	}
}