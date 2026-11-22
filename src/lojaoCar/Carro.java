package lojaoCar;

public class Carro {

	public String marca;

	public String cor;

	public String modelo;

	public void exibirInformacoes() {

		System.out.println(this.toString());
	}
	@Override
	public String toString() {
		return "Marca: " + marca +
							"\nCor : " + cor +
							"\nModelo : " + modelo;
	}
}
