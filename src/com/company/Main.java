package com.company;

import com.company.calculator.CalcCounts;
import com.company.calculator.CountCalculator;
import com.company.calculator.StatisticCalculator;
import com.company.grabber.DataGrabber;
import com.company.grabber.FileDataGrabber;
import com.company.model.Document;
import com.company.sender.DataSender;
import com.company.sender.DbDataSender;
import com.company.sender.SenderResult;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        DataGrabber source = new FileDataGrabber();
        List<Document> documentList = source.fetchData();

        StatisticCalculator calculator = new CountCalculator();
        CalcCounts calcResult = calculator.calculateStat(documentList);

        DataSender dataSender = new DbDataSender();
        SenderResult result = dataSender.sendResult(calcResult);
    }
}