import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = sc.nextLine();
        int tamanho = senha.length();
        for (int i = 0; i < tamanho; i++) {
            char c = senha.charAt(i);
        }
        if (tamanho < 8) {
            System.out.println("Inválida!\n A senha deve possuir pelo menos 8 caracteres.");
        }
        if(senha.contains("@") || senha.contains("#") || senha.contains("$")|| senha.contains("%")|| senha.contains("&")){
            System.out.println("Inválida!\n A senha deve conter pelo menos um caractere especial (@, #, $, %, & ou *).");
        }
        else {
            System.out.println("Válida!");
        }
    }
}
