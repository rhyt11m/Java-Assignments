// Custom Exception Class
class InvalidMarksException extends Exception {
InvalidMarksException(String msg) {
super(msg);
}
}

// Student Class
class Student {
String name;
int marks;

Student(String name, int marks) throws InvalidMarksException {
if (marks < 0 || marks > 100) {
throw new InvalidMarksException("Invalid Marks! Marks should be between 0 and 100.");
}
this.name = name;
this.marks = marks;
}

String assignGrade() {
if (marks >= 90)
return "A";
else if (marks >= 75)
return "B";
else if (marks >= 60)
return "C";
else if (marks >= 50)
return "D";
else
return "F";
}

void display() {
System.out.println("Name: " + name);
System.out.println("Marks: " + marks);
System.out.println("Grade: " + assignGrade());
}
}

// Main Class
class Main {
public static void main(String[] args) {
try {
Student s1 = new Student("Rahul", 82);
s1.display();

Student s2 = new Student("Aman", 110); // Invalid marks
s2.display();

} catch (InvalidMarksException e) {
System.out.println(e.getMessage());
}
}
}
