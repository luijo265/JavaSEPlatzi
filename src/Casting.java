public class Casting {

    public static void main(String[] args) {
        // En un año ubicar hogares a 30 erritos
        // cuantos perritos ubiqye al mes

        // Aqui obtenemos más precision
        double monthlyDogs = 30.0/12.0;
        System.out.println(monthlyDogs);

        // Estimacion
        int estimatedMonthlyDogs = (int) monthlyDogs;
        System.out.println(estimatedMonthlyDogs);

        // Exactitud
        int a = 30;
        int b = 12;

        System.out.println((double)a/b);

        double c = (double) a/b;
//        double c = a/b; //(2) El resultado entre enteros resulta entero, por lo que el casting es agarrar ese resultado y aplicar el casting
        System.out.println(c);

        char n = '1';
        int nI = n;
        System.out.println(nI);

        short nS = (short) n;
//        short nsS = n; // Muestra error donde char no aplica casting automatico a short
        System.out.println(nS);

        char c1 = 'z'; //conviertelo a int
        int c1Int = c1;

        int i = 250; //conviertelo a long y luego de long a short
        long iLong = i;
        short iShort = (short) iLong;

        double d = 301.067; //conviertelo a long
        long dLong = (long) d;

        int i2 = 100; //súmale 5000.66 y conviertelo a float
        float i2Float = (float) (i2 + 5000.66);

        int i3 = 737; //multiplícalo por 100 y conviertelo a byte
        byte i3Byte = (byte)(i3 * 100);

        double d4 = 298.638; //divídelo entre 25 y conviertelo a long
        long d4long = (long) (d4 / 25);

    }

}
