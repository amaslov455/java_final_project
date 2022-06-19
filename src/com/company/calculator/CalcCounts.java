package com.company.calculator;

public class CalcCounts implements CalcResult {
    private final Integer countOfDocs;
    private final Integer countOrdersDone;
    private final Integer countOrdersCreated;

    public CalcCounts(Integer countOfDocs, Integer countOrdersDone, Integer countOrdersCreated) {
        this.countOfDocs = countOfDocs;
        this.countOrdersDone = countOrdersDone;
        this.countOrdersCreated = countOrdersCreated;
    }

    public Integer getCountOfDocs() {
        return countOfDocs;
    }

    public Integer getCountOrdersDone() {
        return countOrdersDone;
    }

    public Integer getCountOrdersCreated() {
        return countOrdersCreated;
    }
}
