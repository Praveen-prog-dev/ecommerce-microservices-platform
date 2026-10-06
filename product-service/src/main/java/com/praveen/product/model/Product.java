package com.praveen.product.model;
import jakarta.persistence.*;
import java.math.BigDecimal;
@Entity @Table(name="products") public class Product {
 @Id @GeneratedValue(strategy=GenerationType.IDENTITY) private Long id;
 @Column(nullable=false) private String name;
 @Column(nullable=false, precision=12, scale=2) private BigDecimal price;
 private Integer stock;
 public Product(){}
 public Product(String name, BigDecimal price, Integer stock){this.name=name;this.price=price;this.stock=stock;}
 public Long getId(){return id;} public String getName(){return name;} public void setName(String v){name=v;} public BigDecimal getPrice(){return price;} public void setPrice(BigDecimal v){price=v;} public Integer getStock(){return stock;} public void setStock(Integer v){stock=v;}
}
