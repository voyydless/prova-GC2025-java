import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tarefa implements Comparable<Tarefa> {
    String titulo;

    public Tarefa(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public int compareTo(Tarefa outra) {
        return this.titulo.compareTo(outra.titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }
}
