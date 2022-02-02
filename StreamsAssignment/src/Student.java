public class Student {
    private int id=0;
    private String name=null;
    private int age=0;
    private String gender=null;
    private String engDepartment=null;
    private int yearOfEnrollment=0;
    private double perTillDate=0;

    public Student(int id,String name,int age,String gender,String engDepartment,int yearOfEnrollment,double perTillDate){
        this.id=id;
        this.name=name;
        this.age=age;
        this.gender=gender;
        this.engDepartment=engDepartment;
        this.yearOfEnrollment=yearOfEnrollment;
        this.perTillDate=perTillDate;
    }

    public String getEngDepartment(){
        return engDepartment;
    }

    public int getYearOfEnrollment(){
        return yearOfEnrollment;
    }

    public String getName(){
        return name;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }
    public double getPerTillDate(){
        return perTillDate;
    }
    public String toString() {
        return "Student [id="+id+" ,name="+name+" ,age="+age+" ,gender="+gender+" " +
                " ,department="+engDepartment+" ,year_of_enrollment="+yearOfEnrollment+" ,perTillDate="+perTillDate+" ]";
    }



}
