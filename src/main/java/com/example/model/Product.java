package com.example.model;
import jakarta.persistence.*;
@Entity
@Table(name="Product")
public class Product{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name", nullable = false)
  private String name;
  @Column(name = "price", nullable = false)
  private double price;

  public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

}