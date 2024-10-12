package corejava.oct.oct122024;

public class Encapsulation {
    private int age;
    private String name;
    private int pincode;
    private String homeAddress;

//    Define getter methods to retrieve the values of the private fields.
//    Define setter methods to set the values of the private fields.
    // Getter for age

    public int getPincode(){
        return pincode;
    }

    public void setPincode(int pincode){
        this.pincode = pincode;
    }

    public String getHomeAddress(){
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress){
        this.homeAddress = homeAddress;
    }
    public int getAge() {
        return age;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();
        obj.setAge(25);
        obj.setName("John Doe");
        obj.setHomeAddress("123, ABC Street");
        obj.setPincode(123456);


        System.out.println("Age: " + obj.getAge());
        System.out.println("Name: " + obj.getName());
        System.out.println("Home Address: " + obj.getHomeAddress());
        System.out.println("Pincode: " + obj.getPincode());
    }



}
