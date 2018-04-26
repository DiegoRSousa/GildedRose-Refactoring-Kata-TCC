# Especifica��es de Requisitos de Gilded Rose

Bem-vindo ao time Gilded Rose. Como voc� deve saber, n�s somos uma pequena pousada estrategicamente localizada em uma prestigiosa cidade, atendida pelo amigavel atendente Allison. Al�m de ser uma pousada, n�s tamb�m compramos e vendemos as mercadorias de melhor qualidade. Infelizmente nossas mercadorias v�o perdendo a qualidade conforme chegam pr�ximo sua data de venda.

N�s temos um sistema instalado que atualiza automaticamente os pre�os do nosso estoque. Esse sistema foi criado por um rapaz sem no��o chamado Leeroy, que agora se dedica � novas aventuras. Seu trabalho ser� adicionar uma nova funcionalidade para o nosso sistema para que possamos vender uma nova categoria de itens. 

## Descri��o preliminar

Vamos dar uma breve introdu��o do nosso sistema:

* Todos os itens (classe `Item`) possuem uma propriedade chamada `SellIn` que informa o n�mero de dias que temos para vende-lo
* Todos os itens possuem uma propriedade chamada `quality` que informa o qu�o valioso � o item.
* No final do dia, nosso sistema decrementa os valores das propriedades `SellIn` e `quality` de cada um dos itens do estoque atrav�s do m�todo `updateQuality`.

Bastante simples, n�o �? Bem, agora que as coisas ficam interessantes:

* Quando a data de venda do item tiver passado, a qualidade (`quality`) do item diminui duas vezes mais rapido.
* A qualidade (`quality`) do item n�o pode ser negativa
* O "Queijo Brie envelhecido" (`Aged Brie`), aumenta sua qualidade (`quality`) em `1` unidade a medida que envelhece.
* A qualidade (`quality`) de um item n�o pode ser maior que 50.
* O item "Sulfuras" (`Sulfuras`), por ser um item lend�rio, n�o precisa ter uma data de venda (`SellIn`) e sua qualidade (`quality`) n�o precisa ser diminuida.
* O item "Entrada para os Bastidores" (`Backstage Passes`), assim como o "Queijo Brie envelhecido", aumenta sua qualidade (`quality`) a medida que o dia da venda (`SellIn`) se aproxima;
  * A qualidade (`quality`) aumenta em `2` unidades quando a data de venda (`SellIn`) � igual ou menor que `10`.
  * A qualidade (`quality`) aumenta em `3` unidades quando a data de venda (`SellIn`) � igual ou menor que `5`.
  * A qualidade (`quality`) do item vai direto � `0` quando a data de venda (`SellIn`) tiver passado.

N�s recentemente assinamos um suprimento de itens Conjurados Magicamente. Isto requer que n�s atualizemos nosso sistema:

* Os itens "Conjurados" (`Conjured`) diminuem a qualidade (`quality`) duas vezes mais r�pido que os outros itens.

Sinta-se livre para fazer qualquer altera��o no m�todo `updateQuality` e adicionar c�digo novo contanto que tudo continue funcionando perfeitamente. Entretanto, n�o altere o c�digo da classe `Item` ou da propriedade `Items` na classe `GildedRose` pois elas pertencem ao Goblin que ir� te matar com um golpe pois ele n�o acredita na cultura de c�digo compartilhado.

## Notas Finais

Para esclarecer: Um item n�o pode ter uma qualidade (`quality`) maior que `50`, entretanto as "Sulfuras" por serem um item lend�rio v�o ter uma qualidade imutavel de `80`.

O c�digo utilizado neste reposit�rio est� dispon�vel em: [fonte](https://github.com/emilybache/GildedRose-Refactoring-Kata)
