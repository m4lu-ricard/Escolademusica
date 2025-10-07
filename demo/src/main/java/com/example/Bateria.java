package com.example;

public class Bateria extends InstrumentoMusical{
    
    private int numeropecas;

    public Bateria(String nome, String material, int numeropecas)
    {
        super(nome, material);
        this.numeropecas = numeropecas;
    }

    @Override
    public void tocar(){
        System.out.println("marcando o ritmo na " + super.getNome() + " com " + numeropecas + "peças...");
        System.out.println("Boom! tss! Boom! tss!");
    }

    @Override
    public  void afinar()
    {
        super.afinar();
        System.out.println("Ajustando a tensão das peles do tambores...");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        System.out.println("Número de peças: " + numeropecas);
    }
}