package cuentas;

/**
 * Es el inicio del programa. El programa bancario comienza. 
 * @author Usuario
 * @version 1.5
 * @since 1.0
 *
 */
public class Main {

    public static void main(String[] args) {
        operativa_cuenta(0);
    }

	private static void operativa_cuenta(float cantidad) {
		CCuenta cuenta1;
        double saldoActual;
        

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",300,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(100);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
