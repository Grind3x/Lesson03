public class Group {
    private Student[] studentArr = new Student[10];
    private int stIndex = -1;

    public Group() {
    }

    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException();
        }
        if (!isStudentInGroup(student)) {
            try {
                if (stIndex == 9) {
                    throw new OutOfStudentIndexException();
                }
                studentArr[++stIndex] = student;
                student.setGroup(this);
            } catch (OutOfStudentIndexException e) {
                e.printStackTrace();
            }
        }
    }

    public void delStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException();
        }
        if (stIndex >= 0) {
            for (int i = 0; i < studentArr.length; i++) {
                if (student.equals(studentArr[i])) {
                    student.setGroup(null);
                    int k = i;
                    while (k < studentArr.length - 1) {
                        studentArr[k] = studentArr[k+1];
                        studentArr[k+1] = null;
                        k++;
                    }
                    break;
                }
            }
        }
    }

    public Student findStudentbySecondName(String secondName) {
        Student tmp = null;
        for (Student st : studentArr) {
            if (st != null) {
                if (secondName.equals(st.getSecondName())) {
                    tmp = st;
                    break;
                }
            }
        }
        return tmp;
    }

    public boolean isStudentInGroup(Student student) {
        if (student == null) {
            throw new IllegalArgumentException();
        }
        boolean retVal = false;
        for (Student st : studentArr) {
            if (student.equals(st)) {
                retVal = true;
                break;
            }
        }
        return retVal;
    }

    public void sortGroup() {
        for (int i = studentArr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studentArr[i] != null) {
                    if (studentArr[j].getSecondName().compareTo(studentArr[j+1].getSecondName()) > 0) {
                        Student tmp = studentArr[j];
                        studentArr[j] = studentArr[j + 1];
                        studentArr[j + 1] = tmp;
                    }
                }
            }
        }
    }

    public Student[] getStudentArr() {
        return studentArr;
    }

    @Override
    public String toString() {
        sortGroup();
        String retVal = "Список студентов:" + '\n';
        for (Student st : studentArr) {
            retVal += (st + "\n");
        }
        return retVal;
    }
}
