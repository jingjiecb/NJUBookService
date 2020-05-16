package cn.booknju.booknjuservice.blImpl;

import cn.booknju.booknjuservice.bl.BookService;
import cn.booknju.booknjuservice.mapper.BookMapper;
import cn.booknju.booknjuservice.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private static Integer iniId=1;

    @Autowired
    BookMapper bookMapper;

    @Override
    public void add(Book book) {
        while (bookMapper.getBookById(iniId)!=null) iniId++;
        if (book.getId()==null) book.setId(iniId++);
        bookMapper.add(book);
    }

    @Override
    public void update(Book book) {
        bookMapper.update(book);
    }

    @Override
    public Book getBookById(Integer id) {
        return bookMapper.getBookById(id);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookMapper.getAllBooks();
    }

    @Override
    public void delete(Integer id) {
        bookMapper.delete(id);
    }
}
