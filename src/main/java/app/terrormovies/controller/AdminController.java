package app.terrormovies.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/admin")
public class AdminController {


	@RequestMapping("movies")
	@ResponseBody
	public String createMovie(@RequestBody String movie) {
		System.out.println("Adding movie! " + movie);

		return "created";
	}
 }