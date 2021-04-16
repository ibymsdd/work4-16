package com.bym.work.work416.service.serviceImpl;


import com.bym.work.work416.entity.SearchWords;
import com.bym.work.work416.mapper.SearchMapper;
import com.bym.work.work416.service.SearchService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class SearchServiceImpl implements SearchService {
    @Resource
    SearchMapper searchMapper;
    @Override
    public List<String> hotword() {
        return searchMapper.hotword();
    }

    @Override
    public List<SearchWords> words(String word) {
        return searchMapper.words(word);
    }
}
