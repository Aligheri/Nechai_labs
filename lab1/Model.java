import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Department {
    private int departmentId;
    private String departmentName;
    private String departmentCode;
    private String building;
    private String phone;

    private List<Professor> professors;
    private List<Course> courses;
}

class Classroom {
    private int classroomId;
    private String roomNumber;
    private String building;
    private int capacity;
    private String equipment;

    private List<Course> courses;
}

class Professor {
    private int professorId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String officeLocation;
    private LocalDate hireDate;

    private int departmentId;
    private Department department;
    private List<Course> courses;
}

class Student {
    private int studentId;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate dateOfBirth;
    private String phone;
    private LocalDate enrollmentDate;

    private Integer departmentId;
    private Department department;
    private List<Enrollment> enrollments;

    public double calculateGPA() {
        double total = 0;
        int count = 0;
        for (Enrollment e : enrollments) {
            if (e.grade != null && e.status.equals("completed")) {
                total += e.grade;
                count++;
            }
        }
        return count > 0 ? total / count : 0.0;
    }
}

class Course {
    private int courseId;
    private String courseCode;
    private String courseName;
    private int credits;
    private int maxCapacity;
    private String semester;
    private int year;

    private int professorId;
    private int departmentId;
    private int classroomId;

    private Professor professor;
    private Department department;
    private Classroom classroom;
    private List<Enrollment> enrollments;

    public int getAvailableSeats() {
        int enrolled = 0;
        for (Enrollment e : enrollments) {
            if (e.status.equals("active")) {
                enrolled++;
            }
        }
        return maxCapacity - enrolled;
    }
}

class Enrollment {
    private int enrollmentId;
    private int studentId;
    private int courseId;
    private LocalDate enrollmentDate;
    private Double grade;
    private String status;

    private Student student;
    private Course course;

    public String getLetterGrade() {
        if (grade == null) return "N/A";
        if (grade >= 90) return "A";
        if (grade >= 80) return "B";
        if (grade >= 70) return "C";
        if (grade >= 60) return "D";
        return "F";
    }
}