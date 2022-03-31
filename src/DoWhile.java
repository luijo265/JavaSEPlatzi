import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {
        int choose = 0;
        do {
            System.out.println("Selecciona el numero");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("0. Salir");

            Scanner sc = new Scanner(System.in);
            choose = sc.nextInt();
            switch (choose){
                case 0:
                    System.out.println("Gracias por visitarnos");
                    break;
                case 1:
                    System.out.println("Movies");
                    break;
                case 2:
                    System.out.println("Series");
                    break;
                default:
                    System.out.println("Selecciona bien");
                    break;
            }

        }while(choose != 0);

        System.out.println("Fin del programa");
    }

}
