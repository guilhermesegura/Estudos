package src;

public class Carro extends Veiculo {
	float preco;
	boolean raridade;
	
	public String toString() {
		return "o " + getModelo() + " fabricado em " + getAnoDeFabricacao() + " custando " + preco + " Dolares";
	}
	
	Carro (int ano, String modelo, String marca, float preco ) {
		super (ano, marca, modelo);
		this.preco = preco;
	}
	
	public static void main (String args[]) {
		
		Carro golfSapao = new Carro(2007, "Sapao", "Volksvagem", 35000);
		
		System.out.println ("O carro criado foi " + golfSapao);
	}
}