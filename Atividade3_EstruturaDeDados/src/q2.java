import java.util.Scanner;
public class q2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r50= 0, r20 = 0, r10=0;
        int valor = sc.nextInt();
        r50 = valor / 50;
        valor = valor % 50;
        r20 = valor / 20;
        valor = valor % 20;
        r10 = valor /10;
        System.out.println(r50);
        System.out.println(r20);
        System.out.println(r10);
    }
}
