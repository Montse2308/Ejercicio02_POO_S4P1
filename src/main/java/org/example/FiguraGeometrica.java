package org.example;

public class FiguraGeometrica {
    private Triangulo triangulo;
    private Rectangulo rectangulo;

    public FiguraGeometrica(Triangulo triangulo){
        this.triangulo = triangulo;
    }
    public FiguraGeometrica(Rectangulo rectangulo){
        this.rectangulo = rectangulo;
    }

    /*public void Burbuja(int n, double arreglo[]){
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <n-1 ; j++) {
                if(arreglo[i] < arreglo[j]){
                    double temp= arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temp;
                }
            }
        }
    }*/
}
