package Classes;

public class Dog extends Pets{
    public Dog(String Name, String sound){
        super(Name, sound);

    }
    @Override
    public void Say() {
        System.out.println(this.sound);
    }
    @Override
    public void Feed() {
        if ((this.Hangry -= 10) >= 0){
            this.Hangry -= 10;
            System.out.println("вы покормили своего "  + this.Name + " теперь он хочет есть на " + this.Hangry);
        }else {
            System.out.println("ваш " + this.Name + " ничего не съел");
        }

    }
    @Override
    public void Walk(){
        if((this.Happy + 20) <= 100){
            System.out.println("вы выгулялли своего питомца");
            this.Hangry += 20;
            this.Happy += 10;
            if(this.Hangry >= 60){
                this.HP -= 10;
            }
        }else{
            System.out.println("слишком счастлив");
        }
    }

    public  void GetBone(){
        System.out.println("вы кинули собаке кость: +1 к сытости");
        this.Hangry -= 1;
    }

    @Override
    public void Stats() {
        System.out.println("Ваш питомец: " + this.Name + "\n HP: " + this.HP + "\n Hangry: " + this.Hangry + "\n Happy: " + this.Happy);
    }
}
