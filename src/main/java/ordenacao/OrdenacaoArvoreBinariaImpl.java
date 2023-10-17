package ordenacao;

import estrutura.Node;

public class OrdenacaoArvoreBinariaImpl implements IOrdenacaoArvoreBinaria {

	@Override
	public String retornaPreOrdem(Node node) {
		String resultado = calculaPreOrdemNode(node);
		return resultado.substring(0, resultado.length()-2);
	}

	@Override
	public String retornaOrdem(Node node) {
		String resultado = calculaOrdemNode(node);
		return resultado.substring(0, resultado.length()-2);
	}

	@Override
	public String retornaPosOrdem(Node node) {
		String resultado = calculaPosOrdemNode(node);
		return resultado.substring(0, resultado.length()-2);
	}

	private String calculaPreOrdemNode(Node node) {
	    if (node == null) {
	        return "";
	    }
	    String resultado = node.getNome() + ", ";
	    resultado += calculaPreOrdemNode(node.getEsquerda());
	    resultado += calculaPreOrdemNode(node.getDireita());
	
	    return resultado;
    }
	
	private String calculaOrdemNode(Node node) {
		if (node == null) {
            return ""; 
        }
		
		String resultado = calculaOrdemNode(node.getEsquerda());
        resultado += node.getNome() + ", ";
        resultado += calculaOrdemNode(node.getDireita());

        return resultado;
    }
	
	private String calculaPosOrdemNode(Node node) {
		if (node == null) {
            return ""; 
        }
		
        String resultado = calculaPosOrdemNode(node.getEsquerda());
        resultado += calculaPosOrdemNode(node.getDireita());
        resultado += node.getNome() + ", ";

        return resultado;
    }
	
}
