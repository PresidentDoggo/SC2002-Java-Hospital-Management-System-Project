package Entity;

import java.sql.Date;
import Enum.Frequency;

public class Prescription implements Serializable{
    private Date startDate;
    private Date endDate;
    private Frequency frequency;
    private String note;
    private String medicineName;
    private boolean dispensed;

    public Prescription(Date startDate, Date endDate, Frequency frequency, String note, String medicineName, boolean dispensed) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.frequency = frequency;
        this.note = note;
        this.medicineName = medicineName;
        this.dispensed = dispensed;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicine(String medicineName) {
        this.medicineName = medicineName;
    }

    public boolean isDispensed() {
        return dispensed;
    }

    public void setDispensed(boolean dispensed) {
        this.dispensed = dispensed;
    }
}
