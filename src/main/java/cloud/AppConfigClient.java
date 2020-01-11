package cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName: AppConfigClient
 * @Auther: Administrator
 *
 * 要是需要刷新客户端的配置信息，需要添加配置  actuator监控中心
 * @RefreshScope 此配置需要添加到接口，用于刷新最新配置
 * 手动调用接口 /actuator/refresh 进行刷新
 *
 * @Description:
 */
@SpringBootApplication
public class AppConfigClient {

    public static void main(String[] args) {
        SpringApplication.run(AppConfigClient.class,args);
    }

}
