package pre_estudo_java.src;

import pre_estudo_java.src.model.ContaCorrente;
import pre_estudo_java.src.model.ContaPoupanca;

public class App {
  public static void main(String[] args) {
    System.out.println("Criando nosso Banco Digital");
    System.out.println();

    ContaCorrente conta = new ContaCorrente("0001", "17632", 5, 1000.0);

    System.out.println("Saldo atual da conta: R$" + conta.getSaldo());
    System.out.println();

    conta.depositar(200.0);
    System.out.println(conta.getSaldo());
    
    conta.sacar(500.0);
    System.out.println(conta.getSaldo());

    ContaPoupanca conta2 = new ContaPoupanca("0001", "18765", 4, 300.0);
    System.out.println("Saldo conta 2: " + conta2.getSaldo());

    conta.transferir(100.0, conta2);
    System.out.println("Saldo conta 1 após transferência: " + conta.getSaldo());
    System.out.println("Saldo conta 2 após transferência: " + conta2.getSaldo());
  }
}
