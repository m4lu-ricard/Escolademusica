package com.example;

public class EscolaMusical {
    public static void main(String[] args) {
        // Criamos um array de 4 instrumentos.
        InstrumentoMusical[] banda = new InstrumentoMusical[4];

        // Instanciamos os instrumentos.
        // NOTA: Estas linhas dependem dos construtores corretos das suas classes.
        banda[0] = new Violao("Violão Clássico", "Madeira", 6);
        banda[1] = new Piano("Piano", "Madeira e metal", 88);
        banda[2] = new Bateria("Bateria", "Madeira e metal", 5);
        banda[3] = new Saxofone("Saxofone", "Latão", "Alto"); 

        EscolaMusical escola = new EscolaMusical();

        escola.apresentar(banda);
        escola.contarInstrumentosPorTipo(banda); // Agora o método também está implementado.
    }
    
    // ---
    
    // Implementação do método principal para afinar e tocar os instrumentos
    public void apresentar(InstrumentoMusical[] banda) {
        System.out.println("\n=== A ORQUESTRA VAI COMEÇAR! ===");
        
        System.out.println("\n--- Afinação dos instrumentos --- \n");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.afinar();
            System.out.println();
        }

        System.out.println("\n--- O CONCERTO INICIA! ---");
        for (InstrumentoMusical instrumento : banda) {
            instrumento.tocar();
            System.out.println();
        }
        System.out.println("\n=== FIM DO CONCERTO ===");
    }
    
    // ---
    
    // Implementação do método para contar instrumentos por tipo (exemplo de uso de instanceof)
    public void contarInstrumentosPorTipo(InstrumentoMusical[] banda) {
        int pianos = 0;
        int baterias = 0;
        int saxofones = 0;
        int violoes = 0;
        int outros = 0;

        for (InstrumentoMusical instrumento : banda) {
            if (instrumento instanceof Piano) {
                pianos++;
            } else if (instrumento instanceof Bateria) {
                baterias++;
            } else if (instrumento instanceof Saxofone) {
                saxofones++;
            } else if (instrumento instanceof Violao) {
                violoes++;
            } else {
                outros++;
            }
        }
        
        System.out.println("\n--- Resumo de Instrumentos ---");
        System.out.println("Piano(s): " + pianos);
        System.out.println("Bateria(s): " + baterias);
        System.out.println("Saxofone(s): " + saxofones);
        System.out.println("Violão(ões): " + violoes);
        
        if (outros > 0) {
            System.out.println("Outros: " + outros);
        }
    }
}