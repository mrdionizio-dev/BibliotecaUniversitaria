public class Biblioteca {

    public static void main(String[] args) {

        // Dados simulados para testar as regras.
        boolean cadastroValido = true;
        int emprestimosAtivos = 2;
        boolean exemplarDisponivel = true;
        boolean condicaoAdequada = true;

        final int LIMITE_EMPRESTIMOS = 3;
        final int PRAZO_DIAS = 14;

        System.out.println("=== Biblioteca Universitária ===");

        if (emprestimosAtivos < 0) {
            System.out.println(
                    "Erro: a quantidade de empréstimos não pode ser negativa."
            );

        } else if (!cadastroValido) {
            System.out.println(
                    "Empréstimo recusado: cadastro do membro inválido."
            );

        } else if (emprestimosAtivos >= LIMITE_EMPRESTIMOS) {
            System.out.println(
                    "Empréstimo recusado: limite de três empréstimos ativos atingido."
            );

        } else if (!exemplarDisponivel || !condicaoAdequada) {

            if (!exemplarDisponivel) {
                System.out.println(
                        "Empréstimo recusado: exemplar indisponível."
                );
            }

            if (!condicaoAdequada) {
                System.out.println(
                        "Empréstimo recusado: exemplar sem condições adequadas de uso."
                );
            }

        } else {
            int totalAposEmprestimo = emprestimosAtivos + 1;

            System.out.println("Empréstimo pode ser autorizado.");
            System.out.println(
                    "Prazo de devolução: " + PRAZO_DIAS + " dias corridos."
            );
            System.out.println(
                    "Empréstimos ativos após a operação: " + totalAposEmprestimo
            );
        }
    }
}