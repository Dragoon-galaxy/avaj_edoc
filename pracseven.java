/*bject Oriented Programming in JAVA 
Practical No. :- 7 
Q.7] A vehicle has engine no and chassis number. It can be locked, unlocked. Every vehicle is movable (interface). 
It can be started, stopped, turned, accelerated, turned, and decelerated. A car is a vehicle. It has steering. An 
airplane is a vehicle. It has wings. A boat is a vehicle. It has propeller.
Code :- */

 //********* 
interface VehicleProperties{ 
 void start(); 
 void stop(); 
 void accelerate(); 
 void decelerate(); 
 void turn(); 
} 
 //***** 
class Vehicle implements VehicleProperties { 
 int engineNo , chassisNo ; 
 public void start(){ 
 System.out.println("It can be started."); 
 } 
 public void stop() { 
 System.out.println("It can be stopped."); 
 } 
 public void accelerate(){ 
 System.out.println("It can be accelerated."); 
 } 
 public void decelerate() { 
 System.out.println("It can be decelerated."); 
 } 
 public void turn() { 
 System.out.println("It can be turned."); 
 } 
} 
 //***** 
class Car extends Vehicle{ 
 Car(int en,int cn) { 
 engineNo = en; 
 chassisNo = cn; 
 } 
 public void steering(){ 
 System.out.println("------Car---------"+'\n'+"It has steering."); 
 } 
} 
 //******** 
class Boat extends Vehicle{ 
 Boat(int en,int cn) { 
 engineNo = en; 
 chassisNo = cn; 
 } 
 public void propeller(){ 
 System.out.println("------Boat---------"+'\n'+"It has propeller."); 
 } 
 } 
 //******** 
class Airplane extends Vehicle{ 
 Airplane(int en,int cn) { 
 engineNo = en; 
 chassisNo = cn; 
 } 
 public void wings(){ 
 System.out.println("------Airplane---------"+'\n'+"It has wings."); 
 } 
} 
 //******* 
public class pracseven{ 
 public static void main(String[] args) { 
 Car c = new Car(1234,56789); 
 Boat b = new Boat(2345,67890); 
 Airplane a = new Airplane(3456,78901); 
 c.steering(); 
 c.start(); 
 c.turn(); 
 c.accelerate(); 
 c.decelerate(); 
 c.stop(); 
 b.propeller(); 
 b.start(); 
 b.turn(); 
 b.accelerate(); 
 b.decelerate(); 
 b.stop(); 
 a.wings(); 
 a.start(); 
 a.turn(); 
 a.accelerate(); 
 a.decelerate(); 
 a.stop(); 
 } 
}