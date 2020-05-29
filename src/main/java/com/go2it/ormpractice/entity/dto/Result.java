package com.go2it.ormpractice.entity.dto;

public class Result {
    private String name;
    private Double sum;// if in DB column has 'null' - need wrapper
    private Long count;

    public Result() {
    }

    public Result(String name, Double sum) {
        this.name = name;
        this.sum = sum;
    }

    public Result(String name, Double sum, Long count) {
        this.name = name;
        this.sum = sum;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSum() {
        return sum;
    }

    public void setSum(Double sum) {
        this.sum = sum;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Result{" +
                "name='" + name + '\'' +
                ", sum=" + sum +
                ", count=" + count +
                '}';
    }
}
