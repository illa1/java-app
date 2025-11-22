public class Dog {
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }

    void run(){
        System.out.println("Біжить");
    }
    void bark(){
        System.out.println("Гавкає");
    }
}

public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog("name1", 3);
        Dog dog2 = new Dog("name2", 4);

        // TODO: завершити код
    }
}