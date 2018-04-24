package np.com.ishworb.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
@RequestMapping("/")
public String mainControl() {
	return "hello";
}
}
