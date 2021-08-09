package com.company;

public  class 找钱 {
    public static class Main {

        public static class VendingMachine<VendingMachinestatic> {
            private static String[] args;
            int prince;
            int balance;
            int total;

            void showPrompt() {
                System.out.println("Welcome");
            }

            void insterMomey(int amount) {
                balance = balance + amount;
            }

            void showBalance() {
                System.out.println(balance);
            }

            void getFood() {
                if (balance >= prince) {
                    System.out.println("Here you are.");
                }
                balance = balance - prince;
                total = total + prince;
            }
        }

            /**
             * @param args
             */
            public static void main(String[] args) {
                VendingMachine.args = args;
                com.company.找钱.Main.VendingMachine vm = new com.company.找钱.Main.VendingMachine();
                vm.showPrompt();
                vm.showBalance();
                vm.getFood();
                vm.showBalance();
                com.company.找钱.Main.VendingMachine vm1 = new com.company.找钱.Main.VendingMachine();
                vm1.insterMomey(1000);
                vm1.showBalance();
            }


        }
    }



