public class IfStatemets {

    public static void main(String[] args) {

        // Verificar si el bluetooth
        boolean isBluetoothEnabled = true;
        int fileSended = 3;

        if (isBluetoothEnabled) {
            // Send File
            fileSended++;
            System.out.println("Archivo enviado");
        } else {
            System.out.println("Bluetooth desactivado, encender por favor");
        }

        System.out.println(fileSended);

    }

}
