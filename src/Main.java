import Classes.Cat;
import Classes.Dog;
import Classes.Tiger;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Cat Cat = new Cat("Борис", "мааау");
        Dog Dog = new Dog("Рыжик", "гавав");
        Tiger Tiger = new Tiger("Алигатор", "аррхрар");
        Cat.Say();
        Cat.Stats();
        Cat.CatTouch();
        Dog.Say();
        Dog.Stats();
        Dog.GetBone();
        Tiger.Say();
        Tiger.Stats();
        Tiger.EatPeople();


    }
}