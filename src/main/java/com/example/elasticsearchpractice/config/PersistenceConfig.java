package com.example.elasticsearchpractice.config;

import com.example.elasticsearchpractice.book.domain.Book;
import com.example.elasticsearchpractice.book.repository.BookRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackageClasses = Book.class)
@EnableJpaRepositories(basePackageClasses = BookRepository.class)
public class PersistenceConfig {
}
