package estrutura;
import com.google.gson.Gson;

public class ConvertedorNodesUtil {

	private static final Gson gson = new Gson();
	
	private ConvertedorNodesUtil() {}
	
	public static Node converteJsonParaObjetosNode(String json) {
		return gson.fromJson(json, Node.class);
	}

}
