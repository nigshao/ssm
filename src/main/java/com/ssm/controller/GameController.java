package com.ssm.controller;

import com.ssm.domain.VZyGame;
import com.ssm.exception.ZdyException;
import com.ssm.service.GameService;
import com.ssm.util.PropertyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.ResponseWrapper;
import java.util.List;


@RequestMapping("game")
@Controller
public class GameController extends BaseController{

    @Autowired
    GameService gameService;

    @ResponseBody
    @RequestMapping("get")
    public Object get() throws ZdyException {
        List<VZyGame> allGame = gameService.getlist();
        return allGame;
    }

    @ResponseBody
    @RequestMapping("test")
    public Object test(){
        String sourcename = PropertyUtil.getString("sourcename");
        return sourcename;
    }


}
