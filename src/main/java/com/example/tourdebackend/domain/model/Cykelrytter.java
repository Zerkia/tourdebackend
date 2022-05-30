package com.example.tourdebackend.domain.model;

import javax.persistence.*;

@Entity
public class Cykelrytter {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  private String name;
  @Column(name = "bjergpoint")
  private int bjergPoint;
  @Column(name = "spurtpoint")
  private int spurtPoint;
  private double lapTime;

  @ManyToOne
  private Cykelrytter cykelrytter;

  public Cykelrytter() {

  }

  public Cykelrytter(int id, String name, int bjergPoint, int spurtPoint, double lapTime, Cykelrytter cykelrytter) {
    this.id = id;
    this.name = name;
    this.bjergPoint = bjergPoint;
    this.spurtPoint = spurtPoint;
    this.lapTime = lapTime;
    this.cykelrytter = cykelrytter;
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

  public double getLapTime() {
    return lapTime;
  }

  public void setLapTime(double lapTime) {
    this.lapTime = lapTime;
  }

  public Cykelrytter getCykelrytter() {
    return cykelrytter;
  }

  public void setCykelrytter(Cykelrytter cykelrytter) {
    this.cykelrytter = cykelrytter;
  }

  @Override
  public String toString() {
    return "Cykelrytter{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", bjergPoint=" + bjergPoint +
        ", spurtPoint=" + spurtPoint +
        ", lapTime=" + lapTime +
        ", cykelrytter=" + cykelrytter +
        '}';
  }
}
