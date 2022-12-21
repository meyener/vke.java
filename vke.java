import java.util.Scanner;

/**
 * vke
 */
public class vke {

    public static void main(String[] args) {
        float boy,w,vke;
        System.out.println("lüntfen uzunluğunu metre cinsinden gir : ");
        Scanner scn = new Scanner(System.in);
        boy= scn.nextFloat();
        System.out.println("lütfen ağirliğini kilogram cinsinde gir : ");
        w=scn.nextFloat();
        boy=boy*boy;
        vke=w/boy;
        System.out.println("Vücut kitle endeksiniz : "+vke);
    }
}