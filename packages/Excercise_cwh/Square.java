package Excercise_cwh.Squares;

public class Square {
    public int side;
    public Square(int side){
        this.side=side;
    }
    public int getside(){
        return side;
    }
    public int Area(){
        return side*side;
    }
    public int perimeter(){
        return (4*side);
    }
}
