import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
    
        Scanner entrada = new Scanner(System.in);

        System.out.print("Por favor, digite o seu nome: ");
        String nome = entrada.nextLine();
        
        System.out.print("Por fravor, digite a sua Agência: ");
        String agencia = entrada.nextLine();

        System.out.print("Por favor, digite o número da sua agência: ");
        int numeroConta = entrada.nextInt();

        System.out.print("Por favor, digite o valor do seu salário: ");
        double saldo = entrada.nextDouble();
        
        entrada.close();

        System.out.print("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta n° %d e seu saldo é R$%.2f."
        .formatted(nome, agencia, numeroConta, saldo) 
        );

















    }
}
