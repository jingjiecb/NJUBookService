package cn.booknju.booknjuservice.controller;

import cn.booknju.booknjuservice.bl.BookService;
import cn.booknju.booknjuservice.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BookController {

    @Autowired
    BookService bookService;

    @RequestMapping("/books")
    public String list(Model model){
        List<Book> books=bookService.getAllBooks();
        model.addAttribute("books",books);
        return "book/list";
    }

    @GetMapping("/addBook")
    public String toAddPage(){
        return "book/add";
    }

    @PostMapping("/addBook")
    public String addBook(Book book){
        bookService.add(book);
        return "redirect:/books";
    }

    @GetMapping("/updateBook")
    public String toUpdateBook(@RequestParam("id") Integer id,Model model){
        Book book = bookService.getBookById(id);
        model.addAttribute("book",book);
        return "book/update";
    }

    @PostMapping("/updateBook")
    public String updateBook(Book book){
        bookService.update(book);
        return "redirect:/books";
    }

    @GetMapping("/deleteBook")
    public String deleteBook(@RequestParam("id") Integer id){
        bookService.delete(id);
        return "redirect:/books";
    }
}
