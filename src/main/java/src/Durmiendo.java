
package src;

/**
 *
 * @author wilfr
 */
public class Durmiendo extends State {

    public Durmiendo(Tamagotchi miTamagotchi) {
        super(miTamagotchi);
    }

    @Override
    public void despertarse() {
        miTamagotchi.changeState(new Despierto(miTamagotchi));
        miTamagotchi.setMensaje("Buenos dias ! ");
        miTamagotchi.setImagen("src/main/java/anya/despertarse.png");
    }

    @Override
    public void comer() {
        miTamagotchi.setMensaje("ZzzzZzZZzZZZ");
    }

    @Override
    public void estudiar() {
        miTamagotchi.setMensaje("ZzzzZzZZzZZZ");
    }

    @Override
    public void jugar() {
        miTamagotchi.setMensaje("ZzzzZzZZzZZZ");
    }

    @Override
    public void dormir() {
        miTamagotchi.setMensaje("ZzzzZzZZzZZZ");
    }


}
