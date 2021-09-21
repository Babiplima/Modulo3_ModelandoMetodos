package br.com.zup.Cartao;

public class Cartao {
    double limite;
    double saldoFatura;
    String nomeCliente;

    //Método de construtor
    public Cartao(double limite, double saldoFatura, String nomeCliente) {
        this.limite = limite;
        this.saldoFatura = saldoFatura;
        this.nomeCliente = nomeCliente;
    }

    //Método exibe dados do cartão do cliente
    public void exibirDados() {
        System.out.println("Nome do titular do cartão " + nomeCliente);
        System.out.println("Este é o saldo da fatura do cliente " + saldoFatura);
        System.out.println("Este é o limite que o cliente tem no seu cartão " + limite);
    }

    // Método aumenta limite
    public void aumentaLimite(double aumentoLimite) {
        limite = limite + aumentoLimite;
    }

    // Método diminui limite
    public void diminuiLimite(double reducaoLimite) {
        limite = limite - reducaoLimite;
    }

    // Método realiza compra
    public void realizaCompra(double compraRealizada) {
        if (compraRealizada <= limite) {
            System.out.println("Compra realizada com sucesso ");
            limite = limite - compraRealizada;
            saldoFatura = saldoFatura + compraRealizada;
        } else {
            {
                System.out.println("Saldo insuficiente ");
            }
        }
    }
        // Imprime fatura
        public void imprimeFatura(){
            System.out.println("Limite do cartão " + limite);
            System.out.println("Sua fatura atual é " + saldoFatura);
        }

    }



