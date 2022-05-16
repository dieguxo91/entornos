/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package eedUnidad_4;

/**
 *
 * @author Francisco Javier Cabrerizo Membrilla
 */
public class CCuenta {


    // Propiedades de la Clase Cuenta
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /* Constructor sin argumentos */

    /**
     *
     */

    public CCuenta ()
    {
    }
    // Constructor con parámetro para iniciar todas las propiedades de la clase

    /**
     *
     * @param nom
     * @param cue
     * @param sal
     * @param tipo
     */
    public CCuenta (String nom, String cue, double sal, double tipo)
    {
        tipoInterés=tipo;
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
   // Método para asignar el nombre del titular de la cuenta

    /**
     *
     * @param nom
     */
    public void asignarNombre(String nom)
    {
        nombre=nom;
    }
    // Método que me devuelve el nombre del titular

    /**
     *
     * @return
     */
    public String obtenerNombre()
    {
        return nombre;
    }

    // Método que me devuelve el saldo disponible en cada momento

    /**
     *
     * @return
     */
     public double estado ()
    {
        return saldo;
    }

    /* Método para ingresar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */

    /**
     *
     * @param cantidad
     * @throws Exception
     */

    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0){
            throw new Exception("No se puede ingresar una cantidad negativa");
        }
        setSaldo(saldo + cantidad);
        
    }



    /* Método para retirar cantidades en la cuenta. Modifica el saldo.
     * Este método va a ser probado con Junit
     */

    /**
     *
     * @param cantidad
     * @throws Exception
     */

    public void retirar (double cantidad) throws Exception
    {
        if (cantidad < 0){
            throw new Exception ("No se puede retirar una cantidad negativa");
        }
        if (estado()< cantidad){
            throw new Exception ("No hay suficiente saldo");
        }
        setSaldo(saldo - cantidad);
    }

    // Método que me devuelve el número de cuenta

    /**
     *
     * @return
     */
    public String obtenerCuenta ()
    {
        return cuenta;
    }

    /**
     * @param cuenta the cuenta to set
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the tipoInterés
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * @param tipoInterés the tipoInterés to set
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
}
