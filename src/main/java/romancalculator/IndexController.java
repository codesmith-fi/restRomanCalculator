package romancalculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Value;

/**
 * Controller for handling requests to /
 */
@Controller
public class IndexController {
    /**
     * Class constants
     */
    private static final String TEXT_UNDEFINED="undefined";

    @Value("${spring.application.name}")
    String appName;

    @RequestMapping("/")
    public String homePage(Model model) {
        model.addAttribute("appName", appName);

        ConversionResult emptyResult = new ConversionResult(TEXT_UNDEFINED, TEXT_UNDEFINED);
        model.addAttribute("result", emptyResult);

        return "index";
    }
}
