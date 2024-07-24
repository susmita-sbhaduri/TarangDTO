/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bhaduri.tarangdto;

import java.util.Date;
import java.util.List;

/**
 *
 * @author bhaduri
 */
public class CallResultsIntermediate extends CallResults{
    

    private List<LastTransactionPrice> intermediateLTPList;

    public CallResultsIntermediate(List<LastTransactionPrice> intermediateLTPList, String scripId, String callVersionOne, String callVersionTwo, Double retraceVersionOne, Double retraceVersionTwo, Date callGenerationTimeStamp,Double callGenerationPrice) {
        super(scripId, callVersionOne, callVersionTwo, retraceVersionOne, retraceVersionTwo, callGenerationTimeStamp,callGenerationPrice);
        this.intermediateLTPList = intermediateLTPList;
    }

    public CallResultsIntermediate(String scripId, List<LastTransactionPrice> intermediateLTPList, Date callGenerationTimeStamp, Double callGenerationPrice) {
        super(scripId,"", "", 0.0, 0.0, callGenerationTimeStamp, callGenerationPrice);
        this.intermediateLTPList = intermediateLTPList;
    }

    public List<LastTransactionPrice> getIntermediateLTPList() {
        return intermediateLTPList;
    }

    public void setIntermediateLTPList(List<LastTransactionPrice> intermediateLTPList) {
        this.intermediateLTPList = intermediateLTPList;
    }

    
}
