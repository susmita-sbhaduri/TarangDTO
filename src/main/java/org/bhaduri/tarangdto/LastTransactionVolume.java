/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bhaduri.tarangdto;

/**
 *
 * @author sb
 */
public class LastTransactionVolume {
    int index;
    int lastTransactionVolume;

    public LastTransactionVolume(int index, int lastTransactionVolume) {
        this.index = index;
        this.lastTransactionVolume = lastTransactionVolume;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public int getLastTransactionVolume() {
        return lastTransactionVolume;
    }

    public void setLastTransactionVolume(int lastTransactionVolume) {
        this.lastTransactionVolume = lastTransactionVolume;
    }
    
}
