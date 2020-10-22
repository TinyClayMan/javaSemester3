import java.util.Random;

public class Student {
    private static int totalID = 0;
    private String surname;
    private String forename;
    private int idNumber;
    private int gpa;

    public Student(String surname, String forename){
        this.surname = surname;
        this.forename = forename;
        this.idNumber = ++totalID;
        Random generator = new Random();
        this.gpa = 1 + generator.nextInt(5);
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public int getGPA() {
        return gpa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Surname='" + surname + '\'' +
                ", Forename='" + forename + '\'' +
                ", ID=" + idNumber +
                ", GPA=" + gpa +
                '}';
    }
}
