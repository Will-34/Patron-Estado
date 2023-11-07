
package src;

/**
 *
 * @author wilfr
 */
public class Estudiando extends State {

    public Estudiando(Tamagotchi miTamagotchi) {
        super(miTamagotchi);
    }

    @Override
    public void despertarse() {
        miTamagotchi.setMensaje("Ya estoy despierta y estudiando !! ");
    }

    @Override
    public void comer() {
        miTamagotchi.setMensaje("No quiero, primero quiero jugar !! ");
    }

    @Override
    public void estudiar() {
        miTamagotchi.setMensaje("Ya estoy estudiando !! ");
    }

    @Override
    public void jugar() {
        miTamagotchi.changeState(new Jugando(miTamagotchi));
        miTamagotchi.setMensaje("A jugar !! ");
        miTamagotchi.setImagen("src/main/java/anya/jugando.png");
    }

    @Override
    public void dormir() {
        miTamagotchi.changeState(new Durmiendo(miTamagotchi));
        miTamagotchi.setMensaje("Buenas noches uwu ! ");
        miTamagotchi.setImagen("src/main/java/anya/durmiendo.png");
    }

}
