package com.miasol.controller;

import com.miasol.pojo.Category;
import com.miasol.service.CategoryService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("category")
public class CategoryController {
    @Resource
    private CategoryService categoryServiceImpl;

    @RequestMapping("getByPid/{pid}")
    @ResponseBody
    public List<Category> getByPid(@PathVariable("pid")int pid){
        return categoryServiceImpl.selByPid(pid);
    }

}
