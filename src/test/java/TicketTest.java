import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketTest {

    @Test
    public void test() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SVX", "SVO", 7000, 10, 13);
        Ticket ticket2 = new Ticket("SVX", "LED", 8000, 13, 17);
        Ticket ticket3 = new Ticket("SVX", "DME", 3000, 8, 11);
        Ticket ticket4 = new Ticket("SVX", "SVO", 6000, 5, 8);
        Ticket ticket5 = new Ticket("SVX", "CEK", 2000, 18, 19);
        Ticket ticket6 = new Ticket("SVX", "AER", 10_000, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Ticket[] actual = manager.search("SVX", "SVO");
        Ticket[] expected = {ticket4, ticket1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SVX", "SVO", 7000, 10, 13);
        Ticket ticket2 = new Ticket("SVX", "LED", 8000, 13, 17);
        Ticket ticket3 = new Ticket("SVX", "DME", 3000, 8, 11);
        Ticket ticket4 = new Ticket("SVX", "SVO", 6000, 5, 8);
        Ticket ticket5 = new Ticket("SVX", "CEK", 2000, 18, 19);
        Ticket ticket6 = new Ticket("SVX", "AER", 10_000, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Ticket[] actual = manager.search("SVO", "SVX");
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test3() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SVX", "SVO", 7000, 10, 13);
        Ticket ticket2 = new Ticket("SVX", "LED", 8000, 13, 17);
        Ticket ticket3 = new Ticket("SVX", "DME", 3000, 8, 11);
        Ticket ticket4 = new Ticket("SVX", "SVO", 6000, 5, 8);
        Ticket ticket5 = new Ticket("SVX", "CEK", 2000, 18, 19);
        Ticket ticket6 = new Ticket("SVX", "AER", 10_000, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);

        Ticket[] actual = manager.search("SVX", "LED");
        Ticket[] expected = {ticket2};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test4() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SVX", "SVO", 7000, 10, 13);
        Ticket ticket2 = new Ticket("SVX", "LED", 8000, 13, 17);
        Ticket ticket3 = new Ticket("SVX", "DME", 3000, 8, 11);
        Ticket ticket4 = new Ticket("SVX", "SVO", 6000, 5, 8);
        Ticket ticket5 = new Ticket("SVX", "CEK", 2000, 18, 19);
        Ticket ticket6 = new Ticket("SVX", "AER", 10_000, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("SVX", "SVO", comparator);
        Ticket[] expected = {ticket1, ticket4};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test5() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SVX", "SVO", 7000, 10, 13);
        Ticket ticket2 = new Ticket("SVX", "LED", 8000, 13, 17);
        Ticket ticket3 = new Ticket("SVX", "DME", 3000, 8, 11);
        Ticket ticket4 = new Ticket("SVX", "SVO", 6000, 5, 8);
        Ticket ticket5 = new Ticket("SVX", "CEK", 2000, 18, 19);
        Ticket ticket6 = new Ticket("SVX", "AER", 10_000, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("SVX", "AER", comparator);
        Ticket[] expected = {ticket6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test6() {

        AviaSouls manager = new AviaSouls();
        Ticket ticket1 = new Ticket("SVX", "SVO", 7000, 10, 13);
        Ticket ticket2 = new Ticket("SVX", "LED", 8000, 13, 17);
        Ticket ticket3 = new Ticket("SVX", "DME", 3000, 8, 11);
        Ticket ticket4 = new Ticket("SVX", "SVO", 6000, 5, 8);
        Ticket ticket5 = new Ticket("SVX", "CEK", 2000, 18, 19);
        Ticket ticket6 = new Ticket("SVX", "AER", 10_000, 9, 13);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);
        manager.add(ticket6);
        TicketTimeComparator comparator = new TicketTimeComparator();

        Ticket[] actual = manager.searchAndSortBy("SVX", "ANT", comparator);
        Ticket[] expected = {};

        Assertions.assertArrayEquals(expected, actual);
    }
}

