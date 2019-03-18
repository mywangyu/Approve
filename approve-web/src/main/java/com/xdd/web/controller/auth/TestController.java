package com.xdd.web.controller.auth;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Deso on 2019/3/18.
 */
@RestController("/testController")
public class TestController {

    @ApiOperation("获取用户")
    @PostMapping(value = "/getUser")
    public void getUser() {
        return;
    }

}
