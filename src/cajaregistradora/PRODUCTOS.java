package cajaregistradora;

import java.util.Locale;
import java.util.Scanner;

public class PRODUCTOS {

    Scanner p = new Scanner(System.in);
    static String a1, a2, a3, a4, a5, a6, a7, a8;
    static int c1, c2, c3, c4, c5, c6, c7, c8;
    static double p1, p2, p3, p4, p5, p6, p7, p8;
    static double o1, o2, o3, o4, o5, o6, o7, o8, IT;
    static double m1, m2, m3, m4, m5, m6, m7, m8;

    public void Productos(String a1, String a2, String a3, String a4, String a5, String a6, String a7, String a8) {
        System.out.println("NOMBRE DE LOS PRODUCTOS");
        System.out.println("Nombre del producto nùmero 1:");
        this.a1 = p.nextLine();
        System.out.println("Nombre del producto nùmero 2:");
        this.a2 = p.nextLine();
        System.out.println("Nombre del producto nùmero 3:");
        this.a3 = p.nextLine();
        System.out.println("Nombre del producto nùmero 4:");
        this.a4 = p.nextLine();
        System.out.println("Nombre del producto nùmero 5:");
        this.a5 = p.nextLine();
        System.out.println("Nombre del producto nùmero 6:");
        this.a6 = p.nextLine();
        System.out.println("Nombre del producto nùmero 7:");
        this.a7 = p.nextLine();
        System.out.println("Nombre del producto nùmero 8:");
        this.a8 = p.nextLine();
    }

    public void Cantidad(int c1, int c2, int c3, int c4, int c5, int c6, int c7, int c8) {
        System.out.println("\nCANTIDAD DE PRODUCTOS");
        System.out.println("Nùmero de productos de:\t" + this.a1);
        this.c1 = p.nextInt();
        System.out.println("Nùmero de productos de:\t" + this.a2);
        this.c2 = p.nextInt();
        System.out.println("Nùmero de productos de:\t" + this.a3);
        this.c3 = p.nextInt();
        System.out.println("Nùmero de productos de:\t" + this.a4);
        this.c4 = p.nextInt();
        System.out.println("Nùmero de productos de:\t" + this.a5);
        this.c5 = p.nextInt();
        System.out.println("Nùmero de productos de:\t" + this.a6);
        this.c6 = p.nextInt();
        System.out.println("Nùmero de productos de:\t" + this.a7);
        this.c7 = p.nextInt();
        System.out.println("Nùmero de productos de:\t" + this.a8);
        this.c8 = p.nextInt();
    }

    public void Precio(double p1, double p2, double p3, double p4, double p5, double p6, double p7, double p8) {
        System.out.println("\nPRECIO DE LOS PRODUCTOS");
        System.out.println("Precio del producto:\t" + this.a1);
        this.p1 = p.nextDouble();
        System.out.println("Precio del producto:\t" + this.a2);
        this.p2 = p.nextDouble();
        System.out.println("Precio del producto:\t" + this.a3);
        this.p3 = p.nextDouble();
        System.out.println("Precio del producto:\t" + this.a4);
        this.p4 = p.nextDouble();
        System.out.println("Precio del producto:\t" + this.a5);
        this.p5 = p.nextDouble();
        System.out.println("Precio del producto:\t" + this.a6);
        this.p6 = p.nextDouble();
        System.out.println("Precio del producto:\t" + this.a7);
        this.p7 = p.nextDouble();
        System.out.println("Precio del producto:\t" + this.a8);
        this.p8 = p.nextDouble();
    }

    public void Operacion() {
        this.o1 = c1 * p1;
        this.o2 = c2 * p2;
        this.o3 = c3 * p3;
        this.o4 = c4 * p4;
        this.o5 = c5 * p5;
        this.o6 = c6 * p6;
        this.o7 = c7 * p7;
        this.o8 = c8 * p8;
        this.IT = o1 + o2 + o3 + o4 + o5 + o6 + o7 + o8;
    }

