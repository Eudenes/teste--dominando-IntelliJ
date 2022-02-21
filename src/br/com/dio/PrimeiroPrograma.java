package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setNome("MAciel");
        gato.setIdade(64);
        gato.setCor("amarelo-ouro");

        System.out.println(gato.getNome() + " " + gato.getIdade() + " " + gato.getCor());


    }


}
