import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List <Empregado> list = new ArrayList<>();
        System.out.println("quantos funcionários serão cadastrados?");
        int numFunc = sc.nextInt();

        for (int i = 0; i <numFunc; i++) {
            System.out.println("Empregado #"+(i+1)+":");
        }

        sc.close();
    }
}
