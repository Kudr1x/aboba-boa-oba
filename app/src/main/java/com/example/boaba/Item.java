package com.example.boaba;

public class Item {
    public String fio;
    public String age;
    public int[] marks;
    public float avg;

    public Item(String fio, String age, int[] marks) {
        this.fio = fio;
        this.age = age;
        this.marks = marks;
    }

    public String getMarks(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < marks.length; i++){
            s.append(marks[i]);
            if(i == marks.length - 1)
                s.append("");
            else
                s.append(", ");
        }
        return s.toString();
    }

    public String getAvg(){
        for (int mark : marks) {
            avg += mark;
        }

        return ("Средний балл: " + (avg / marks.length));
    }

    public String getAge(){
        return age + " лет";
    }
}
