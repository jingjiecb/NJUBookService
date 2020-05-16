package cn.booknju.booknjuservice.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;


/*
*  书籍简单对象
*
*/
@Data
@NoArgsConstructor
public class Book {
    private Integer id;
    private String isbn;
    private String bname;
    private String author;
    private String publisher;
    private String degree;
    private Date inDate;
    private int num;

    public Book(Integer id,String isbn, String bname, String author, String publisher, String degree,int num) {
        this.id=id;
        this.isbn = isbn;
        this.bname = bname;
        this.author = author;
        this.publisher = publisher;
        this.degree = degree;
        this.num=num;
        //默认入库日期为当日
        inDate=new Date();
    }
}
