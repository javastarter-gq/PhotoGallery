package gq.javastarters.Controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by al on 22.05.16.
 */
@Controller
public class IndexController {
	final Logger logger = LoggerFactory.getLogger(IndexController.class);

    @RequestMapping("/")
    String index(){
        return "index";
    }
}
