package br.com.zup.Elevador;

public class Elevador {
    int andarAtual = 0;
    int totalAndares = 10;
    double capacidadeElevador = 450;
    int numeroPessoas = 8;

    //Método de construtor
    public Elevador(int andarAtual, int totalAndares, double capacidadeElevador, int numeroPessoas) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadeElevador = capacidadeElevador;
        this.numeroPessoas = numeroPessoas;
    }

    //Método Entrar elevador

    public void entra(int qtPessoas) {

        int totalDeViajantes = qtPessoas + numeroPessoas;
        if (totalDeViajantes > capacidadeElevador) {
            System.out.println("O elevador não comporta não comporta o número de pessoas ");
            System.out.println("Quantidade pessoas que excedeu" + (totalDeViajantes - capacidadeElevador));
        } else {
            numeroPessoas = totalDeViajantes;
        }
    }

    public void sai(int qtPessoas) {
        int totalDeViajantes = numeroPessoas - qtPessoas;
        if (totalDeViajantes <= 0) {
            System.out.println("Você não pode tirar pessoas, do que a quantidade de pessoas presentes. ");
        } else {
            numeroPessoas = totalDeViajantes;
        }
    }

    public void sobe() {

    }

    public void desce() {

    }


}
