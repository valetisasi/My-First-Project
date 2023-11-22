package com.iris.Collections;
class Train{
    int trainNo;
    String trainName;
    char grade;

    //constructor
    public Train(int no, String name, char trainGrade) {
        trainNo=no;
        trainName=name;
        grade=trainGrade;
    }
    //No-args constructor
    public Train(){

    }

    public String toString(){
        return "No: "+trainNo+"\tName: "+trainName+"\tGrade: "+grade;
    }
}

public class ArrysOfObject {
    public static void main(String args[]) {

        Train train = new Train(); //single object

        Train[] trainslist = new Train[20]; //empty array of student objects

        trainslist[0] = new Train(2345, "howra", 'G');
        trainslist[1] = new Train(45678, "VandeBharath", 'A');

        for (int j = 0; j  < trainslist.length; j++) {
            System.out.println(trainslist[j]);
        }

    }
}



