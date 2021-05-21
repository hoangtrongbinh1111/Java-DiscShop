package mta.ltnc.BookStore.managers;

import mta.ltnc.BookStore.entity.News;
import mta.ltnc.BookStore.repositories.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
* Generated by Spring Data Generator on 22/06/2019
*/
@Component
public class NewsManager {

	private NewsRepository newsRepository;

	@Autowired
	public NewsManager(NewsRepository newsRepository) {
		this.newsRepository = newsRepository;
	}

}
