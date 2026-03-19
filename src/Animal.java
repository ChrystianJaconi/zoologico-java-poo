public abstract class Animal {

    private float peso;
    private Double idade;
    protected String nome;

    public Animal(String nome, double idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public abstract void locomover();
    public abstract void alimentar();
    public abstract void emitirSom();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public Double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
}
