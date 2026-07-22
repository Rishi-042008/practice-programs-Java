package com.company.Constructors;

public class Student_details_using_constructors {
    static class Student{
        private String name;
        private int marks;
        public Student(String student_name,int score){
            name=student_name;
            if(score>=0 && score<=100){
                marks=score;
            }
            else
                System.out.println("Invalid marks,setting to zero");
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setMarks(int marks) {
            if(marks>=0 && marks<=100)
                this.marks = marks;
            else
                System.out.println("Invalid marks,setting to zero");
        }

        public int getMarks() {
            return marks;
        }
        public char getGrade(){
            char grade;
            if(marks>=90)
                grade='A';
            else if (marks>=75)
                grade='B';

            else
                grade='C';

            return grade;
        }

    }
    public static void main(String[] args){
        Student raj=new Student("Jaswanth",-86);
        System.out.println("Name = "+raj.getName());
        System.out.println("Grade = "+raj.getGrade());
    }
}