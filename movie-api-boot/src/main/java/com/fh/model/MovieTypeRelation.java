package com.fh.model;

import lombok.Data;

@Data
public class MovieTypeRelation {
 private Integer id;
 private Integer typeId;
 private Integer movieId;
}
