public class BonusMilesService {

    public int calculate(int ticketPrice) {
        int milesPerUnit = 20;  // допустим, за каждые 20 рублей дают 1 милю
        return ticketPrice / milesPerUnit;
    }

    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int ticketPrice = 10000;  // пример цены билета
        int miles = service.calculate(ticketPrice);
        System.out.println("Количество миль: " + miles);
    }
}
