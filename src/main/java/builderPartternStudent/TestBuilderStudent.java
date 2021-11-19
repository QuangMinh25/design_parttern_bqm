package builderPartternStudent;

public class TestBuilderStudent {
    public static void main(String[] args) {
//Using builder to get the object in a single line of code and
//without any inconsistent state or arguments management issues
        Student student1 = new Student.StudentBuilder(
                "1", "Minh","14ATT","21","Male").build();
        Student student2 = new Student.StudentBuilder(
                "1", "Minh","14ATT","21","Male").setAdress("asdf")
                .setNationality("VN").setReligion("Buddhism").build();
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}
