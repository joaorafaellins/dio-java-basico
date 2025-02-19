import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        int numeroConta  ;
        String agencia  ;
        String nomeDoCliente ;
        double saldo;

        System.out.println("Digite o numero da conta");
        numeroConta=sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a agencia");
        agencia=sc.nextLine();
        System.out.println("Digite o nome do cliente");
        nomeDoCliente=sc.nextLine();
        System.out.println("DIgite o saldo da conta");
        saldo=sc.nextDouble();

        System.out.println("Ola "+nomeDoCliente+", obrigado por criar uma conta em nosso banco, sua agencia é : "+agencia+", conta: "
        +numeroConta+" e seu saldo:"+saldo+", ja esta disponivel para saque");

    }
}
