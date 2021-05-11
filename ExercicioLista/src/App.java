import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

//import jdk.internal.module.SystemModuleFinders;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner sc = new Scanner(System.in);

        List <Empregado> list = new ArrayList<>();
        System.out.println("Quantos funcionários serão cadastrados?");
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
        
        System.out.println("Informe o id do funcionário que terá seu salário aumentado: ");
        Integer idsalario = sc.nextInt();
        Integer pos = posicao(list, idsalario);
        if(pos == null){
            System.out.println("Este id não existe");
        } else {
            System.out.println("Informe a porcentagem de aumento: ");
            double porcentagem = sc.nextDouble();
            list.get(pos).aumentaSalario(porcentagem);
        }


        sc.close();
    }

    public static Integer posicao(List<Empregado> list, int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getId() == id){
                return i;
            } 
        }
        return null;
    }
}
