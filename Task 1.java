public class Task 1 {

class Contact {
    private String phone;
    private String email;
    
    public Contact(String phone, String email) {
        this.phone = phone;
        this.email = email;
    }
    
    public String getPhone() {
        return phone;
    }
    
    public String getEmail() {
        return email;
    }
    
    @Override
    public String toString() {
        return "Phone: " + phone + ", Email: " + email;
    }
}


class Student {
    private String name;
    private int id;
    private Contact contact;
    
    public Student(String name, int id, Contact contact) {
        this.name = name;
        this.id = id;
        this.contact = contact;
    }
    
    public String getName() {
        return name;
    }
    
    public int getId() {
        return id;
    }
    
    public Contact getContact() {
        return contact;
    }
    
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name + ", " + contact;
    }
}

class School {
    private String name;
    private Student[] students;
    private int studentCount;
    private static final int MAX_STUDENTS = 100;
    
    public School(String name) {
        this.name = name;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }
    
    public void addStudent(Student student) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("School is at maximum capacity!");
        }
    }
    
    public void displayAllStudents() {
        System.out.println("\n=== " + name + " School ===");
        System.out.println("Total Students: " + studentCount);
        System.out.println("----------------------------");
        
        for (int i = 0; i < studentCount; i++) {
            System.out.println(students[i]);
        }
    }
    
    public int getStudentCount() {
        return studentCount;
    }
}
    
}
