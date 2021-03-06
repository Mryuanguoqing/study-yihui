package com.git.hui.web.thymeleaf.rest;

import javafx.util.Pair;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.time.LocalDateTime;
import java.util.*;

/**
 * Created by @author yihui in 14:44 19/8/16.
 */
@Controller
public class IndexController {

    @GetMapping(path = {"", "/", "/index"})
    public ModelAndView index() {
        Map<String, Object> data = new HashMap<>(2);
        data.put("name", "YiHui Thymeleaf");
        data.put("now", LocalDateTime.now().toString());
        return new ModelAndView("index", data);
    }

    private static String[] contents =
            ("绿蚁浮觞香泛泛，黄花共荐芳辰。\n清霜天宇净无尘。\n登高宜有赋，拈笔戏成文。\n可奈园林摇落尽，悲秋意与谁论。\n眼中相识几番新。\n龙山高会处，落帽定何人。").split("\n");
    private static Random random = new Random();

    @GetMapping(path = "show1")
    public String showOne(Model model) {
        model.addAttribute("title", "临江仙");
        model.addAttribute("content", contents[random.nextInt(6)]);
        return "show1";
    }

    @GetMapping(path = "show2")
    public String showTow(Map<String, Object> data) {
        data.put("name", "Show2---->");
        data.put("now", LocalDateTime.now().toString());
        return "show2";
    }

    @GetMapping(path = "list")
    public String list(Model model) {
        List list = new ArrayList<>();
        list.add(toMap("title", "标题1", "name", "yhh"));
        list.add(toMap("title", "标题2", "name", "sc"));
        model.addAttribute("list", list);
        return "list";
    }

    private Map<String, Object> toMap(String key, Object val, Object ... obj) {
        Map<String, Object> ans = new HashMap<>();
        ans.put(key, val);
        for (int i = 0; i < obj.length; i += 2) {
            ans.put((String) obj[i], obj[i+1]);
        }
        return ans;
    }
}
