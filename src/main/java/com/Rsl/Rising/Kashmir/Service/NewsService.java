package com.Rsl.Rising.Kashmir.Service;

import com.Rsl.Rising.Kashmir.Entity.NewsTable;

import java.util.List;

public interface NewsService {

    NewsTable saveNews(NewsTable newsTable);
    List<NewsTable> getAllNews();
    NewsTable updateNews(Integer id, NewsTable updateNews);

    Boolean deleteNews(Integer id);

    NewsTable getById(Integer id);
}
