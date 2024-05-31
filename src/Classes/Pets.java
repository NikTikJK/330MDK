package Classes;

abstract class Pets {
    protected int HP = 100;
    protected String Name;
    protected String sound = "мяу";
    protected int Hangry = 0;
    protected int Happy = 50;
    public Pets(String Name, String sound){
        this.Name = Name;
        this.sound = sound;
    }
    public abstract void Say();
    public abstract void Feed();
    public abstract  void Walk();
    public abstract  void Stats();
}
