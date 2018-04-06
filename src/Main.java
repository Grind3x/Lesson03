public class Main {
    public static void main(String[] args) {
        Group group = new Group();
        Student stOne = new Student("Иванов", "Иван", 18, true, "Ukrainian", "KPI");
        Student stTwo = new Student("Петров", "Василий", 17, true, "ukrainian", "KPI");
        Student stThree = new Student("Сидорова","Катерина", 18, false, "ukrainian", "KPI");
        Student stFour = new Student("Заснежный","Игор", 18, true, "ukrainian", "KPI");
        Student stFive = new Student("Каптур","Федор", 19, true, "ukrainian", "KPI");
        Student stSix = new Student("Мухов","Николай", 17, true, "ukrainian", "KPI");
        Student stSeven = new Student("Золотая", "Виктория", 17, false, "ukrainian", "KPI");
        Student stEight = new Student("Каменских", "Анастасия", 18, false, "ukrainian", "KPI");
        Student stNine = new Student("Жуков","Петр", 17, true, "ukrainian", "KPI");
        Student stTen = new Student("Ларин", "Владислав", 18, true, "ukrainian", "KPI");
        Student stEleven = new Student("Галкин","Сергей", 17, true, "ukrainian", "KPI");


        group.addStudent(stOne);
        group.addStudent(stOne);
        group.addStudent(stOne);
        group.addStudent(stOne);
        group.addStudent(stTwo);
        group.addStudent(stThree);
        group.addStudent(stFour);
        group.addStudent(stFive);
        group.addStudent(stSix);
        group.addStudent(stSeven);
        group.addStudent(stEight);
        group.addStudent(stNine);
        group.addStudent(stTen);

        System.out.println(group);
        group.delStudent(stTwo);
        group.delStudent(stFive);


        System.out.println();
        System.out.println(group);

        System.out.println();
        System.out.println(group.findStudentbySecondName("Сидорова"));
    }
}
