public class q5 {

        public static boolean verificarUnicos(int[] vetor) {
            for (int i = 0; i < vetor.length; i++) {
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        System.out.println("Duplicata encontrada: O numero " + vetor[i] + " se repete.");
                        return false; // Retorna false (não são únicos)
                    }
                }
            }
            return true;
        }
        public static void main(String[] args) {
            // Exemplo 1: Lista com repetidos
            int[] lista1 = {10, 20, 30, 20, 50};

            // Exemplo 2: Lista com todos únicos
            int[] lista2 = {1, 2, 3, 4, 5};

            System.out.println("--- Teste 1 ---");
            if (verificarUnicos(lista1)) {
                System.out.println("Todos os elementos são únicos.");
            } else {
                System.out.println("A lista contém números repetidos.");
            }

            System.out.println("\n--- Teste 2 ---");
            if (verificarUnicos(lista2)) {
                System.out.println("Todos os elementos são únicos.");
            } else {
                System.out.println("A lista contém números repetidos.");
            }

    }
}

