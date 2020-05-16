package cn.booknju.booknjuservice.bl;

import cn.booknju.booknjuservice.pojo.Book;

import java.util.List;

public interface BookService {
    void add(Book book);
    void update(Book book);
    List<Book> getAllBooks();
    Book getBookById(Integer id);
    void delete(Integer id);
}
