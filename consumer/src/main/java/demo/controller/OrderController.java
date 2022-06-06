package demo.controller;

import demo.service.OrderService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/order1")
    public String getOrder1(){
        return orderService.getOrder();
    }

    @GetMapping("/order2")
    public String getOrder2(){
        return orderService.getOrder2();
    }
}
