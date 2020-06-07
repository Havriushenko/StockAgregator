package com.test_project.havriushenko.stockAgregator.model;

import javax.persistence.*;

@Entity
public class HistoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    private int id_company;
    @Column(name = "field_name", length = 200)
    private String fieldName;
    @Column(name = "last_change", length = 500)
    private String lastChange;
    @Column(name = "new_change", length = 500)
    private String newChange;
}
