public class Peixe extends Animal{
    public String corEscama;

    public Peixe(String nome, double idade) {
        super(nome, idade);
    }

    @Override
    public void locomover() {
        System.out.println(getNome()+" saiu Nadando.");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome()+" Comendo substância.");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome()+" Peixe não faz som.");
    }
}
