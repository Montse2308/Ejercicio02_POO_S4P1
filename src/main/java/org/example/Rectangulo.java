package org.example;

public class Rectangulo {
    private Punto InfIzq;
    private Punto InfDer;
    private Punto SupIzq;
    private Punto SupDer;

    public Rectangulo(Punto m, Punto n, Punto o, Punto p) {//METODO CONSTRUCTOR
        this.InfIzq = m;
        this.InfDer = n;
        this.SupIzq = o;
        this.SupDer = p;
    }

    public Punto[] OrganizarArreglo()//Creo un arreglo organizado con las coordenadas
    {
        Punto arreglo[]={this.InfIzq, this.InfDer,this.SupIzq,this.SupDer};

        //Primero organizo las coordenadas para que esten primero las infereriores
        for (int i = 0; i < 4 ; i++) {//
            for (int j = 1; j < 4-1 ; j++) {
                if(arreglo[i].getY() > arreglo[j].getY()){
                    Punto temp= arreglo[i];
                    arreglo[i]=arreglo[j];
                    arreglo[j]=temp;
                }
            }
        }

        //Ya que tengo las inferiores, las ordeno x si son las izquierdas o derechas
        if( arreglo[0].getX() > arreglo[1].getX()){
            Punto temp= arreglo[0];
            arreglo[0]=arreglo[1];
            arreglo[1]=temp;
        }
        if( arreglo[2].getX() > arreglo[3].getX()){
            Punto temp= arreglo[2];
            arreglo[2]=arreglo[3];
            arreglo[3]=temp;
        }

        return arreglo;
    }

    public void OrganizarCoordenadas(){//Ya que el arreglo está organizado puedo acomodarlas dentro de mi triangulo
        Punto arreglo[] = OrganizarArreglo();

        this.InfIzq=arreglo[0];
        this.InfDer=arreglo[1];
        this.SupIzq=arreglo[2];
        this.SupDer=arreglo[3];
    }

    public boolean TengoUnTrianguloDentro(Triangulo t){

        boolean bandera = true;
        if((t.getA().getX() < this.InfIzq.getX()) || (t.getA().getX() > this.SupDer.getX())){
            bandera=false;
        }
        if((t.getA().getY() < this.InfIzq.getY()) || (t.getA().getY() > this.SupDer.getY())){
            bandera=false;
        }
        if((t.getB().getX() < this.InfIzq.getX()) || (t.getB().getX() > this.SupDer.getX())){
            bandera=false;
        }
        if((t.getB().getY() < this.InfIzq.getY()) || (t.getB().getY() > this.SupDer.getY())){
            bandera=false;
        }
        if((t.getC().getX() < this.InfIzq.getX()) || (t.getC().getX() > this.SupDer.getX())){
            bandera=false;
        }
        if((t.getC().getY() < this.InfIzq.getY()) || (t.getC().getY() > this.SupDer.getY())){
            bandera=false;
        }

        return bandera;
    }
}
