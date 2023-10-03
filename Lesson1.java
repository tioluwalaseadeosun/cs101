/**
 * In this lesson, we will explore primtive data types in java.
 * Java is a typed language, which means that you must specify the
 * data type of every variable.
 * 
 * Primitive data types are discrete values as opposed to object data types
 * which are collections of values.
 * We assign literal values to variables of primitive data types.
 * Primitive data types do not need classes or constructor methods.
 * 
 * For mor info about java data types, see the link below.
 * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html 
 * 
 * In java syntax, you put the data type before the variable name.
 */
 
import java.util.*;

public class Lesson1 {
  /**
   * Java, like most typed languages has different numerical types 
   * of different sizes.
   * Below are a few examples.
   */
   
  // Declaring a variable with byte data type and value 
  byte myByte = 0b1001;
  
  // Declaring a variable with short data type and value 
  short myShort = 254;
  
  // Declaring a variable with integer data type and value 
  int myInt = 231;
  
  // Declaring a variable with float data type and value 
  float myFloat = 2.0f;
  
  // Declaring a variable with double data type and value 
  double myDouble = 231;
  
  /**
   * Java has two types for representing alphanumeric values.
   */
  
  // Declaring a variable with CHARACTER data type and value
  char mychar = 'e';
  
  // Declaring a variable with string data type and value
  String myStr = "Stringy";
  
  /**
   * Java has a data type for representing true or false, called Boolean.
   */
  
  // Declaring a variable with boolean data type and value
  boolean myBool = true;
  
  /**
   * Any variable in java that is not a primitive data type, is an object.
   * Below are a few examples of objects in java.
   * 
   * Unlike primitive data types, Object types are not discrete.
   * Object types are an aggregation of primitive types and
   * possibly other object types.
   * Object types have attributes and behaviour.
   * The attributes can be of primitive types or other object types,
   * and the behaviours are class functions called methods
   */
  
  // Declaring a variable with Object data type and value
  Object myObj = new Object();
  
  // Accessing attributes of myObj with dot notation.
  String s1 = myObj.toString();
  
  // Declaring a variable with array list data type and value
  ArrayList myArrayList = new ArrayList(1);
  
  // Accessing attributes of myArray with dot notation.
  // myArrayList.set(1, (Object)myObj);
  String s2 = myArrayList.toString();
  
  public void printAllValues() {
    // Printing out all the values.
    
    System.out.println(myByte);
    System.out.println(myShort);
    System.out.println(myInt);
    System.out.println(myFloat);
    System.out.println(myDouble);
    System.out.println(mychar);
    System.out.println(myStr);
    System.out.println(myBool);
    System.out.println(myObj);
    System.out.println(myArrayList);
  }
  
  
  public static void main(String[] args) {
    Lesson1 l1 = new Lesson1();
    l1.printAllValues();
  }
}










































