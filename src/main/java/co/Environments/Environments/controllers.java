package co.Environments.Environments;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controllers {

    @Autowired
    private Environment environment;

    @Value("${devName.value}")
    String devName;


    @GetMapping
    public String autCode(){

        return environment.getProperty("authCode.value");
    }

    @GetMapping("/name")
    public String name(){
        return devName;
    }
}
