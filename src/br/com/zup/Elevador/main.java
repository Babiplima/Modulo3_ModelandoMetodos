package br.com.zup.Elevador;

public class main {
    public static void main(String[] args) {
        Elevador objeto = new Elevador(0,10,450,8);

        System.out.println(objeto.numeroPessoas);
        objeto.entra(5);
        System.out.println(objeto.numeroPessoas);
        objeto.entra(5);
        System.out.println(objeto.numeroPessoas);
        objeto.sai(10);
        System.out.println(objeto.numeroPessoas);
        objeto.sai(1);
 }
}
