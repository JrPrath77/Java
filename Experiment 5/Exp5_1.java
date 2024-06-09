/* Animals (Grouping Related Classes):
•	Create classes for Dog and Cat.
•	Put them in a package called pets to group them together because they're both pets.
 */
import pets.Dog;
import pets.Cat;
public class Exp5_1{

public static void main(String args[]){
    Dog d1=new Dog();
    Cat c1=new Cat();

    d1.display();
    d1.bark();
    c1.display();
    c1.sound();
}
}