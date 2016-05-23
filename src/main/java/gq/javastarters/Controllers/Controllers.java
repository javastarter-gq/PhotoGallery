package gq.javastarters.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by a_pan on 21.05.2016.
 */
//@Controller
public class Controllers {

  //  @RequestMapping({"/photo", "/error"})
    public String index(){
        return "index";
    }
}
