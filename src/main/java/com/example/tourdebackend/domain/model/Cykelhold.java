package com.example.tourdebackend.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cykelhold {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id")
  private int id;
  @Column(name = "holdname")
  private String holdName;

  @OneToMany(mappedBy = "cykelhold")
  @JsonBackReference
  private List<Cykelrytter> cykelrytters;

  public Cykelhold() {
  }

  public Cykelhold(int holdid, String holdName) {
    this.id = holdid;
    this.holdName = holdName;
  }

  public Cykelhold(int holdid, String holdName, List<Cykelrytter> cykelrytters) {
    this.id = holdid;
    this.holdName = holdName;
    this.cykelrytters = cykelrytters;
  }

  public int getId() {
    return id;
  }

  public void setId(int holdid) {
    this.id = holdid;
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
        "id=" + id +
        ", holdName='" + holdName + '\'' +
        ", cykelrytters=" + cykelrytters +
        '}';
  }
}
