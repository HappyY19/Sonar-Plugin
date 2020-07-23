package com.checkmarx.sonar.cxportalservice.osa.model;

/**
 * Created by tsahib on 9/27/2016.
 */
public enum ScanStatus {
    NOTSTARTED(0), INPROGRESS(1), FINISHED(2), FAILED(3);

    private int value;

    private ScanStatus(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public static ScanStatus fromId(int id){
        for (ScanStatus type : ScanStatus.values()) {
            if (type.getValue() == id) {
                return type;
            }
        }
        return null;
    }
}
