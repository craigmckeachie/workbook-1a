package com.pluralsight;

public class StringExamples {

    public static void main(String[] args) {
//        String welcome = "Big Tex says \"Howdy\"!";
//        System.out.println(welcome);


        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf("-");
        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition+1);
        System.out.println(vendor);
        System.out.println(productNum);
// vendor contains ACME and productNum contains 12213
    }

}
