package programas;

public class CuentaMain {
	
		public static void main (String [] args) {
			
			Cuenta cuenta1 = new Cuenta("ES21099865462528660871295", 0);
			cuenta1.setSaldo(100);
			cuenta1.ingresarDinero(200);
			System.out.println(cuenta1.getSaldo());
			cuenta1.extraerDinero(50);
			cuenta1.mostrarCuenta();
			cuenta1.extraerDinero(500);
			cuenta1.mostrarCuenta();
			
		}
}
