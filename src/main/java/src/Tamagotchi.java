package src;

public class Tamagotchi {

    private State state;
    private String mensaje;
    private String imagen;

    public Tamagotchi() {
        this.state = new Despierto(this);
        setImagen("src/main/java/anya/despertarse.png");
    }
    public void changeState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public void comer() {
        this.state.comer();
    }

    public void dormir() {
        this.state.dormir();
    }

    public void jugar() {
        this.state.jugar();
    }

    public void despertarse() {
        this.state.despertarse();
    }

    public void estudiar() {
        this.state.estudiar();
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getImagen() {
        return imagen;
    }

}
