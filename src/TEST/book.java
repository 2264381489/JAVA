package TEST;

import java.io.Serializable;

public class book implements Serializable {
    private String bookName;
    private int price;

    public book() {
    }

    public book(String bookName, int price) {
        this.bookName = bookName;
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" +
                "bookName='" + bookName + '\'' +
                ", price=" + price +
                ", author='" + '\'' +
                '}';
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }


}
