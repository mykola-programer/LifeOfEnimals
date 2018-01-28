package Animals;

public class Dog implements Animals {
    private String name = "";
    private int speed = 0;

    public Dog() {
    }

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
    @Override
    public void eat() {
        System.out.println("Dog "+name+" is eating.");
    }

    @Override
    public void run(int speed) {
        System.out.println("Dog "+name+" is running with speed :"+speed+" .");
    }
}
