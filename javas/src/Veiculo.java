package src;

public class Veiculo {
	
	private int AnoDeFabricacao;
	private String Marca;
	private String Modelo;
	
	Veiculo (int adf, String mrc, String mdl) {
		AnoDeFabricacao = adf;
		Marca = mrc;
		Modelo = mdl;
		
	}
	
	public String getModelo() {
		return Modelo;
	}
	
	public int getAnoDeFabricacao() {
		return AnoDeFabricacao;
	}
	
	public void setAnoDeFabricacao(int AnoDeFabricacao) {
		this.AnoDeFabricacao = AnoDeFabricacao;
	}
}
