package com.venus.controller;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.venus.domain.Test;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dongkx
 * @version 0.0.1
 * @date 2019/12/3
 */
@Api("测试Api")
@Controller("test")
@RequestMapping("/test")
public class TestController {

    @ApiOperation(value = "测试", notes = "测试")
    @RequestMapping(value = "get-test", method = RequestMethod.GET)
    @ResponseBody
    public Test getTest() {
        return new Test("小明", 12);
    }
}
