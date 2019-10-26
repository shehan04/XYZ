/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package das_xyz;

import das_xyz.Entities.BanquetHall;
import das_xyz.Entities.Hotel;
import das_xyz.Entities.Reservation;
import static java.lang.Integer.parseInt;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Randeer Silva
 */
public class DAS_XYZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {

        List<Reservation> reservationsList = new ArrayList();
        List<BanquetHall> banquetHallList = new ArrayList();
        String hotelName = null;
        Date reservationDate = null;
        int maxGuest = 0;
        Boolean found = false;

        // TODO code application logic here
        Hotel hotel = new Hotel();
        hotel.setId(1);
        hotel.setHotelName("Hikka Tranz");
        hotel.setLocation("Hikkaduwa");

        BanquetHall hall01 = new BanquetHall();
        hall01.setId(1);
        hall01.setHotel(hotel);
        hall01.setName("Hall01");
        hall01.setMaxGuest(200);
        hall01.setMenu01("Grand");
        hall01.setMenu02("Medium");
        hall01.setMenu03("Normal");

        BanquetHall hall02 = new BanquetHall();
        hall02.setId(2);
        hall02.setHotel(hotel);
        hall02.setName("Hall02");
        hall02.setMaxGuest(230);
        hall02.setMenu01("Grand");
        hall02.setMenu02("Medium");
        hall02.setMenu03("Normal");

        BanquetHall hall03 = new BanquetHall();
        hall03.setId(3);
        hall03.setHotel(hotel);
        hall03.setName("Hall03");
        hall03.setMaxGuest(100);
        hall03.setMenu01("Grand");
        hall03.setMenu02("Medium");
        hall03.setMenu03("Normal");

        //Create Banquest Hall List
        banquetHallList.add(hall01);
        banquetHallList.add(hall02);
        banquetHallList.add(hall03);

        //Create Reservation
        DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Reservation reservation1 = new Reservation();
        reservation1.setId(1);
        reservation1.setHall(hall03);
        reservation1.setCustomerId(1);
        reservation1.setReservationDate(format.parse("26/10/2019"));
        reservation1.setStatus("Pending");

        Reservation reservation2 = new Reservation();
        reservation2.setId(1);
        reservation2.setHall(hall02);
        reservation2.setCustomerId(1);
        reservation2.setReservationDate(format.parse("26/08/2019"));
        reservation2.setStatus("Confirmed");

        Reservation reservation3 = new Reservation();
        reservation3.setId(1);
        reservation3.setHall(hall01);
        reservation3.setCustomerId(1);
        reservation3.setReservationDate(format.parse("26/07/2019"));
        reservation3.setStatus("Pending");

        reservationsList.add(reservation3);
        reservationsList.add(reservation2);
        reservationsList.add(reservation1);

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter Hotel Name : ");
        hotelName = myObj.nextLine();  // Read user input
        System.out.println("Enter Number of Guests : ");
        maxGuest = parseInt(myObj.nextLine());
        System.out.println("Enter Reservation Date : ");
        reservationDate = format.parse(myObj.nextLine());

        for (Reservation res : reservationsList) {
            if (res.getReservationDate().equals(reservationDate)
                    && res.getHall().getHotel().getHotelName().equals(hotelName)
                    && res.getHall().getMaxGuest() <= maxGuest) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("Soory We don't have any Reservation hall to fullfill your requirment");
        } else {
            System.out.println("Available Reservation Halls");
            System.out.println("----------------------------");
            for (BanquetHall banquestHall : banquetHallList) {
                System.out.println("Hotel Name : " + banquestHall.getHotel().getHotelName()
                        + " Banquet Hall Name : " + banquestHall.getName()
                        + " Maximum number of Guests : " + banquestHall.getMaxGuest()
                );
            }
        }

    }

}
