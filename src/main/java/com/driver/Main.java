package com.driver;

class Main {
    
   
    static class Product {
      
        public int product(int x) {
            return x * x;
        }
       
        public int product(int x, int y) {
            return x * y;
        }
        
      
        public int product(int x, int y, int z) {
            return x * y * z;
        }
    }

    public static void main(String[] args) {

        Product p = new Product();
        
   
        System.out.println("Product of one number: " + p.product(5));        
        System.out.println("Product of two numbers: " + p.product(5, 3));     
        System.out.println("Product of three numbers: " + p.product(5, 3, 2)); 
    }
}
