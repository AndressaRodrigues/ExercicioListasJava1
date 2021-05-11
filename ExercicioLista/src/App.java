import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//import jdk.internal.module.SystemModuleFinders;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List <Empregado> list = new ArrayList<>();
        System.out.println("quantos funcionários serão cadastrados?");
        int numFunc = sc.nextInt();

        for (int i = 0; i <numFunc; i++) {
            System.out.println("Empregado #"+(i+1)+":");
            System.out.print("Id: ");
            Integer id = sc.nextInt();
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Salário: ");
            Double salario = sc.nextDouble();
            
            Empregado epm = new Empregado(id, nome, salario);

            list.add(epm);
        }

        sc.close();
    }
}
