import animals.Animal;

public class App extends Animal {
    static App app =  new App();
    public void some(){
        Animal animal = new Animal();
        super.eat();
    }
    public void main(String[] args) {
        Animal animal = new Animal();

        animal.sleep();
//        animal.eat();
        System.out.println(super.toString());
        app.eat();
    }
}
