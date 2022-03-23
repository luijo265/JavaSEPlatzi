public class MathematicOperation {

    public static void main(String[] args) {

        double x = 2.1;
        double y = 3;

        // devuelve un entero hacia arriba
        System.out.println(Math.ceil(x));

        // devuelve un entero hacia arriba
        System.out.println(Math.floor(x));

        // numero elevado a otro
        System.out.println(Math.pow(x, y));

        // devuelve el numero mayor
        System.out.println(Math.max(x,y));

        // Devuelvce la raiz cuadrada
        System.out.println(Math.sqrt(y));

        // Area de un circulo
        // pi * 2
        System.out.println(Math.PI * Math.pow(y,2));

        // Area de una esfere
        // 4*PI*r2
        System.out.println(4*Math.PI*Math.pow(y,2));


    }

}
