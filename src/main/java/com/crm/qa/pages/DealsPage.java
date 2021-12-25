package com.crm.qa.pages;

public class DealsPage {
    private static DealsPage dealsPage;
    int c;
    int mul(int a,int b)
    {
        return c=a*b;
    }
    public static void main(String [] args)
    {
        dealsPage=new DealsPage();
        dealsPage.mul(4,2);
        System.out.println(dealsPage.c);
        System.out.println("ishanth");
    }

}
