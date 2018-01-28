package Animals;

public class Cat implements Animals {
    private String name = "";
    private int speed = 0;

    public Cat () {
    }

    public Cat(String name) {
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
        System.out.println("Cat "+name+" is eating.");
    }

    @Override
    public void run(int speed) {
        System.out.println("Cat "+name+" is running with speed :"+speed+" .");
    }
}
