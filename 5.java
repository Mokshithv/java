public class Shape 
{ 
// Member functions 
public void draw() 
{ 
System.out.println("Drawing a shape"); 
} 
public void erase() 
{ 
System.out.println("Erasing a shape"); 
} 
} 
// Circle class, a subclass of Shape 
class Circle extends Shape 
{ 
public void draw() 
{ 
System.out.println("Drawing a circle"); 
} 
public void erase() 
{ 
} 
} 
System.out.println("Erasing a circle"); 
// Triangle class, a subclass of Shape 
class Triangle extends Shape 
{ 
public void draw() 
{ 
System.out.println("Drawing a triangle"); 
} 
public void erase() 
{ 
System.out.println("Erasing a triangle"); 
} 
} 
// Square class, a subclass of Shape 
class Square extends Shape 
{
public void draw() 
{ 
System.out.println("Drawing a square"); 
} 
public void erase() 
{ 
System.out.println("Erasing a square"); 
} 
} 
// Main program to demonstrate polymorphism 
class Main 
{ 
} 
public static void main(String[] args) 
{ 
// Creating objects of different shapes 
Circle c = new Circle(); 
Triangle t = new Triangle(); 
Square s = new Square(); 
// Demonstrating polymorphism by calling draw and erase methods 
System.out.println("Using Circle object:"); 
c.draw(); 
c.erase(); 
System.out.println("\nUsing Triangle object:"); 
t.draw(); 
t.erase(); 
System.out.println("\nUsing Square object:"); 
s.draw(); 
s.erase(); 
}
