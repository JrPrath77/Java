package packages.general;

import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.Condition;

public class Queue{
    Lock lock = new ReentrantLock();
    Condition queueEmpty = lock.newCondition();
    private String [] data;
    private int f = -1;
    private int r = -1;
    private int arrSize;
    public Queue(int size){
        data = new String[size];
        arrSize = size;
    }
    public String dequeue(){
        lock.lock();
        String temp =  null;
        while(true){
            if(this.f!=-1){
                temp = data[this.f];
                if(this.f==this.r){
                    this.f = this.r = -1;
                }else{
                    this.f = (this.f+1)%arrSize;
                }
                break;
            }else{
                try{
                    queueEmpty.await();
                }catch(InterruptedException e){

                }
            }
        }
        lock.unlock();
        return temp;
    }
    public boolean enqueue(String request){
        lock.lock();
        if((this.r+1)%arrSize != this.f){
            if(this.r==-1) this.f++;
            this.r = (this.r+1)%arrSize;
            data[this.r] = request;
            queueEmpty.signal();
            lock.unlock();
            return true;
        }else{
                lock.unlock();
                return false;
            }
    }

}
