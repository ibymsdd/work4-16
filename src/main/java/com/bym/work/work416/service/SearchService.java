package com.bym.work.work416.service;



import com.bym.work.work416.entity.SearchWords;

import java.util.List;

public interface SearchService {
    List<String> hotword();
    List<SearchWords> words(String word);
}
