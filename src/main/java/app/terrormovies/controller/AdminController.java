package app.terrormovies.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {


	@RequestMapping(value = "movies", method = RequestMethod.POST)
	public @ResponseBody String createMovie(@RequestBody String movie) {
		System.out.println("Adding movie! " + movie);

		return "{status: suc, action : created}";
	}
 }
