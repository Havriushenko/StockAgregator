package com.test_project.havriushenko.stockAgregator.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "history")
public class HistoryModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "id_company")
    private int idCompany;
    @Column(name = "field_name", length = 200)
    private String fieldName;
    @Column(name = "last_change", length = 500)
    private String lastChange;
    @Column(name = "new_change", length = 500)
    private String newChange;
}
