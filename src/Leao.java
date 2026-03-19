public class Leao extends Animal {

    public Leao(String nome, double idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome()+" rugiu forte!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome()+" devorou carne.");
    }

    @Override
    public void locomover() {
        System.out.println(getNome()+" Começou a correr.");
    }
}