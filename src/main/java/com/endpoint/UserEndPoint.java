package com.endpoint;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.server.UserService;

/**
* @author 作者 Fangcai Liao
* @version 创建时间：Oct 26, 2016 11:09:14 AM
* 类说明
*/
@RestController
public class UserEndPoint {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @Autowired
    UserService userService;

    /**
     * 主界面API.
     */
    @RequestMapping("/hello")
    public String home(@RequestParam String name) {
        log.debug("测试");
        List list = userService.getByName(name);
        return "hello word";
    }

}
