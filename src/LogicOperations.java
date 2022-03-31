public class LogicOperations {

    public static void main(String[] args) {

        int edadLuis = 30;
        int edadDayana = 28;

        // Operadores asignacion
        System.out.println("a = b " + (edadDayana == edadLuis));
        System.out.println("a <> b " + (edadDayana != edadLuis));

        // Operadores relacionales
        System.out.println("a > b " + (edadDayana > edadLuis));
        System.out.println("a < b " + (edadDayana < edadLuis));
        System.out.println("a >= b " + (edadDayana >= edadLuis));
        System.out.println("a <= b " + (edadDayana <= edadLuis));

        if (edadDayana == edadLuis){
            System.out.println("son iguales");
        }else if(edadDayana != edadLuis){
            System.out.println("son diferentes");
        }else if(edadDayana > edadLuis){
            System.out.println("dayana es mayor");
        }else if(edadDayana < edadLuis){
            System.out.println("dayana es menor");
        }else if(edadDayana >= edadLuis){
            System.out.println("dayana es mayor o igual");
        }else if(edadDayana <= edadLuis){
            System.out.println("dayana es menor o igual");

        }

    }

}
