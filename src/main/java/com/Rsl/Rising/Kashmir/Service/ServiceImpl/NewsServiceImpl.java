package com.Rsl.Rising.Kashmir.Service.ServiceImpl;

import com.Rsl.Rising.Kashmir.Entity.LocationTable;
import com.Rsl.Rising.Kashmir.Entity.NewsTable;
import com.Rsl.Rising.Kashmir.Entity.NewsTable;
import com.Rsl.Rising.Kashmir.Repository.CategoryTableRepository;
import com.Rsl.Rising.Kashmir.Repository.LocationTableRepository;
import com.Rsl.Rising.Kashmir.Repository.NewsTableRepository;
import com.Rsl.Rising.Kashmir.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    NewsTableRepository newsTableRepository;

    @Autowired
    CategoryTableRepository categoryTableRepository;

    @Autowired
    LocationTableRepository locationTableRepository;

    @Override
    public NewsTable saveNews(NewsTable news) {
        Optional<NewsTable> newsTable = newsTableRepository.findById(news.getCategoryId());
        if(newsTable.isPresent()){
            news.setCategoryId(news.getNewsId());
        }
        LocationTable location = locationTableRepository.findById(news.getLocation().getLocationId()).get();
        if(location != null){
            news.setLocation(location);
            NewsTable news1 = newsTableRepository.save(news);
            return news1;
        } else{
            throw new RuntimeException("not found");
        }
    }

    @Override
    public List<NewsTable> getAllNews() {
        return newsTableRepository.findAll();
    }

    @Override
    public NewsTable updateNews(Integer id, NewsTable updateNews) {
        NewsTable News = newsTableRepository.findById(id).orElse(null);
        if(News != null){
            if(updateNews.getNewsTitle() != null){
                News.setNewsTitle(updateNews.getNewsTitle());
            }
            if(updateNews.getNewsDetails() != null){
                News.setNewsDetails(updateNews.getNewsDetails());
            }
            if(updateNews.getNewsDescription() != null){
                News.setNewsDescription(updateNews.getNewsDescription());
            }
            return newsTableRepository.save(News);
        }
        return null;
    }

    @Override
    public Boolean deleteNews(Integer id) {
        Optional<NewsTable> News = newsTableRepository.findById(id);
        if(News.isPresent()){
            newsTableRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public NewsTable getById(Integer id) {
        return newsTableRepository.findById(id).orElse(null);
    }
}
