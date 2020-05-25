package TEST;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class bookTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        List list = new ArrayList<book>();
        book book1 = new book("Java编程思想",1040);
        book book2 = new book("Java核心技术",1200);
        book book3 = new book("深入理解java虚拟机",1400);
        book book4 = new book("Java多线程核心技术",1700);
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        //将图书对象存入文件
            library.writeObjectToFile(list);
        //将图书对象读出
        List<book> books = null;
            books = library.readObjectFormFile();

        library.delete("Java编程思想");
        library.search("深入理解java虚拟机");
    }
}
