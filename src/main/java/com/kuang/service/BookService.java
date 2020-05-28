package com.kuang.service;

import com.kuang.pojo.Books;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookService {
    int addBook(Books books);

    int deleteBookById(@Param("bookid") int id);

    int updateBook(Books books);

    Books queryBookById(@Param("bookid") int id);

    List<Books> queryAllBook();
}
