package coupled;

public class Car {
    private  Tire tire;

    public Car() {
        tire=new Tire();
    }
//istenen durum loose coupling
    public void drive(){
        System.out.print("It user car....");
        tire.turnTire();
    }
}
