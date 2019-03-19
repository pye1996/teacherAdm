package com.blq.forteacher.Controller;

import com.blq.forteacher.Entity.KeepLesson;
import com.blq.forteacher.Service.KeepService;
import com.blq.forteacher.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private TestService testService;
    @Autowired
    private KeepService keepService;

    @RequestMapping(value = "/addLesson",method = RequestMethod.GET)
    public String addLesson(@RequestParam("name") String name,@RequestParam("image") String image,@RequestParam("typeid") int typeid){
        int num = keepService.addLesson(name,image,typeid);
        if(num == 1){
            return "成功插入一条数据";
        }
        else{
            return "失败了";
        }
    }

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public List<KeepLesson> hello(){
        List<KeepLesson> hello = null;
        try {
            hello = testService.hello();
        }catch(Exception e){
            System.out.println(e);
        }
        return hello;
    }


}
