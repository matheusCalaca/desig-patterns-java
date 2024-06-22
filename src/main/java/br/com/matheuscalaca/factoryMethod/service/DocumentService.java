package br.com.matheuscalaca.factoryMethod.service;

import br.com.matheuscalaca.factoryMethod.concretCreator.ExcelDocumentoCreateFactory;
import br.com.matheuscalaca.factoryMethod.concretCreator.WordDocumentoCreateFactory;
import br.com.matheuscalaca.factoryMethod.creator.DocumentCreateFactory;
import br.com.matheuscalaca.factoryMethod.product.Document;

public class DocumentService {

    public void processDocument(String Type){
        Document document = getDocumentCreate(Type);
        document.process();
    }

    private Document getDocumentCreate(String Type) {
        DocumentCreateFactory documentCreateFactory;
        switch (Type.toUpperCase()){
            case "EXCEL":
                documentCreateFactory = new ExcelDocumentoCreateFactory();
                break;
            case "WORD":
                documentCreateFactory = new WordDocumentoCreateFactory();
                break;
            default:
                throw new IllegalArgumentException("Type not found");
        }
        return documentCreateFactory.createDocument();
    }

}
