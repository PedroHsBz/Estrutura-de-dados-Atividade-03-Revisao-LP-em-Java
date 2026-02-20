public class q5 {
        public static void verificarUnicos(int vetor[]) {
            for (int i = 0; i < vetor.length; i++) {
                for (int j = i + 1; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) {
                        System.out.println("Duplicata encontrada.\nA lista contém números repetidos.");
                        return;
                    }
                }
            }
            System.out.println("Todos os elementos são únicos.");
        }
        public static void main(String[] args) {
            int[] lista1 = {10, 20, 30, 20, 50};
            verificarUnicos(lista1);

    }
}
