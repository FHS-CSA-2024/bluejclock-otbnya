package src.main.java;



public class NumberDisplay
{
    //implement 2 private variables, limit and value.
    //  both should be ints
    private int value;    
    private int limit;
        
    
    //implement a constructor that sets the limit to a passed in variable rollOverLimit
    public NumberDisplay(int rollOverLimit){
        limit = rollOverLimit;
        //  should set value to 0
        value = 0;
    }
    
    //Implement getter/setter methods for limit and value
    public int getLimit(){
        return limit;
    }
    
     public int getValue(){
        return value;
    }
    public void setLimit(int newLimit){
        limit = newLimit;
    }
    //  The setValue method should check the input for validity
    //      (should not be less than 0, or over the limit)
    public void setValue(int newValue){
        if(newValue >= 0 && newValue < limit){
            value = newValue;
        }
    }
    //Implement a function getDisplayValue that take no parameters and returns a String.
    //  The return string should be formatted as a two digit number
    //  If the number is less than 10 it should return a 0 before the number.
    public String getDisplayValue(){
        String output = "";
        output = Integer.toString(value);
        
        if(output.length() == 1){
            output = "0" + output;
        }
        
        return output;
    }

    //Implement a method increment that takes no parameters and returns nothing. 
    
    
    public void increment(){
        value++;
        //  This function should increase value by 1, unless it reaches the limit.
        
        if(value >= limit){
            value = 0; //  It should reset to 0 if the limit is reached
        }
    }
}
