
package src;

/**
 *
 * @author wilfr
 */
public class Comiendo extends State {

    public Comiendo(Tamagotchi miTamagotchi) {
        super(miTamagotchi);
    }

    @Override
    public void despertarse() {
        miTamagotchi.setMensaje("Ya Estoy Despierta !! ");
    }

    @Override
    public void comer() {
        miTamagotchi.setMensaje("Ya estoy comiendo e.e !! ");
    }

    @Override
    public void estudiar() {
        miTamagotchi.changeState(new Estudiando(miTamagotchi));
        miTamagotchi.setMensaje("A estudiar ! ! ");
        miTamagotchi.setImagen("src/main/java/anya/estudiando.png");
    }

    @Override
    public void jugar() {
        miTamagotchi.setMensaje("Primero tengo que Estudiar !! ");
    }

    @Override
    public void dormir() {
        miTamagotchi.changeState(new Durmiendo(miTamagotchi));
        miTamagotchi.setMensaje("a dormir ZzZzZzz");
        miTamagotchi.setImagen("src/main/java/anya/durmiendo.png");
    }

}
