package br.com.matheuscalaca.factoryMethod.concretCreator;

import br.com.matheuscalaca.factoryMethod.concretProduct.Excel;
import br.com.matheuscalaca.factoryMethod.creator.DocumentCreateFactory;
import br.com.matheuscalaca.factoryMethod.product.Document;

public class ExcelDocumentoCreateFactory implements DocumentCreateFactory {
    @Override
    public Document createDocument() {
        return new Excel();
    }
}
