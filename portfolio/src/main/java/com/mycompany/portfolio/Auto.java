package com.mycompany.portfolio;

/**
 *
 * @author MEDERO
 */
public class Auto extends Vehiculo{

    //declarancion de atributos
    private int id;
    private String patente;
    private int cantPuertas;
    private String color;
    private boolean cajaManual;

    //constructores -boton derecho insert code, contructor-
    public Auto() {
    }

    public Auto(int id, String patente, int cantPuertas, String color, boolean cajaManual, int numRegistro, int cantRuedas, String marca, String modelo) {
        super(numRegistro, cantRuedas, marca, modelo);
        this.id = id;
        this.patente = patente;
        this.cantPuertas = cantPuertas;
        this.color = color;
        this.cajaManual = cajaManual;
    }

    //declarar los métodos
    //declaro primero los getters y setters -- boton derecho o alt + insert  getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCajaManual() {
        return cajaManual;
    }

    public void setCajaManual(boolean cajaManual) {
        this.cajaManual = cajaManual;
    }

    //metodo toString
    @Override
    public String toString() {
        return "Auto{" + "id=" + id + ", patente=" + patente + ", cantPuertas=" + cantPuertas + ", color=" + color + ", cajaManual=" + cajaManual + '}';
    }

    //metodos propios
    public void encender() {
        System.out.println("Estoy encendiendo");
    }

    public void apagar() {
        System.out.println("Estoy apagando");
    }

    public void acelerar(double km) {
        System.out.println("Estoy acelerando " + km + " kms");
    }

    public void frenar(double km) {
        System.out.println("Estoy frenando " + km + " kms");
    }
}
