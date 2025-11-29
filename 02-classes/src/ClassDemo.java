public class ClassDemo {
    public static void main(String[] args){
        System.out.println("Створення обєктів");
        
        Student student1 = new Student();
        student1.nikname = "wrong name";
        student1.setName("Illya");
        student1.setAge(17);

        Student student2 = new Student();
        student2.nikname = "name";
        student2.setName("Illa");
        student2.setAge(107);

        student1.introduse();
        student2.introduse();

        String strNumber = "234";
        int myNumber = Integer.parseInt(strNumber);
        System.out.println(myNumber);

        System.out.println("1. Вік: " + student1.getAge());
        System.out.println("2. Вік: " + student2.getAge());

        int sc = Student.getStudentCount();
        System.out.println("Кількість:" + sc);
    }
}

class Student{
    // полля зміних
    private String name;
    private int age;

    private static int studentCount = 0;

    public String nikname; 

    public Student(){
        studentCount ++;
    }

    // конструктор з параметрами

    public Student(String name, int age){
        this.name = name;
        this.age = age;
        studentCount ++;
    }
    // set для зміного приватного поля
    public void setName(String name){
        if (name != null && !name.isEmpty()){
            this.name = name;
        }else{
            System.out.println("Помилка, недопустиме ім'я");
        }
    }
    public String getNme(){
        return name;
    }

    public void setAge(int age){
        if(age > 0 && age < 150)
            this.age = age;
    }

    public int getAge(){
        return age;
    }
    // Звичайний метод
    public void introduse(){
        System.out.println("Привіт! Я " + name + " мені " + age);
    }
    public static int getStudentCount(){
        return studentCount;
    }
}