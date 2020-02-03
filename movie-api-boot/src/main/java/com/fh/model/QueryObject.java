package com.fh.model;

import lombok.Data;

import java.util.Date;

@Data
public class QueryObject extends Page{
 private String name;//  电影名
 private Long minmins;
 private Long maxmins;
 private Integer IsHot ;// 是否热映，1代表是 2代表否
private Integer typeId;
private Date minShowTime;
private Date maxShowTime;
private Integer areaId;
}
