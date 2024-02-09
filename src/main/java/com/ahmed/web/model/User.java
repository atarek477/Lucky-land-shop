package com.ahmed.web.model;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "\"user\"")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private  String name ;

    @Column
    private String email;
    @Column
    private String password ;
    @Column
    private boolean isAdmin ;
    @Column
    private String number;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Product> products = new ArrayList<>();


    public User() {

    }
    public User(String name, String email, String password, boolean isAdmin, String number) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.number = number;
    }

    public User(int id, String name, String email, String password, boolean isAdmin, String number) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.isAdmin = isAdmin;
        this.number = number;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void setAdmin(boolean admin) {
        isAdmin = admin;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && isAdmin == user.isAdmin && Objects.equals(name, user.name) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(number, user.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email, password, isAdmin, number);
    }


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", isAdmin=" + isAdmin +
                ", number='" + number + '\'' +
                '}';
    }
}
