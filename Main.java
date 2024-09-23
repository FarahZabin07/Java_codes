package animals;

public class Main {
    public static void main(String[] args) {

    Mammal mammal=new Mammal("Lion",4,"Golden");
    Bird bird=new Bird("Eagle",3,2.5f);
    Reptile reptile=new Reptile("Turtle",5,"Green");

        System.out.println("Bird");
        bird.sleep(6);
        bird.sleep(8);
        System.out.println("Mammal");
        mammal.eat();
        System.out.println("Reptile");
        reptile.crawl();

    }
}