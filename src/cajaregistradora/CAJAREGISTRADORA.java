package cajaregistradora;

/**
 * Este programa es una caja registradora xd
 *
 * @author Ricardo Blancas
 */
public class CAJAREGISTRADORA {

    static String a1, a2, a3, a4, a5, a6, a7, a8;
    static double p1, p2, p3, p4, p5, p6, p7, p8;
    static int c1, c2, c3, c4, c5, c6, c7, c8;

    public static void main(String[] args) {
        PRODUCTOS P = new PRODUCTOS();
        P.Productos(a1, a2, a3, a4, a5, a6, a7, a8);
        P.Cantidad(0, 0, 0, 0, 0, 0, 0, 0);
        P.Precio(p1, p2, p3, p4, p5, p6, p7, p8);
        P.Operacion();
        P.PrecioTotal();
        P.Ticket();
        P.Descuento();
    }

}
