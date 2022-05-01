package pl.vistula.tasks;

public class Task4 {

        public String exceptionMethod(String f, String m){
            String mf   =  m.toUpperCase() + f.toLowerCase();
            return mf;
        }



    public static void main(String[] args) {
        try{
            Task4 tf = new Task4();
            System.out.println( tf.exceptionMethod("Fabrine","Migisha"));
            throw new NewException1("Error");

        }
        catch(NewException1 ex ){
            ex.getMessage();
        }


    }
}


