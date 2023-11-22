package com.iris.Collections;

public class Worker {
    int wId;
    String workerName;
    double salary;

    //constructor
    Worker(int id,String name, double amt){
        wId=id;
        workerName=name;
        salary=amt;
    }

    //toString() method--> in built method that returns the given value in string format
    // This method is used to represent any  object as a String.
    //If you print any object java compiler internally invokes the toString() method.
    public String toString(){
        return "Id: "+wId+"\nWorker Name: "+workerName+"\nSalary: "+salary;
    }

    public static void main(String args[]){
        Worker w=new Worker(1020,"vishnu",300000.50);
        System.out.println(w); //internally toString() is called
    }

}
