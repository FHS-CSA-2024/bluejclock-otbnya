package src.main.java;


public class ClockDisplay
{
    //Implement 2 private NumberDisplay objects. 
    private NumberDisplay hours;
    //  One for hours and one for minutes
    private NumberDisplay minutes;
    //Implement a private String for the display
    private String display;

    //Implement a constructor that takes no parameters
    public ClockDisplay(){
        //The constructor should set hours as a NumberDisplay object with 24 as the limit.
        hours  = new NumberDisplay(24);
        //The constructor should set minutes as a NumberDisplay object with 60 as the limit
        minutes = new NumberDisplay(60);
        updateDisplay(); //The constructor should call the method updateDisplay before finishing
    }
    
    //Implement a constructor that takes 2 parameters, hour and minute
    public ClockDisplay(int hour, int minute){
        //The constructor should set hours as a NumberDisplay object with 24 as the limit
         hours = new NumberDisplay(24);
         //The constructor should set minutes as a NumberDisplay object with 60 as the limit
         minutes = new NumberDisplay(60);
         setTime(hour, minute); //The constructor should call the method setTime with the parameters passed in
    }
    
    //Implement a method timeTick that takes no parameters and returns nothing
    public void timeTick(){
        //The method should increase the minute value by one each run
        minutes.increment();
        //The hours should increase when the minutes roll over: checking if value rolled over to 0
        if(minutes.getValue() == 0){
            hours.increment();
        }
        //The updateDisplay method should be called before finishing
        updateDisplay();
    }
    
    //Implement a method setTime that takes in 2 parameters, hour and minute
    
    
    public void setTime(int hour, int minute){
        //The method should set the hours value and minutes value
        hours.setValue(hour);
        minutes.setValue(minute);
        updateDisplay(); //The updateDisplay method should be called before finishing
    }
    
    //Implement a method getTime that takes no parameter and returns a String
    
    public String getTime(){
        return display; //The return String should be formatted as HH:MM and report out the current time
    }

    //Implement a method updateDisplay that takes no parameters and returns nothing
    public void updateDisplay(){
        //The method should update the displayString with the current time in a format
        String newDisplay = "";
        //  HH:MM
        newDisplay+=hours.getDisplayValue();
        newDisplay+=":";
        newDisplay+=minutes.getDisplayValue();
        
        display = newDisplay;
    }
}






