package servlet;

import entity.Author;
import entity.Book;
import service.AuthorService;
import service.BookService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author wfzs
 * @date 2019.10.2
 * */
@WebServlet(urlPatterns = "/home")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String bookName = req.getParameter("bookName");
        List<Book> bookList;
        if (bookName == null || bookName.trim().equals("")){
            bookList = BookService.getBooklist();
        }else {
            bookList = BookService.getListByName(bookName);
        }
        List<Author> authorList = AuthorService.init();
        req.setAttribute("authorList",authorList);
       // req.getRequestDispatcher("/home.jsp").forward(req,resp);
        req.setAttribute("bookList",bookList);
//        跳转到对应得jsp文件中，并将数据带到jsp中
     req.getRequestDispatcher("/home.jsp").forward(req,resp);
    }
}
