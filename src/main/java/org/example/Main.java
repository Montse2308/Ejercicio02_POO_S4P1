package org.example;

public class Main {
    public static void main(String [] args) {
        Punto aTriangulo = new Punto(2.0, 1.0);
        Punto bTriangulo = new Punto(8.0, 1.0);
        Punto cTriangulo = new Punto(4.0, 3.0);

        Punto mRectangulo = new Punto(0.0, 0.0);
        Punto nRectangulo = new Punto(10.0, 0.0);
        Punto oRectangulo = new Punto(0.0, 4.0);
        Punto pRectangulo = new Punto(10.0, 4.0);


        Triangulo t = new Triangulo(aTriangulo,bTriangulo, cTriangulo);
        Rectangulo r = new Rectangulo(mRectangulo, nRectangulo, oRectangulo, pRectangulo);

        r.OrganizarCoordenadas();

        if(r.TengoUnTrianguloDentro(t)){
            System.out.println("El triangulo SÍ está dentro");
        }else{
            System.out.println("El triangulo NO está dentro");
        }
    }
}