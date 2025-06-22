package SuperKeyword;

public class Dog extends Animal{

    String breed;

    public Dog(String name,String breed){
        super(name);
        this.breed = breed;
    }


    @Override
    public void sound(){
        System.out.println("Dog barks");
    }

    public void display(){
        System.out.println("Name: " + this.name + ", Breed: " + this.breed);  // Correctly display name and breed
    }
}
