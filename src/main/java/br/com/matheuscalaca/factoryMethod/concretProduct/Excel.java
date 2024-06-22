package br.com.matheuscalaca.factoryMethod.concretProduct;

import br.com.matheuscalaca.factoryMethod.product.Document;

public class Excel extends Document {
    @Override
    public void process() {
        System.out.println("[EXCEL] Estou gerando um documento EXCEL");
    }
}
