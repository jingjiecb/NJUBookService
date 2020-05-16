package cn.booknju.booknjuservice.mapper;

import cn.booknju.booknjuservice.pojo.Book;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    //增加图书
    int add(Book book);

    //更新图书
    int update(Book book);

    //获得书单
    List<Book> getAllBooks();

    //根据ISBN查询书目
    Book getBookById(Integer id);

    //删除图书
    int delete(Integer id);
}
