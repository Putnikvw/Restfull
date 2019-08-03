package com.voitov;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface BookRepository extends JpaRepository<Book, Long> {

    @Query("select b.name from Book b where b.id = :id")
    String findUserName(@Param("id") Long userId);

}
