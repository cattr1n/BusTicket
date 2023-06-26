package com.cattr1ne.myapplication29;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import ticket.BusTicket;
import ticket.BusTicketChild;
import ticket.BusTicketPensioner;

public class MainActivity extends AppCompatActivity {

    private void fillCart() {
        // добавляем взрослые билеты
        for (int i = 0; i < 9; i++) {
            BusTicket ticket = new BusTicket("Горно-Алтайск", "Артыбаш", "1 июня 7:00", "4 часа 30 минут",
                    157, 70);
        }
        // добавляем детские билеты
        for (int i = 0; i < 11; i++) {
            BusTicket ticket = new BusTicketChild("Горно-Алтайск", "Артыбаш", "1 июня 7:00", "4 часа 30 минут",
                    157, 70);
        }
        // добавляем пенсионерские билеты
        for (int i = 0; i < 5; i++) {
            BusTicket ticket = new BusTicketPensioner("Горно-Алтайск", "Артыбаш", "1 июня 7:00", "4 часа 30 минут",
                    157, 70);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fillCart();
        TextView ticketsCostOut = findViewById(R.id.ticketsCostOut);
    }
}