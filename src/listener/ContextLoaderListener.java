package listener;

import entity.Book;
import entity.User;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.annotation.WebServlet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wfzs
 * @ClassName ContextLoaderListener
 * @Description 上下文加载监听器，在服务器启动时即刻生效，用户生成用户数据和图书数据
 * @Date 2019.10.8
 * @Version 1.0
 * */
@WebListener
public class ContextLoaderListener implements ServletContextListener {

    /**
     * @Descirption 容器初始化方法
     * @param  sce
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("容器启动");
//        创建并生成用户数据列表
        List<User> userList = new ArrayList<>();
        User [] users = {
                new User("3.jpg","大爱谭松韵","14752191369","698d51a19d8a121ce581499d7b701668","南京"),
                new User("最美的风景.jpg","最美的风景","1244353765","bcbe3365e6ac95ea2c0343a2395834dd","上海")
        };
        userList = Arrays.asList(users);

//        创建并生成图书数据
        List<Book> bookList = new ArrayList<>();
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
        bookList = Arrays.asList(books);

        ServletContext servletContext = sce.getServletContext();
//        设置全局变量属性，将用户和图书列表数据记入，整个应用共享
        servletContext.setAttribute("userList",userList);
        servletContext.setAttribute("bookList",bookList);
    }

    /**
     * 销毁方法
     * @param sce
     * */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("容器销毁");
    }
}
