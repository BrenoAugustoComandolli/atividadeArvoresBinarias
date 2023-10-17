package estrutura;

public class Node {

	private String nome;
	private Node esquerda;
	private Node direita;
	
	public Node(String nome, Node esquerda, Node direita) {
		this.nome = nome;
		this.esquerda = esquerda;
		this.direita = direita;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Node getEsquerda() {
		return esquerda;
	}

	public void setEsquerda(Node esquerda) {
		this.esquerda = esquerda;
	}

	public Node getDireita() {
		return direita;
	}

	public void setDireita(Node direita) {
		this.direita = direita;
	}
	
}
