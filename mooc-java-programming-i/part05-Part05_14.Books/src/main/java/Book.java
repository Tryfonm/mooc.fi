
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public boolean equals(Book compared) {
        if (this==compared){
            return true;
        }
        if (!(compared instanceof Book)) {
            return false;
        }
        if(this.name.equals(compared.name) && this.publicationYear== compared.publicationYear){
            return true;
        } 
        return false;
    }
}
