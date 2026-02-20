public class q1 {
    public static void main(String[] args){
        double[] notas = {7.5, 4.0, 9.2, 5.5, 8.0, 6.5, 3.2, 10.0, 7.0, 5.8};
        double soma = 0, media = 0, alunoAcima = 0, maiorN = 0;
        for(int i = 0; i < notas.length; i++) {
            soma += notas[i];
            if (notas[i] > maiorN) {
                maiorN = notas[i];
            }
        }
        media=soma/notas.length;
        for(int i = 0; i < notas.length; i++){
            if(notas[i]>=media) {
                alunoAcima++;
            }
        }
        System.out.println("Media: "+media);
        System.out.println("Alunos acima da media: "+alunoAcima);
        System.out.println("Maior nota: "+maiorN);
    }
}
