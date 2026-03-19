public class Canguru extends Animal {

    public Canguru(String nome, double idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome()+" fez som de canguru! ");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome()+" comendo grama/vegetais. ");
    }

    @Override
    public void locomover() {
        System.out.println(getNome()+" começou a sair correndo saltando. ");
    }
}