public class App {
    public static void main(String[] args) throws Exception {
        User student1 = new User();

        student1.setName("Lucas");
        student1.setAge(18);
        student1.subject.setSubjectName("Math");
        student1.subject.setSubjectDifficult("Hard");

        String statusStudent = student1.getAgeAndName() + "; subject: " + student1.subject.getSubjectName()
                + "; difficult: " + student1.subject.getSubjectDifficult();

        System.out.println(statusStudent);
    }
}
