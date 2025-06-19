public class Item {
    String nome;
    int quantidade;

    public Item(String nome) {
        this.nome = nome;
        this.quantidade = 1;
    }

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }
}
