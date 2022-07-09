package com.firat.bean;

import lombok.Getter;
import lombok.Setter;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named(value = "cdiBean")
@RequestScoped
@ApplicationScoped
@Setter
@Getter
public class JsfBean {
    private String patika;

    public JsfBean(String patika) {
        this.patika = "Spring Boot Eğitimine Hoşgeldiniz";
    }

}
