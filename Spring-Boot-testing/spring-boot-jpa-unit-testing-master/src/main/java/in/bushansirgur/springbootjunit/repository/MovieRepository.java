package in.bushansirgur.springbootjunit.repository;

import java.util.List; 

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import in.bushansirgur.springbootjunit.model.Movie;

@Component
@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	List<Movie> findByGenera(String genera);
}
