package com.train;

import java.util.Scanner;

public class Tester {
    private static int ticket;
    private static int roundticket;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while(ticket == 0){
            System.out.println("Please enter number of tickets: ");
            ticket = scanner.nextInt();
            if (ticket >= 0){
                break;
            }
        }
        while(roundticket == 0){
            System.out.println("How many round-trip tickets: ");
            roundticket = scanner.nextInt();
            if(roundticket > ticket){
                roundticket = 0;
            }
        }
        Ticket money = new Ticket(ticket, roundticket);
        money.print();
    }
}
