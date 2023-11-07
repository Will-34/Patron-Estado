
package src;

/**
 *
 * @author wilfr
 */
public class Jugando extends State {

    public Jugando(Tamagotchi miTamagotchi) {
        super(miTamagotchi);
    }

    @Override
    public void despertarse() {
        miTamagotchi.setMensaje("Ya estoy despierta !!! ");
    }

    @Override
    public void comer() {
        miTamagotchi.setMensaje("A comeeer ! ");
        miTamagotchi.changeState(new Comiendo(miTamagotchi));
        miTamagotchi.setImagen("src/main/java/anya/comiendo.png");
    }

    @Override
    public void estudiar() {
        miTamagotchi.setMensaje("No quieo estudiar ! ");
    }

    @Override
    public void jugar() {
        miTamagotchi.setMensaje("Ya estoy jugandooo ! ");
    }

    @Override
    public void dormir() {
        miTamagotchi.setMensaje("Buenas noches uwu ZZZzZzz");
        miTamagotchi.changeState(new Durmiendo(miTamagotchi));
        miTamagotchi.setImagen("src/main/java/anya/durmiendo.png");
    }

}
