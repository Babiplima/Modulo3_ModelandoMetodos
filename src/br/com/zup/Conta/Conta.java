package br.com.zup.Conta;

public class Conta {

    //Atributos de conta

      double numeroConta;
      double saldo;
      String nome;

    //Método de construtor
    public Conta(String nome, double conta, double saldo){
        this.nome =nome;
        this.numeroConta =conta;
        this.saldo=saldo;
    }
    //Dados da conta

    public void demonstrarDados(){
        System.out.println("Nome do titular da conta "+ nome);
        System.out.println("Número da conta " + numeroConta);
        System.out.println("Este é o valor da saldo em conta" + saldo);
    }

    //Método saque
    public void sacar (double valorDoSaque){
        saldo = saldo - valorDoSaque;
    }

    //Método depósito
    public void depositar (double valorDoDeposito){
        saldo = saldo + valorDoDeposito;
    }
    //Método extrato
    public void extrato (double valorDoExtrato){
        valorDoExtrato = saldo;
    }

 }

