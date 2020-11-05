
public class Jogador {
    // 1° Atributos da classe
    private String nome;
    private int idade;
    private String apelido;
    private double vida;

    // 2° Métodos construtores
    public Jogador(String nome, int idade, String apelido) {
        this.nome = nome;
        this.idade = idade;
        this.apelido = apelido;
        this.vida = 100;
    }

    // 3° Métodos específicos da classe
    public void jogar() {
        System.out.println("O jogador está jogando");
    }

    public void atacar() {
        System.out.println("O jogador atacou e perdeu 10 de vida");
        sofrerDano();
    }

    public void mostrarStatus() {
        System.out.println(nome + " possui " + vida + " pontos de vida.");
    }

    private void sofrerDano() {
        vida -= 10;
    }


    // 4° Métodos getters e setters
    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getApelido() {
        return apelido;
    }

    public double getVida() {
        return vida;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


}