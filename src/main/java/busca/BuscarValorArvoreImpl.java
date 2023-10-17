package busca;

public class BuscarValorArvoreImpl implements IBuscarValorArvore {

    @Override
    public boolean buscarPreOrdem(String ordem, String valor) {
        if (!ordem.isEmpty()) {
        	int index = ordem.indexOf(valor);
        	if(index > 0) {        		
        		String caminhoAteValor = ordem.substring(0, index);
        		caminhoAteValor = caminhoAteValor + valor;
        		System.out.println("-----------------");
        		System.out.println("Caminho Pré-Ordem: " + caminhoAteValor);
        		return true;
        	}
        }
        return false;
    }

    @Override
    public boolean buscarOrdem(String ordem, String valor) {
    	 if (!ordem.isEmpty()) {
         	int index = ordem.indexOf(valor);
         	if(index > 0) {        		
         		String caminhoAteValor = ordem.substring(0, index);
         		caminhoAteValor = caminhoAteValor + valor;
         		System.out.println("-----------------");
         		System.out.println("Caminho Ordem: " + caminhoAteValor);
         		return true;
         	}
         }
         return false;
    }

    @Override
    public boolean buscarPosOrdem(String ordem, String valor) {
    	 if (!ordem.isEmpty()) {
         	int index = ordem.indexOf(valor);
         	if(index > 0) {        		
         		String caminhoAteValor = ordem.substring(0, index);
         		caminhoAteValor = caminhoAteValor + valor;
         		System.out.println("-----------------");
         		System.out.println("Caminho Pós-Ordem: " + caminhoAteValor);
         		return true;
         	}
         }
         return false;
    }

}