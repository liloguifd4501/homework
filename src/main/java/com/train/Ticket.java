package com.train;

public class Ticket {
    int ticket;
    int roundticket;
    public Ticket(int ticket,int roundticket){
        this.ticket = ticket;
        this.roundticket = roundticket;
    }
    public void print(){
        System.out.println("Total tickets:"+ticket);
        System.out.println("Round-trip:"+roundticket);
        int total = (int)((ticket-roundticket)*1000 + roundticket*2000*0.9);
        System.out.println("Total:"+ total);

    }
}
