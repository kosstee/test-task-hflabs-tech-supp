import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> addresses = List.of(
                "140002 ЛЮБЕРЦЫ 2 ОКТЯБРЬСКИЙ ПР 123/4", //must be deleted
                "143095 ГОЛИЦЫНО 2 ПАРКОВАЯ 7",
                "123459 МОСКВА 1 МОЛОСТОВЫХ 19",
                "143090 Голицыно-2 0 Парковая 10", //must be deleted
                "123456 МОСКВА 6 2-ой Хорошевский проезд 16", //must be deleted
                "603022 нижний новгород 2 2-я Оранжерейная улица дом 2 кв 1", //must be deleted
                "344065 Ростов-на-Дону 5 5-й Каретный пер. 5 корп. 5 кв. 5", //must be deleted
                "603021 нижний новгород 2 2-я Оранжерейная улица дом 2 кв 1",
                "344064 Ростов-на-Дону 5 5-й Каретный пер. 5 корп. 5 кв. 5",
                "123456 МОСКВА 2 2-ой Хорошевский проезд 16");

        addresses.stream()
                .map(address -> address.replaceAll("^(?<index>\\d{5})(?<endofindex>\\d)(?<city>\\s\\S+\\s?\\S+\\s)(?<digit>\\2) (?<address>.*)$", "$1$2$3$5" + " deleted"))
                .forEach(System.out::println);
    }
}