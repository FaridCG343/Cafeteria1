/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafeteria;

/**
 *
 * @author farid
 */
public abstract class Vaso {

    protected static int numVaso;
    protected int numVaso1;
    protected int refill;

    public Vaso() {
        this.refill = 0;
        numVaso++;
        this.numVaso1 = numVaso;
    }

    public String Refill() {
        String temp;
        refill++;
        if (this.refill <= 3) {
            temp = "\nDifruta tu refill =D\nRefil restantes: " + (3 - this.refill);
        } else {
            temp = "\nLo sentimos pero ya no te quedan refill";
        }
        return temp;
    }

    public double preciot(Tamanio tam) {
        double precio = 0;
        switch (tam) {
            case Chico -> {
                precio = 10;
            }
            case Mediano -> {
                precio = 15;
            }
            case Grande -> {
                precio = 20;
            }
        }
        return precio;
    }

    public double preciol(Leches le) {
        double precio = 0;
        if (le == Leches.Nutrileche) {
            precio = 10;
        } else {
            precio = 15;
        }
        return precio;
    }

    public double precioe(Extras ex) {
        double precio = 0;
        switch (ex) {
            case Galleta -> {
                precio += 10;
            }
            case Dona -> {
                precio += 15;
            }
            case Azucar -> {
                precio += 5;
            }
            case Chocolate -> {
                precio += 10;
            }
        }
        return precio;
    }

    public String Refillr() {
        return "\nRefil restantes: " + (3 - this.refill);
    }

    public int getNumVaso1() {
        return numVaso1;
    }

    abstract double Precio();

    @Override
    public String toString() {
        return "Numero de vaso:" + numVaso;
    }
}
