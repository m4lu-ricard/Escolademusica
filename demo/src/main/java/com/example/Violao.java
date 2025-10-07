package com.example;

public class Violao extends InstrumentoMusical {
    private int numeroCordas;

    public Violao (String nome, String materil, int numeroCordas){
        super(nome, material);
        this.numeroCordas = numeroCordas;
    }

    @Override
    public void tocar(){
        System.out.println("Tocando notas suaves no" + super.getNome() + "com" + numeroCordas + "cordas...");
        System.out.println("Dedilhando uma melodia romântica no valor");
    }

    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a tensão das " + numeroCordas + "cordas.");
    }
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Número de codas: " + numeroCordas);
    }
}
