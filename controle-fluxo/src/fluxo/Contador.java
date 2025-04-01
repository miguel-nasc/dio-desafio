package fluxo;

import java.util.Scanner;

public class Contador {

    static void contar(int parametroUm, int parametroDois) throws ParametroInvalidoException{

        if (parametroDois < parametroUm) {
            throw new ParametroInvalidoException();
        }
        int contador = parametroDois - parametroUm;
        
        for (int i = 0; i < contador; i++){

            System.out.println("Imprimindo o número %d.".formatted(i + 1));

        }

    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Primeiro parâmetro: ");
        int parametro1 = sc.nextInt();

        System.out.print("Segundo parâmetro: ");
        int parametro2 = sc.nextInt();

        sc.close();

        try {
            contar(parametro1, parametro2);
        } catch (ParametroInvalidoException e) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro!");
        }
        
    }

}
