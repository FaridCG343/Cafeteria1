/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Cafeteria;

/**
 *
 * @author farid
 */
public class Capuchino extends Vaso {

    private Tamanio tamanio;
    private Extras extra1;
    private Extras extra2;
    private Extras extra3;
    private Leches leches;

    public Capuchino(Tamanio tamanio, Extras extra1, Extras extra2, Extras extra3, Leches leches) {
        this.tamanio = tamanio;
        this.extra1 = extra1;
        this.extra2 = extra2;
        this.extra3 = extra3;
        this.leches = leches;
    }

    public Capuchino() {
        this.extra1 = null;
        this.extra2 = null;
        this.extra3 = null;
    }

    public Tamanio getTamanio() {
        return tamanio;
    }

    public void setTamanio(Tamanio tamanio) {
        this.tamanio = tamanio;
    }

    public Extras getExtra1() {
        return extra1;
    }

    public void setExtra1(Extras extra1) {
        this.extra1 = extra1;
    }

    public Extras getExtra2() {
        return extra2;
    }

    public void setExtra2(Extras extra2) {
        this.extra2 = extra2;
    }

    public Extras getExtra3() {
        return extra3;
    }

    public void setExtra3(Extras extra3) {
        this.extra3 = extra3;
    }

    public Leches getLeches() {
        return leches;
    }

    public void setLeches(Leches leches) {
        this.leches = leches;
    }

    @Override
    public double Precio() {
        double precio = 30;
        precio+=preciot(this.tamanio);
        precio+=preciol(this.leches);
        precio+=precioe(this.extra1);
        precio+=precioe(this.extra2);
        precio+=precioe(this.extra3);
        return precio;
    }

    @Override
    public String toString() {
        String e;
        if (extra1 == null) {
            e = "Ninguno";
        } else if (extra2 == null) {
            e = extra1.toString();
        } else if (extra3 == null) {
            e = extra1.toString() + ", " + extra2.toString();
        } else {
            e = extra1.toString() + ", " + extra2.toString() + ", " + extra3.toString();
        }
        return super.toString() + "\nCapuchino" + "\nTamaño:" + tamanio + "\nExtras: " + e + "\nLeches=" + leches;
    }

}
