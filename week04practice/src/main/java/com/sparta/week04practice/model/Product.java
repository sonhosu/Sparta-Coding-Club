package com.sparta.week04practice.model;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor
public class Product extends Timestamped {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;

    @Column(nullable = false)
    private  String title;

    @Column(nullable = false)
    private String image;

    @Column(nullable = false)
    private int lprice;

    @Column(nullable = false)
    private int myprice;

    @Column(nullable = false)
    private String link;


    public Product(ProductRequestDto requestDto){
        this.title=requestDto.getTitle();
        this.image=requestDto.getImages();
        this.lprice=requestDto.getLprice();
        this.link=requestDto.getLink();
        this.myprice=0;
    }

}
