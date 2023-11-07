package src;

public abstract class State {

  Tamagotchi miTamagotchi;

  State(Tamagotchi miTamagotchi) {
    this.miTamagotchi = miTamagotchi;
  }

  public abstract void despertarse();
  public abstract void comer();
  public abstract void estudiar();
  public abstract void jugar();
  public abstract void dormir();

}


