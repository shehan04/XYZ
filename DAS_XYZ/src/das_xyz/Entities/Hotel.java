/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_xyz.Entities;

/**
 *
 * @author Randeer Silva
 */
public class Hotel {
    private int Id ;
    private String HotelName;
    private String Location;

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
     * @return the HotelName
     */
    public String getHotelName() {
        return HotelName;
    }

    /**
     * @param HotelName the HotelName to set
     */
    public void setHotelName(String HotelName) {
        this.HotelName = HotelName;
    }

    /**
     * @return the Location
     */
    public String getLocation() {
        return Location;
    }

    /**
     * @param Location the Location to set
     */
    public void setLocation(String Location) {
        this.Location = Location;
    }
    
    
    
    
    
}
