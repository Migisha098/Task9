package pl.vistula.tasks;

public class Main {

    public static  void main(String[] args) {
        try {
            TestException exceptiontest = new TestException();
            exceptiontest.genExceptionFabrine();
        }
        catch (NullPointerException ex) {
            ex.printStackTrace();
            System.out.println(ex);
            ex.getMessage();


        }
    }
}
class TestException{
    public void genExceptionFabrine(){
        String MigishaFabrine = null;
        System.out.println(" Migisha Fabrinenull");
    }

public double arithmeticException(int a,int b){
    return a*b;
}
public void indexOutArray(){
    int nums[] = new int []{0,5,7,9,10,11,12,13,14,15};
    for(int i = 0 ;i <=nums.length; i++){
        System.out.println(" The array is " + nums[i]);
    }
    }
}

class CheckException {
    public static void main(String[] args) {
        try{
            TestException ts = new TestException();
            System.out.println(ts.arithmeticException(25,25));
            ts.indexOutArray();
        }
        catch (ArithmeticException e ){
            System.out.println(" This is an arithmetic exception ");
            System.out.println(e.getMessage ());

        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is a bound of array ");
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Successfully");
        }
    }
}