package br.com.dio;


import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        Gato gato = new Gato();

        gato.setNome("Maciel");
        gato.setIdade(64);
        gato.setCor("amarelo-de-ouro");

        System.out.println(gato.getNome() + " " + gato.getIdade() + " " + gato.getCor());
        System.out.println(gato);

        Livro livro = new Livro("Bíblia" , 2345);
        System.out.println(livro);

    }
}

class Livro{
    private String nome;
    private Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
