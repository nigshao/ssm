package com.ssm.controller;

import com.ssm.exception.ZdyException;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

public class BaseController {


    @ExceptionHandler(ZdyException.class)
    @ResponseBody
    public Map<String,Object>  exZdy(HttpServletRequest request,Exception ex){

        try {
            String url  = request.getRequestURL().append(request.getQueryString()).toString();
        } catch (Exception e) {
            //jiaban dao 10  dian xiongdimen youshimei ping sm yaoqiu renjia weismne
            System.out.println("---------url 获取异常");
        }

        System.out.println(ExceptionUtils.getStackTrace(ex));
        Map<String,Object>  map = new HashMap<>();
        map.put("exCode",((ZdyException)ex).getErrorCode());
        map.put("exMessage",((ZdyException)ex).getMessage());
        return map;
    }


}
