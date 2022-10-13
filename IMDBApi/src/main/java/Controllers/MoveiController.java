package Controllers;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import Model.Movie;
import Services.MoveiServices;


@Controller
public class MoveiController {

	@Autowired
	MoveiServices movieServices;
	
	// Return all Movie  in Json Format//
	
	@RequestMapping("/getAll")
	@ResponseBody
	public String getAllMovie(Model model) {
		return movieServices.getAll().toString();
	}
	
	
	@RequestMapping("/get/{title}")
	@ResponseBody
	public String getByTitle(@PathVariable("title") String title) {
		return movieServices.findById(title).toString();
	}
	
	
	@PutMapping(path = "movie",consumes = {"application/json"})
	public Movie SaveMovie(@RequestBody Movie movie) {
		movieServices.saveMovie(movie);
		return movie;
	}
	
	
}
