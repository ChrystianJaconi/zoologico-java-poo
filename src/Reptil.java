public class Reptil extends Animal{
    public String corEscama;

    public Reptil(String nome, double idade) {
        super(nome, idade);
    }

    @Override
    public void locomover() {
        System.out.println(getNome()+" começou a Rastejar.");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome()+" está comendo pequeno mamífero.");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome()+" fez Som de Réptil(rastejando)");
    }
}
