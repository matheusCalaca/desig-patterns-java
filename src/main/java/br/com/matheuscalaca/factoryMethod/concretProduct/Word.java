package br.com.matheuscalaca.factoryMethod.concretProduct;

import br.com.matheuscalaca.factoryMethod.product.Document;

public class Word extends Document {
    @Override
    public void process() {
        System.out.println("[WORD] Estou gerando um documento WORD");
    }
}
