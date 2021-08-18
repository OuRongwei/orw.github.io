import java.io.IOException;

public final class as
{
  private static final int[] jdField_a_of_type_ArrayOfInt = { 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 0, 99, 99 };
  private static final int[] jdField_b_of_type_ArrayOfInt = { 3, 4, 5, 6, 7, 8, 9, 10, 11, 13, 15, 17, 19, 23, 27, 31, 35, 43, 51, 59, 67, 83, 99, 115, 131, 163, 195, 227, 258, 0, 0 };
  private static final int[] jdField_c_of_type_ArrayOfInt = { 0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13 };
  private static final int[] d = { 1, 2, 3, 4, 5, 7, 9, 13, 17, 25, 33, 49, 65, 97, 129, 193, 257, 385, 513, 769, 1025, 1537, 2049, 3073, 4097, 6145, 8193, 12289, 16385, 24577 };
  private static final int[] e = { 16, 17, 18, 0, 8, 7, 9, 6, 10, 5, 11, 4, 12, 3, 13, 2, 14, 1, 15 };
  private static int jdField_a_of_type_Int;
  private static int jdField_b_of_type_Int;
  private static int jdField_c_of_type_Int;
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    jdField_a_of_type_Int = jdField_b_of_type_Int = jdField_c_of_type_Int = 0;
    if ((a(paramArrayOfByte, 16) != 35615) || (a(paramArrayOfByte, 8) != 8)) {
      throw new IOException("Invalid GZIP format");
    }
    int i = a(paramArrayOfByte, 8);
    jdField_a_of_type_Int += 6;
    if ((i & 0x4) != 0) {
      jdField_a_of_type_Int += a(paramArrayOfByte, 16);
    }
    while (((i & 0x8) != 0) && (paramArrayOfByte[(jdField_a_of_type_Int++)] != 0)) {}
    while (((i & 0x10) != 0) && (paramArrayOfByte[(jdField_a_of_type_Int++)] != 0)) {}
    if ((i & 0x2) != 0) {
      jdField_a_of_type_Int += 2;
    }
    i = jdField_a_of_type_Int;
    jdField_a_of_type_Int = paramArrayOfByte.length - 4;
    byte[] arrayOfByte1 = new byte[a(paramArrayOfByte, 16) | a(paramArrayOfByte, 16) << 16];
    int j = 0;
    jdField_a_of_type_Int = i;
    do
    {
      i = a(paramArrayOfByte, 1);
      int k;
      if ((k = a(paramArrayOfByte, 2)) == 0)
      {
        jdField_c_of_type_Int = 0;
        k = a(paramArrayOfByte, 16);
        a(paramArrayOfByte, 16);
        System.arraycopy(paramArrayOfByte, jdField_a_of_type_Int, arrayOfByte1, j, k);
        jdField_a_of_type_Int += k;
        j += k;
      }
      else
      {
        int i1;
        int i3;
        int[] arrayOfInt1;
        int[] arrayOfInt2;
        if (k == 2)
        {
          int m = a(paramArrayOfByte, 5) + 257;
          i1 = a(paramArrayOfByte, 5) + 1;
          i3 = a(paramArrayOfByte, 4) + 4;
          byte[] arrayOfByte4 = new byte[19];
          for (int i5 = 0; i5 < i3; i5++) {
            arrayOfByte4[e[i5]] = ((byte)a(paramArrayOfByte, 3));
          }
          int[] arrayOfInt3 = a(arrayOfByte4, 18);
          arrayOfInt1 = a(a(paramArrayOfByte, arrayOfInt3, m), m - 1);
          arrayOfInt2 = a(a(paramArrayOfByte, arrayOfInt3, i1), i1 - 1);
        }
        else
        {
          byte[] arrayOfByte2 = new byte['Ġ'];
          for (i1 = 0; i1 < 144; i1++) {
            arrayOfByte2[i1] = 8;
          }
          for (i1 = 144; i1 < 256; i1++) {
            arrayOfByte2[i1] = 9;
          }
          for (i1 = 256; i1 < 280; i1++) {
            arrayOfByte2[i1] = 7;
          }
          for (i1 = 280; i1 < 288; i1++) {
            arrayOfByte2[i1] = 8;
          }
          arrayOfInt1 = a(arrayOfByte2, 287);
          byte[] arrayOfByte3 = new byte[32];
          for (i3 = 0; i3 < arrayOfByte3.length; i3++) {
            arrayOfByte3[i3] = 5;
          }
          arrayOfInt2 = a(arrayOfByte3, 31);
        }
        int n = 0;
        int i2 = 0;
        while ((n = a(paramArrayOfByte, arrayOfInt1)) != 256) {
          if (n > 256)
          {
            n -= 257;
            int i4 = jdField_b_of_type_ArrayOfInt[n];
            if ((i2 = jdField_a_of_type_ArrayOfInt[n]) > 0) {
              i4 += a(paramArrayOfByte, i2);
            }
            n = a(paramArrayOfByte, arrayOfInt2);
            int i6 = d[n];
            if ((i3 = jdField_c_of_type_ArrayOfInt[n]) > 0) {
              i6 += a(paramArrayOfByte, i3);
            }
            n = j - i6;
            while (i6 < i4)
            {
              System.arraycopy(arrayOfByte1, n, arrayOfByte1, j, i6);
              j += i6;
              i4 -= i6;
              i6 <<= 1;
            }
            System.arraycopy(arrayOfByte1, n, arrayOfByte1, j, i4);
            j += i4;
          }
          else
          {
            arrayOfByte1[(j++)] = ((byte)n);
          }
        }
      }
    } while (i == 0);
    return arrayOfByte1;
  }
  
  private static int a(byte[] paramArrayOfByte, int paramInt)
  {
    int i = jdField_c_of_type_Int == 0 ? (jdField_b_of_type_Int = paramArrayOfByte[(jdField_a_of_type_Int++)] & 0xFF) : jdField_b_of_type_Int >> jdField_c_of_type_Int;
    for (int j = 8 - jdField_c_of_type_Int; j < paramInt; j += 8)
    {
      jdField_b_of_type_Int = paramArrayOfByte[(jdField_a_of_type_Int++)] & 0xFF;
      i |= jdField_b_of_type_Int << j;
    }
    jdField_c_of_type_Int = jdField_c_of_type_Int + paramInt & 0x7;
    return i & (1 << paramInt) - 1;
  }
  
  private static int a(byte[] paramArrayOfByte, int[] paramArrayOfInt)
  {
    int i = paramArrayOfInt[0];
    while (i >= 0)
    {
      if (jdField_c_of_type_Int == 0) {
        jdField_b_of_type_Int = paramArrayOfByte[(jdField_a_of_type_Int++)] & 0xFF;
      }
      i = (jdField_b_of_type_Int & 1 << jdField_c_of_type_Int) == 0 ? paramArrayOfInt[(i >> 16)] : paramArrayOfInt[(i & 0xFFFF)];
      jdField_c_of_type_Int = jdField_c_of_type_Int + 1 & 0x7;
    }
    return i & 0xFFFF;
  }
  
  private static byte[] a(byte[] paramArrayOfByte, int[] paramArrayOfInt, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i = 0;
    int j = 0;
    for (int k = 0; i < paramInt; k = j) {
      if ((j = a(paramArrayOfByte, paramArrayOfInt)) >= 16)
      {
        int m;
        if (j == 16)
        {
          m = 3 + a(paramArrayOfByte, 2);
          j = k;
        }
        else
        {
          if (j == 17) {
            m = 3 + a(paramArrayOfByte, 3);
          } else {
            m = 11 + a(paramArrayOfByte, 7);
          }
          j = 0;
        }
        while (m-- > 0) {
          arrayOfByte[(i++)] = ((byte)j);
        }
      }
      else
      {
        arrayOfByte[(i++)] = ((byte)j);
      }
    }
    return arrayOfByte;
  }
  
  private static int[] a(byte[] paramArrayOfByte, int paramInt)
  {
    int[] arrayOfInt1 = new int[17];
    for (int j = 0; j < paramArrayOfByte.length; j++) {
      arrayOfInt1[paramArrayOfByte[j]] += 1;
    }
    j = 0;
    arrayOfInt1[0] = 0;
    int[] arrayOfInt2 = new int[17];
    for (int k = 1; k <= 16; k++) {
      arrayOfInt2[k] = (j = j + arrayOfInt1[(k - 1)] << 1);
    }
    int[] arrayOfInt3 = new int[(paramInt << 1) + 16];
    int i = 1;
    for (int m = 0; m <= paramInt; m++)
    {
      int n;
      if ((n = paramArrayOfByte[m]) != 0)
      {
        int tmp108_106 = n;
        int[] tmp108_104 = arrayOfInt2;
        int tmp110_109 = tmp108_104[tmp108_106];
        tmp108_104[tmp108_106] = (tmp110_109 + 1);
        j = tmp110_109;
        int i1 = 0;
        n--;
        while (n >= 0)
        {
          int i2;
          if ((j & 1 << n) == 0)
          {
            if ((i2 = arrayOfInt3[i1] >> 16) == 0)
            {
              arrayOfInt3[i1] |= i << 16;
              i1 = i++;
            }
            else
            {
              i1 = i2;
            }
          }
          else if ((i2 = arrayOfInt3[i1] & 0xFFFF) == 0)
          {
            arrayOfInt3[i1] |= i;
            i1 = i++;
          }
          else
          {
            i1 = i2;
          }
          n--;
        }
        arrayOfInt3[i1] = (0x80000000 | m);
      }
    }
    return arrayOfInt3;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\as.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */