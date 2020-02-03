package com.fh.model;

import lombok.Data;

import java.util.Date;

@Data
public class MovieType {
 private Integer id;
 private String name;
 private Date creaTime;
 private Date updateTime;
}
