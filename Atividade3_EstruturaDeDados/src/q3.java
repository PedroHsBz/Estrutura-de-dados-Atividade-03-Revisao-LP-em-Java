import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String senha = sc.nextLine();
        while (senha.length() < 8) {
            System.out.println("Inválida!\nA senha deve possuir pelo menos 8 caracteres.");
            System.out.println("Tente novamente: ");
            senha = sc.nextLine();
        }
        if(senha.contains("@") || senha.contains("#") || senha.contains("$")|| senha.contains("%")|| senha.contains("&")){
            System.out.println("Válida!");
        }
        else {
            System.out.println("Inválida!\nA senha deve conter pelo menos um caractere especial (@, #, $, %, & ou *).");
        }
    }
}
