/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.bhaduri.tarangdto;

/**
 *
 * @author bhaduri
 */
public class LastTransactionPrice {
    int index;
    Double lastTransactionPrice;

    public LastTransactionPrice(int index, Double lastTransactionPrice) {
        this.index = index;
        this.lastTransactionPrice = lastTransactionPrice;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Double getLastTransactionPrice() {
        return lastTransactionPrice;
    }

    public void setLastTransactionPrice(Double lastTransactionPrice) {
        this.lastTransactionPrice = lastTransactionPrice;
    }
    
    
    
}
