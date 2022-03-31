public class While {

    static boolean isTurnLight = false;

    public static void main(String[] args) {
        switchLight();
        /*int i = 0;

        while(isTurnLight && i <= 10){
            printSOS();
            i++;
        }*/
        for (int i = 1; (isTurnLight && (i <= 10)); i++) {
           printSOS();
        }

    }

    public static void printSOS(){
        System.out.println("...___...");
    }

    public static void switchLight(){
        isTurnLight = isTurnLight ? false : true;
    }
}
