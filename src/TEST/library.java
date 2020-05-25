package TEST;
import java.io.*;
import java.util.List;

public class library {
    static ObjectOutputStream output;
    static ObjectInputStream in;

    /**
     * 读取
     *
     * @param books
     * @return
     * @throws IOException
     */
    public static boolean writeObjectToFile(List<book> books) throws IOException {
        File file = new File("book.txt");
        //序列化
        output = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file, false)));
        output.writeObject(books);//将book对象写入
        clean(output);
        return true;
    }


    /**
     * 清除内容
     * @param output
     * @throws IOException
     */
    private static void clean(ObjectStreamConstants output) throws IOException {
        if (output instanceof ObjectInputStream) {
            output = (ObjectInputStream) output;
            ((ObjectInputStream) output).close();
        } else {
            ((ObjectOutputStream) output).close();
        }
    }

    /**
     *
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static List<book> readObjectFormFile() throws IOException, ClassNotFoundException {
        File file = new File("book.txt");
        List<book> books = null;
        in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        books = (List<book>) in.readObject();
        clean(in);
        return books;
    }

    /**
     *
     * @param name
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void delete(String name) throws IOException, ClassNotFoundException {
        File file = new File("book.txt");
        List<book> books = null;
        in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        books = (List<book>) in.readObject();
        int i = 0;
        for (book book : books) {
            if (book.getBookName().equals(name)) {
                books.remove(book);
                System.out.println("已经删除了");
                return;
            }
            i++;
        }
        System.out.println("没有发现这个内容");
    }

    /**
     * 寻找
     * @param name
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public static void search(String name) throws IOException, ClassNotFoundException {
        File file = new File("book.txt");
        List<book> books = null;
        in = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)));
        books = (List<book>) in.readObject();


        for (book book : books) {
            if (book.getBookName().equals(name)) {
                System.out.println("已经找到了");
                System.out.println(book.toString());
            }

        }


    }
}
