package ie.atu.week9sem2.example123;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/form")
    public String showForm(Student student) {
        return "form";
    }

    @PostMapping("/submit")
    public String submitForm(@ModelAttribute Student student, Model model) {
        model.addAttribute("submitted", student);
        return "result";
    }
}
