class Animal{

    public void move(){
        System.out.println("Animal");
    }

}

class Dog extends Animal{

    public void move(){
        System.out.println("Dog");
    }

}


public class Override{

    public static void main(String [] args){

            Animal a = new Dog();
            a.move();
            Animal b = new Animal();
            b.move();

    }

}