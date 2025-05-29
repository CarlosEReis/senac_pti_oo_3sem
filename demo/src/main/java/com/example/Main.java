package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        var endereco = new Endereco(
            "Rua Exemplo",
            "123",
            "Apto 456",
            "Bairro Exemplo",
            "Cidade Exemplo",
            Uf.SP,
            "12345-678"
        );

        var regiao = endereco.getUf().getRegiao();
        var uf = endereco.getUf();
        var ufNome = endereco.getUf().getNome();
    
        System.out.println("UF: " + uf);
        System.out.println("Nome da UF: " + ufNome);
        System.out.println("Região: " + regiao);
        System.out.println("Nome da Região: " + regiao.name());
    }
}