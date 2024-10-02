package src.main.java;


public class ClockDisplaySeconds
{
    //Extend ClockDisplaySeconds to include a seconds field.
    //Update all methods and parameters to accomodate this change
    //Implement 2 private NumberDisplay objects. 
    //  One for hours and one for minutes and seconds
    private NumberDisplay hours;
    private NumberDisplay minutes;
    private NumberDisplay seconds;
    //Implement a private String for the display
    private String display;

    //Implement a constructor that takes no parameters
    public ClockDisplaySeconds(){
        //The constructor should set hours as a NumberDisplay object with 24 as the limit
        hours  = new NumberDisplay(24);
        //The constructor should set minutes as a NumberDisplay object with 60 as the limit
        minutes = new NumberDisplay(60);
        seconds = new NumberDisplay(60);
        updateDisplay(); //The constructor should call the method updateDisplay before finishing
    }
    
    //Implement a constructor that takes 2 parameters, hour and minute
    public ClockDisplaySeconds(int hour, int minute, int second){
        //The constructor should set hours as a NumberDisplay object with 24 as the limit
         hours = new NumberDisplay(24);
        //The constructor should set minutes as a NumberDisplay object with 60 as the limit
         minutes = new NumberDisplay(60);
         seconds = new NumberDisplay(60);
        //The constructor should call the method setTime with the parameters passed in
         setTime(hour, minute, second);
    }
    
    //Implement a method timeTick that takes no parameters and returns nothing
    public void timeTick(){
        seconds.increment();
        //The method should increase the minute value by one each run
        //The hours should increase when the minutes roll over
        if(seconds.getValue() == 0){
            minutes.increment();
            if(minutes.getValue() == 0){
                hours.increment();
            }
        }
        updateDisplay(); //The updateDisplay method should be called before finishing
    }
    
    //Implement a method setTime that takes in 2 parameters, hour and minute
    public void setTime(int minute, int hour, int second){
        //The method should set the hours value and minutes value
        minutes.setValue(minute);
        hours.setValue(hour);
        seconds.setValue(second);
        updateDisplay(); //The updateDisplay method should be called before finishing
    }
    
    //Implement a method getTime that takes no parameter and returns a String
    //The return String should be formatted as HH:MM and report out the current time
    public String getTime(){
        return display;
    }

    //Implement a method updateDisplay that takes no parameters and returns nothing
    public void updateDisplay(){
        //The method should update the displayString with the current time in a format
    //  HH:MM
        String newDisplay = "";
        newDisplay+=hours.getDisplayValue();
        newDisplay+=":";
        newDisplay+=minutes.getDisplayValue();
        newDisplay+=":";
        newDisplay+=seconds.getDisplayValue();
        
        display = newDisplay;
    }
}




