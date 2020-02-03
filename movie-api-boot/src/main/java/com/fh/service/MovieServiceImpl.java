package com.fh.service;

import com.fh.common.ServerResponse;
import com.fh.mapper.MovieMapper;
import com.fh.model.QueryObject;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MovieServiceImpl implements MovieService {
 @Resource
 private MovieMapper movieMapper;

 @Override
 public ServerResponse queryMovieList(QueryObject queryObject) {
  Map map = new HashMap();
  Integer total = movieMapper.queryCount(queryObject);
  List movieMap = movieMapper.queryMovieList(queryObject);
  map.put("draw", queryObject.getDraw());
  map.put("recordsTotal", total);
  map.put("recordsFiltered", total);
  map.put("data", movieMap);
  return ServerResponse.success(map);
 }
}
