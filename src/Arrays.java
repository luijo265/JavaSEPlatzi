public class Arrays {
    public static void main(String[] args) {
        int size = 17;
        String[] androidVersions = new String[size];
        String days[] = new String[7];

        String[][] cities = new String[4][2];

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Applie Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        /*for (int i = 0; i < androidVersions.length; i++) {
            System.out.println(androidVersions[i]);
        }*/

        for (String androidVersion: androidVersions) {
            System.out.println(androidVersion);
        }

        cities[0][0] = "Venezuela";
        cities[0][1] = "Guatire";
        cities[1][0] = "Venezuela";
        cities[1][1] = "Caracas";
        cities[2][0] = "Colombia";
        cities[2][1] = "Cali";
        cities[3][0] = "Colombia";
        cities[3][1] = "Medellin";

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(cities[i][j]);
            }
        }

        /*System.out.println(cities[0][0]);
        System.out.println(cities[0][1]);
        System.out.println(cities[1][0]);
        System.out.println(cities[1][1]);
        System.out.println(cities[2][0]);
        System.out.println(cities[2][1]);
        System.out.println(cities[3][0]);
        System.out.println(cities[3][1]);*/

        // [1][0][0][1]
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
    }
}
