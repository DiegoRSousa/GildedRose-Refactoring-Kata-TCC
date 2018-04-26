package com.uepb.tcc.gildedrose;

public class GildedRose {
	Item[] itens;

	public GildedRose(Item[] itens) {
		this.itens = itens;
	}
	
	public void atualizaQualidade() {
		for(int i = 0; i < itens.length; i++) {
			atualizarItem(itens[i]);
		}		
	}
	
	public void atualizarItem(Item item) {
		if(item.nome.equals("Brie Envelhecido")) {
			atualizarBrieEnvelhecido(item);
		} else if(item.nome.equals("Entrada para os Bastidores")) {
			atualizarEntradaParaOsBastidores(item);
		} else if(item.nome.equals("Conjurados")) {
			atualizarConjurados(item);
		} else {
			atualizarItemPadrao(item);
		}
	}
	
	public void atualizarBrieEnvelhecido(Item item) {
		if(item.qualidade < 50) {
			item.qualidade = item.qualidade + 1;
		}
		item.diaVenda = item.diaVenda - 1;
		if(item.diaVenda < 0)
			if (item.qualidade < 50)
	            item.qualidade = item.qualidade + 1;
	}
	
	public void atualizarEntradaParaOsBastidores(Item item) {
		if(item.qualidade < 50) {
			item.qualidade = item.qualidade + 1;
		
			if(item.diaVenda < 11) {
				if(item.qualidade < 50) {
					item.qualidade = item.qualidade + 1;
				}
			}
			if(item.diaVenda < 6) {
				if(item.qualidade < 50) {
					item.qualidade = item.qualidade + 1;
				}
			}
		}
		
		item.diaVenda = item.diaVenda - 1;
		
		if(item.diaVenda < 0)
			item.qualidade = item.qualidade - item.qualidade;
	}
	
	public void atualizarConjurados(Item item) {
		if(item.qualidade > 1) {
			item.qualidade = item.qualidade - 2;
		} else if (item.qualidade == 1)  {
			item.qualidade = item.qualidade - 1;
		}
		item.diaVenda = item.diaVenda - 1;
		if(item.diaVenda < 0) {
			if(item.qualidade > 1) {
				item.qualidade = item.qualidade - 2;
			} else if (item.qualidade == 1)  {
				item.qualidade = item.qualidade - 1;
			}
		}
	}
	
	public void atualizarItemPadrao(Item item) {
		if(item.qualidade > 0) {
			if(!item.nome.equals("Sulfuras")) {
				item.qualidade = item.qualidade - 1;
			}
		}
		if (!item.nome.equals("Sulfuras")) {
			item.diaVenda = item.diaVenda - 1;
		}
		if(item.diaVenda < 0) {
			if (item.qualidade > 0) {
                if (!item.nome.equals("Sulfuras")) {
                    item.qualidade = item.qualidade - 1;
                }
            }
		}
	}
}

