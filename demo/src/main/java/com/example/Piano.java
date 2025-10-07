package com.example;

public class Piano extends InstrumentoMusical{
    private int numeroTeclas;

    public Piano(String nome, String material, int numeroTeclas)
    {
        super(nome, material);
        this.numeroTeclas = numeroTeclas;
    }

    @Override
    public void tocar(){
        System.out.println("Soando uma bela melodia no " + super.getNome() + " com " + numeroTeclas + "Teclas...");
        System.out.println("Executando uma sonata clássica.");
    }

    @Override
    public  void afinar()
    {
        super.afinar();
        System.out.println("Ajustando a tensão das cordas internas do piano...");
    }

    @Override
    public void mostrarInformacoes()
    {
        super.mostrarInformacoes();
        System.out.println("Número de teclas: " + numeroTeclas);
    }
}