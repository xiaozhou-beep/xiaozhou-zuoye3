package com.fh.controller;

import com.fh.common.ServerResponse;
import com.fh.model.QueryObject;
import com.fh.service.MovieService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@CrossOrigin
public class MovieController {
 @Resource
 private MovieService movieService;
@RequestMapping("queryMovieList")
 public ServerResponse queryMovieList(QueryObject queryObject){
  return movieService.queryMovieList(queryObject);
 }
}
