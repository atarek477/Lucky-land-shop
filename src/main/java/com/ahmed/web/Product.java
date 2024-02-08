package com.ahmed.web;

import jakarta.persistence.*;

import java.math.BigInteger;
import java.util.Objects;

@Entity
public class Product {



    @Id
    @SequenceGenerator(name = "product_id_seq", sequenceName = "product_id_seq", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_id_seq")
    private int id;

    @Column
    private  String name ;
    @Column
    private BigInteger bigInteger;
    @Column
    private String urlPicture;
    @Column
    private String description ;
    public Product() {

    }
    public Product(String name, BigInteger bigInteger, String urlPicture, String description) {
        this.name = name;
        this.bigInteger = bigInteger;
        this.urlPicture = urlPicture;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getBigInteger() {
        return bigInteger;
    }

    public void setBigInteger(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    public String getUrlPicture() {
        return urlPicture;
    }

    public void setUrlPicture(String urlPicture) {
        this.urlPicture = urlPicture;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && Objects.equals(name, product.name) && Objects.equals(bigInteger, product.bigInteger) && Objects.equals(urlPicture, product.urlPicture) && Objects.equals(description, product.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, bigInteger, urlPicture, description);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", bigInteger=" + bigInteger +
                ", urlPicture='" + urlPicture + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
