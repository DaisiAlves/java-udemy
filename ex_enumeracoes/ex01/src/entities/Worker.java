package entities;

import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

    private String name;
    private WorkerLevel level;
    private Double baseSalary;


    private Department department;//A classe work está associada a um departamento
    private List <HourContract> contracts; // E está associada a vários contratos, que deve ser representado como ums lista
}
