package app.data.db;

import app.data.entity.Book;
import config.WebAppInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;


import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@ComponentScan(basePackageClasses = {WebAppInitializer.class})
public class DataAccess implements Service{

    private JdbcTemplate jdbcTemplate;

    public DataAccess(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Book> bookList() {
        return jdbcTemplate.query("SELECT * FROM books", new BookMapper());
    }

    public void insert(Book book) {
        String query = "INSERT INTO books(name, author) VALUES (?,?)";
        jdbcTemplate.update(query, book.getName(), book.getAuthor());

    }

    public void delete(int id) {
        String SQL = "delete from books where id = ?";
        jdbcTemplate.update(SQL, id);
    }


    private static final class BookMapper implements RowMapper<Book> {

        @Override
        public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
            Book book = new Book();
            book.setId(rs.getInt("id"));
            book.setName(rs.getString("name"));
            book.setAuthor(rs.getString("author"));
            return book;
        }
    }
}
