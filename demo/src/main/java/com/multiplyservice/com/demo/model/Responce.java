package com.multiplyservice.com.demo.model;


import javax.persistence.*;
@Entity
@Table(name="Responce")
public class Responce {
    @Id
    @Column(name="id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private int value;

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

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Responce{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", value=" + value +
                '}';
    }
}
