package corejava.oct.oct142024;

interface animal{
    void sound();
    void sleep();
}

class Cat implements animal{


    @Override
    public void sound() {
        System.out.println("Barking");
    }

    @Override
    public void sleep() {
        System.out.println("Sleeping");
    }
}
