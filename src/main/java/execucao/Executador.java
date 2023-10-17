package execucao;


import java.util.Scanner;

import busca.BuscarValorArvoreImpl;
import busca.IBuscarValorArvore;
import estrutura.ConvertedorNodesUtil;
import estrutura.ExibicaoUtil;
import estrutura.LeitorArquivoUtil;
import estrutura.Node;
import ordenacao.IOrdenacaoArvoreBinaria;
import ordenacao.OrdenacaoArvoreBinariaImpl;

public class Executador {
	
	private static IOrdenacaoArvoreBinaria ordenador = new OrdenacaoArvoreBinariaImpl();
	private static IBuscarValorArvore buscador = new BuscarValorArvoreImpl();
	private static Node nodeRaiz;
	
	public static void main(String[] args) {
		montaNodes();
		ExibicaoUtil.mostrarArvoresNodes(nodeRaiz);
		executaMenuOperacoes();
	}

	private static void montaNodes() {
		String texto = LeitorArquivoUtil.lerArquivo();
		nodeRaiz = ConvertedorNodesUtil.converteJsonParaObjetosNode(texto);
	}
	
	private static void executaMenuOperacoes() {
		Scanner sc = new Scanner(System.in);
		
		int opcao = 0;
		while (opcao != 4) {
			ExibicaoUtil.exibeMenuOpcoes();
			
			try {	
				opcao = sc.nextInt();
				limpaConsole(sc);
			} catch (NumberFormatException e) {
				System.out.println("Formato inválido!");
				continue;
			}
			
			executaAcaoConformeOpcao(opcao);
		}
	}

	private static void limpaConsole(Scanner sc) {
		sc.nextLine();
	}

	private static void executaAcaoConformeOpcao(int opcao) {
		String ordem = "";
		
		switch (opcao) {
			case 1: {
				ordem = ordenador.retornaPreOrdem(nodeRaiz); 
				exibeOrdem(ordem);
				solicitaValorBusca(ordem, opcao);
				break; 
			}
			case 2: {
				ordem = ordenador.retornaOrdem(nodeRaiz); 
				exibeOrdem(ordem);
				solicitaValorBusca(ordem, opcao);
				break; 
			}
			case 3: {
				ordem = ordenador.retornaPosOrdem(nodeRaiz); 
				exibeOrdem(ordem);
				solicitaValorBusca(ordem, opcao);
				break; 
			}
			case 4: {
				System.out.println("Saindo..."); 
				break; 
			}
			default: {
				System.out.println("Opção inválida!");
			}
		}
	}
	
	private static void solicitaValorBusca(String ordem, int opcao) {
		Scanner sc = new Scanner(System.in);
		
		String valor = null;
		while (valor == null) {
			ExibicaoUtil.exibeSolicitacaoValor();
			
			try {	
				valor = sc.next();
				limpaConsole(sc);
			} catch (Exception e) {
				System.out.println("Formato inválido!");
				continue;
			}
			
			executaBusca(ordem, valor, opcao);
		}
	}
	
	private static void executaBusca(String ordem, String valor, int opcao) {
		switch (opcao) {
			case 1: {
				buscador.buscarPreOrdem(ordem, valor);
				break; 
			}
			case 2: {
				buscador.buscarOrdem(ordem, valor);
				break; 
			}
			case 3: {
				buscador.buscarPosOrdem(ordem, valor);
				break; 
			}
			default:{
				System.out.println("Opção inválida!");
			}
		}
	}

	private static void exibeOrdem(String ordem) {
		if(!ordem.isBlank()) {
			System.out.println("------------------");
			System.out.println("Resultado: "+ ordem);
			System.out.println("------------------");
		}
	}
}
