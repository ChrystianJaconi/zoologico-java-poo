public class Ave extends Animal{
    public String corPena;

    public Ave(String nome, double idade) {
        super(nome, idade);
    }

    public void locomover() {
        System.out.println(getNome()+" começou a Voar.");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome()+" está comendo Frutos.");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome()+" fez Som de Ave.");
    }
}
