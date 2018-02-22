package com.uepb.tcc.gildedrose.manual;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.uepb.tcc.gildedrose.GildedRose;
import com.uepb.tcc.gildedrose.Item;

public class GildedRoseTest {

	private Item[] itens;
	private GildedRose app;
	
	@Before
	public void setUp() {
		itens = new Item[] { new Item("Padrao", 0, 10),
							 new Item("Padrao", 0, 0),
							 new Item("Brie Envelhecido", 10, 10),
							 new Item("Brie Envelhecido", 10, 50),
							 new Item("Sulfuras", 10, 10),
							 new Item("Entrada para os Bastidores", 9, 2),
							 new Item("Entrada para os Bastidores", 5, 2),
							 new Item("Entrada para os Bastidores", 0, 2) };
		app = new GildedRose(itens);
		app.atualizaQualidade();
	}
	
	@Test
	public void QuandoADataDeVendaTiverPassadoAQualidadeDiminuiDuasVezesMais() {
		assertEquals(8, itens[0].qualidade);
	}
	
	@Test
	public void itemPadraoQualidadeNaoPodeSerNegativa() {
		assertEquals(0, itens[1].qualidade);
	}
	
	@Test 
	public void brieEnvelhecidoAumentaQualidadeEmUmAMedidaQueEnvelhece() {
		assertEquals(11, itens[2].qualidade);
	}
	
	@Test
	public void qualidadeDoItemNaoPodeSerMaiorQueCinquenta() {
		assertEquals(50, itens[3].qualidade);
	}
	
	@Test
	public void SufurasQualidadeNaoDeveSerDiminuida() {
		assertEquals(10, itens[4].qualidade);
	}
	
	@Test
	public void entradaParaOsBastidoresDeveAumentarAQualidadeEmDoisQuandoDiaDeVendaMenorOuIgualQueDez() {
		assertEquals(4, itens[5].qualidade);
	}
	
	@Test
	public void entradaParaOsBastidoresDeveAumentarAQualidadeEmTresQuandoDiaDeVendaMenorOuIgualQueCinco() {
		assertEquals(5, itens[6].qualidade);
	}
	
	@Test
	public void entradaParaOsBastidoresVaiDiretoAZeroQuandoDataDeVendaTiverPassado() {
		assertEquals(0, itens[7].qualidade);
	}
}
