package AggregationAndComposition.task5;


import AggregationAndComposition.task5.tour.Tour;

import java.util.List;

//5. Туристические путевки. Сформировать набор предложений клиенту по выбору туристической путевки различного типа
// (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора. Учитывать возможность выбора транспорта,
// питания и числа дней. Реализовать выбор и сортировку путевок.
public class Task5 {
    public static void main(String[] args) {


        ClientBase clientBase =new ClientBase();
        System.out.print(clientBase.chooseClient( "Pitt"));
        System.out.println( Tour.CRUISE);

    }
}
