package tadsLeilao.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import tadsLeilao.Lance;
import tadsLeilao.Leilao;
import tadsLeilao.Usuario;
import tadsLeilao.servico.Avaliador;

public class TesteDoAvaliador {
	
	@Test
	public void testOrdemLances() {
		Usuario joao = new Usuario("João");
		Usuario jose = new Usuario("Jose");
		Usuario maria = new Usuario("Maria");
		
		Leilao leilao = new Leilao("Playstation 4 Novo");
		
		leilao.propoe(new Lance(joao, 250.0));
		leilao.propoe(new Lance(jose, 300.0));
		leilao.propoe(new Lance(maria, 400.0));
		
		Avaliador leiloeiro = new Avaliador();
		leiloeiro.avalia(leilao);
		
		double maiorEsperado = 400.0;
		double menorEsperado = 250.0;
		
		assertEquals(maiorEsperado, leiloeiro.getMaiorLance(), 0.00001);
		assertEquals(menorEsperado, leiloeiro.getMenorLance(), 0.00001);
		
	}
}
