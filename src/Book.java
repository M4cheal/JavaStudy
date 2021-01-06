
public class Book {
    public String ISBN;
    public String BookName;
    public String publish;
    public void showBook()
    {
        System.out.println("ISBN：" + ISBN + "；"  + "书名：" + BookName + "出版社：" + publish);
    }
    public static void main(String[] args) {
        Book book = new Book();
        book.ISBN = "9787302987";
        book.BookName = "Java语言程序设计";
        book.publish = "清华大学出版社";
        book.showBook();
    }
}