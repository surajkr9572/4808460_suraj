 public static long flippingBits(long n) {
        ///If I am using bitwise operations, then Java internally converts the numbers to binary.
        
        return n^0xFFFFFFFFL; //0x → Hexadecimal notation
                                //0x is a prefix that tells Java you're writing a hexadecimal (base 16) number.
                                //FFFFFFFF → Hex value
                                //Each F in hex = 1111 in binary (4 bits).
                                //So FFFFFFFF = 8 × 4 = 32 bits all set to 1:
 // step 1. n=1  binary number is  00000000 00000000 00000000 00000001
     // to remove over flow use 64 bit long literal.
    //step 2. 0xFFFFFFFFL is 00000000 000000000 00000000 000000000     11111111 11111111 11111111 11111111 because 
    //step 3. xor operation n=1 00000000 00000000 00000000 00000001
    //               FFFFFFFF=  11111111 11111111 11111111 11111111
    //                          ----------------------------------------
    //                  result==11111111 11111111 11111111 11111110
    // in decimal           4294967294        
    }