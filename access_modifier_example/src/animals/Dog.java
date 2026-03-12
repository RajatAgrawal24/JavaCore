package animals;

public class Dog extends Animal {

    @Override
    protected void eat(){
        System.out.println("Dog eating");
    }

    @Override
    public void sleep(){
        System.out.println("Dog sleeping");
    }
}
