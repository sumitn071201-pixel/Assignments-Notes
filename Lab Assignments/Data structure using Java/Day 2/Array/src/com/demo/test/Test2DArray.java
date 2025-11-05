//package com.demo.test;
//
//import com.demo.arrays.My2DArray;
//
//public class Test2DArray {
//    public static void main(String[] args) {
//        My2DArray ob1 = new My2DArray();
//        My2DArray ob2 = new My2DArray();
//
//        System.out.println("Enter values for ob1:");
//        ob1.acceptData();
//
//        System.out.println("Enter values for ob2:");
//        ob2.acceptData();
//
//        System.out.println("\nob1:");
//        ob1.displayData();
//
//        System.out.println("\nob2:");
//        ob2.displayData();
//
//        int[] rowSums = ob1.findSumRowWise();
//        System.out.println("\nRow-wise sum of ob1:");
//        for (int i = 0; i < rowSums.length; i++) {
//            System.out.println("Row " + i + ": " + rowSums[i]);
//        }
//
//        int[] colSums = ob1.findSumColumnWise();
//        System.out.println("\nColumn-wise sum of ob1:");
//        for (int i = 0; i < colSums.length; i++) {
//            System.out.println("Column " + i + ": " + colSums[i]);
//        }
//        
//        int[][] sum = ob1.add2DArrays(ob2);
//        System.out.println("\nSum of ob1 and ob2:");
//        for (int i = 0; i < sum.length; i++) {
//            for (int j = 0; j < sum[i].length; j++) {
//                System.out.print(sum[i][j] + "\t");
//            }
//            System.out.println();
//        }
//
//        int[][] diff = ob1.sub2DArrays(ob2);
//        System.out.println("\nDifference of ob1 and ob2:");
//        for (int i = 0; i < diff.length; i++) {
//            for (int j = 0; j < diff[i].length; j++) {
//                System.out.print(diff[i][j] + "\t");
//            }
//            System.out.println();
//        }
//    }
//}
