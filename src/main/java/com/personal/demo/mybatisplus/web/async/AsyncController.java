package com.personal.demo.mybatisplus.web.async;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
@Slf4j
public class AsyncController {
    @RequestMapping("/order")
    public Callable<String> order() throws Exception {
        log.info("主线程开始");
        Callable<String> result = new Callable<String>() {
            @Override
            public String call() throws Exception {
                log.info("副线程开始");
                Thread.sleep(5000);
                log.info("副线程返回");
                return "Success";
            }
        };
        log.info("主线程结束");
        return result;
    }
}
