package app.data.db;

import app.data.entity.Book;

import java.util.List;

public interface Repos {

    List<Book> bookList();

    void insert(Book book);

    void delete(int id);
}
