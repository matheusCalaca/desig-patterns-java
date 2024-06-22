package br.com.matheuscalaca.factoryMethod.concretCreator;

import br.com.matheuscalaca.factoryMethod.concretProduct.Word;
import br.com.matheuscalaca.factoryMethod.creator.DocumentCreateFactory;
import br.com.matheuscalaca.factoryMethod.product.Document;

public class WordDocumentoCreateFactory implements DocumentCreateFactory {
    @Override
    public Document createDocument() {
        return new Word();
    }
}
