public class StudentInfo {

    private String fullName;
    private String group;
    private String specialty;

    public StudentInfo(String fullName, String group, String specialty) {
        this.fullName = fullName;
        this.group = group;
        this.specialty = specialty;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName);
        System.out.println("Группа: " + group);
        System.out.println("Специальность: " + specialty);
    }
}
