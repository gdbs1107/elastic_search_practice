package com.example.elasticsearchpractice.book.repository;

import com.example.elasticsearchpractice.book.domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
