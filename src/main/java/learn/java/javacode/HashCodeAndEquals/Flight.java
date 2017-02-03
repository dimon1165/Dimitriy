package learn.java.javacode.HashCodeAndEquals;

/**
 * Created by dvorop on 03.02.2017.
 */
public class Flight {
    private int seats = 150;
    private int passengers;
    private int flightNumber;
    private char flightClass;

    public Flight(int seats) {
        this.seats = seats;
    }

    @Override
    public boolean equals(Object o){
         Flight other = (Flight) o;
         return flightNumber == other.flightNumber &&
                 flightClass == other.flightClass;
    }

    public void add1Passenger(){
        if (hasSeating()){
            passengers += 1;
        }
            else{
                handleToMany();
            }
        }

    private void handleToMany() {
//        some code
    }

    public boolean hasSeating(){
        return passengers < seats;
    }
}
