package project.portfolioHyeon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class portfolioController {

	@RequestMapping("/")
	public String mainPage() {
		return "index";
	}
}
