package entidade;

public abstract class Animal {
	
	private String nome;
	private double peso;
	
	public Animal() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public abstract void fazerBarulho();
	

}
