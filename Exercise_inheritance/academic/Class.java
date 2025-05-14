package academic;

import actor.IAttendant;
import actor.Iattendee;
import actor.Lecturer;
import actor.Student;

import java.util.ArrayList;

public class Class {
    String class_code;
    int semester;
    String year;
    ArrayList<Course> courses = new ArrayList<>();
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Lecturer> lecturers = new ArrayList<>();

    ArrayList<IAttendant> todayAttendats = new ArrayList<>();
    Iattendee todayAttendee;

    public Class(String class_code, int semester, String year) {
        this.class_code = class_code;
        this.semester = semester;
        this.year = year;
    }

    public String getClass_code() {
        return class_code;
    }

    public int getSemester() {
        return semester;
    }

    public String getYear() {
        return year;
    }

    public void addCourse(Course course){
        courses.add(course);
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void addLecturer(Lecturer lecturer){
        lecturers.add(lecturer);
    }

    public void attend(IAttendant iAttendant){
        todayAttendats.add(iAttendant);
    }

    public void takeAttendance(Iattendee iattendee){
        todayAttendee = iattendee;
    }

    public void showTodayAttendance(){
        System.out.println("Today lecturer : " + todayAttendee);
        System.out.println("Today attendance: ");
        for (IAttendant iAttendant : todayAttendats){
            System.out.printf("Name : %s", iAttendant);
        }
    }
}
