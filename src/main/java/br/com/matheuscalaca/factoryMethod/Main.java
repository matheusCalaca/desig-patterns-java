package br.com.matheuscalaca.factoryMethod;

import br.com.matheuscalaca.factoryMethod.service.DocumentService;

public class Main {
    public static void main(String[] args) {
        // codigo com regras
        //chama para criar o documento
        DocumentService documentService = new DocumentService();

        documentService.processDocument("Excel");
        documentService.processDocument("word");

    }
}