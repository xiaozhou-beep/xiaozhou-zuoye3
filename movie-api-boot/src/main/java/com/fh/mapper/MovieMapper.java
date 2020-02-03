package com.fh.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fh.model.Movie;
import com.fh.model.QueryObject;

import java.util.List;

public interface MovieMapper extends BaseMapper<Movie> {
 Integer queryCount(QueryObject queryObject);

 List queryMovieList(QueryObject queryObject);
}
