/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bhaduri.tarangdto;

import java.util.Date;

/**
 *
 * @author bhaduri
 */
public class CallResults {
    private String callVersionOne;
    private String callVersionTwo;
    private Double retraceVersionOne;
    private Double retraceVersionTwo;
    private Date callGenerationTimeStamp;

    public CallResults(String callVersionOne, String callVersionTwo, Double retraceVersionOne, Double retraceVersionTwo, Date callGenerationTimeStamp) {
        this.callVersionOne = callVersionOne;
        this.callVersionTwo = callVersionTwo;
        this.retraceVersionOne = retraceVersionOne;
        this.retraceVersionTwo = retraceVersionTwo;
        this.callGenerationTimeStamp = callGenerationTimeStamp;
    }

    public String getCallVersionOne() {
        return callVersionOne;
    }

    public void setCallVersionOne(String callVersionOne) {
        this.callVersionOne = callVersionOne;
    }

    public String getCallVersionTwo() {
        return callVersionTwo;
    }

    public void setCallVersionTwo(String callVersionTwo) {
        this.callVersionTwo = callVersionTwo;
    }

    public Double getRetraceVersionOne() {
        return retraceVersionOne;
    }

    public void setRetraceVersionOne(Double retraceVersionOne) {
        this.retraceVersionOne = retraceVersionOne;
    }

    public Double getRetraceVersionTwo() {
        return retraceVersionTwo;
    }

    public void setRetraceVersionTwo(Double retraceVersionTwo) {
        this.retraceVersionTwo = retraceVersionTwo;
    }

    public Date getCallGenerationTimeStamp() {
        return callGenerationTimeStamp;
    }

    public void setCallGenerationTimeStamp(Date callGenerationTimeStamp) {
        this.callGenerationTimeStamp = callGenerationTimeStamp;
    }
    
}
