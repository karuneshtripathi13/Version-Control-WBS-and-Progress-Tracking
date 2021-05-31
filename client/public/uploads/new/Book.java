import java .util.*;1668898989897
class Book{
    Scanner sc=new Scanner(System.in);
    private String bookname,authorname,publisher,ISBNnumber;
    Book(String bookname,String authorname,String publisher,String ISBNnumber)
    {
        this.bookname=bookname;
        this.authorname=authorname;
        this.publisher=publisher;
        this.ISBNnumber=ISBNnumber;
    }
public String getAuthorname() {
    String authorname;
    System.out.println("Enter Authorname: ");
    authorname=sc.nextLine();
    return authorname;
}
public String getBookname() {
    System.out.println("Enter Book name: ");
    String bookname=sc.nextLine();
    return bookname;
}
public String getISBNnumber() {
    System.out.println("Enter ISBN number: ");
    String ISBNnumber=sc.nextLine();
    return ISBNnumber;
}
public String getPublisher() {
    System.out.println("Enter publisher: ");
    String publisher=sc.nextLine();
    return publisher;
}
public void setAuthorname(String authorname) {
    this.authorname = authorname;
}
public void setBookname(String bookname) {
    this.bookname = bookname;
}
public void setISBNnumber(String ISBNnumber) {
    this.ISBNnumber = ISBNnumber;
}
public void setPublisher(String publisher) {
    this.publisher = publisher;
}
public String getBookInfo()
{
    return ("Book Name: "+bookname+"\nAuthor Name: "+authorname+"\npublisher name: "+publisher+"\nISBN number: "+ISBNnumber);
}
}
class BookTest{
    public static void main(String[] args) {
        Book obj[]=new Book[30];
        for(int i=0;i<30;i++)
        {
            obj[i]=new Book("Default","Default","Default","Default");
            obj[i].setAuthorname(obj[i].getAuthorname());
            obj[i].setBookname(obj[i].getBookname());
            obj[i].setISBNnumber(obj[i].getISBNnumber());
            obj[i].setPublisher(obj[i].getPublisher());
        }
        for(int i=0;i<30;i++)
        {
            System.out.println("\nBook Details\n"+obj[i].getBookInfo());
        }
    }
}