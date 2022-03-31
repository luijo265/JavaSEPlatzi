public class SwithStatements {

    public static void main(String[] args) {

//        String theme = "Light";
        String theme = "1";

        switch (theme){
            case "Dark":
                System.out.println("Selecionado tema negro");
                break;
            case "Light":
                System.out.println("Selecionado tema Light");
                break;
            case "Blue":
                System.out.println("Selecionado tema azul");
                break;
            default:
                System.out.println("Selecionado tema por defecto");
                break;
        }

    }

}
