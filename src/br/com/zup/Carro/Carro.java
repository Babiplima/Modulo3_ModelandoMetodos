package br.com.zup.Carro;

//Atributos
public class Carro {
    String nome;
    double peso;
    String fabricante;
    String cor;
    double valor;

    //Criando o método Construtor

    public Carro(String nome,double peso,String fabricante, String cor, double valor){
        this.nome = nome;
        this.peso = peso;
        this.fabricante = fabricante;
        this.cor = cor;
        this.valor = valor;
    }
    //Método dados do carro
    public void dadosCarro(){
        System.out.println("Nome do carro " + nome);
        System.out.println("Fabricante" + fabricante);
        System.out.println("Cor do carro " + cor);
        System.out.println( "Valor do carro " + valor);
    }
    //Método dar desconto
    public void descontoCarro(double valorDesconto) {
        valor = valor - valorDesconto;
    }
    //Método pintar o carro

    public void pintar(String corPintura){
        cor = corPintura;
    }
}








