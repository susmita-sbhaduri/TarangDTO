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
public class CallResultsForEachLayer {
    private List<LastTransactionPrice> outputLastTransationPriceList;
    private String lastCallVersionTwo = "";
    private Double retraceVersionTwo = 0.0;
    private String lastCallVersionOne = "";
    private Double retraceVersionOne = 0.0;

    
    public List<LastTransactionPrice> getOutputLastTransationPriceList() {
        return outputLastTransationPriceList;
    }

    public void setOutputLastTransationPriceList(List<LastTransactionPrice> outputLastTransationPriceList) {
        this.outputLastTransationPriceList = outputLastTransationPriceList;
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
        
    
}
