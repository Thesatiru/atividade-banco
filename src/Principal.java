import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner digitar = new Scanner(System.in);
        ContaBancaria conta1 = new ContaBancaria("2451-4","Rafael",3000);
        ContaBancaria conta2 = new ContaBancaria("1234-5","Jorge",2000);
        ContaBancaria conta3 = new ContaBancaria("8908-3","Juan",1500);
        List<ContaBancaria> listarContas = new ArrayList<>();
        listarContas.add(conta1);
        listarContas.add(conta2);
        listarContas.add(conta3);
        int i = 0;
        int escolher = 0;
        while (i != 2){
            System.out.println("****************\nMenu Banco");
            System.out.println("1.Sacar\n2.Depositar\n3.Transferir\n4.Mostrar dados\n****************");
            System.out.println("Escolha: ");
            escolher = digitar.nextInt();
            switch (escolher){
                case 1:
                    System.out.println("Digite o valor que deseja sacar:");
                    listarContas.get(0).sacar(digitar.nextDouble());
                    break;
                case 2:
                    System.out.println("Digite o valor que deseja depositar");
                    listarContas.get(0).depositar(digitar.nextDouble());
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir");
                    listarContas.get(0).tranferir(digitar.nextDouble(), listarContas.get(2));
                    System.out.println(listarContas.get(2).getSaldo());
                    break;
                case 4:
                    System.out.println(listarContas.get(0).toString());
                    break;
                default:
                    System.out.println("As opçoes vão de 1 á 4");
                    break;
            }
            System.out.println("Deseja continuar? 1-Sim 2-Não");
            i = digitar.nextInt();

        }
    }
}
