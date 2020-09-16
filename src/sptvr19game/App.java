/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sptvr19game;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author user
 */
class App {
    public void run() {
        System.out.println("Угадай задуманное число!");
        System.out.println("----------------------------");
        Random random = new Random();
        int myNumber = random.nextInt(5-0+1)+0;
        System.out.println("Задумано число от 0 до 5. Угадай!");
        Scanner scanner = new Scanner(System.in);
        int attempt = 1;
        do{
            
            int gameNumber = scanner.nextInt();
            if (myNumber == gameNumber) {
                System.out.println("Ты выиграл!");
                break;
            }else{
                if(attempt < 3) {
                    System.out.println("Не угадал попробуй ещё!");
                    if(myNumber > gameNumber) {
                    System.out.println("Задуманное число больше!");
                    } else{
                        System.out.println("Задуманное число меньше!");
                    }
                    
                } else {
                     System.out.println("ТЫ проиграл! Задумано число: "+myNumber);
                     break;
                }
            }
            attempt++;
        }while(true);
        
    }
    
}
