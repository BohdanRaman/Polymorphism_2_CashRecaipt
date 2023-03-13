package main;
/**
 * Implement system, that can creates different cash receipts:
 * regular cash receipt with list of items, sum, date of order, name of cashter,
 * regular cash receipt with discount, cancelled  cash receipt.
 * It depends on user: what type of cash receipt he needs, data for items should not be hardcoded
 * and cost of cash receipt/discount should be calculated automatically when user needs. Discount value should be configurable
 */


import receipt.RegularCashReceipt;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("================ Меню  =============");
                System.out.println("=== for create regular cash receipt press 1 ===");
                System.out.println("=== for create discount cash receipt press 2 ===");
                System.out.println("=== for create cancelled cash receipt press 3 ===");
                System.out.println("=== for exit press 0 ===");

                System.out.print("->  ");
                int inputNumber = Integer.parseInt(scanner.nextLine());

                if (inputNumber == 1) {
                    getRegularCashReceipt();
                }
                if (inputNumber == 2) {
                    getDiscountCashReceipt();
                }
                if (inputNumber == 3) {
                    getCancelledCashReceipt();
                }
                if (inputNumber == 0) {
                    return;
                }

            } catch (Exception e) {
                System.out.println("press correct number");
            }
        }
    }

    public static void getRegularCashReceipt() {
        ArrayList<RegularCashReceipt> receiptArrayList = new ArrayList<>();
        //   RegularCashReceipt regularCashReceipt = new RegularCashReceipt();

    }

    public static void getDiscountCashReceipt() {

    }

    public static void getCancelledCashReceipt() {

    }
}
