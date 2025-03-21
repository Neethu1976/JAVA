class MutliplicationTable implements Runnable{
    public void run(){
        System.out.println("Multiplication ");
        for(int i=1;i<=10;i++){
            System.out.println("5 x "+i+"="+(5*i));
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                e.printStackTrace();

            }
        }
    }
}

class Factorial implements Runnable{
    public void run(){
        System.out.println("Factorial of 36 :");

        for(int i=1;i<=36;i++){
            if(36%i == 0){
                System.out.println("\t\t"+i);
            }
            try{
                Thread.sleep(100);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
       


    }
}



public class factmulti{
    public static void main(String [] args) {
        MutliplicationTable m = new MutliplicationTable();
        Factorial  f = new Factorial ();



        Thread t1= new Thread(m);
        Thread t2=new Thread (f);

        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();

        }

        catch(Exception e){
            e.printStackTrace();

        }
        System.out.println("Both threads are finished");
    }
}