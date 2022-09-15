package OOP.Java;

import org.omg.CORBA.FREE_MEM;

public class Fraction {
    private int nom;
    private int denom;
    //метод set = записать значение в свойство (поле) класса
    public void setNom(int fNom){
        nom = fNom;
    }
    /*
    public void set(int nom){
        this.nom = nom;
        }
     */
    public void setDenom(int fDenom){
        if(fDenom <= 0){
            denom = 1;
        }
        else{
            denom = fDenom;
        }
    }
    public Fraction(){
        nom = 0;
        denom = 1;
        }
    public Fraction(int fNom, int fDenom){
        nom = fNom;
        denom = fDenom;
        }
        public void print(){
            System.out.println(nom + "/" + denom);

        }
    public Fraction mul(Fraction f2){
        Fraction res = new Fraction();
        res.nom = this.nom * f2.nom;
        res.denom = this.denom * f2.denom;
        return res;
    }
    public Fraction division(Fraction f3){
        Fraction division = new Fraction();
        division.nom = this.nom * f3.denom ;
        division.denom = this.denom * f3.nom;
        return division;
    }
    private Fraction reverse(){
        Fraction res = new Fraction();
        res.nom = this.denom;
        res.denom = this.nom;
        return res;
    }
    public Fraction div(Fraction f2){
        Fraction res = this.mul(f2.reverse());
        return res;
    }
    public Fraction add(Fraction f2){
        Fraction res = new Fraction();
        res.denom = this.denom * f2.denom;
        res.nom = this.nom* f2.nom + f2.nom + this.nom;
        return res;

    }
    int gcdByEuclidsAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidsAlgorithm(n2, n1 % n2);
    }
}
