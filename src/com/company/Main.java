package com.company;

import java.util.Scanner;

import static java.lang.System.out;
import static java.lang.System.setOut;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dayOfTheWeek = scanner.nextLine();
        switch (dayOfTheWeek){
            case "MONDAY":
            case "Дуйшомбу":
                out.println(" Kyny JAVA okuym");
                break;
            case "TUESDAY":
            case "Шейшемби":
                out.println("Куну англис тил сабагын окуйм");
                break;
            case "WEDNESDAY":
            case "Шаршемби":
                out.println("Куну кыргыз тил сабагын окуйм");
                break;
            case "THURSDAY":
            case "Бейшемби":
                out.println("Куну дене тарбия сабагы болот");
                break;
            case "FRIDAY":
            case "Жума":
                out.println("Куну жума намазга барам");
                break;
            case "SATURDAY":
            case "Ишемби":
                out.println("Куну музыка сабагын окуйм");
                break;
            case "SUNDAY":
            case "Жекшемби":
                out.println("Куну дем алыш");
                break;
        }
        DayOfTheWeek dayOfTheWeek1 = DayOfTheWeek.valueOf(scanner.nextLine());
        switch (dayOfTheWeek1){
            case MONDAY -> out.println("Дуйшомбу куну Жава сабагын окуйм");
            case TUESDAY -> out.println("Шейшемби куну англис тил сабагын окуйм");
            case WEDNESDAY -> out.println("Шаршемби куну кыргыз тил сабагын окуйм");
            case THURSDAY -> out.println("Бейшемби куну дене тарбия сабагы болот");
            case FRIDAY -> out.println("Жума куну жума намазга барам");
            case SATURDAY -> out.println("Ишемби куну музыка сабагын окуйм ");
            case SUNDAY -> out.println("Жекшкмби куну дем алыш ");
        }
    }
}
