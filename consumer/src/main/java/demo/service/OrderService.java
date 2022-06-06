package demo.service;

import demo.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@Service
public class OrderService {

    @DubboReference(version = "1.0")
    public UserService userService1;

    @DubboReference(version = "2.0")
    public UserService userService2;

    public String getOrder(){
        return userService1.getUser();
    }
    public String getOrder2(){
        return userService2.getUser();
    }
}
