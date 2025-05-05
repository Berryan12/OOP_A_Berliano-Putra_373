class Student extends User {
    private String studentId;

    public Student(String name, String studentId) {
        super(name);
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public boolean login(String inputName, String inputId) {
        return getName().equals(inputName) && studentId.equals(inputId);
    }

    @Override
    public void displayInfo() {
        System.out.println("Student login successful.");
        System.out.println("Name: " + getName());
        System.out.println("Student ID: " + studentId);
    }
}