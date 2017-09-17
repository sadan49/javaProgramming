/* Things an object knows about itself are called instance variable. */
/* Things an object can do are called methods. */
/* A class is not an object(but it's used to contruct them) */

//Step 1
/* Write your Class */
class Dog {
//These declarations are known as instance variable.

  int size;
  String breed;
  String name;
  
  //A method
  void bark() {
    System.out.println("Bhow Bhow");
    }
  }
  
  //Step 2
  /* Write a tester class(TesterDrive) */
  class DogTestDrive {
    public static void main(String args[]) { //Just a main method(We are gonna put the code in the next Step.
      //Dog test goes here.
      }
   }
   
   //Step 3
   /* In your tester, make an object and accesst the object's variables and method.
   
  class DogTestDrive {
    public static void main(String args[]) { //Just a main method(We are gonna put the code in the next Step.
        Dog d = new Dog(); //Make a dog object
        d.size = 40; //Use dot operator to set the size of the dog.
        d.bark(); //and to calls it bark method.
      }
   } 
    
  
