package service;

import entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wfzs
 * @date 2019.10.2
 * */
public class BookService {
    private static List<Book> booklist;

    static {
        booklist = new ArrayList<>(10);
        Book[] books = {
                new Book(1,"X的悲剧","X的悲剧.jpg","埃勒里 奎因"),
                new Book(2, "流浪地球", "流浪地球.jpg", "刘慈欣"),
                new Book(3, "白色的乌鸦", "白色的乌鸦.jpg", "李洱"),
                new Book(4, "月色撩人", "月色撩人.jpg", "王安忆"),
                new Book(5, "逃之夭夭", "逃之夭夭.jpg", "伍纯刚"),
                new Book(6, "戏年", "戏年.jpg", "葛亮"),
                new Book(7, "昨日重现", "1111.jpg", "张寒寺"),
                new Book(8, "墙上的父亲", "墙上的父亲.jpg", "鲁敏"),
                new Book(9, "血疑", "血凝.jpg", "尹恩 兰金"),
                new Book(10, "短歌行", "短歌行.jpg", "钟文音"),
                new Book(11, "人间失格", "人间失格.jpg", "太宰治"),
                new Book(12, "罪恶生涯", "罪恶生涯.jpg", "罗伯特加尔布雷斯"),
                new Book(13,"晚风如诉","晚风如诉.jpg","肯特 哈鲁夫"),
                new Book(14, "城南旧事", "城南旧事.jpg", "林海音"),
                new Book(15,"零的焦点","零的焦点.jpg","松本清张")
        };
        booklist = Arrays.asList(books);
    }

    public static List<Book> getListByName(String bookName) {
        return booklist.stream().filter(book -> book.getName().contains(bookName)).collect(Collectors.toList());
    }

    public static List<Book> getBooklist() {
        return booklist;
    }
    public static List<Book> init(){
        return booklist;
    }

    public static void setBooklist(List<Book> booklist) {
        BookService.booklist = booklist;
    }
}