    public void Descuento() {
        if (c1 >= 5) {
            System.out.println("Se le aplico un 20% de descuento al producto\t" + this.a1);
        }
        if (c2 >= 5) {
            System.out.println("Se le aplico un 20% de descuento al producto\t" + this.a2);
        }
        if (c3 >= 5) {
            System.out.println("Se le aplico un 20% de descuento al producto\t" + this.a3);
        }
        if (c4 >= 5) {
            System.out.println("Se le aplico un 20% de descuento al producto\t" + this.a4);
        }
        if (c5 >= 5) {
            System.out.println("Se le aplico un 20% de descuento al producto\t" + this.a5);
        }
        if (c6 >= 5) {
            System.out.println("Se le aplico un 20% de descuento al producto\t" + this.a6);
        }
        if (c7 >= 5) {
            System.out.println("Se le aplico un 20% de descuento al producto\t" + this.a7);
        }
        if (c8 >= 5) {
            System.out.println("Se le aplico un 20% de descuento al producto\t" + this.a8);
        }
        System.out.println("\nSIN DESCUENTOS");
        if (c1 < 5) {
            System.out.println("No se le aplico descuento al producto\t" + this.a1);
        }
        if (c2 < 5) {
            System.out.println("No se le aplico descuento al producto\t" + this.a2);
        }
        if (c3 < 5) {
            System.out.println("No se le aplico descuento al producto\t" + this.a3);
        }
        if (c4 < 5) {
            System.out.println("No se le aplico descuento al producto\t" + this.a4);
        }
        if (c5 < 5) {
            System.out.println("No se le aplico descuento al producto\t" + this.a5);
        }
        if (c6 < 5) {
            System.out.println("No se le aplico descuento al producto\t" + this.a6);
        }
        if (c7 < 5) {
            System.out.println("No se le aplico descuento al producto\t" + this.a7);
        }
        if (c8 < 5) {
            System.out.println("No se le aplico descuento al producto\t" + this.a8);
        }
    }

    public void PrecioTotal() {
        if (c1 >= 5) {
            this.m1 = 20 * o1 / 100;
        } else {
            this.m1 = o1;
        }
        if (c2 >= 5) {
            this.m2 = 20 * o2 / 100;
        } else {
            this.m2 = o2;
        }
        if (c3 >= 5) {
            this.m3 = 20 * o3 / 100;
        } else {
            this.m3 = o3;
        }
        if (c4 >= 5) {
            this.m4 = 20 * o4 / 100;
        } else {
            this.m4 = o4;
        }
        if (c5 >= 5) {
            this.m5 = 20 * o5 / 100;
        } else {
            this.m5 = o5;
        }
        if (c6 >= 5) {
            this.m6 = 20 * 06 / 100;
        } else {
            this.m6 = o6;
        }
        if (c7 >= 5) {
            this.m7 = 20 * o7 / 100;
        } else {
            this.m7 = o7;
        }
        if (c8 >= 5) {
            this.m8 = 20 * o8 / 100;
        } else {
            this.m8 = o8;
        }
    }

    public void Ticket() {
        System.out.println("TIENDA DESESPERACIÒN\tUNIDAD ACADEMICA\t729224344\n"
                + "**********************************************************"
                + "\nPRODUCTO\tCANTIDAD\tPRECIO\t\tPRECIO TOTAL\n"
                + a1 + "\t\t" + c1 + "\t\t" + String.format("%.3f", o1) + "\t\t" + String.format("%.3f", m1) + "\n"
                + a2 + "\t\t" + c2 + "\t\t" + String.format("%.3f", o2) + "\t\t" + String.format("%.3f", m2) + "\n"
                + a3 + "\t\t" + c3 + "\t\t" + String.format("%.3f", o3) + "\t\t" + String.format("%.3f", m3) + "\n"
                + a4 + "\t\t" + c4 + "\t\t" + String.format("%.3f", o4) + "\t\t" + String.format("%.3f", m4) + "\n"
                + a5 + "\t\t" + c5 + "\t\t" + String.format("%.3f", o6) + "\t\t" + String.format("%.3f", m5) + "\n"
                + a6 + "\t\t" + c7 + "\t\t" + String.format("%.3f", o7) + "\t\t" + String.format("%.3f", m6) + "\n"
                + a7 + "\t\t" + c7 + "\t\t" + String.format("%.3f", o7) + "\t\t" + String.format("%.3f", m7) + "\n"
                + a8 + "\t\t" + c8 + "\t\t" + String.format("%.3f", o8) + "\t\t" + String.format("%.3f", m8) + "\n");
    }
}
