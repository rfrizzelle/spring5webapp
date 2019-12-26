package rod.father.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import rod.father.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {

}
