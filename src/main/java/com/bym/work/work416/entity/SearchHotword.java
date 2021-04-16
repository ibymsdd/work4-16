package com.bym.work.work416.entity;

import lombok.Data;

@Data
public class SearchHotword {

  private long sn;
  private String word;
  private java.sql.Timestamp createTime;
  private long hits;


  public long getSn() {
    return sn;
  }

  public void setSn(long sn) {
    this.sn = sn;
  }


  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public long getHits() {
    return hits;
  }

  public void setHits(long hits) {
    this.hits = hits;
  }

}
