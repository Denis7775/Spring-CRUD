package app.controller;

import app.data.db.DataAccess;
import app.data.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.sql.DataSource;
import java.util.List;

@Controller
@ComponentScan(basePackageClasses = {DataAccess.class})
public class DbController {

    private DataAccess dataAccess;

    @Autowired
    public DbController(DataSource dataSource) {
        this.dataAccess = new DataAccess(dataSource);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String inrt(Model model) {
        model.addAttribute("book", new Book());
        List<Book> arr = dataAccess.bookList();
        model.addAttribute("arr", arr);
        return "bookForm";
    }

    @RequestMapping(value = "/delete/{id}")
    public String delete(@PathVariable("id") int id, Model model) {
        model.addAttribute("book", new Book());
        dataAccess.delete(id);
        List<Book> arr = dataAccess.bookList();
        model.addAttribute("arr", arr);
        return "bookForm";
    }


    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String save(@ModelAttribute("book") Book book, Model model) {
        dataAccess.insert(book);
        List<Book> arr = dataAccess.bookList();
        model.addAttribute("arr", arr);
        return "bookForm";
    }
}
