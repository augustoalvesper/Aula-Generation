package iniciandojava;

import java.util.Scanner;

public class tarefa11011 {

    public static void main(String[] args) {
        System.out.println("Os números entre 1000 e 1999 que quando dividos por 11 obtem-se o resto 5:");
        for(int count = 1000; count <= 1999; count++){
            if(count%11==5){
                System.out.print(count + "\t");
            }
        }
    }
    
}