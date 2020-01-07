package rod.father.spring5webapp.bootstrap;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import rod.father.spring5webapp.model.Author;
import rod.father.spring5webapp.model.Book;
import rod.father.spring5webapp.model.Publisher;
import rod.father.spring5webapp.repositories.AuthorRepository;
import rod.father.spring5webapp.repositories.BookRepository;
import rod.father.spring5webapp.repositories.PublisherRepository;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {
	
	private AuthorRepository authorRepo;
	private BookRepository bookRepo;
	private PublisherRepository publisherRepo;
	
	public DevBootstrap(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
		this.authorRepo = authorRepository;
		this.bookRepo = bookRepository;
		this.publisherRepo = publisherRepository;
	}
	
	private void initData() {
		
		//Eric
		Author eric = new Author("Eric", "Evans");
		Publisher publisher1 = new Publisher("Harper Collins", "123 Publisher Lane");
		Book ddd = new Book("Domain Driven Design", "1234", publisher1);
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		authorRepo.save(eric);
		publisherRepo.save(publisher1);
		bookRepo.save(ddd);
		
		//Rod
		Author rod = new Author("Rod", "Frizzelle");
		Publisher publisher2 = new Publisher("Worx", "456 Publisher Lane");
		Book noEJB = new Book("J2EE Development without EJB", "23444", publisher2);
		
		rod.getBooks().add(noEJB);
		
		authorRepo.save(rod);
		publisherRepo.save(publisher2);
		bookRepo.save(noEJB);
		
		
	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		// TODO Auto-generated method stub
		initData();
		
	}

}
