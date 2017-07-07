package com.kozyrev;


import com.kozyrev.other_package.MyCalculator;
import com.kozyrev.other_package.MyCalendar;

import java.util.ArrayList;
import java.util.HashSet;

public class Main {



    public static void main(String[] args) {
        // write your code here
         //exampleMethod();
        //Object o = new Object();
        //o.hashCode()
         //exampleMethod2();
        //exampleMethod3();
        //exampleMethod8();
        exampleMethodWorkWithString();
    }

    private static void exampleMethodWorkWithString() {
        String text = "ethod overriding, in object-oriented programming, is a language feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its superclasses or parent classes. The implementation in the subclass overrides (replaces) the implementation in the superclass by providing a method that has same name, same parameters or signature, and same return type as the method in the parent class.[1] The version of a method that is executed will be determined by the object that is used to invoke it. If an object of a parent class is used to invoke the method, then the version in the parent class will be executed, but if an object of the subclass is used to invoke the method, then the version in the child class will be executed.[2] Some languages allow a programmer to prevent a method from being overridden.\n" +
                "\n" +
                "Contents  [hide] \n" +
                "1\tLanguage-specific examples\n" +
                "1.1\tAda\n" +
                "1.2\tC#\n" +
                "1.3\tC++\n" +
                "1.4\tDelphi\n" +
                "1.5\tEiffel\n" +
                "1.6\tJava\n" +
                "1.7\tPython\n" +
                "1.8\tRuby\n" +
                "2\tNotes\n" +
                "3\tSee also\n" +
                "4\tReferences\n" +
                "5\tExternal links\n" +
                "Language-specific examples[edit]\n" +
                "Ada[edit]\n" +
                "Ada provides method overriding by default. To favor early error detection (e.g. a misspelling), it is possible to specify when a method is expected to be actually overriding, or not. That will be checked by the compiler.\n" +
                "\n" +
                "  type T is new Controlled with ......;\n" +
                "  procedure Op(Obj: in out T; Data: in Integer);\n" +
                "\n" +
                "  type NT is new T with null record;\n" +
                "  overriding    -- overriding indicator\n" +
                "  procedure Op(Obj: in out NT; Data: in Integer);\n" +
                "  overriding    -- overriding indicator\n" +
                "  procedure Op(Obj: in out NT; Data: in String);\n" +
                "  -- ^ compiler issues an error: subprogram \"Op\" is not overriding\n" +
                "C#[edit]\n" +
                "C# does support method overriding, but only if explicitly requested using the modifiers override and virtual.\n" +
                "\n" +
                "abstract class Animal {\n" +
                "  public          String Name {get; set; }\n" +
                "  // Methods\n" +
                "  public          void   Drink();\n" +
                "  public virtual  void   Eat();\n" +
                "  public          void   Go();\n" +
                "}\n" +
                "\n" +
                "class Cat : Animal {\n" +
                "  public new      String Name {get; set; }\n" +
                "  // Methods\n" +
                "  public          void   Drink();  // warning: hides inherited drink(). Use new\n" +
                "  public override void   Eat();    // overrides inherited eat().\n" +
                "  public new      void   Go();     // hides inherited go().\n" +
                "}\n" +
                "When overriding one method with another, the signatures of the two methods must be identical (and with same visibility). In C#, class methods, indexers, properties and events can all be overridden.\n" +
                "\n" +
                "Non-virtual or static methods cannot be overridden. The overridden base method must be virtual, abstract, or override.\n" +
                "\n" +
                "In addition to the modifiers that are used for method overriding, C# allows the hiding of an inherited property or method. This is done using the same signature of a property or method but adding the modifier new in front of it.[3]\n" +
                "\n" +
                "In the above example, hiding causes the following:\n" +
                "\n" +
                "Cat cat = new Cat();\n" +
                "\n" +
                "cat.Name = …;             // accesses Cat.Name\n" +
                "cat.Eat();                // calls Cat.Eat()\n" +
                "cat.Go();                 // calls Cat.Go()\n" +
                "((Animal)cat).Name = …;   // accesses Animal.Name!\n" +
                "((Animal)cat).Eat();      // calls Cat.Eat()!\n" +
                "((Animal)cat).Go();       // calls Animal.Go()!\n" +
                "C++[edit]\n" +
                "In C++, the name of the parent or base class is used followed by the scope resolution operator to override functions. For example, the following code presents two classes, the base class TRectangle, and the derived class TBox. TBox overrides the TRectangle class's print() method, so as also to print its height.[4]\n" +
                "\n" +
                "#include <iostream>\n" +
                "\n" +
                "//---------------------------------------------------------------------------\n" +
                "class TRectangle\n" +
                "{\n" +
                "public:\n" +
                "    TRectangle(double l, double w) : length(l), width(w) {}\n" +
                "    virtual void print() const;\n" +
                " \n" +
                "private:\n" +
                "    double length;\n" +
                "    double width;\n" +
                "};\n" +
                " \n" +
                "//---------------------------------------------------------------------------\n" +
                "void TRectangle::print() const\n" +
                "{\n" +
                "   // print() method of base class.\n" +
                "   std::cout << \"Length = \" << this->length << \"; Width = \" << this->width;\n" +
                "}\n" +
                " \n" +
                "//---------------------------------------------------------------------------\n" +
                "class TBox : public TRectangle\n" +
                "{\n" +
                "public:\n" +
                "    TBox(double l, double w, double h) : TRectangle(l, w), height(h) {}\n" +
                "    // virtual is optional here, but it is a good practice to remind it to the developer.\n" +
                "    virtual void print() c";
        //write your solution here
        //text.split("");

    }


    public static  void exampleMethod8 (){

            ArrayList<Travel> list = new ArrayList<Travel>();
        Travel myTravel = new Travel();
        list.add(myTravel);
        BusTravel busTravel = new BusTravel();
        list.add(busTravel);

    }

    public class HashSet {

        HashSet Travel = new HashSet();
    }

   // hashMap<String, Travel>*/

    public static void exampleMethod4(){
    Travel myTravel =  new Travel();
        myTravel.chooseTour();
        myTravel.checkWeather();
        AviaTravel aviaTravel = new AviaTravel();
        aviaTravel.pay();

    }

    public static void exampleMethod3() {
        MyCalendar myCalendar = new MyCalendar();
        myCalendar.showCurrentDay();
    }

        public static void exampleMethod2() {
        MyCalculator calculator = new MyCalculator();
        for (int i = 0; i < 100; i++ ) {
            int res = calculator.addFive(i);
            System.out.println("result: " + res);
        }
        }

    public static void exampleMethod() {
        System.out.println("hello Vanya");
    }

}

