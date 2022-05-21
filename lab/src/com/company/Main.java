package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {


        static Scanner ug1 = new Scanner(System.in);
        static Scanner ug2 = new Scanner(System.in);
    static Scanner ug3 = new Scanner(System.in);

    public static void main(String args[])
        {
            System.out.print("1 угол треугольника (в процентах) = ");
            int u1 = ug1.nextInt();
            System.out.print("2 угол треугольника (в процентах) = ");
            int u2 = ug2.nextInt();
            System.out.print("3 угол треугольника (в процентах) = ");
            int u3 = ug3.nextInt();
            if ( u1+u2+u3<180)
            {
                System.out.print("Такого треугольника не существует");
            }
            else if (u1==90 || u2==90 || u3==90 || u1+u2==90 || u1+u3==90 || u2+u3==90 )
            { System.out.print("Это прямоугольный треугольник"); }
            else
            { System.out.print ("Это треугольник");}




    }}




