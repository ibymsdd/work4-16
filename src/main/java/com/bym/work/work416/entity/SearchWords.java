package com.bym.work.work416.entity;

import lombok.Data;

@Data
public class SearchWords {

  private long sn;
  private String word;
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


  public long getHits() {
    return hits;
  }

  public void setHits(long hits) {
    this.hits = hits;
  }

}
