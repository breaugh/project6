package project6;

import java.util.Scanner;

public class class1 {

	 class1 left, right;

         int data;

         public class1()

         {

             left = null;

             right = null;

             data = 0;

         }

       

         public class1(int n)

         {

             left = null;

             right = null;

             data = n;

         }

         // left node is set here

         public void setLeft(class1 n)

         {left = n; }

         // sets the right node 

         public void setRight(class1 n)

         {right = n;}
             
         // Retrieves left node

         public class1 getLeft()

         {

             return left;

         }

         // retrieves right node

         public class1 getRight()

         {

             return right;

         }

         // info is placed in correct node

         public void setData(int d)

         {

             data = d;

         }

         // info is retrieved from correct node

         public int getData()

         {

             return data;

         }     

     }
