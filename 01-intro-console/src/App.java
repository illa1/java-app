public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Типи даних в Java:");
        // Примітивні типи даних
        int userAge = 20;
        double height = 175.5;
        boolean isActive = true;
        char grade = 'A';

        // Посилальні типи даних
        String name = "illya";

        System.out.println(userAge);
        System.out.println(name);

        userAge = (int) height;
        System.out.println(userAge);

        // умовні оператори
        if (isActive){
            System.out.println("Умова виконана");
        } else {
            System.out.println("Помилка");
        }

        int score = 70;
        if (score >= 90) {
            System.out.print("Відмінно");
        } else if (score >= 60){
            System.out.println("Добре");
        } else {
            System.out.println("Незадовільно");
        }
        int x = 1;

        x = x + 5;

        // цикли
        for (int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        int j = 1;
        while (j <= 5) {
            System.out.println(j);
            j++;
        }
    }
}
