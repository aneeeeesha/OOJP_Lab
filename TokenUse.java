class Q{
    int n;
    boolean setValue=false;
    synchronized int get(){
        while(!setValue)
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println("Exception Occured");
            }
        System.out.println("Token Received:"+n);
        setValue=false;
        notify();
        return n;
    }
    synchronized void put(int n){
        while(setValue){
            try{
                wait();
            }
            catch(InterruptedException ie){
                System.out.println("Exception Occured");
            }
        }
        this.n=n;
        setValue=true;
        System.out.println("Token Generated :"+n);
        notify();
    }
}

class Receptionist implements Runnable{
    Q q;
    Thread t;
    Receptionist(Q q){
        this.q=q;
        t=new Thread(this,"Receptionist Thread");
        t.start();
    }
    @Override
    public void run(){
        int i=0;
        while(i<=10){
            q.put(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println("ex");
            }
        }
    }
}

class Client implements Runnable{
    Q q;
    Thread t;
    Client(Q q){
        this.q=q;
        t=new Thread(this,"Client Thread");
        t.start();
    }
    @Override
    public void run(){
        int i=0;
        while(i<=10){
            i++;
            q.get();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.err.println(ex);
            }
        }
    }
    
}

public class TokenUse {
    public static void main(String args[]){
        Q q=new Q();
        Receptionist p = new Receptionist(q);
        Client c = new Client(q); 
    }
}
