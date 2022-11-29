package test;
import src.diet.Diet;
import src.animal.Animal;


public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");

    Animal cat = new Animal();

      cat.setSpecies("dog");
      cat.setDiet("herbivore");
      cat.setRace("chihuahua");
      cat.setName("Titan");
      cat.setLimbs(4);
      cat.setGestationTime(2);
      cat.setLifeExpectancy(18);
    
    Diet myDiet = new Diet();
    Animal dog = new Animal(myDiet);
    
    Animal bird = new Animal("insectivore");

    System.out.println(cat.getName());
    System.out.println(dog.getDiet());
    System.out.println(bird.getDiet());
  }
}