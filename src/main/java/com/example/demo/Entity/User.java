package com.example.demo.Entity;


import javax.persistence.*;

@Entity
@Table(name = "Company")
public class User {

    @Column(name = "user_id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;

    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int  getId() {
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
}

//@Entity
//@Table(name = "product_ratings", schema = "product")
//public class Rating {
//    @Id
//    @GeneratedValue
//    @Column(name="rating_id")
//    private Long ratingId;
//    private double rating;
//    @Column(name="product_id")
//    private String productId;
//    @Column(name="user_id")
//    private String userId;
//    public Rating() {
//    }
//    public Rating(Long ratingId, double rating, String productId, String userId) {
//        super();
//        this.ratingId = ratingId;
//        this.rating = rating;
//        this.productId = productId;
//        this.userId = userId;
//    }
//    //getters, setters, toString, hashCode, equals
//}
