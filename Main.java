class Animal{
    public void animalSound(){
        System.out.println("This animal makes a sound");
    }
}

class Pig extends Animal{
    public void animalSound(){
        System.out.println("Pig goes oink....");
    }
}


class Dog extends Animal{
    public void animalSound(){
        super.animalSound();
        System.out.println("Dog goes bark...");
    }
}


class Main extends vehicle{
    public static void main(String[] args){
    Animal AnimalObj = new Animal();
    Animal dogObj = new Dog();
    Animal pigObj = new Pig();
    AnimalObj.animalSound();
    dogObj.animalSound();
    pigObj.animalSound();


        
    }
}
