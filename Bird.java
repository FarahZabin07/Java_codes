package animals;

public class Bird extends Animal {

    private float wingspan;

    public Bird(String name, int age, float wingspan) {
        super(name, age);
        this.wingspan = wingspan;
    }

    public float getWingspan() {
        return wingspan;
    }

    public void setWingspan(float wingspan) {
        this.wingspan = wingspan;
    }
    @Override

    public void sleep(){
        System.out.println(getName()+" is sleeping.");
    }

    public void sleep(int hour){
        System.out.println(getName()+" will sleep "+hour+"hours.");
    }

}
