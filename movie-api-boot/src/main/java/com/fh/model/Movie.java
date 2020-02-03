package com.fh.model;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
public class Movie {
private Integer id;// 电影id
private String name;//  电影名
private Long mins;//  时长，单位为分钟
private Integer mainImage;//  电影主图
private Integer IsHot ;// 是否热映，1代表是 2代表否
private Double grade;//  评分
 @DateTimeFormat(pattern = "yyyy-MM-dd")
private Date showTime;//  上映时间
private String introduce ;// 电影介绍
 @DateTimeFormat(pattern = "yyyy-MM-dd")
private Date createTime;//  创建时间
 @DateTimeFormat(pattern = "yyyy-MM-dd")
private Date updateTime ;// 修改时间
 private  Integer isDel;
}
