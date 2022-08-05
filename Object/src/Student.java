public class Student {
    private String name;
    private String college;
    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCollege() {
        return college;
    }
    public void setCollege(String college) {
        this.college = college;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", college='" + college + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Student student = new Student("sachin", "iit");
        Student student2 = new Student("kapil", "nit");
        Student student3 = new Student("rahul", "iiit");

        System.out.println(student);
        System.out.println(student2);
        System.out.println(student3);

    }
}