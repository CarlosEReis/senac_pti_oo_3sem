package com.example;

public enum Uf {
    AC("Acre", Regiao.NORTE),
    AL("Alagoas", Regiao.NORDESTE),
    AM("Amazonas", Regiao.NORTE),
    AP("Amapá", Regiao.NORTE),
    BA("Bahia", Regiao.NORDESTE),
    CE("Ceará", Regiao.NORDESTE),
    DF("Distrito Federal", Regiao.CENTRO_OESTE),
    ES("Espírito Santo", Regiao.SUDESTE),
    GO("Goiás", Regiao.CENTRO_OESTE),
    MA("Maranhão", Regiao.NORDESTE),
    MG("Minas Gerais", Regiao.SUDESTE),
    MS("Mato Grosso do Sul", Regiao.CENTRO_OESTE),
    MT("Mato Grosso", Regiao.CENTRO_OESTE),
    PA("Pará", Regiao.NORTE),
    PB("Paraíba", Regiao.NORDESTE),
    PE("Pernambuco", Regiao.NORDESTE),
    PI("Piauí", Regiao.NORDESTE),
    PR("Paraná", Regiao.SUL),
    RJ("Rio de Janeiro", Regiao.SUDESTE),
    RN("Rio Grande do Norte", Regiao.NORDESTE),
    RO("Rondônia", Regiao.NORTE),
    RR("Roraima", Regiao.NORTE),
    RS("Rio Grande do Sul", Regiao.SUL),
    SC("Santa Catarina", Regiao.SUL),
    SE("Sergipe", Regiao.NORDESTE),
    SP("São Paulo", Regiao.SUDESTE),
    TO("Tocantins", Regiao.NORTE);

    private final String nome;
    private final Regiao regiao;

    Uf(String nome, Regiao regiao) {
        this.nome = nome;
        this.regiao = regiao;
    }

    public String getNome() {
        return nome;
    }

    public Regiao getRegiao() {
        return regiao;
    }
    public static Uf fromSigla(String sigla) {
        for (Uf uf : values()) {
            if (uf.name().equalsIgnoreCase(sigla)) {
                return uf;
            }
        }
        throw new IllegalArgumentException("Sigla inválida: " + sigla);
    }
}
