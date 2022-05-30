package com.example.tourdebackend.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cykelhold {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "holdid")
  private int holdid;
  @Column(name = "holdname")
  private String holdName;

  @OneToMany
  private List<Cykelrytter> cykelrytters;

  public Cykelhold() {
  }

  public Cykelhold(int holdid, String holdName) {
    this.holdid = holdid;
    this.holdName = holdName;
  }

  public Cykelhold(int holdid, String holdName, List<Cykelrytter> cykelrytters) {
    this.holdid = holdid;
    this.holdName = holdName;
    this.cykelrytters = cykelrytters;
  }

  public int getHoldid() {
    return holdid;
  }

  public void setHoldid(int holdid) {
    this.holdid = holdid;
  }

  public String getHoldName() {
    return holdName;
  }

  public void setHoldName(String holdName) {
    this.holdName = holdName;
  }

  public List<Cykelrytter> getCykelrytters() {
    return cykelrytters;
  }

  public void setCykelrytters(List<Cykelrytter> cykelrytters) {
    this.cykelrytters = cykelrytters;
  }

  @Override
  public String toString() {
    return "Cykelhold{" +
        "holdid=" + holdid +
        ", holdName='" + holdName + '\'' +
        ", cykelrytters=" + cykelrytters +
        '}';
  }
}
