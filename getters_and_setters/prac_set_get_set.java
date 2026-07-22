package com.company.getters_and_setters;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class prac_set_get_set {
    static class Cylinder {
        private int radius;
        private int height;

        public Cylinder(int rad, int h) {
            if (rad > 0) {
                radius = rad;
            } else
                System.out.println("Invalid radius , Default 1 is assigned");
            if (h > 0) {
                height = h;
            } else
                System.out.println("Invalid height , Default 1 is assigned");
        }

        public void setRadius(int rad) {
            if (rad > 0) {
                this.radius = rad;
            } else
                System.out.println("Invalid radius , default 1 is taken");
        }

        public void setHeight(int realheight) {
            if (realheight > 0)
                this.height = realheight;
            else
                System.out.println("Invalid height , default 1 is taken");
        }

        public int getRadius() {
            return radius;
        }

        public int getHeight() {
            return height;
        }

        public double surface_area() {
            return 2 * Math.PI * radius * (radius + height);
        }

        public double volume() {
            return Math.PI * Math.pow(radius, 2) * height;
        }
    }
        static class Sphere {
            private int radius;
            private int height;

            public Sphere(int rad) {
                if (rad > 0) {
                    radius = rad;
                } else
                    System.out.println("Invalid radius , Default 1 is assigned");

            }

            public void setRadius(int rad) {
                if (rad > 0) {
                    this.radius = rad;
                } else
                    System.out.println("Invalid radius , default 1 is taken");
            }

            public int getRadius() {
                return radius;
            }

            public double surface_area() {
                return 4 * Math.PI * Math.pow(radius, 2);
            }

            public double volume() {
                return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
       /* Cylinder cy = new Cylinder();
        System.out.println("Enter the height of the cylinder in cm: ");
        cy.setHeight(sc.nextInt());
        System.out.println("Enter the radius of the cylinder in cm: ");
        cy.setRadius(sc.nextInt());
        System.out.println("The Surface area of the cylinder is :"+cy.surface_area());
        System.out.println("The volume area of the cylinder is :"+cy.volume());*/


        /*System.out.println("Enter the radius and height of the cylinder");
        Cylinder cy2=new Cylinder(sc.nextInt(),sc.nextInt());
        System.out.println("The surface area of the cylinder is :"+cy2.surface_area());
        System.out.println("The volume of the cylinder is :"+cy2.volume());*/

            System.out.println("Enter the radius of the sphere: ");
            Sphere sp = new Sphere(sc.nextInt());
            System.out.println("The surface area of the sphere = " + sp.surface_area());
            System.out.println("The volume of the sphere = " + sp.volume());
        }
    }