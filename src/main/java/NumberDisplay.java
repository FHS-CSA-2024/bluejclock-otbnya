package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay

        
        System.out.println("Testing Clock Display:");
        ClockDisplay test1 = new ClockDisplay();
        String test1Output = test1.getTime();
        System.out.println("\tEmpty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(2, 45);
        String test2Output = test2.getTime();
        System.out.println("\t2 Arg Con. Test - " + test2Output);
        
        test2.setTime(5, 15);
        String test3Output = test2.getTime();
        System.out.println("\t Set Time Test - " + test3Output);
        
        //TODO; Read time and Tick Time test - done
        System.out.println("Clock Display:");
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        String tickTestOutput = tickTest1.getTime();
        System.out.println("\tTickTest1 Before increment - " + tickTestOutput);
        tickTest1.timeTick();
        tickTestOutput = tickTest1.getTime();
        System.out.println("\tTickTest1 After increment -" + tickTestOutput);
        
        //Implement tests for your ClockDisplaySeconds
        
        System.out.println("Clock Display Seconds:");
        ClockDisplaySeconds tickTest1Seconds = new ClockDisplaySeconds(3, 32, 59); //  * Tick test for 03:32:59 to 03:33:00
        String tickTestOutputSeconds = tickTest1Seconds.getTime();
        System.out.println("\tTickTest1 Before increment - " + tickTestOutputSeconds);
        tickTest1Seconds.timeTick();
        tickTestOutputSeconds = tickTest1Seconds.getTime();
        System.out.println("\tTickTest1 After increment -" + tickTestOutputSeconds);
        
        ClockDisplaySeconds tickTest2Seconds = new ClockDisplaySeconds(1,0,59); //  * Tick test for 01:00:59 to 01:01:00
        String tickTestOutputSeconds2 = tickTest2Seconds.getTime();
        System.out.println("\tTickTest2 Before increment - " + tickTestOutputSeconds2);
        tickTest2Seconds.timeTick();
        tickTestOutputSeconds2 = tickTest2Seconds.getTime();
        System.out.println("\tTickTest2 After increment -" + tickTestOutputSeconds2);
        
        ClockDisplaySeconds tickTest4Seconds = new ClockDisplaySeconds(23,59,59); //  * Tick test for 23:59:59 to 00:00:00
        String tickTestOutputSeconds4 = tickTest4Seconds.getTime();
        System.out.println("\tTickTest4 Before increment - " + tickTestOutputSeconds4);
        tickTest4Seconds.timeTick();
        tickTestOutputSeconds4 = tickTest4Seconds.getTime();
        System.out.println("\tTickTest4 After increment -" + tickTestOutputSeconds4);
        
        ClockDisplaySeconds tickTest3Seconds = new ClockDisplaySeconds(1,59,59); //  * Tick test for 01:59:59 to 02:00:00
        String tickTestOutputSeconds3 = tickTest3Seconds.getTime();
        System.out.println("\tTickTest3 Before increment - " + tickTestOutputSeconds3);
        tickTest3Seconds.timeTick();
        tickTestOutputSeconds3 = tickTest3Seconds.getTime();
        System.out.println("\tTickTest3 After increment -" + tickTestOutputSeconds3);
        
        
        
    }
}

