package com.company.getters_and_setters;

    public class Area_of_rectangle_using_getters_setters {
        static class rect{
            private int length;
            private int breadth;
            public rect(int reallength,int realbreadth){
                if(reallength>0) {
                    this.length = reallength;
                }
                else {
                    System.out.println("Invalid length so default 1 is taken ");
                    length = 1;
                }
                if(realbreadth>0) {
                    this.breadth = realbreadth;
                }
                else {
                    System.out.println("Invalid breadth so default 1 is taken ");
                    breadth = 1;
                }
            }
            public void setLength(int l){
                if(l>0){
                    length=l;
                }
                else {
                    length=1;
                }
            }
            public void setBreadth(int b){
                if(b>0){
                    breadth=b;
                }
                else {
                    breadth=1;
                }
            }
            public int getLength(){
                return length;
            }
            public int getBreadth(){
                return breadth;
            }
            public int getArea(){
                return length*breadth;
            }
        }

        public static void main(String[] args){
        rect rectangle = new rect(7,8);
            System.out.println("The area of the rectangle is: "+rectangle.getArea());
        }

}