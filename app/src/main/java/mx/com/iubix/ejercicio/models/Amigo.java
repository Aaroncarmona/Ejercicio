package mx.com.iubix.ejercicio.models;

public class Amigo {
    private String nombre;
    private String twitter;
    private String ultimo;

    public Amigo(){

    }

    public Amigo(String nombre, String twitter, String ultimo){
        this.nombre = nombre;
        this.twitter = twitter;
        this.ultimo = ultimo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getUltimo() {
        return ultimo;
    }

    public void setUltimo(String ultimo) {
        this.ultimo = ultimo;
    }
}
