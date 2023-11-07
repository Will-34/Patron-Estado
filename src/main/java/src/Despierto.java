/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package src;

/**
 *
 * @author wilfr
 */
public class Despierto extends State {

    public Despierto(Tamagotchi miTamagotchi) {
        super(miTamagotchi);
    }

    @Override
    public void despertarse() {
        miTamagotchi.setMensaje("Ya estoy despierta !! ");
    }

    @Override
    public void comer() {
        miTamagotchi.changeState(new Comiendo(miTamagotchi));
        miTamagotchi.setMensaje("A comeeeer ! ");
        miTamagotchi.setImagen("src/main/java/anya/comiendo.png");
    }

    @Override
    public void estudiar() {
       miTamagotchi.setMensaje("Tengo hambre !! ");
    }

    @Override
    public void jugar() {
       miTamagotchi.setMensaje("Primero tengo que comer y estudiar !! ");
    }

    @Override
    public void dormir() {
        miTamagotchi.setMensaje("Ya no quiero dormir ! ");
    }

}
