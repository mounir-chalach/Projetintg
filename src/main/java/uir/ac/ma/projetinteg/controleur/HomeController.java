package uir.ac.ma.projetinteg.controleur;


import ch.qos.logback.core.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;

@Controller
public class HomeController {

    @GetMapping
    String home(Model model){
        return "Home";
    }





}
