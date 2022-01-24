import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Enter number of TestCases");
        int T= scan.nextInt();

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date signupDate;
        Date currentDate;

        while(T!=0)
        {
            try {
                // System.out.println("Enter signup date and current date");
                signupDate = dateFormat.parse(scan.next());
                currentDate=dateFormat.parse(scan.next());
                findKYCSubmissionWindow(signupDate,currentDate);
            }
            catch(ParseException e)
            {
                System.out.println("Parse Exception");
            }
            T--;
        }
    }
    public static void findKYCSubmissionWindow(Date signupDate,Date currentDate)
    {
        Calendar calendar= Calendar.getInstance();
        Calendar calendar1=Calendar.getInstance();

        calendar.setTime(signupDate);
        int signupYear=calendar.getWeekYear();

        calendar1.setTime(currentDate);
        int currentYear=calendar1.getWeekYear();

        if(signupYear>=currentYear)
        {
            //System.out.println(signupYear+" "+currentYear);
            System.out.println("No range");
        }
        else{
            calendar.set(calendar.YEAR,calendar1.get(Calendar.YEAR));

            calendar.add(calendar.DATE,-30 );
            Date startDate=calendar.getTime();

            calendar.add(calendar.DATE,+60);
            Date endDate=calendar.getTime();
            //System.out.println(currentDate+" "+endDate);

            if(endDate.after(currentDate))
                endDate=currentDate;

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            System.out.println(dateFormat.format(startDate)+" "+dateFormat.format(endDate));
        }


    }
}
