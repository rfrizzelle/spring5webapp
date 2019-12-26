package rod.father.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;

import rod.father.spring5webapp.model.Author;

public interface AuthorRepository extends CrudRepository<Author, Long> {

}
