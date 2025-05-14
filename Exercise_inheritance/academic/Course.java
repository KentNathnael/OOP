package academic;

public class Course {
    String Course_Code;
    String name;
    int credit;

    public Course(String course_Code, String name, int credit) {
        Course_Code = course_Code;
        this.name = name;
        this.credit = credit;
    }

    public String getCourse_Code() {
        return Course_Code;
    }

    public String getName() {
        return name;
    }

    public int getCredit() {
        return credit;
    }
}
