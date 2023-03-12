package programas;

public class Cuenta {
	//Estoy metiendo un comentario en la ramalocal2 para ver que pasa
	//Este comentario lo pongo desde Github para ver que pasa y haré un pull para que se me actualice en local
	
							//defino dos variables para alojar el número de cuenta y el saldo
	private String número; //número de la cuenta bancaria
	private float saldo; // saldo de la cuenta bancaria en euros

	
	
	
	public Cuenta (String numCta, float saldoCta) {     //creo el constructor que tendrá dos parámetros numCta y saldo Cta 
		número=numCta;                                  //así cuando lo llame, cada uno de los valores de los parámetros irá 
		saldo=saldoCta;									//a las variables que hemos definido antes.
	}
			
		
	public String getNúmero() {   
		return número;								//creo los getter y setter métodos que me sirven 
	}												//para obtener e introducir valores respectivamente
													//se hace desde Source-generate getters...
	
	public void setNúmero(String numCta) {
		this.número = numCta;
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
		System.out.println("El número de cuenta es: " + getNúmero() );
		System.out.println("El saldo es: " + getSaldo() + "€");
	}	
	
	
}
