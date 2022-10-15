package springmvc.app;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {

	@RequestMapping(value="/helloworld",method=RequestMethod.POST)
	public String handler(@ModelAttribute HelloWorld helloWorld,Model model) {
		
		//helloWorld.setDateTime(LocalDateTime.now().toString());
		System.out.println("-----------handler----------------"+helloWorld.getMessage());

		ModelAndView modelAndView = new ModelAndView("success");
		  //modelAndView.addObject("m", helloWorld.getMessage());
		//modelAndView.
	
		model.addAttribute("message", helloWorld.getMessage());
	//	return modelAndView;
		return "success";
	}
}