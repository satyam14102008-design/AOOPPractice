package oopconcepts;

class StudentWithoutTypedId {

    public void register(String studentId, String courseId) {

        System.out.println("Student ID: " + studentId
                + " Registered for Course ID: " + courseId);
    }
}

class MainWithoutTypedId {

    public static void main(String[] args) {

        StudentWithoutTypedId s = new StudentWithoutTypedId();

        // Correct way
        s.register("S101", "C101");

        // Wrong way (Java still accepts it)
        s.register("C101", "S101");
    }
}


