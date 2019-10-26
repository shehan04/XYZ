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
public class BanquetHall {
    private int Id;
    private String Name;
    private int MaxGuest;
    private String Menu01;
    private String Menu02;
    private String Menu03;
    private Hotel Hotel;

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
     * @return the Name
     */
    public String getName() {
        return Name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * @return the MaxGuest
     */
    public int getMaxGuest() {
        return MaxGuest;
    }

    /**
     * @param MaxGuest the MaxGuest to set
     */
    public void setMaxGuest(int MaxGuest) {
        this.MaxGuest = MaxGuest;
    }

    /**
     * @return the Menu01
     */
    public String getMenu01() {
        return Menu01;
    }

    /**
     * @param Menu01 the Menu01 to set
     */
    public void setMenu01(String Menu01) {
        this.Menu01 = Menu01;
    }

    /**
     * @return the Menu02
     */
    public String getMenu02() {
        return Menu02;
    }

    /**
     * @param Menu02 the Menu02 to set
     */
    public void setMenu02(String Menu02) {
        this.Menu02 = Menu02;
    }

    /**
     * @return the Menu03
     */
    public String getMenu03() {
        return Menu03;
    }

    /**
     * @param Menu03 the Menu03 to set
     */
    public void setMenu03(String Menu03) {
        this.Menu03 = Menu03;
    }

    /**
     * @return the Hotel
     */
    public Hotel getHotel() {
        return Hotel;
    }

    /**
     * @param Hotel the Hotel to set
     */
    public void setHotel(Hotel Hotel) {
        this.Hotel = Hotel;
    }
}
