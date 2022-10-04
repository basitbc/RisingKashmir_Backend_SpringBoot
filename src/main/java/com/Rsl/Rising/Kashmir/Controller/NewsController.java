package com.Rsl.Rising.Kashmir.Controller;

import com.Rsl.Rising.Kashmir.Entity.CategoryTable;
import com.Rsl.Rising.Kashmir.Entity.LocationTable;
import com.Rsl.Rising.Kashmir.Entity.NewsTable;
import com.Rsl.Rising.Kashmir.Repository.LocationTableRepository;
import com.Rsl.Rising.Kashmir.Repository.NewsTableRepository;
import com.Rsl.Rising.Kashmir.Service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/news-table")
@CrossOrigin
public class NewsController {

    @Autowired
    NewsService newsService;

    @Autowired
    LocationTableRepository locationTableRepository;

    @Autowired
    NewsTableRepository newsTableRepository;

    //    Post Mapping is used to add a new data to NewsTable in Database
    @PostMapping("/save")  //to save
    public ResponseEntity save(@RequestBody NewsTable save){
        return  ResponseEntity.status(HttpStatus.OK).body(newsService.saveNews(save));

    }


    //    Get Mapping is used to get data from NewsTable in Database
    @GetMapping("/get-all-News")
    public ResponseEntity getAllNews(){
        return ResponseEntity.status(HttpStatus.OK).body(newsService.getAllNews());
    }

    @PutMapping("/update/{id}")
    public ResponseEntity update(@RequestBody NewsTable update, @PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(newsService.updateNews(id, update));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(newsService.deleteNews(id));
    }

    @GetMapping("/getbyid/{id}")
    public ResponseEntity getNewsById(@PathVariable Integer id){
        return ResponseEntity.status(HttpStatus.OK).body(newsService.getById(id));
    }
}
