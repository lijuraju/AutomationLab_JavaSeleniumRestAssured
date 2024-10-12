package corejava.oct.oct112024;

public class BaseTests {

    private String name;
    private int id;

    public String getName() {
        System.out.println("Name is: "+name);
        return  name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getId(){
        System.out.println("Id is: "+id);
        return id;
    }

    public void setId(int id){
        if(id>0) {
            this.id = id;
        }
        else
            System.out.println("Id should be greater than 0");
    }



public void performGET(){

 }
public void performPOST(){

}
public void performPATCH(){

}

public void performPUT(){

}

public void performDELETE(){

}
}
