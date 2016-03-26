import java.io.Serializable;

public class Problem6CustomObject implements Serializable {
    private double firstVar;
    private int secondVar;

    public Problem6CustomObject(Double aFirstVar, int aSecondVar) {
        firstVar = aFirstVar;
        secondVar = aSecondVar;
    }

    public double GetFirstVar(){
        return firstVar;
    }

    public  int GetSecondVar(){
        return secondVar;
    }


}
