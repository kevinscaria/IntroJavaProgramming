public class MainJavaLongObject extends Object {

    public static void main(String[] args) {
        Student max = new Student("Max", 24);
        System.out.println(max.toString());
        System.out.println(max);
        System.out.println("------");

        PrimarySchoolStudent john = new PrimarySchoolStudent("John", 12, "Mathew");
        System.out.println(john.toString());
        System.out.println(john);

    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

class PrimarySchoolStudent extends Student{
    private String parentName;

    public PrimarySchoolStudent(String name, int age, String parentName) {
        super(name, age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        return "PrimarySchoolStudent{" +
                "parentName='" + parentName + '\'' +
                "} " + super.toString();
    }
}