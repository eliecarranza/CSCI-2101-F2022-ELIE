package HW1;
/*
Make the output look like this:
#
##
###
####
#####
####
###
##
#
Hint: the object is created for you (Pyramid) and so is the method (Output)
Hint2: Also notice the method is void meaning you will not be returning anything
*/
public class Pyramid {
    public static void Output(String s) {
        System.out.println(s + "x");
        System.out.println(s + "xx");
        System.out.println(s + "xxx");
        System.out.println(s + "xxxx");
        System.out.println(s + "xxx");
        System.out.println(s + "xx");
        System.out.println(s + "x");

    }
}
