public class Human {
    private String firstName;
    private String secondName;
    private int age;
    private boolean sex;
    private String nationality;

    public Human() {
    }

    public Human(String secondName, String firstName, int age, boolean sex, String nationality) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.age = age;
        this.sex = sex;
        this.nationality = nationality;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    @Override
    public String toString() {
        return "Human{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
