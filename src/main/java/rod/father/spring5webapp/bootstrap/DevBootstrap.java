package rod.father.spring5webapp.bootstrap;

import rod.father.spring5webapp.model.Author;
import rod.father.spring5webapp.model.Book;

public class DevBootstrap {
	
	private void initData() {
		
		//Eric
		Author eric = new Author("Eric", "Evans");
		Book ddd = new Book("Domain Driven Design", "1234", "Harper Collins");
		eric.getBooks().add(ddd);
		ddd.getAuthors().add(eric);
		
		//Rod
		Author rod = new Author("Rod", "Frizzelle");
		Book noEJB = new Book("J2EE Development without EJB", "23444", "Worx");
		rod.getBooks().add(noEJB);
		
	}

}
