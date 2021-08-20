// Java Program to Implement the RSA Algorithm
//About this code
// msg = The number to be encrypted and decrypted
// p = 1st prime number
// q = 2st prime number
// e is for public key exponent, (e < n) always

import java.math.*;
import java.util.*;

class RSA {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int p, q, n, z, d = 0, e, i;


        System.out.println("Enter the message you want to encrypt: ");
        int msg = scan.nextInt();
        double c;
        BigInteger msgback;


        System.out.println("Enter the first prime number: ");
        p = scan.nextInt();


        System.out.println("Enter the second prime number: ");
        q = scan.nextInt();
        n = p * q;
        z = (p - 1) * (q - 1);
        System.out.println("The value of z is " + z);

        for (e = 2; e < z; e++) {


            if (gcd(e, z) == 1) {
                break;
            }
        }
        System.out.println("The value of e is " + e);
        System.out.println("Public key is (" + n + "," + e + ")");
        for (i = 0; i <= 9; i++) {
            int x = 1 + (i * z);


            if (x % e == 0) {
                d = x / e;
                break;
            }
        }
        System.out.println("The value of d is " + d);


        System.out.println("Private key is (" + n + "," + d + ")");
        c = (Math.pow(msg, e)) % n;
        System.out.println("Message after encryption : " + c);

        // converting int value of n to BigInteger
        BigInteger N = BigInteger.valueOf(n);

        // converting float value of c to BigInteger
        BigInteger C = BigDecimal.valueOf(c).toBigInteger();
        msgback = (C.pow(d)).mod(N);
        System.out.println("Original Message was : "
                + msgback);
    }

    static int gcd(int e, int z)
    {
        if (e == 0)
            return z;
        else
            return gcd(z % e, e);
    }
}
