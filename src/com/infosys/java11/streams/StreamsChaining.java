package com.infosys.java11.streams;


import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class StreamsChaining {
    public Integer transactionId;
    public LocalDateTime time;
    public String type;
    public String remarks;
    public Double amount;

    public StreamsChaining (Integer transactionId, LocalDateTime time, String type, String remarks, Double amount){
        this.transactionId = transactionId;
        this.time = time;
        this.type = type;
        this.remarks = remarks;
        this.amount = amount;
    }

}

class ProcessingStreams {
    public static void main(String[] args) {
        List<StreamsChaining> transactionList = Arrays.asList(
                new StreamsChaining(1001, LocalDateTime.of(2022, 10, 24, 4, 50), "DR", "Paid phone bill", 533.0),
                new StreamsChaining(1002, LocalDateTime.of(2022, 10, 25, 5, 55), "DR", "Paid internet bill", 800.0),
                new StreamsChaining(1003, LocalDateTime.of(2022, 10, 26, 6, 59), "CR", "From bank account", 12000.0),
                new StreamsChaining(1004, LocalDateTime.of(2022, 10, 27, 7, 05), "DR", "Paid electricity bill", 672.0),
                new StreamsChaining(1005, LocalDateTime.of(2022, 10, 28, 8, 10), "CR", "From Jim", 15000.0),
                new StreamsChaining(1006, LocalDateTime.of(2022, 10, 29, 9, 15), "DR", "To bank account", 1500.0)
        );
        transactionAbove10k(transactionList);
    }

    public static void transactionAbove10k(List<StreamsChaining> transactionList){
        System.out.println("Transaction above 10000: ");

        //You can change the arguments of the stream operations here, and see how the results yield!
        transactionList.stream()
                .filter(streams -> {System.out.println("filtering: " + streams.transactionId);
                    return streams.amount > 10000;})
                .map(streams -> {System.out.println("Mapping: " + streams.transactionId);
                    return streams.transactionId;})
                .sorted((x, y) -> {System.out.println();
                    return x - y;})
                .forEach(id -> System.out.println(id));

    }
}
