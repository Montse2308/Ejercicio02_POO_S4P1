package org.example;

public class Main {
    public static void main(String [] args) {
        Punto aTriangulo = new Punto(0, 2);
        Punto bTriangulo = new Punto(3, 0);
        Punto cTriangulo = new Punto(5, 3);

        Punto mRectangulo = new Punto(0, 0);
        Punto nRectangulo = new Punto(20, 0);
        Punto oRectangulo = new Punto(0, 10);
        Punto pRectangulo = new Punto(20, 10);


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