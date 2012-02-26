import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problema {

	private final String entrada;
	private String sequencia;
	private List<HashMap<Integer,int[]>> instancias;

	public Problema(String entrada) {
		this.entrada = entrada;
		instancias = new ArrayList<HashMap<Integer,int[]>>();
	}

	
	private void processaInstancias(String entrada){
		String linhas[] = entrada.split("\n");
		for (int i = 0; i < linhas.length; i++) {
			HashMap<Integer,int[]> instancia = new HashMap<Integer,int[]>();
			
			if (i%2==0){
			} else {
				
			}
		}
	}

	public String retornaResultados() {
		String linhas[] = entrada.split("\n");
		String retorno = "não achei";

		sequencia = linhas[1];

		String seq[] = sequencia.split(" ");

		if (Integer.parseInt(linhas[0]) != seq.length)
			return "sequência inválida";
		
		
		
		int numeroAtual;
		int proximoNumero = 0;
		int somaNumerosAnteriores = 0;

		if (seq.length == 1) {
			if (seq[0] == "0")
				retorno = "0";
		}

		for (int i = 0; i < seq.length; i++) {

			numeroAtual = Integer.parseInt(seq[i]);	
			
			if (i < seq.length - 1) {
				proximoNumero = Integer.parseInt(seq[i + 1]);
			}

			somaNumerosAnteriores += numeroAtual;

			if (somaNumerosAnteriores == proximoNumero) {
				retorno = "" + proximoNumero;
				return "Instância 1\n" + retorno;
			}
		}

		return "Instância 1\n" + retorno;
	}

}
