package com.example;

public abstract class InstrumentoMusical {
    protected String nome;
    protected String material;

    public InstrumentoMusical(String nome, String material) {
        this.nome = nome;
        this.material = material;
    }

    public abstract void tocar();

    public void afinar(){
        System.out.println("Aficado o" + nome + "..." );
    }

    public void mostrarInformacoes (){
        System.err.println("Instrumento: " + nome);
        System.err.println("Material: " + material);
    }
}
