package com.bovenjoy.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author <a href='mailto:bovenjoy@163.com'>周志豪</a>.
 * @version createTime:2017/2/7 17:22 demo
 */
@Controller
public class Index {

    @RequestMapping("index")
    public String index() {
        return null;
    }
}
