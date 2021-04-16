package com.bym.work.work416.controller;



import com.bym.work.work416.entity.SearchWords;
import com.bym.work.work416.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    @Autowired
    SearchService searchService;
    @GetMapping("/hotword")
    public List<String> hotwords(){
        return searchService.hotword();
    }
    @GetMapping("/words")
    public List<SearchWords> words(@RequestParam("word")String word){
        return searchService.words(word);
    }
}
