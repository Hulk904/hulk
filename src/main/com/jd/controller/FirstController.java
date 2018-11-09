package main.com.jd.controller;

import org.smart4j.framework.mvc.annotation.Action;
import org.smart4j.framework.mvc.annotation.Request;
import org.smart4j.framework.mvc.bean.Result;
import org.smart4j.framework.mvc.bean.View;

import java.util.Collections;
import java.util.Date;

/**
 * Created by yangyuan on 7/27/17.
 */
@Action
public class FirstController {

    @Request.Get(value = "/first/hello.do")//地址要跟浏览器后面的uri一样，包括 /  斜杠也不能丢
    public Result  hello(){
        Result result = new Result(true);
        result.setData(new Date());
        return result;
    }

    @Request.Get(value = "/first/hi.do")
    public View hiJsp(){
        View view = new View("hello.jsp");
        return view;
    }

    @Request.Get(value = "/first/param.do")
    public Result withParam(String param){
        Result result = new Result(true);
        System.out.println("=========" + param);
        return result;
    }

    public static void main(String[] args) {
        String a = "abc";
        System.out.println(a.hashCode());
        System.out.println(hash(a.hashCode()));
    }
    public static int hash(int h){
        h ^= (h >>> 20) ^ (h >>> 12);
        return h ^ (h >>> 7) ^ (h >>> 4);
    }
}
