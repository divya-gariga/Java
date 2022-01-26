import java.io.*;
import java.net.*;
import java.util.Scanner;
import java.util.Arrays;
public class Assignment3 {

        // Sends ping request to a provided IP address
        public static void sendPingRequest(String ipAddress,int count)
                throws UnknownHostException, IOException {
            long[] timeArray = new long[count];
            while (count > 0) {
                long startTime = System.nanoTime();
                InetAddress geek = InetAddress.getByName(ipAddress);
                System.out.println("Sending Ping Request to " + ipAddress);
                if (geek.isReachable(5000)) {
                    System.out.println("Host is reachable");
                    long endTime = System.nanoTime();
                    count--;
                    timeArray[count] = endTime - startTime;
                } else {
                    System.out.println("Sorry ! We can't reach to this host");
                    break;
                }
            }
            Arrays.sort(timeArray);
            if (timeArray.length % 2 == 0)
                System.out.println(timeArray[timeArray.length / 2]);
            else
                System.out.println(timeArray[(timeArray.length / 2) + 1]);
        }



        public static void main(String[] args) throws UnknownHostException, IOException
        {

            String ipAddress;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter ipAddress");
            ipAddress=sc.next();
            System.out.println("Enter count");
            int count=sc.nextInt();
            sendPingRequest(ipAddress,count);
        }
    }

