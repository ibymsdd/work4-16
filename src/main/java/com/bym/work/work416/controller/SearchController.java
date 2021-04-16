package com.bym.work.work416.controller;



import com.bym.work.work416.entity.SearchWords;
import com.bym.work.work416.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    @Autowired
    SearchService searchService;
    @GetMapping("/hotword")
    public List<String> hotwords(@RequestParam(name = "token", required = false) String token){
        return searchService.hotword();
    }
    @GetMapping(value = "/words")
    public List<SearchWords> words(@RequestParam("word")String word){
        return searchService.words(word);
    }
}
