
public class Calculator
{
    private int upperLimit;
    private int lowerLimit;
    public Calculator (int minValue, int maxValue ){
        upperLimit = maxValue;
        lowerLimit = minValue;
    }
    public boolean ValidateArgs(int arg1, int arg2){
       if (arg1 > upperLimit){
         throw new RuntimeException("First argument exceeds upper limit");
        }
       if (arg2 < lowerLimit){
         throw new RuntimeException("Second argument exceeds lower limit");
        }
       if (arg1 < lowerLimit){
         throw new RuntimeException("First argument exceeds lower limit");
        }
       if (arg2 > upperLimit){
         throw new RuntimeException("Second argument exceeds upper limit");
        }
       return true;
    }
    public int add(int arg1, int arg2) {
        ValidateArgs(arg1, arg2);
        int result = arg1 + arg2;
        if (result > upperLimit){
            throw new RuntimeException("Upper limit exceeded");
        }
        return result;
    }
    public int substract(int arg1, int arg2) {
        ValidateArgs(arg1, arg2);
        int result = arg1 - arg2;
        if (result < lowerLimit){
            throw new RuntimeException("Lower limit exceeded");
        }
        return result;
    }
    public int getUpperLimit () {
         return upperLimit;
    }
    public void setUpperLimit ( int value){
          upperLimit = value;
    }
    public int getLowerLimit () {
          return lowerLimit;
    }
    public void setLowerLimit (int value){
          lowerLimit = value;
    }
}