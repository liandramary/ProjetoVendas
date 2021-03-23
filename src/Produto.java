
public class Produto {

	private String nome;
	private Double preço;
	private int quantidade;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setPreço(Double preço) {
		this.preço = preço;
	}
	
	public Double getPreço() {
		return this.preço;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
}
