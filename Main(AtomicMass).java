import java.util.Arrays;

// must define the class so java knows what an " Element " is 

class Element {
    public String name;
    public int atomicNumber;
    public double atomicMass;

    // this constructor allows you to create new elements with data 
    public Element (String name, int atomicNumber, double atomicMass) {
        this.name = name;
        this.atomicNumber = atomicNumber;
        this.atomicMass = atomicMass;
    }
}

public class Main {
    public static void main(String[] args) {
        // Allocation operand 
        // 'new Element[118]' uses '118' as an operand set memory size 
        Element[] periodicTable = new Element[118];

        // reference assignment operators 
        // the '=' operator assigns the memory address of the new object to array index 
        periodicTable[0] = new Element("Hydrogen", 1, 1.008);
        periodicTable[1] = new Element("Helium", 2, 4.0026);
        periodicTable[5] = new Element("Carbon", 6, 12.011);

        // string concatenation ("+" operator)
        // here, '+' is not doing math; it is joining  the next variables together 
        System.out.println("The mass of" + periodicTable[0].name + " is " + periodicTable[0].atomicMass);

        // Arithmetic operands (Molar Mass calculation)
        // lets caclulate the mass of methane (CH4)
        double carbonMass = periodicTable[5].atomicMass; // Operand A 
        double hyhdrogenMass = periodicTable[0].atomicMass; // Operand B 

        // Math Expression: (Operand A) + (Operand B * 4)
        // '*'  is the multiplication operator; '+' is the addition operator
        double molarMassMethane = carbonMass + (hyhdrogenMass * 4);
        System.out.println("Molar mas of CH4 is:" + molarMassMethane);
    }
}