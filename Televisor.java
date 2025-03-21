import enums.TipoDeTelevisor;

public class Televisor {
    private String marca;
    private String modelo;
    private int anio;
    private int pulgadas;
    private String resolucion;
    private boolean esInteligente;
    private TipoDeTelevisor tipo;
    private boolean encendido;

    public Televisor(String marca, String modelo, int anio, int pulgadas, String resolucion, boolean esInteligente, TipoDeTelevisor tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.pulgadas = pulgadas;
        this.resolucion = resolucion;
        this.esInteligente = esInteligente;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return marca + " " + modelo + " -- " + pulgadas + " pulgadas"+ " -- " + resolucion + " -- " + esInteligente;
    }

    public void encender() {
        encendido = true;
    }

    public void apagar() {
        encendido = false;
    }


}
