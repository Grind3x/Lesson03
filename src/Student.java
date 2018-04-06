import java.util.Objects;

public class Student extends Human {
    private String university;
    private Group group;

    public Student() {

    }

    public Student(String secondName, String firstName, int age, boolean sex, String nationality, String university) {
        super(secondName, firstName, age, sex, nationality);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;


        return Objects.equals(this.getFirstName(), student.getFirstName()) &
                Objects.equals(this.getSecondName(), student.getSecondName()) &
                Objects.equals(this.getAge(), student.getAge()) &
                Objects.equals(this.getNationality(), student.getNationality()) &
                Objects.equals(university, student.university) &
                Objects.equals(group, student.group);
    }

    @Override
    public int hashCode() {

        return Objects.hash(university, group);
    }

    @Override
    public String toString() {
        return super.getSecondName() + " " + super.getFirstName();
    }
}
