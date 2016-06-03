package org.airline.reservations;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ FlightTest.class, PassengersTest.class, SeatTest.class, TicketsTest.class, DatabaseTest.class })
public class ReservationsTestSuites {

}
