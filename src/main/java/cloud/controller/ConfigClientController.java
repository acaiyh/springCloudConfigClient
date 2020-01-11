package cloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: ConfigClientController
 * @Auther: Administrator
 * @Date: 2019/8/5 0005 11:03
 * @Description:
 */
@RestController
@RefreshScope  //需要刷新到最新的配置信息，需要此注解
public class ConfigClientController {

    @Value("${name}")
    private String name;

    @Value("${age}")
    private int age;

    @RequestMapping(value = "getConfig")
    @ResponseBody
    public String getConfig(){
        return name + "-" + age;
    }

}
