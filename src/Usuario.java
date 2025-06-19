public class Usuario {
    String nome;
    int idade;

    public Usuario(String n, int i) {
        nome = n;
        idade = i;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + " | Idade: " + idade;
    }
}
