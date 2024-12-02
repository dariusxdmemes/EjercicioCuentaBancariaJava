package ObjetoCuentaBancaria;
import java.util.Random;

public class MainCuentaBancaria {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Mendez Álvaro", genNumeroCuenta());
        cuenta1.informacionCuenta();
        System.out.println();

        CuentaBancaria cuenta2 = new CuentaBancaria(1234, "Blasco Ibañez", genNumeroCuenta());
        cuenta2.ingresoDinero(987);
        cuenta2.ingresoDinero(654);
        cuenta2.retiradaDinero(321);
        cuenta2.retiradaDinero(123);
        System.out.println();
        System.out.println("Resumen de cuenta "+cuenta2.getTitular().toUpperCase());
        cuenta2.informacionCuenta();

        //Probando varias cantidades hasta más del saldo del cual dispone y mostrando resumen de la cuenta
    }
    public static String genNumeroCuenta() {
        Random numeroAleatorio = new Random();

        String paisCuenta="ES";

        int numeroControl=numeroAleatorio.nextInt(100);
        int numeroSede=numeroAleatorio.nextInt(9000)+1000;
        int numeroOficina=numeroAleatorio.nextInt(9000)+1000;
        int digitosControl=numeroAleatorio.nextInt(100);
        long numeroCuenta = (long) (numeroAleatorio.nextInt(900000000)+100000000L);

        return paisCuenta+numeroControl+numeroSede+numeroOficina+numeroControl+digitosControl+numeroCuenta;
    }
}