/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kasia
 */
import java.util.Scanner;

public class UserInterface {

    private TodoList list;
    private Scanner scanner;

    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        
        while (true) {
            System.out.println("Command: ");
            String command = scanner.nextLine();
            if ("stop".equals(command)) {
                break ;
            }
            if ("add".equals(command)) {
                System.out.println("To add: ");
                String task = scanner.nextLine();
                list.add(task);
            }
            if ("list".equals(command)) {
                list.print();
            }
            if ("remove".equals(command)) {
                System.out.println("Which one is removed? ");
                int index = Integer.valueOf(scanner.nextLine());
                list.remove(index);
            }
            
        }
    }
}
