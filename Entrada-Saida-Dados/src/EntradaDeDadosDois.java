import java.util.Scanner;

public class EntradaDeDadosDois {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
       
        String s1, s2, s3;
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        //nextline servre para fazer a leitura da linha inteira até sua quebra, mesmo que tenham sido digitados números junto da frase

        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        
        sc.close();


    }
}