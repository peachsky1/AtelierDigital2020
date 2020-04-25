package Lab2.CodeChallenge3;

public abstract class Animal {

    protected int legs;
    protected Animal(int legs){
        this.legs = legs;
    }

    abstract void eat();
    protected void walk(){
        System.out.println("Walking in "+legs+" legs...");
    }

}
