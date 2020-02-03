package com.fh.service;

import com.fh.common.ServerResponse;
import com.fh.model.QueryObject;

public interface MovieService {
 ServerResponse queryMovieList(QueryObject queryObject);
}
