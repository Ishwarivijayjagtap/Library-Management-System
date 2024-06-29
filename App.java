package com.bookSystem;


import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	BookOperations bookDao = new BookOperations();
        UserDataOperation userDao = new UserDataOperation();
        TransactionOpration transactionDao = new TransactionOpration();
        LibraryService libraryService = new LibraryService(bookDao, userDao, transactionDao);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("Library Management System");
                System.out.println("1. Add Book");
                System.out.println("2. View All Books");
                System.out.println("3. Add User");
                System.out.println("4. View All Users");
                System.out.println("5. Borrow Book");
                System.out.println("6. Return Book");
                System.out.println("7. View All Transactions");
                System.out.println("8. Exit");
                System.out.print("Enter your choice: ");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        System.out.print("Enter book title: ");
                        String title = scanner.nextLine();
                        System.out.print("Enter book author: ");
                        String author = scanner.nextLine();
                        System.out.print("Enter book publisher: ");
                        String publisher = scanner.nextLine();
                        System.out.print("Enter book ISBN: ");
                        String isbn = scanner.nextLine();
                        libraryService.addBook(title, author, publisher, isbn);
                        System.out.println("Book added successfully!");
                        break;
                    case 2:
                        for (Book book : libraryService.getAllBooks()) {
                            System.out.println(book);
                        }
                        break;
                    case 3:
                        System.out.print("Enter user name: ");
                        String name = scanner.nextLine();
                        System.out.print("Enter user email: ");
                        String email = scanner.nextLine();
                        libraryService.addUser(name, email);
                        System.out.println("User added successfully!");
                        break;
                    case 4:
                        for (User user : libraryService.getAllUsers()) {
                            System.out.println(user);
                        }
                        break;
                    case 5:
                        System.out.print("Enter user ID: ");
                        int userId = scanner.nextInt();
                        System.out.print("Enter book ID: ");
                        int bookId = scanner.nextInt();
                        libraryService.borrowBook(userId, bookId);
                        System.out.println("Book borrowed successfully!");
                        break;
                    case 6:
                        System.out.print("Enter user ID: ");
                        userId = scanner.nextInt();
                        System.out.print("Enter book ID: ");
                        bookId = scanner.nextInt();
                        libraryService.returnBook(userId, bookId);
                        System.out.println("Book returned successfully!");
                        break;
                    case 7:
                        for (Transaction transaction : libraryService.getAllTransactions()) {
                            System.out.println(transaction);
                        }
                        break;
                    case 8:
                        System.out.println("Exiting...");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear the invalid input
            } catch (Exception e) {
                System.out.println("An error occurred: " + e.getMessage());
            }
        }
    }
}




