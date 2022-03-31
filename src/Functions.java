public class Functions {

    public static void main(String[] args) {
        double y = 3;

        // Devuelvce la raiz cuadrada
        System.out.println(Math.sqrt(y));

        // Area de un circulo
        // pi * 2
//        System.out.println(Math.PI * Math.pow(y,2));
        System.out.println(circleArea(y));

        // Area de una esfere
        // 4*PI*r2
        System.out.println(sphereArea(y));

        // Pesos a dolar
        System.out.println("Pesos a dolar:" + converToCurrency(2000.0, "COP"));
        System.out.println("Bolivares a dolar:" + converToCurrency(2000.0, "VEN"));
    }

    public static double circleArea(double radio){
        return Math.PI * Math.pow(radio,2);
    }

    public static double sphereArea(double radio) {
        return 4*Math.PI*Math.pow(radio,2);
    }

    /**
     * Description: Función que convierte un valor en dolar a la moneda indicada
     *
     * @param dollar Cantidad de dinero en dolar
     * @param currency Tipo de moneda: COP y VEN disponible
     * @return currencyValue Devuelve cantidad en la modena seleccionada
     */
    public static double converToCurrency(double dollar, String currency){
        double currencyValue;
        switch (currency){
            case "COP":
                currencyValue = dollar * 0.00031;
                break;
            case "VEN":
                currencyValue = dollar * 0.31;
                break;
            default:
                currencyValue = dollar;
                break;
        }
        return currencyValue;
    }

}
