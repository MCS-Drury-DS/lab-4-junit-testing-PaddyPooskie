package cs.csmath.complexnumber;

public class ComplexNumber {

    private double realPart;
    private double imagPart;

    //-----------Constructors--------------
    public ComplexNumber(double realPart, double imagPart){
        this.realPart = realPart;
        this.imagPart = imagPart;
    }

    public ComplexNumber(){
        this(0.0,0.0);
    }

    public ComplexNumber(ComplexNumber cn){
        this.realPart = cn.getRealPart();
        this.imagPart = cn.getImagPart();
    }

    //------Getters & Setters-------------
    public double getRealPart() {
        return realPart;
    }

    public void setRealPart(double realPart) {
        this.realPart = realPart;
    }

    public double getImagPart() {
        return imagPart;
    }

    public void setImagPart(double imagPart) {
        this.imagPart = imagPart;
    }



    //--------Arithmetic Operators------------
    public void add(ComplexNumber otherCN){
        this.realPart += otherCN.realPart;
        this.imagPart += otherCN.imagPart;
    }
    public void sub(ComplexNumber otherCN){
        this.realPart -= otherCN.realPart;
        this.imagPart -= otherCN.imagPart;
    }
    public void mult(ComplexNumber otherCN){
        double constantReal = this.realPart;
        double constantImag = this.imagPart;
        this.realPart = (constantReal * otherCN.realPart) - (constantImag * otherCN.imagPart);
        this.imagPart = (constantReal * otherCN.imagPart) + (constantImag * otherCN.realPart);
    }
    public void div(ComplexNumber otherCN) throws ArithmeticException{
            double constantReal = this.realPart;
            double constantImag = this.imagPart;

            double denominator = Math.pow(otherCN.realPart, 2) + Math.pow(otherCN.imagPart, 2);
            if(java.lang.Math.abs(denominator) < 0.000001){
               throw new ArithmeticException();
            }
            this.realPart = ((constantReal * otherCN.realPart) + (constantImag * otherCN.imagPart)) /
                    ((otherCN.realPart * otherCN.realPart) + (otherCN.imagPart * otherCN.imagPart));
            this.imagPart = ((constantImag * otherCN.realPart) - (constantReal * otherCN.imagPart)) /
                    (Math.pow(otherCN.realPart, 2) + Math.pow(otherCN.imagPart, 2));
    }
    public double abs(){
        double absoluteValue = Math.sqrt(Math.pow(this.realPart, 2) + Math.pow(this.imagPart, 2));
        return absoluteValue;
    }
    public ComplexNumber conj(){
        ComplexNumber CNConj = new ComplexNumber(this.realPart, -1*this.imagPart);
        return CNConj;
    }

    //----------Class Methods-----------------
    public static ComplexNumber add(ComplexNumber firstCN, ComplexNumber secondCN){
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);
        cn2.add(cn1);
        return cn2;
    }
    public static ComplexNumber sub(ComplexNumber firstCN, ComplexNumber secondCN){
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);
        cn2.sub(cn1);
        return cn2;
    }
    public static ComplexNumber mult(ComplexNumber firstCN, ComplexNumber secondCN){
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);
        cn2.mult(cn1);
        return cn2;
    }
    public static ComplexNumber div(ComplexNumber firstCN, ComplexNumber secondCN){
        ComplexNumber cn1 = new ComplexNumber(firstCN);
        ComplexNumber cn2 = new ComplexNumber(secondCN);
        cn2.div(cn1);
        return cn2;
    }

    public static void main(String[] args){
        ComplexNumber cn1 = new ComplexNumber(1,-1);
        ComplexNumber cn2 = new ComplexNumber(2, 2);
        ComplexNumber cn3 = new ComplexNumber(1,-1);
        ComplexNumber cn4 = new ComplexNumber(2, 2);
        ComplexNumber cn5 = new ComplexNumber(1,-1);
        ComplexNumber cn6 = new ComplexNumber(2, 2);
        ComplexNumber cn7 = new ComplexNumber(1,-1);
        ComplexNumber cn8 = new ComplexNumber(2, 2);
        System.out.println("Real: " + cn1.getRealPart());
        System.out.println("Imag: " + cn1.getImagPart());
        cn1.add(cn2);
        cn3.sub(cn4);
        cn5.mult(cn6);
        cn7.div(cn8);
        System.out.println("Sum: " + cn1.getRealPart() + "," + cn1.getImagPart());
        System.out.println("Difference: " + cn3.getRealPart() + "," + cn3.getImagPart());
        System.out.println("Product: " + cn5.getRealPart() + "," + cn5.getImagPart());
        System.out.println("Quotient: " + cn7.getRealPart() + "," + cn7.getImagPart());
        System.out.println();
    }
}
