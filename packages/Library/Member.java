package Library.members;


public class Member {
    String name ;
    int ID;

    public Member(String name , int ID) {
        this.name = name;
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public void Displaymember(){
        System.out.println("Name = "+name);
        System.out.println("ID = "+ID);
    }
    
}
