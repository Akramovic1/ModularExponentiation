# ModularExponentiation
prpgram which calculate ModularExponentiation in different ways and print their execution time

* Naive-1
  * Pseudo code:
    * r = 1
    * for i=0 to to n -1 { r = r * b}
    * r = r mod m
    * measure time of execution
* Naive-2
  * Pseudo code:
    * r = 1
    * for i=0 to to n -1 { r = (r * b) mod m}
    * measure time of execution
* Modular Exponentiation-Iterative
  * Pseudo code:
    * r = 1
    * while n > 0
    * if last bit of n = 1
    * r = (r*b) mod m
    * shift n 1 bit to the right
    * b = (b*b) mod m
    * measure time of execution
 * Modular Exponentiation Recursive
  * Pseudo code:
    * result = 1
    * base case
    * if b == 0 {return 0}
    * if n == 0 {return 1}
    * if n is even number
    * r = MDREC(b,n/2,m)
    * r = (r*r) mod m
    * if n is odd number
    * r = b mod m
    * r = (r * MDREC(b,n-1,m) mod m ) mod m
    * measure time of execution
    * return (r+m) mod m
