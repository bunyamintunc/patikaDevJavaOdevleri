public class Main {
    public static void main(String[] args) {

        Course mat=new Course("Matematik","MAT101","MAT");
        Course fizik =new Course("Fizik","FZK101","FZK");
        Course kimya=new Course("Kimya","KMY101","KMY");

        Teacher t1=new Teacher("Bunyamin Hoca","1928030","MAT");
        Teacher t2=new Teacher("Fatma Ayşe","1928929","FZK");
        Teacher t3=new Teacher("Emre Topal","1928028","KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1=new Student("Osman tunc",4,"12345678910",mat,fizik,kimya);
        s1.addSozluExample(100,100,100);
        s1.addBulExamleNote(100,20,40);

        s1.isPass();

    }
}
