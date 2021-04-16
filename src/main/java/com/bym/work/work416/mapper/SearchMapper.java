package com.bym.work.work416.mapper;



import com.bym.work.work416.entity.SearchWords;

import java.util.List;

public interface SearchMapper {
    List<String> hotword();
    List<SearchWords> words(String word);
}
