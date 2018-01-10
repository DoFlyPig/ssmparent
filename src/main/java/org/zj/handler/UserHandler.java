package org.zj.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Administrator on 2017/8/24 0024.
 */

@Controller(value = "/user")
public class UserHandler {

    @RequestMapping(value = {"","/"},method = RequestMethod.GET)
    public String index () {

        return "ok";
    }

}
