package mta.ltnc.BookStore.repositories;

import mta.ltnc.BookStore.dto.client.PublisherDto;
import mta.ltnc.BookStore.entity.Image;
import mta.ltnc.BookStore.entity.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
* Generated by Spring Data Generator on 22/06/2019
*/
@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Integer>, JpaSpecificationExecutor<Publisher> {

    @Query("SELECT new mta.ltnc.BookStore.dto.client.PublisherDto(p,COUNT(p.name)) FROM Publisher p LEFT JOIN Book b ON p = b.publisher GROUP BY p")
    List<PublisherDto>  getAll();
    @Query("SELECT bi FROM Publisher bi WHERE bi.id = 1")
    Publisher getAllPublisher();
}
