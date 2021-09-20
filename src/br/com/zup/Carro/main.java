package br.com.zup.Carro;

public class main {

    public static void main(String[] args) {
        //Instanciando o novo carro

    Carro exemplo1 = new Carro ("Argo",1105,"Fiat","Vermelha",69000);

    //Testando os métodos
        exemplo1.dadosCarro();

    //Dando o desconto no valor do carro
        exemplo1.descontoCarro(10000);

    //Testando o método desconto criado

        System.out.println("____________________");
        exemplo1.dadosCarro();

    //Mudando a cor do carro
    exemplo1.pintar("Azul");

    //Testando o método mudar a cor do carro
        System.out.println("____________________");
        exemplo1.dadosCarro();

    }
    }
        
    
   
