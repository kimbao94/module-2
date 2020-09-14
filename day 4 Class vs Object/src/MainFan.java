import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class MainFan {
    public static void main(String[] args) {
        Fan fan = new Fan();
        System.out.println(fan.toString());
        Fan fan1 = new Fan(10, true, 10, "yellow");
        Fan fan2 = new Fan(5, false, 5, "blue");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap speed");
        if (fan1.getSpeed() <= 10){
            int a = scanner.nextInt();
            fan1.setSpeed(a);
        }
        System.out.println("nhap radius");
        if (fan.getRadius() <= 10){
            int b =scanner.nextInt();
            fan1.setRadius(b);
        }


    }


}
