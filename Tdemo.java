class MultiplicationTable implements Runnable {
    public void run(){
        System.out.println("Multiplication Table :");
        for(int i=1;i<=10;i++) {
            System.out.println("5 * " + i +"="+(5*i));
        }
        try{
            Thread.sleep(600);
        }
        catch (InterruptedException e){
            e.printStackTrace();  

        }
        }
    }
class Factor implements Runnable{
    public void run(){
        int num=36;
        System.out.println("factor "+ num +" :");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                System.out.println("Factor :" + i);
            }
            try{
                Thread.sleep(300);

            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
           
        }
    }

}

public class Tdemo{
    public static void main(String[] args){
        MultiplicationTable mt=new MultiplicationTable();
        Factor f=new Factor();
        Thread t1=new Thread(mt);
        Thread t2=new Thread(f);
        t1.start();
        t2.start();
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
         System.out.println("thread Finished");
    }
   
}