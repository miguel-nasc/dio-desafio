package candidatura;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

public class ProcessoSeletivo {

    //Método analisarCandidato
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000;
        if (salarioBase > salarioPretendido){
        System.out.println("Ligar para o candidato.");
    } else if (salarioBase == salarioPretendido) {
        System.out.println("Ligar para o candidato com contra proposta.");
    } else {
        System.out.println("Aguardando os demais candidatos...");
    }

    }

    //Salário Pretendido
    static double gerarSalarioPretendido() {
        Random random = new Random();
        double salarioPretendido = random.nextDouble(1800, 2200);
        return salarioPretendido;

    }


    //Métodos para Seleção de candidatos
    static void selecaoCandidatos() {
        List<String> candidatos = Arrays.asList("FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JOSEFA" );
        HashSet<String> candidatosAprovados = new HashSet<>();

        System.out.println("\n< Avaliação de Salários Pretendidos > \n");
        
        for (String candidato: candidatos) {
    
            double salarioDesejado = gerarSalarioPretendido();
            System.out.println("\nNOME: %s.\nSalário Pretendido: R$%.2f".formatted(candidato, salarioDesejado));
            
            if (2000 >= salarioDesejado){
                System.out.println("O Candidato %s foi APROVADO para a vaga!".formatted(candidato));
                candidatosAprovados.add(candidato);
            }else {
                System.out.println("O Candidato %s NÃO foi aprovado para a vaga!".formatted(candidato));
            }
            
        }
    
        System.out.println("\n< Candidatos Aprovados >");
        candidatosAprovados.forEach(nome -> System.out.println(nome));

    }

    
  

    //Main
    public static void main(String[] args) {
      selecaoCandidatos();


    }

}
