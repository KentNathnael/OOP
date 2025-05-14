package actor;

public class Lecturer implements Iattendee {
    String lec_code;
    String name;
    String dob;

    public String getLec_code() {
        return lec_code;
    }

    public String getDob() {
        return dob;
    }

    public String getName() {
        return name;
    }

    public Lecturer(String lec_code, String name, String dob) {
        this.lec_code = lec_code;
        this.name = name;
        this.dob = dob;
    }
}
