package service;

import entity.Book;

import javax.servlet.ServletContext;
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
    public static void setBooklist(List<Book> booklist) {
        BookService.booklist = booklist;
    }


//    public static List<Book> getListByName(String bookName) {
//        return booklist.stream().filter(book -> book.getName().contains(bookName)).collect(Collectors.toList());
//    }
//    通过关键字或书名搜索书籍
    public static List<Book> getListByName(String bookName){
        List<Book>list=new ArrayList<>();
        for(Book book:booklist){
            if(book.getName().equals(bookName)||book.getName().contains(bookName)){
                list.add(book);
            }
        }
        return list;
    }
    
    public static List<Book> getBooklist() {
        return booklist;
    }
//    public static List<Book> init(){
//        return booklist;
//    }
//
//    public static void setBooklist(List<Book> booklist) {
//        BookService.booklist = booklist;
//    }
}
