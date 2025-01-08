/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bhaduri.tarangdto;

import java.util.List;

/**
 *
 * @author sb
 */
public class VolumeIntermediate {
    private List<LastTransactionVolume> intermediateVolumeList;
    private int trendFlag;
    
    public VolumeIntermediate(List<LastTransactionVolume> intermediateVolumeList, int trendFlag) {
        this.intermediateVolumeList = intermediateVolumeList;
        this.trendFlag = trendFlag;
    }
    public void setIntermediateVolumeList(List<LastTransactionVolume> intermediateVolumeList) {
        this.intermediateVolumeList = intermediateVolumeList;
    }

    public void setTrendFlag(int trendFlag) {
        this.trendFlag = trendFlag;
    }

    public List<LastTransactionVolume> getIntermediateVolumeList() {
        return intermediateVolumeList;
    }

    public int getTrendFlag() {
        return trendFlag;
    }

    
}
