
import java.util.Scanner;
public class ContaTerminal {
   static public class Conta{
        int numero_da_conta;
        String agencia, nome_cliente;
        double saldo;

        

        public void Setnomecliente(String nome){
            nome_cliente = nome;
        }
        public String Getnomecliente(){
            return nome_cliente;
        }


        public void Setagencia(String agencia){
            this.agencia =agencia; 
        }
        public String Getagencia(){
            return agencia;
        }


        public void Setnumerodaconta(int numero){
            numero_da_conta = numero;
        }
        public int Getnumerodaconta() {
            return numero_da_conta;
        }



        public void Setsaldo(double saldo){
            this.saldo = saldo;
        }
        public double Getsaldo(){
            return saldo;
        }
        

        public void Impressao(){
            System.out.println("Olá "+ nome_cliente+"! Obrigado por criar uma conta em nosso banco!");
            System.err.println("Sua Agência é :"+agencia+", conta: "+numero_da_conta+", e seu saque de R$"+saldo+" já está pronto para saque!");
        }

        
    };

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        
        System.err.println("Informe seu nome: ");
        String nome = scanner.nextLine();
        conta.Setnomecliente(nome);

        System.err.println("Informe sua agência: ");
        String agencia = scanner.nextLine();
        conta.Setagencia(agencia);

        System.err.println("Informe o número da conta: ");
        int numero = scanner.nextInt();
        conta.Setnumerodaconta(numero);

        System.err.println("Informe seu saldo: ");
        double saldo = scanner.nextDouble();
        conta.Setsaldo(saldo);

        conta.Impressao();        
    }
}
