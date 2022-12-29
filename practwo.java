 /* Object Oriented Programming in JAVA 
Practical No. : - 2 
Q.2) Create a student result database in Java. Calculate the grades of students. Decide criteria for 
best student and short-list students who satisfy the criteria. 
a) A student has a roll No, name, marks in five courses and a grade. A student list has many students. 
If a student has grade equal or beyond 8, he is considered as a top band student. 
b) Create at least ten students. From these, find all such students which satisfy the criteria of top 
band student. Create a list of such students and display the students in the list. 
CODE : - */
import java.util.*; 
public class practwo { 
 public static void main(String[] args) { 
 Student Abhishek = new Student(03,98,97,96,95,98,"Abhishek"); 
 Student Max = new Student(78,78,87,86,55,98,"Max"); 
 Student Kai = new Student(45,88,77,56,35,48,"Kai"); 
 Student Tyson = new Student(01,87,97,96,65,88,"Tyson"); 
 Student Brooklyn = new Student(02,28,57,26,75,24,"Brooklyn"); 
 Student Richie = new Student(04,81,64,85,78,57,"Richie"); 
 Student Alex = new Student(5,98,73,65,24,81,"Alex"); 
 Student Alexa = new Student(6,98,84,95,86,89,"Alexa"); 
 Student Robin = new Student(07,23,67,34,67,83,"Robin"); 
 Student Sherlock = new Student(8,92,83,56,34,34,"Sherlock"); 
 ArrayList<Student> students = new ArrayList<>(); 
 students.add(Abhishek); 
 students.add(Max); 
 students.add(Kai); 
 students.add(Tyson); 
 students.add(Brooklyn); 
 students.add(Richie); 
 students.add(Alex); 
 students.add(Alexa); 
 students.add(Robin); 
 students.add(Sherlock); 
 Percentage f = new Percentage(students); 
 TopBand finder = new TopBand(students); 
 System.out.println("Top Band Students are: "); 
 finder.getTopBandStudent(); 
 } 
 } 

 class TopBand { 
 ArrayList<Student> students; 
 public TopBand(final ArrayList<Student> students){ 
 this.students = students; 
 } 
 public void getTopBandStudent(){ 
 for (Student student : students){ 
 if(student.getGrade() >= 8){ 
 System.out.println("Name: " + student.getName()+ ", Roll No: " 
+ student.getRollNo() + ",Grade: " + student.getGrade()); 
 } 
 } 
 } 
} 
class Student { 
 int rollNo,sub1,sub2,sub3,sub4,sub5; 
 String name; 
 float grade; 
 float per; 
 public int getRollNo(){ 
 return rollNo; 
 } 
 public void setRollNo(int rollNo){ 
 this.rollNo = rollNo; 
 } 
 public String getName() { 
 return name; 
 } 
 public void setName(String name) { 
 this.name = name; 
 } 
 public Student(int rollNo,int sub1,int sub2, int sub3,int sub4,int 
sub5,String name){ 
 this.rollNo = rollNo; 
 this.name = name; 
 this.sub1 = sub1; 
 this.sub2 = sub2; 
 this.sub3 = sub3; 
 this.sub4 = sub4; 
 this.sub5 = sub5; 
 } 
 public float getGrade() { 
 return grade; 
 } 
 public void setGrade(float grade) { 
 this.grade = grade; 
 } 
 public float getPer() { 
 return per; 
 } 
 public void setPer(float per) { 
 this.per = per; 
 } 
 public int getsub1() { 
 return sub1; 
 } 
 public void setSub1(int sub1) { 
 this.sub1 = sub1; 
 } 
 public int getsub2() { 
 return sub2; 
 } 
 public void setSub2(int sub2) { 
 this.sub2 = sub2; 
 } 
 public int getsub3() { 
 return sub3; 
 } 
 public void setSub3(int sub3) { 
 this.sub3 = sub3; 
 } 
 public int getsub4() { 
 return sub4; 
 } 
 public void setSub4(int sub4) { 
 this.sub4 = sub4; 
 } 
 public int getsub5() { 
 return sub5; 
 } 
 public void setSub5(int sub5) { 
 this.sub5 = sub5; 
 } 
} 

class Percentage { 
 public Percentage(ArrayList<Student> students) { 
 for(Student student : students) { 
 student.setPer( 
 (student.getsub1() + student.getsub2() + student.getsub3() + 
student.getsub4() + student.getsub5() )/5); 
 student.setGrade((float) (student.getPer()/9.5)); 
 } 
 } 
} 
