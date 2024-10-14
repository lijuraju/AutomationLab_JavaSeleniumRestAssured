package corejava.oct.oct142024.task142024;



public class PrintMyBook  extends Book {
    String name;
    String author;
    int price;

    PrintMyBook(String name,String author,int price){
        this.name = name;
        this.author = author;
        this.price = price;
    }

    @Override
    void getDetails() {
        System.out.println(name+" "+author+" "+price);

    }
}
