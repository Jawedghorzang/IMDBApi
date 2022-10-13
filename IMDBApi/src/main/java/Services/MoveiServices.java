package Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Model.Movie;
import Ropository.MoveiRepository;


@Service
public class MoveiServices {
	
	@Autowired
	MoveiRepository moveiRepo;
	
	public void saveMovie(Movie movei) {
		moveiRepo.save(movei);	
	}

	public List<Movie> getAll() {
		return moveiRepo.findAll();
	}

	public void delete(String title) {
		moveiRepo.deleteById(title);	
	}

    public Optional<Movie> findById(String title) {
		return moveiRepo.findById(title);
	}
	
	

}
