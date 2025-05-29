import java.util.*;

class Products{
    String name;
    public Products(String name){
        this.name=name;
        
    }
    public void display(){
        System.out.println("Name:"+name);
    }
}
class Sales extends Products implements Runnable{
    int quantity;
    int price;
    public Sales(String name,int quantity,int price){
        super(name);
        this.quantity=quantity;
        this.price=price;
    }
    public void run(){
     
        super.display();
        System.out.println("quantity:"+quantity+" price :"+ price );
    
      try{
          Thread.sleep(300);
      }
      catch(InterruptedException e){
          e.printStackTrace();
      }
}
}
class Multi implements Runnable{
    public void run(){
        System.out.println("multipication table of 5");
        for(int i=0;i<=10;i++){
            System.out.println("5 * "+i+" = "+(5*i));
        }
        try{
            Thread.sleep(500);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of products");
        int n=sc.nextInt();
        sc.nextLine();
        Sales[] s=new Sales[n];
        for(int i=0;i<n;i++){
            System.out.println("name:");
            String name=sc.nextLine();
            System.out.println("quantity:");
            int quantity=sc.nextInt();
             sc.nextLine();
            System.out.println("price:");
            int price=sc.nextInt();
             sc.nextLine();
             s[i]=new Sales(name,quantity,price);
        }
        Multi mul=new Multi();
        Thread t1=new Thread(mul);
        t1.start();
        for(int i=0;i<n;i++){
        Thread t2=new Thread(s[i]);
         t2.start();
        
       
        
        try{
            t1.join();
            t2.join();
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }}
           
        
    }
    
}