package root;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @RequestMapping("/") // localhost:8080
    public String getWelcomePage(Model model, @RequestParam(value = "username", required = false, defaultValue =
            "UNKNOWN_USER") String nickname) {
        model.addAttribute("username", nickname);
        return "welcome"; // welcome.html
    }

}
