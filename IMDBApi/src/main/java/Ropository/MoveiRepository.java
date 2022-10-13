package Ropository;

import org.springframework.data.jpa.repository.JpaRepository;

import Model.Movie;

public interface MoveiRepository extends JpaRepository<Movie, String> {

}
