package service;

import entity.Author;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthorService {
  private  static List<Author> authorList;

  public static List<Author> init(){
      authorList = new ArrayList<> ();
      Author[] authors = {
              new Author(1,"坚持到底","坚持到底.jpg"),
              new Author(2,"书本上的树","书本上的树.jpg"),
              new Author(3,"恋爱密语","恋爱密语.jpg"),
              new Author(4,"最美美不过黄昏","最美美不过黄昏.jpg"),
              new Author(5,"一个人的世界","一个人的世界.jpg"),
              new Author(6,"一只皮卡丘","一只皮卡丘.jpg")
      };
          authorList = Arrays.asList(authors);
          return  authorList;
  }
}
