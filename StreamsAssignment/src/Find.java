import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;


public class Find {

    List<Student> students=StudentUtil.addStudents();

    public void query1(){
       students.stream()
               .map(Student::getEngDepartment)
               .distinct()
               .forEach(System.out::println);
    }

    public void query2(){
        students.stream()
                .filter(s->s.getYearOfEnrollment()>2018)
                .map(Student::getName)
                .forEach(System.out::println);
    }

    public void query3(){
       students.stream()
                .filter(s->s.getEngDepartment().equals("Computer Science"))
                .filter(s->s.getGender().equals("Male"))
               .forEach(System.out::println);
    }

    public long noOfFemales(){
        long noOfFemales = students.stream()
                .filter(s -> s.getGender().equals("Female")).count();
        System.out.println("Total female students = "+noOfFemales);
        return noOfFemales;
    }

    public long noOfMales(){
        long noOfMales = students.stream()
                .filter(s -> s.getGender().equals("Male")).count();
        System.out.println("Total male students = "+noOfMales);
        return noOfMales;
    }

    public void query5(){
        int sumOfFemaleAges=students.stream()
                .filter(s -> s.getGender().equals("Female"))
                .map(Student::getAge)
                .reduce(0,Integer::sum);

        long noOfFemales=noOfFemales();

        System.out.println("Avg age of females : "+sumOfFemaleAges/noOfFemales);

        int sumOfMaleAges=students.stream()
                .filter(s -> s.getGender().equals("Male"))
                .map(Student::getAge)
                .reduce(0,Integer::sum);
        long noOfMales = noOfMales();
        System.out.println("Avg age of males : "+sumOfMaleAges/noOfMales);
    }

    public void query6(){
         Optional<Student> max=students.stream()
                        .collect(Collectors.maxBy(Comparator.comparingDouble(Student::getPerTillDate)));
        System.out.println(max);
    }

    public void query7(){
        Map<String, Long> groupByDept=students.stream()
                .collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.counting()));
        System.out.println(groupByDept);
    }

    public void query8(){
    Map<String,Double> avgPercentOfDepartment=students.stream()
            .collect(Collectors.groupingBy(Student::getEngDepartment,Collectors.averagingDouble(Student::getPerTillDate)));
        System.out.println(avgPercentOfDepartment);
    }

    public void query9(){
        Optional<Student> youngestMaleInElectronic=students.stream()
                .filter(s->s.getEngDepartment().equals("Electronic"))
                .filter(s->s.getGender().equals("Male"))
                .collect(Collectors.minBy(Comparator.comparingInt(Student::getAge)));
        System.out.println(youngestMaleInElectronic);
    }

    public void query10(){
        Map<String,Long> maleAndFemalesInComputerSci=students.stream()
                .filter(s->s.getEngDepartment().equals("Computer Science"))
                .collect(Collectors.groupingBy(Student::getGender,Collectors.counting()));
        System.out.println(maleAndFemalesInComputerSci);
    }

    public static void main(String[] args) {

        System.out.println("Print the name of all departments in the college");
        new Find().query1();
        System.out.println();

        System.out.println("Get the names of all students who have enrolled after 2018?");
        new Find().query2();
        System.out.println();

        System.out.println("Get the details of all male student in the computer sci department?");
        new Find().query3();
        System.out.println();

        System.out.println(" How many male and female student are there ?");
        new Find().noOfFemales();
        new Find().noOfMales();
        System.out.println();

        System.out.println("What is the average age of male and female students?");
        new Find().query5();
        System.out.println();

        System.out.println("Get the details of highest student having highest percentage ?");
        new Find().query6();
        System.out.println();

        System.out.println("Count the number of students in each department? ");
        new Find().query7();
        System.out.println();

        System.out.println("What is the average percentage achieved in each department");
        new Find().query8();
        System.out.println();

        System.out.println("Get the details of youngest male student in the Electronic department?");
        new Find().query9();
        System.out.println();

        System.out.println("How many male and female students are there in the computer science department?");
        new Find().query10();
    }


}
