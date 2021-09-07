
public class Book {
//implements Comparable<Book> 
    private int id;
    private String name;

    public Book(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

//    @Override
//    public int compareTo(Book compared) {
//        if ( this.getId() > compared.getId()){
//            return 1;
//        }else{
//            return -1;
//        }
//    }
    
    @Override
    public String toString() {
        return "(id: " + id + "; name: " + name + ")";
    }

}
