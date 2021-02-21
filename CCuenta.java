package cuentas;

/**
 * Esta clase simula el comportamiento de una cuenta bancaria. 
 * 
 * 
 * @author Juan Vázquez García
 * @version 1.5
 * @since 1.0
 *
 */

public class CCuenta {
	


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;

    public CCuenta()
    {
    }

    /**
     * Constructor que inicializa varios parámetros. 
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Devuelve el saldo de la cuenta
     * @return saldo de la cuenta
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Constructor que inicializa el parametro cantidad y genera una excepcion
     * @param cantidad
     * @throws Exception
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Constructor que inicializa un parámetro y genera una excepción
     * @param cantidad
     * @throws Exception
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Devuelve el nombre del propietario de la cuenta 
     * @return nombre del propietario
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve la cuenta del usuario 
	 * @return el la cuenta del propietario 
	 */
	private String getCuenta() {
		return cuenta;
	}
	
	/**
	 * Constructor que inicializa el parámetro cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Devuelve el valor correspondiente al saldo
	 * @return saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Constructor que inicializa el parámetro saldo
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Devuelve el valor del tipo de interes
	 * @return tipo de interes 
	 */
	private double getTipoInteres() {
		return tipoInteres;
	}

	/**
	 * Constructor que inicializa el parámetro tipoInteres
	 * @param tipoInteres
	 */
	private void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
}
