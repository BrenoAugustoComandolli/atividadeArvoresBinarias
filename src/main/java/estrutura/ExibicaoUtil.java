package estrutura;

public class ExibicaoUtil {

	private ExibicaoUtil() {}
	
	public static void exibeMenuOpcoes() {
		System.out.println("-----------------");
		System.out.println("Escolha uma opção");
		System.out.println("-----------------");
		System.out.println("1 - Pré-ordem");
		System.out.println("2 - Ordem");
		System.out.println("3 - Pós-ordem");
		System.out.println("4 - Sair");
		System.out.println("-----------------");
	}
	
	public static void exibeSolicitacaoValor() {
		System.out.println("-----------------");
		System.out.println("Informe o valor de busca: ");
		System.out.println("-----------------");
	}

	public static void mostrarArvoresNodes(Node nodeRaiz) {
		System.out.println("-----------------");
		System.out.println("Árvore binária:  ");
		System.out.println("-----------------");
		exibirArvore(nodeRaiz, "", false);
	}

	private static void exibirArvore(Node node, String prefixo, boolean esquerda) {
		if (node != null) {
            String marcador = esquerda ? "(E)" : "(D)";
            System.out.println(prefixo + node.getNome() + " " + marcador);
            exibirArvore(node.getEsquerda(), prefixo + "|  ", true);
            exibirArvore(node.getDireita(), prefixo + "|  ", false);
        }
	}
	
}
