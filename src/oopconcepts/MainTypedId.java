package oopconcepts;

class StudentIdTyped {

    String sid;

    StudentIdTyped(String sid) {
        if (sid == null || sid.isBlank()) {
            throw new IllegalArgumentException(
                "Student ID cannot be null or blank"
            );
        }
        this.sid = sid;
    }

    public String value() {
        return sid;
    }
}

class CourseIdTyped {

    String cid;

    CourseIdTyped(String cid) {
        if (cid == null || cid.isBlank()) {
            throw new IllegalArgumentException(
                "Course ID cannot be null or blank"
            );
        }
        this.cid = cid;
    }

    public String value() {
        return cid;
    }
}

class StudentTyped {

    public void register(StudentIdTyped sid, CourseIdTyped cid) {

        System.out.println(
            sid.value() + " Registered for Course ID: " + cid.value()
        );
    }
}

public class MainTypedId {

    public static void main(String[] args) {

        StudentTyped s = new StudentTyped();

        StudentIdTyped sid = new StudentIdTyped("S101");

        CourseIdTyped cid = new CourseIdTyped("C101");

        // Correct way
        s.register(sid, cid);

        // Wrong way - compilation error
        // s.register(cid, sid);
    }
}