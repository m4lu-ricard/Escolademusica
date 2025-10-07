package com.example;

public class Saxofone extends InstrumentoMusical {
    private String tipo;

    public Saxofone(String nome, String material, String tipo){
        super(nome, material);
        this.tipo = tipo;
    }
    @Override
    public void tocar() {
        System.out.println("Tocando Jazz suave no " + super.getNome() + "" + tipo + "...");
        System.out.println("Melodia envolvente de saxofone ");
    }
    @Override
    public void afinar(){
        super.afinar();
        System.out.println("Ajustando a embocadura e as chaves do saxofone.");
    }
    @Override
    public void mostrarInformacoes(){
        super.mostrarInformacoes();
        System.out.println("Tipo:" + tipo);
    }
}
