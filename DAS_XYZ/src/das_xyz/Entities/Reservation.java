/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_xyz.Entities;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Randeer Silva
 */
public class Reservation {
    private  int Id ;
    private int CustomerId;
    private BanquetHall Hall;
    private Date ReservationDate ;
    private String Status;

    /**
     * @return the Id
     */
    public int getId() {
        return Id;
    }

    /**
     * @param Id the Id to set
     */
    public void setId(int Id) {
        this.Id = Id;
    }

    /**
     * @return the CustomerId
     */
    public int getCustomerId() {
        return CustomerId;
    }

    /**
     * @param CustomerId the CustomerId to set
     */
    public void setCustomerId(int CustomerId) {
        this.CustomerId = CustomerId;
    }

    /**
     * @return the Hall
     */
    public BanquetHall getHall() {
        return Hall;
    }

    /**
     * @param Hall the Hall to set
     */
    public void setHall(BanquetHall Hall) {
        this.Hall = Hall;
    }

    /**
     * @return the ReservationDate
     */
    public Date getReservationDate() {
        return ReservationDate;
    }

    /**
     * @param ReservationDate the ReservationDate to set
     */
    public void setReservationDate(Date ReservationDate) {
        this.ReservationDate = ReservationDate;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }

    /**
     * @param Status the Status to set
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }
    
    
    
    
}
