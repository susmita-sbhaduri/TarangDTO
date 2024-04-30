/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bhaduri.tarangdto;

import java.util.List;

/**
 *
 * @author bhaduri
 */
public class CallResultsInermediate {
    
    private String lastCallVersionOne;
    private String lastCallVersionTwo;
    private Double retraceVersionOne;
    private Double retraceVersionTwo;
    private List<LastTransactionPrice> intermediateLTPList;

    public CallResultsInermediate(String lastCallVersionOne, String lastCallVersionTwo, Double retraceVersionOne, Double retraceVersionTwo, List<LastTransactionPrice> intermediateLTPList) {
        this.lastCallVersionOne = lastCallVersionOne;
        this.lastCallVersionTwo = lastCallVersionTwo;
        this.retraceVersionOne = retraceVersionOne;
        this.retraceVersionTwo = retraceVersionTwo;
        this.intermediateLTPList = intermediateLTPList;
    }



    public CallResultsInermediate(List<LastTransactionPrice> intermediateLTPList) {
        this.intermediateLTPList = intermediateLTPList;
        this.lastCallVersionOne = "";
        this.retraceVersionOne = 0.0;
        this.lastCallVersionTwo = "";
        this.retraceVersionTwo = 0.0;
    }
    

    public List<LastTransactionPrice> getIntermediateLTPList() {
        return intermediateLTPList;
    }

    public void setIntermediateLTPList(List<LastTransactionPrice> intermediateLTPList) {
        this.intermediateLTPList = intermediateLTPList;
    }

    public String getLastCallVersionOne() {
        return lastCallVersionOne;
    }

    public void setLastCallVersionOne(String lastCallVersionOne) {
        this.lastCallVersionOne = lastCallVersionOne;
    }

    public Double getRetraceVersionOne() {
        return retraceVersionOne;
    }

    public void setRetraceVersionOne(Double retraceVersionOne) {
        this.retraceVersionOne = retraceVersionOne;
    }

    public String getLastCallVersionTwo() {
        return lastCallVersionTwo;
    }

    public void setLastCallVersionTwo(String lastCallVersionTwo) {
        this.lastCallVersionTwo = lastCallVersionTwo;
    }

    public Double getRetraceVersionTwo() {
        return retraceVersionTwo;
    }

    public void setRetraceVersionTwo(Double retraceVersionTwo) {
        this.retraceVersionTwo = retraceVersionTwo;
    }

    
}
