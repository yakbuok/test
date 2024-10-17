import java.util.ArrayList;
import java.util.Scanner;

   public class Dealer {
        private String name;

        public Dealer(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void dealerMenu() {
            Scanner scanner = new Scanner(System.in);
            String choice;

            do {
                System.out.println("Dealer Menu for " + name);
                System.out.println("1. View Dealer Info");
                System.out.println("2. Create new dealer");
                System.out.println("O. Exit Dealer");
                System.out.print("Choose an option: ");
                choice = scanner.nextLine();

                switch (choice) {
                    case "1":
                        System.out.println("Dealer Name: " + name);
                        break;
                    case "2":
                        System.out.println("Performing action for " + name);
                        // Add more actions as needed
                        break;
                    case "O":
                        System.out.println("Exiting to Main Menu...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } while (!choice.equals("O"));
        }


        static class Dealers {
            private ArrayList<Dealer> dealerList = new ArrayList<>();

            public void dealersMenu() {
                Scanner scanner = new Scanner(System.in);
                String choice;

                do {
                    System.out.println("Dealers Menu");
                    System.out.println("1. View Existing Dealers");
                    System.out.println("2. Create New Dealer");
                    System.out.println("O. Exit");
                    System.out.print("Choose an option: ");
                    choice = scanner.nextLine();

                    switch (choice) {
                        case "1":
                            viewExistingDealers();
                            break;
                        case "2":
                            createNewDealer();
                            break;
                        case "O":
                            System.out.println("Exiting...");
                            break;
                        default:
                            System.out.println("Invalid choice. Please try again.");
                    }
                } while (!choice.equals("O"));
            }

            private void viewExistingDealers() {
                if (dealerList.isEmpty()) {
                    System.out.println("No dealers available.");
                    return;
                }

                Scanner scanner = new Scanner(System.in);
                for (int i = 0; i < dealerList.size(); i++) {
                    System.out.println((i + 1) + ". " + dealerList.get(i).getName());
                }

                System.out.print("Select a dealer (number) to manage or 0 to go back: ");
                int selection = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (selection > 0 && selection <= dealerList.size()) {
                    dealerList.get(selection - 1).dealerMenu();
                } else {
                    System.out.println("Returning to main menu...");
                }
            }

            private void createNewDealer() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter dealer name: ");
                String name = scanner.nextLine();
                dealerList.add(new Dealer(name));
                System.out.println("Dealer " + name + " created successfully.");
            }

            public static void main(String[] args) {
                Dealers dealers = new Dealers();
                dealers.dealersMenu();
            }
        }
    }