import java.util.ArrayList;
import java.util.List;

public class StudentUtil {
    public static List<Student> addStudents()
    {
        List<Student> students=new ArrayList<>();

        Student student1=new Student(111, "Jiya Brein", 17, "Female", "Computer Science", 2018, 70.8);
        students.add(student1);

        Student student2=new Student(122, "Paul Niksui", 18, "Male", "Mechanical", 2016, 50.2);
        students.add(student2);

        Student student3=new Student(133, "Martin Theron", 17, "Male", "Electronic", 2017, 90.3);
        students.add(student3);

        Student student4=new Student(144, "Murali Gowda", 18, "Male", "Electrical", 2018, 80);
        students.add(student4);

        Student student5=new Student(155, "Nima Roy", 19, "Female", "Textile", 2016, 70);
        students.add(student5);

        Student student6=new Student(166, "Iqbal Hussain", 18, "Male", "Security", 2016, 70);
        students.add(student6);

        Student student7=new Student(177, "Manu Sharma", 16, "Male", "Chemical", 2018, 70);
        students.add(student7);

        Student student8=new Student(188, "Wang Liu", 20, "Male", "Computer Science", 2015, 80);
        students.add(student8);

        Student student9=new Student(199, "Amelia Zoe", 18, "Female", "Computer Science", 2016, 85);
        students.add(student9);

        Student student10=new Student(200, "Jaden Dough", 18, "Male", "Security", 2015, 82);
        students.add(student10);

        Student student11=new Student(211, "Jasna Kaur", 20, "Female", "Electronic", 2019, 83);
        students.add(student11);

        Student student12=new Student(222, "Nitin Joshi", 19, "Male", "Textile", 2016, 60.4);
        students.add(student12);

        Student student13= new Student(233, "Jyothi Reddy", 16, "Female", "Computer Science", 2015, 45.6);
        students.add(student13);

        Student student14=new Student(244, "Nicolus Den", 16, "Male", "Electronic", 2017, 95.8);
        students.add(student14);

        Student student15=new Student(255, "Ali Baig", 17, "Male", "Electronic", 2018, 88.4);
        students.add(student15);

        Student student16=new Student(266, "Sanvi Pandey", 17, "Female", "Electric", 2019, 72.4);
        students.add(student16);

        Student student17=new Student(277, "Anuj Chettiar", 18, "Male", "Computer Science", 2017, 57.5);
        students.add(student17);

        return students;
    }
}
