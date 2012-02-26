import junit.framework.Assert;

import org.junit.Test;

public class ProblemaTest {

	@Test
	public void seEntrarComUmAlgarismoSendoEsteZeroDeveRetornarZero() {
		Problema problema = new Problema("1\n0");
		Assert.assertEquals("Instância 1\n0", problema.retornaResultados());
	}

	@Test
	public void deveRetornarOProprioNumeroParaDoisNumerosIguais() {
		Problema problema = new Problema("2\n1 1");
		Assert.assertEquals("Instância 1\n1", problema.retornaResultados());

		problema = new Problema("2\n2 2");
		Assert.assertEquals("Instância 1\n2", problema.retornaResultados());

	}
	
	@Test
	public void deveRetornar3() {
		Problema problema = new Problema("7\n1 2 3 4 5 6 7");
		Assert.assertEquals("Instância 1\n3", problema.retornaResultados());
	}

	@Test
	public void deveRetornarNaoAcheiParaDoisNumerosDiferentes() {
		Problema problema = new Problema("2\n1 2");
		Assert.assertEquals("Instância 1\nnão achei",
				problema.retornaResultados());
	}
	
	@Test
	public void retornoResultadosDeveRetornarSequenciaInvalida() {
		Problema problema = new Problema("6\n1 2 3 4 5 6 7");
		Assert.assertEquals("sequência inválida", problema.retornaResultados());
	}

	@Test
	public void deveRetornar15() {
		Problema problema = new Problema("7\n1 2 4 3 5 15 7");
		Assert.assertEquals("Instância 1\n15", problema.retornaResultados());
	}


	@Test
	public void deveRetornar15E3() {
		Problema problema = new Problema("7\n1 2 4 3 5 15 7\n2\n1 2");
		Assert.assertEquals("Instância 1\n15\nInstância 2\n3", problema.retornaResultados());
	}

}
