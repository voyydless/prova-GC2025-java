import java.sql.Array;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Questão 1
        System.out.println("\n=== Questão 1 ===");
        LocalDate base = LocalDate.of(2025, 6, 1);
        int dias = 7;
        LocalDate novaData = base.plusDays(dias * 2 - 3);
        System.out.println(novaData.getDayOfMonth());

        // Questão 2
        System.out.println("\n=== Questão 2 ===");
        int nota = 7;
        int peso = 2;
        double media = (nota * peso + 6 * 3) / 5;
        if (media >= 7.0) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Revisar conteúdo");
        }

        // Questão 3
        System.out.println("\n=== Questão 3 ===");
        Item x = new Item("Caderno");
        Item y = new Item("Caneta", 3);
        System.out.println(x.quantidade + y.quantidade);

        // Questão 4
        System.out.println("\n=== Questão 4 ===");
        int prioridade = 4;
        int urgencia = 8;

        if (prioridade > 3 && urgencia > 7) {
            System.out.println("Tarefa crítica");
        } else if (prioridade > 3 || urgencia > 7) {
            System.out.println("Tarefa importante");
        } else {
            System.out.println("Tarefa comum");
        }

        // Questão 5
        System.out.println("\n=== Questão 5 ===");
        int notificacoes = 0;

        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                notificacoes += 2;
            } else {
                notificacoes++;
            }
        }
        System.out.println(notificacoes);

        // Questão 6
        System.out.println("\n=== Questão 6 ===");
        ArrayList<String> horarios = new ArrayList<>();
        horarios.add("08:00");
        horarios.add("10:00");
        horarios.add("12:00");
        horarios.remove(1);
        horarios.add("14:00");

        System.out.println(horarios.get(1));

        // Questão 7
        System.out.println("\n=== Questão 7 ===");
        Livro l = new Livro();
        l.titulo = "Java para Iniciantes";
        System.out.println(l.status());
        l.emprestar();
        System.out.println(l.status());

        // Questão 8
        System.out.println("\n=== Questão 8 ===");
        Usuario u = new Usuario("João", 25);
        System.out.println(u);

        // Questão 9
        System.out.println("\n=== Questão 9 ===");
        System.out.println("Resposta: git reset --soft HEAD1");

        // Questão 10
        System.out.println("\n=== Questão 10 ===");
        System.out.println("Resposta: get checkout Calculadora.java");

        // Questão 11
        System.out.println("\n=== Questão 11 ===");
        LocalDate hoje = LocalDate.of(2025, 6, 9);
        LocalDate prazo = hoje.plusDays(10);
        System.out.println(prazo);

        // Questão 12
        System.out.println("\n=== Questão 12 ===");
        LocalDate data = LocalDate.of(2025, 6, 10);
        int diasUteis = 0;

        while (diasUteis < 7) {
            data = data.plusDays(1);
            boolean fimDeSemana = data.getDayOfWeek() == DayOfWeek.SATURDAY || data.getDayOfWeek() == DayOfWeek.SUNDAY;
            boolean feriado = data.equals(LocalDate.of(2025, 6, 15));

            if (!fimDeSemana && !feriado) {
                diasUteis++;
            }
        }
        System.out.println(data);

        // Questão 13
        System.out.println("\n=== Questão 13 ===");
        LocalTime envio = LocalTime.of(23, 0);
        LocalTime limite = LocalTime.of(22, 59);

        if (!envio.isBefore(limite)) {
            System.out.println("Entrega fora do horário");
        } else {
            System.out.println("Tarefa enviada com sucesso");
        }

        // Questão 14
        System.out.println("\n=== Questão 14 ===");
        List<Tarefa> tarefas = new ArrayList<>();
        tarefas.add(new Tarefa("Estudar"));
        tarefas.add(new Tarefa("Almoçar"));
        tarefas.add(new Tarefa("Dormir"));
        Collections.sort(tarefas);
        System.out.println(tarefas);

        // Questão 15
        System.out.println("\n=== Questão 15 ===");
        ArrayList<String> outrasTarefas = new ArrayList<>();
        outrasTarefas.add("Estudar Java");
        outrasTarefas.add("Fazer exercícios");
        outrasTarefas.add("Revisar códio");

        for (String tarefa : outrasTarefas) {
            if (tarefa.contains("Java")) {
                System.out.println("Tarefa de programação: " + tarefa);
            }
        }
    }
}
