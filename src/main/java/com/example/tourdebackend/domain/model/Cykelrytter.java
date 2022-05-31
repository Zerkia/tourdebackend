package com.example.tourdebackend.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Builder
public class Cykelrytter {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  @Column(name = "bjergpoint")
  @JsonProperty("bjergpoint")
  private int bjergPoint;
  @Column(name = "spurtpoint")
  @JsonProperty("spurtpoint")
  private int spurtPoint;
  @Column(name = "holdid", insertable = false, updatable = false)
  private int holdid;
  @Column(name = "bjergtid")
  @JsonProperty("bjergtid")
  private double bjergtid;
  @Column(name = "spurttid")
  @JsonProperty("spurttid")
  private double spurttid;
  @Column(name = "alder")
  @JsonProperty("alder")
  private int alder;

  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "holdid", referencedColumnName = "id")
  private Cykelhold cykelhold;

  public Cykelrytter() {

  }

  public Cykelrytter(int id, String name, int bjergPoint, int spurtPoint, int holdid, double bjergtid, double spurttid, int alder, Cykelhold cykelhold) {
    this.id = id;
    this.name = name;
    this.bjergPoint = bjergPoint;
    this.spurtPoint = spurtPoint;
    this.holdid = holdid;
    this.bjergtid = bjergtid;
    this.spurttid = spurttid;
    this.alder = alder;
    this.cykelhold = cykelhold;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAlder() {
    return alder;
  }

  public void setAlder(int alder) {
    this.alder = alder;
  }

  public int getBjergPoint() {
    return bjergPoint;
  }

  public void setBjergPoint(int bjergPoint) {
    this.bjergPoint = bjergPoint;
  }

  public int getSpurtPoint() {
    return spurtPoint;
  }

  public void setSpurtPoint(int spurtPoint) {
    this.spurtPoint = spurtPoint;
  }

  public int getHoldid() {
    return holdid;
  }

  public void setHoldid(int holdid) {
    this.holdid = holdid;
  }

  public double getBjergtid() {
    return bjergtid;
  }

  public void setBjergtid(double lapTime) {
    this.bjergtid = lapTime;
  }

  public double getSpurttid() {
    return spurttid;
  }

  public void setSpurttid(double spurttid) {
    this.spurttid = spurttid;
  }

  public Cykelhold getCykelhold() {
    return cykelhold;
  }

  public void setCykelhold(Cykelhold cykelhold) {
    this.cykelhold = cykelhold;
  }


  @Override
  public String toString() {
    return "Cykelrytter{" +
            "id=" + id +
            ", name='" + name + '\'' +
            ", bjergPoint=" + bjergPoint +
            ", spurtPoint=" + spurtPoint +
            ", holdid=" + holdid +
            ", bjergtid=" + bjergtid +
            ", spurttid=" + spurttid +
            ", alder=" + alder +
            ", cykelhold=" + cykelhold +
            '}';
  }
}


