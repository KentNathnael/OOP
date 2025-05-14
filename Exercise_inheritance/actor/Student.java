package actor;

public class Student implements IAttendant{
    String nim;
    String name;
    String dob;

    public Student(String nim, String name, String dob) {
        this.nim = nim;
        this.name = name;
        this.dob = dob;
    }

    public String getNim() {
        return nim;
    }

    public String getName() {
        return name;
    }

    public String getDob() {
        return dob;
    }
}
