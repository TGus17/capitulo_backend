package pre_estudo_java.src;

import pre_estudo_java.src.model.ContaBancaria;

public class App {
  public static void main(String[] args) {
    System.out.println("Criando nosso Banco Digital");
    System.out.println();

    ContaBancaria conta = new ContaBancaria("0001", "17632", 5, 1000.0);

    System.out.println("Saldo atual da conta: R$" + conta.getSaldo());
    System.out.println();

    conta.depositar(200.0);
    System.out.println(conta.getSaldo());
    
    conta.sacar(500.0);
    System.out.println(conta.getSaldo());
  }
}
