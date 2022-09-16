import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/**
 * inceSesliKalınSesli
 */
public class inceSesliKalınSesli {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        char[] inceSesliHarfler = { 'e', 'i', 'ö', 'ü' };
        char[] kalınSesliHarfler = { 'a', 'ı', 'o', 'u' };

        System.out.print("Bir karakter girin : ");
        char typedChar = in.next().charAt(0);

        for (int i = 0; i < 4; i++) {
            if (typedChar == inceSesliHarfler[i])
                System.out.println("Bu karakter ince seslidir.");
            else if (typedChar == kalınSesliHarfler[i])
                System.out.println("Bu karakter kalın seslidir.");
        }

    }
}