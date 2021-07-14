package com.week01_hwk.model;



import com.week01_hwk.PersonRequestDto.PersonRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Getter
@NoArgsConstructor
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO )
    private Long Id;
    @Column(nullable = false)
    private String Name;
    @Column(nullable = false)
    private String Job;
    @Column(nullable = false)
    private String Address;
    @Column(nullable = false)
    private int age;

    public Person(PersonRequestDto requestDto){
        this.age= requestDto.getAge();
        this.Name=requestDto.getName();
        this.Address=requestDto.getAddress();
        this.Job= requestDto.getJob();
    }



    public void update(PersonRequestDto requestDto){
        this.Address=requestDto.getAddress();
        this.Job=requestDto.getJob();
        this.Name= requestDto.getName();
        this.age= requestDto.getAge();
    }



}
