/* Shape Hierarchy (Avoiding Name Conflicts):
•	Create two classes named Circle and Rectangle with their respective properties and methods.
•	Imagine you're working on a separate project that also has a class named Circle for unrelated functionality (e.g., representing a social circle).
•	Without packages, using both classes in the same program would lead to a conflict.
•	Solution: Organize your Circle and Rectangle classes within a package named geometry. This enables you to reference them using geometry.Circle and geometry.Rectangle, preventing conflicts with classes from other projects.

 */

 import geometry.Circle;
 import geometry.Rectangle;
 
 public class Exp5_2 {
     public static void main(String args[]){
         Circle c1 = new Circle(); // Using Circle from the geometry package
         Rectangle r1 = new Rectangle(); // Using Rectangle from the geometry package
       
         
         c1.displayArea();
         r1.displayArea();
     }
 }
 

