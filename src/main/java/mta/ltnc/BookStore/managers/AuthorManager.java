package mta.ltnc.BookStore.managers;

import mta.ltnc.BookStore.entity.Author;
import mta.ltnc.BookStore.repositories.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 22/06/2019
*/
@Component
public class AuthorManager {

	private AuthorRepository authorRepository;

	@Autowired
	public AuthorManager(AuthorRepository authorRepository) {
		this.authorRepository = authorRepository;
	}

}
