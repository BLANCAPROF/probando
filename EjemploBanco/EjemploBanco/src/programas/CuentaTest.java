package programas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CuentaTest {

	@Test
	void testGetSaldo() {
		Cuenta cuenta1 = new Cuenta("ES21099865462528660871295", 100);
		float saldo=cuenta1.getSaldo();
		assertEquals(100, saldo);
	//	assertEquals(10,saldo,"ojo no va"); //cambio respecto a JUnit4 string al final
	}

	@Test
	void testSetSaldo() {
		Cuenta cuenta1 = new Cuenta("ES21099865462528660871295", 0);
		cuenta1.setSaldo(100);
		assertEquals(100, cuenta1.getSaldo());
	}

	@Test
	void testIngresarDinero() {
		Cuenta cuenta1 = new Cuenta("ES21099865462528660871295", 100);
		cuenta1.ingresarDinero(400);
		assertEquals(500, cuenta1.getSaldo());
	}

	@Test
	void testExtraerDinero() {
		/*Cuenta cuenta1 = new Cuenta("ES21099865462528660871295", 100);
		cuenta1.extraerDinero(20);
		assertEquals(80, cuenta1.getSaldo());*/
		
		try {
			Cuenta cuenta1 = new Cuenta("ES21099865462528660871295", 100);
			cuenta1.extraerDinero(120);
			fail("Error. Se debería haber lanzado una excepción porque el saldo es negativo");
			}
		catch (ArithmeticException ae) {
			//prueba correcta
		}
	}

}
