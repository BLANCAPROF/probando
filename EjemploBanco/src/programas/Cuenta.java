package programas;

public class Cuenta {
	//Estoy metiendo un comentario en la ramalocal2 para ver que pasa
							//defino dos variables para alojar el n�mero de cuenta y el saldo
	private String n�mero; //n�mero de la cuenta bancaria
	private float saldo; // saldo de la cuenta bancaria en euros

	
	
	
	public Cuenta (String numCta, float saldoCta) {     //creo el constructor que tendr� dos par�metros numCta y saldo Cta 
		n�mero=numCta;                                  //as� cuando lo llame, cada uno de los valores de los par�metros ir� 
		saldo=saldoCta;									//a las variables que hemos definido antes.
	}
			
		
	public String getN�mero() {   
		return n�mero;								//creo los getter y setter m�todos que me sirven 
	}												//para obtener e introducir valores respectivamente
													//se hace desde Source-generate getters...
	
	public void setN�mero(String numCta) {
		this.n�mero = numCta;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldoCta) {
		this.saldo = saldoCta;
	}
	
	public void ingresarDinero (float importe) {
		saldo= saldo+importe;
	}
	
	public void extraerDinero (float importe) {
		// saldo= saldo-importe;
		
	if (saldo-importe <0)
			throw new java.lang.ArithmeticException ("Saldo Negativo");
		else saldo=saldo-importe;    
		
		
	}	
	
	public void mostrarCuenta () {
		System.out.println("El n�mero de cuenta es: " + getN�mero() );
		System.out.println("El saldo es: " + getSaldo() + "�");
	}	
	
	
}
