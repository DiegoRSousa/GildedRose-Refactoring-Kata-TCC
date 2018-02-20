package com.uepb.tcc.gildedrose;

public class GildedRose {
	Item[] itens;

	public GildedRose(Item[] itens) {
		this.itens = itens;
	}
	
	public void atualizaQualidade() {
		for(int i = 0; i < itens.length; i++) {
			if(!itens[i].nome.equals("Brie Envelhecido") 
					&& !itens[i].nome.equals("Entrada para os Bastidores")) {
				if(itens[i].qualidade > 0) {
					if(!itens[i].nome.equals("Sulfuras")) {
						itens[i].qualidade = itens[i].qualidade - 1;
					}
				}
			} else {
				if(itens[i].qualidade < 50) {
					itens[i].qualidade = itens[i].qualidade + 1;
					
					if(itens[i].nome.equals("Entrada para os Bastidores")) {
						if(itens[i].diaVenda < 11) {
							if(itens[i].qualidade < 50) {
								itens[i].qualidade = itens[i].qualidade + 1;
							}
						}
						if(itens[i].diaVenda < 6) {
							if(itens[i].qualidade < 50) {
								itens[i].qualidade = itens[i].qualidade + 1;
							}
						}
					}
				}
			}
			
			if (!itens[i].nome.equals("Sulfuras")) {
				itens[i].diaVenda = itens[i].diaVenda - 1;
			}
			
			if (itens[i].diaVenda < 0) {
                if (!itens[i].nome.equals("Brie Envelhecido")) {
                    if (!itens[i].nome.equals("Entrada para os Bastidores")) {
                        if (itens[i].qualidade > 0) {
                            if (!itens[i].nome.equals("Sulfuras")) {
                                itens[i].qualidade = itens[i].qualidade - 1;
                            }
                        }
                    } else {
                        itens[i].qualidade = itens[i].qualidade - itens[i].qualidade;
                    }
                } else {
                    if (itens[i].qualidade < 50) {
                        itens[i].qualidade = itens[i].qualidade + 1;
                    }
                }
			}
		}		
	}
}

