package com.company.Constructors;

public class Area_of_rectangle_using_getters_setters {
    public static class rectangle {
        private int length;
        private int breadth;
        public rectangle(int givenlength,int givenbreadth){
          this.breadth= givenbreadth;
           this.length=givenlength;
        }
        public void setBreadth(int b){
          if(b>0)
              this.breadth=b;
          else
              System.out.println("Invalid value!");;
        }
        public void setLength(int l){
            if(l>0)
                this.length=l;
            else
                System.out.println("Invalid value!");
        }
        public int getBreadth(){
            return this.breadth;
        }
        public int getLength(){
            return this.length;
        }
        public int getArea(){
            return this.length*this.breadth;

        }
        public int getPerimeter(){
            return 2*(this.length+this.breadth);
        }
    }

    public static void main(String[] args){
        rectangle a = new rectangle(4,8);
        System.out.println("Area of Rectangle = "+a.getArea());
        System.out.println("Perimeter of Rectangle = "+a.getPerimeter());
    }
}

