package Controller;

import java.util.List;

import Model.Class.CardPayment;
import Model.Class.Customer;
import Model.Class.Member;
import Model.Class.OnlinePayment;
import Model.Class.Payment;
import Model.Class.Reservation;
import Model.Class.Room;
import Model.Enum.CustomerType;
import Model.Enum.RoomStatus;
import Model.Enum.RoomType;

public class Controller {

    public static List<Customer> listCustomers;
    public static List<Room> listRoom;
    public static List<Reservation> listReservations;
    public static List<Payment> listPayments;
    
    public void createDummy() {

        listCustomers.add(new Customer(001, "AAA", "aaa@gmail.com", "Company A"));
        listCustomers.add(new Customer(002, "BBB", "bbb@gmail.com", "Company A"));
        listCustomers.add(new Customer(003, "CCC", "ccc@gmail.com", "Company A"));
        listCustomers.add(new Customer(004, "DDD", "ddd@gmail.com", "Company A"));
        listCustomers.add(new Customer(005, "EEE", "eee@gmail.com", "Company A"));

        listCustomers.add(new Member(006, "FFF", "fff@gmail.com", "Company A", 1000000, CustomerType.REG));
        listCustomers.add(new Member(007, "GGG", "ggg@gmail.com", "Company A", 1000000, CustomerType.REG));
        listCustomers.add(new Member(010, "HHH", "hhh@gmail.com", "Company A", 1000000, CustomerType.REG));
        listCustomers.add(new Member(011, "III", "iii@gmail.com", "Company A", 1000000, CustomerType.VIP));
        listCustomers.add(new Member(012, "JJJ", "jjj@gmail.com", "Company A", 1000000, CustomerType.VIP));
        
        listRoom.add(new Room(101, 1, 1000000, 4, RoomStatus.EMPTY, RoomType.BASIC));
        listRoom.add(new Room(102, 1, 1000000, 4, RoomStatus.EMPTY, RoomType.BASIC));
        listRoom.add(new Room(103, 1, 1000000, 4, RoomStatus.EMPTY, RoomType.BASIC));

        listRoom.add(new Room(201, 2, 1250000, 6, RoomStatus.EMPTY, RoomType.SUITE));
        listRoom.add(new Room(202, 2, 1250000, 6, RoomStatus.EMPTY, RoomType.SUITE));
        listRoom.add(new Room(203, 2, 1250000, 6, RoomStatus.EMPTY, RoomType.SUITE));
        
        listRoom.add(new Room(301, 3, 2350000, 10, RoomStatus.EMPTY, RoomType.DELUXE));
        listRoom.add(new Room(302, 3, 2350000, 10, RoomStatus.EMPTY, RoomType.DELUXE));
        listRoom.add(new Room(303, 3, 2350000, 10, RoomStatus.EMPTY, RoomType.DELUXE));

        listRoom.add(new Room(401, 4, 500000, 2, RoomStatus.EMPTY, RoomType.CAPSULE));
        listRoom.add(new Room(402, 4, 500000, 2, RoomStatus.EMPTY, RoomType.CAPSULE));
        listRoom.add(new Room(403, 4, 500000, 2, RoomStatus.EMPTY, RoomType.CAPSULE));

        listReservations.add(new Reservation(00001, 1, listRoom.get(0), listCustomers.get(0)));
        listReservations.add(new Reservation(00002, 2, listRoom.get(2), listCustomers.get(2)));
        listReservations.add(new Reservation(00003, 3, listRoom.get(4), listCustomers.get(4)));
        listReservations.add(new Reservation(00004, 2, listRoom.get(6), listCustomers.get(6)));
        listReservations.add(new Reservation(00005, 1, listRoom.get(10), listCustomers.get(8)));

    }

    public Controller() {

        createDummy();

    }

    public static double processPayment(Reservation reservation, String paymentType) {

        double total = 0;
        double amount = reservation.getStayDay() * reservation.getRoom().getPrice();

        if (reservation.getCustomer() instanceof Member) {
            
            double charge = 1;
            double byBalance = 0;
            double byCard = 0;

            if (paymentType.equalsIgnoreCase("CREDIT CARD")) {
                
                Payment payment = new CardPayment(0, amount, null, "Card_Type", "Card_Number");
                charge = 1.02;

                listPayments.add(payment);

            }
            else {

                Payment payment = new OnlinePayment(0, amount, null, "Bank_Name");

                listPayments.add(payment);

            }

            Member user = (Member) reservation.getCustomer();
            
            if (user.getBalance() < amount) {
                
                user.setBalance(0);
                byCard = amount - user.getBalance();
                byBalance = amount;

            }
            else {

                byBalance = user.getBalance() - amount;
                user.setBalance(byBalance);

            }

            System.out.println("Payment by balance : " + byBalance);
            System.out.println("Payment by Card : " + byCard);
            System.out.println("Charge : " + (byCard + byBalance) * 0.02);

            total = (byCard + byBalance) * charge;

        }
        else {

            

        }

        return total;

    }

}
