package com.crm.qa.pages;

public class HomePage {
    private static HomePage homepage;
    int c;
    int sub(int a,int b)
    {
        return c=a-b;
    }
    public static void main(String [] args)
    {
        homepage=new HomePage();
        homepage.sub(4,2);
        System.out.println(homepage.c);
        System.out.println("ishanth");
    }
}
