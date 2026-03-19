public class Mamifero extends Animal{

    public Mamifero(String nome, double idade) {
        super(nome, idade);
    }


    @Override
    public void locomover() {
        System.out.println(getNome()+" começou a correr e pular.");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome()+" está Mamando.");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome()+" fez Som de Mamífero(Gritando e batendo no peito)");
    }

}
