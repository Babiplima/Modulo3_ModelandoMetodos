package br.com.zup.Cartao;

public class main {
    public static void main(String[] args) {

        //Chamando atributos
        Cartao objeto = new Cartao(1000, 300, "Bárbara Lima");

        //Instanciando método exibir dados
        objeto.exibirDados();
        //Instanciando método aumento limite
        System.out.println("_____________________________");
        objeto.aumentaLimite(1000);
        System.out.println("Sua solicitação de aumento de limite foi aceita, portanto seu novo limite é " + objeto.limite);
        //Instanciando método diminui limite
        objeto.diminuiLimite(300);
        System.out.println("_____________________________________");
        System.out.println("Devido a redução do seu limite, seu limite do cartão agora é " + objeto.limite);
        System.out.println("_____________________________________");
        //Instanciando o método realiza compra
        System.out.println("_____________________________________");
        //Instanciando o método imprime fatura
        objeto.imprimeFatura();

    }
}
