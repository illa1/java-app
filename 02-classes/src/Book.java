public class Book {
    String title;
    String author;
    int pages;
    int year;

    Book(){
        title = "Без назви";
        author = "Невідомий";
        pages = 0;
        year = 0;
        System.out.println("Створено нову книгу");

    }
    Book(String title, String author, int pages, int year){
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;

    }
    void showInfo(){
        System.out.println("Книга " + title);
        System.out.println("Автор " + author);
        System.out.println("Сторінок " + pages);
        System.out.println("Рік " + year);
    }


}
