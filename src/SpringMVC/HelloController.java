package SpringMVC;

/**
 * @author: linyijin
 * @Date: Created in 2017/12/18 16:48
 * @Description:
 **/

// 1、Spring Web MVC 框架
// 1.1、Spring MVC Hello World 例子
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.ModelMap;
@Controller
@RequestMapping("/hello")
public class HelloController{
    @RequestMapping(method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}
