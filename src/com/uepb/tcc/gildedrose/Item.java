package com.uepb.tcc.gildedrose;

public class Item {

	public String nome;
	public int diaVenda;
	public int qualidade;
	
	public Item(String nome, int diaVenda, int qualidade) {
		this.nome = nome;
		this.diaVenda = diaVenda;
		this.qualidade = qualidade;
	}

	@Override
	public String toString() {
		return this.nome + ", " + this.diaVenda + ", " + this.qualidade;
	}
}
