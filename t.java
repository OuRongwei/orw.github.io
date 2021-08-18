import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public final class t
{
  public static int[][][][] a;
  private static int jdField_h_of_type_Int;
  public static a[][] a;
  private static int jdField_i_of_type_Int;
  private static int jdField_j_of_type_Int;
  public static int a;
  public static int b;
  public static int c;
  public static int d;
  private static int jdField_k_of_type_Int;
  private static au jdField_b_of_type_Au = new au();
  private static boolean jdField_e_of_type_Boolean;
  public static boolean a;
  public static short a;
  public static int e;
  private static byte jdField_c_of_type_Byte;
  private static byte[] jdField_a_of_type_ArrayOfByte = new byte[4];
  private static boolean jdField_f_of_type_Boolean;
  private static au jdField_c_of_type_Au;
  private static au jdField_d_of_type_Au;
  public static au a;
  public static byte a;
  private static String jdField_a_of_type_JavaLangString = "";
  public static byte b;
  private static byte jdField_d_of_type_Byte;
  private static String[] jdField_b_of_type_ArrayOfJavaLangString = { "遭遇战", "长安竞技场", "切磋战斗", "偷袭战斗", "帮会", "决胜峡谷", "中州山战场" };
  private static int[] jdField_a_of_type_ArrayOfInt = new int[15];
  private static byte jdField_e_of_type_Byte;
  private static byte jdField_f_of_type_Byte;
  private static byte jdField_g_of_type_Byte;
  private static byte jdField_h_of_type_Byte;
  public static int f;
  public static int g;
  public static boolean b;
  private static byte jdField_i_of_type_Byte;
  private static boolean jdField_g_of_type_Boolean;
  private static boolean jdField_h_of_type_Boolean;
  public static boolean c;
  public static boolean d;
  private static int[][] jdField_a_of_type_Array2dOfInt = new int[8][5];
  private static byte jdField_j_of_type_Byte;
  public static String[] a;
  private static String[] jdField_c_of_type_ArrayOfJavaLangString = new String[8];
  private static byte jdField_k_of_type_Byte;
  private static int[] jdField_b_of_type_ArrayOfInt = new int[16];
  private static byte[] jdField_b_of_type_ArrayOfByte = new byte[16];
  
  public static final void a(n paramn)
  {
    ab.a();
    jdField_h_of_type_Boolean = true;
    jdField_g_of_type_Boolean = ((jdField_b_of_type_Byte = paramn.a()) != 1) && (jdField_b_of_type_Byte != 4) && (jdField_b_of_type_Byte != 5);
    int m = paramn.a();
    jdField_i_of_type_Int = jdField_j_of_type_Int = -1;
    int n = -1;
    for (;;)
    {
      n++;
      if (n >= m) {
        break;
      }
      int i2 = (i1 = paramn.a()) / 4;
      i1 %= 4;
      jdField_a_of_type_Array2dOfA[i2][i1].jdField_j_of_type_Byte = 1;
      jdField_a_of_type_Array2dOfA[i2][i1].jdField_a_of_type_Long = paramn.a();
      jdField_a_of_type_Array2dOfA[i2][i1].jdField_a_of_type_JavaLangString = paramn.a();
      jdField_a_of_type_Array2dOfA[i2][i1].jdField_a_of_type_ArrayOfByte = new byte[33];
      jdField_a_of_type_Array2dOfA[i2][i1].jdField_g_of_type_Byte = paramn.a();
      n.a(jdField_a_of_type_Array2dOfA[i2][i1].jdField_a_of_type_ArrayOfByte, 2, jdField_a_of_type_Array2dOfA[i2][i1].jdField_g_of_type_Byte);
      n.a(jdField_a_of_type_Array2dOfA[i2][i1].jdField_a_of_type_ArrayOfByte, 3, paramn.a());
      int i4 = paramn.d();
      jdField_a_of_type_Array2dOfA[i2][i1].m = i4;
      jdField_a_of_type_Array2dOfA[i2][i1].a(i4);
      jdField_a_of_type_Array2dOfA[i2][i1].b(paramn.c());
      jdField_a_of_type_Array2dOfA[i2][i1].jdField_b_of_type_Byte = paramn.a();
      switch ((localObject = jdField_a_of_type_Array2dOfA[i2][i1]).jdField_b_of_type_Byte)
      {
      case 0: 
        localObject.jdField_j_of_type_Int |= 0x4;
        break;
      case 1: 
        localObject.jdField_j_of_type_Int |= 0x8;
        break;
      case 2: 
        localObject.jdField_j_of_type_Int |= 0x10000;
        break;
      case 3: 
        localObject.jdField_j_of_type_Int |= 0x8;
        ((a)localObject).jdField_f_of_type_Byte = 1;
        break;
      case 4: 
        localObject.jdField_j_of_type_Int |= 0x8;
        ((a)localObject).jdField_f_of_type_Byte = 2;
      }
      jdField_a_of_type_Array2dOfA[i2][i1].jdField_k_of_type_Int = i2;
      jdField_a_of_type_Array2dOfA[i2][i1].l = i1;
      int tmp416_415 = i1;
      byte[] tmp416_412 = jdField_a_of_type_ArrayOfByte;
      tmp416_412[tmp416_415] = ((byte)(tmp416_412[tmp416_415] + 1));
      if (jdField_a_of_type_Array2dOfA[i2][i1].jdField_a_of_type_Long == e.jdField_a_of_type_G.jdField_a_of_type_Long)
      {
        e.jdField_a_of_type_G.jdField_k_of_type_Int = jdField_a_of_type_Array2dOfA[i2][i1].jdField_k_of_type_Int;
        e.jdField_a_of_type_G.l = jdField_a_of_type_Array2dOfA[i2][i1].l;
        e.jdField_a_of_type_G.jdField_j_of_type_Byte = 1;
      }
      jdField_a_of_type_Array2dOfA[i2][i1].a(5, 0, 0);
      if ((i1 == 0) || (i1 == 1))
      {
        jdField_a_of_type_Array2dOfA[i2][i1].a(true);
        if ((jdField_i_of_type_Int == -1) && (jdField_j_of_type_Int == -1))
        {
          jdField_i_of_type_Int = i2;
          jdField_j_of_type_Int = i1;
          g.j = jdField_a_of_type_Array2dOfA[i2][i1];
        }
      }
      else
      {
        jdField_a_of_type_Array2dOfA[i2][i1].a(false);
      }
      jdField_a_of_type_Array2dOfA[i2][i1].jdField_a_of_type_J.a();
      if (jdField_a_of_type_Array2dOfA[i2][i1].jdField_g_of_type_Byte == 0)
      {
        jdField_a_of_type_Array2dOfA[i2][i1].jdField_j_of_type_Int |= 0x40;
        jdField_a_of_type_Array2dOfA[i2][i1].f();
      }
    }
    if ((jdField_i_of_type_Int == -1) || (jdField_j_of_type_Int == -1))
    {
      jdField_i_of_type_Int = e.jdField_a_of_type_G.jdField_k_of_type_Int;
      jdField_j_of_type_Int = e.jdField_a_of_type_G.l;
    }
    if (e.jdField_a_of_type_G.l <= 1)
    {
      a(jdField_a_of_type_Array2dOfA, 0, 3);
      a(jdField_a_of_type_Array2dOfA, 1, 2);
      n = jdField_a_of_type_ArrayOfByte[0];
      jdField_a_of_type_ArrayOfByte[0] = jdField_a_of_type_ArrayOfByte[3];
      jdField_a_of_type_ArrayOfByte[3] = n;
      n = jdField_a_of_type_ArrayOfByte[1];
      jdField_a_of_type_ArrayOfByte[1] = jdField_a_of_type_ArrayOfByte[2];
      jdField_a_of_type_ArrayOfByte[2] = n;
      e.jdField_a_of_type_G.l = (e.jdField_a_of_type_G.l == 0 ? 3 : 0);
    }
    Object localObject = { 0, 1, 3, 2 };
    paramn = 0;
    m = 0;
    while (paramn < 4)
    {
      if (jdField_a_of_type_Array2dOfA[m][localObject[paramn]].jdField_j_of_type_Byte == 1)
      {
        i1 = localObject[paramn];
        n = m;
        int[] arrayOfInt = new int[2];
        int i5 = 45;
        int i6 = 20;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        switch (d.jdField_a_of_type_Int)
        {
        case 176: 
          i7 = 11;
          i9 = 5;
          i10 = 30;
          i6 = 0;
          break;
        case 240: 
          i7 = 18;
          i9 = 20;
          i10 = 100;
          break;
        case 320: 
          i7 = 28;
          i9 = 8;
          i10 = 90;
          break;
        case 360: 
          i7 = 27;
          i9 = 40;
          i10 = 200;
          break;
        case 640: 
          i7 = 64;
          i9 = 20;
          i10 = 150;
          i5 = 128;
          i6 = 20;
        }
        switch (jdField_a_of_type_ArrayOfByte[i1])
        {
        case 0: 
          break;
        case 1: 
        case 3: 
          i8 = d.jdField_b_of_type_Int - i10 - 160 >> 1;
          break;
        case 2: 
        case 4: 
          i8 = (d.jdField_b_of_type_Int - i10 - 160) / 3;
        }
        i10 = d.jdField_a_of_type_Int - i5 - i7 * 3 - 96;
        i5 = i5 + 24 >> 1;
        i6 = i6 + 20 + 40;
        if ((jdField_a_of_type_Array2dOfA[n][i1].jdField_j_of_type_Int & 0x10000) == 0)
        {
          arrayOfInt[0] = (i5 + i1 * 24 + (i1 > 1 ? i10 : 0) + i7 * i1);
          arrayOfInt[1] = (i6 + ((i1 > 0) && (i1 <= 2) ? i9 : 0) + n * 40 + i8 * n);
        }
        else
        {
          arrayOfInt[0] = (jdField_a_of_type_Array2dOfA[n][3].jdField_b_of_type_Int - f.jdField_a_of_type_Int + (i7 + 24) * (i1 == 1 ? 1 : -1));
          arrayOfInt[1] = (jdField_a_of_type_Array2dOfA[n][3].jdField_c_of_type_Int - f.jdField_b_of_type_Int + i9);
        }
        jdField_a_of_type_Array2dOfA[n][i1].b(arrayOfInt[0] + f.jdField_a_of_type_Int, arrayOfInt[1] + f.jdField_b_of_type_Int);
        i5 = arrayOfInt[1];
        i3 = arrayOfInt[0];
        i1 = i1;
        n = n;
        jdField_a_of_type_Array4dOfInt[n][i1][0][0] = i3;
        jdField_a_of_type_Array4dOfInt[n][i1][0][1] = i5;
        jdField_a_of_type_Array4dOfInt[n][i1][1][0] = (i3 + (i1 > 1 ? -32 : 32));
        jdField_a_of_type_Array4dOfInt[n][i1][1][1] = i5;
        jdField_a_of_type_Array4dOfInt[n][i1][2][0] = (i3 + (i1 > 1 ? -16 : 16));
        jdField_a_of_type_Array4dOfInt[n][i1][2][1] = i5;
      }
      if (m++ >= 3)
      {
        m = 0;
        paramn++;
      }
    }
    n localn = -1;
    while (jdField_c_of_type_Au != null)
    {
      localn++;
      if (localn >= jdField_c_of_type_Au.jdField_a_of_type_Int - 2) {
        break;
      }
      ((aa)jdField_c_of_type_Au.a(localn)).jdField_c_of_type_Byte = 0;
    }
    localn = -1;
    while (jdField_d_of_type_Au != null)
    {
      localn++;
      if (localn >= jdField_d_of_type_Au.jdField_a_of_type_Int) {
        break;
      }
      if (jdField_d_of_type_Au.a(localn) != null) {
        ((aa)jdField_d_of_type_Au.a(localn)).jdField_c_of_type_Byte = 0;
      }
    }
    n();
    jdField_e_of_type_Int = jdField_a_of_type_Short = -1;
    jdField_a_of_type_Byte = 0;
    n = d.jdField_a_of_type_Int < 240 ? 36 : 49;
    int i1 = d.jdField_a_of_type_Int < 320 ? 50 : 60;
    int i3 = n - 29 >> 1;
    paramn = i1 - 45 >> 1;
    m = d.jdField_a_of_type_Int - n * 3 >> 1;
    localn = d.jdField_b_of_type_Int - i1 * 3 >> 1;
    jdField_a_of_type_ArrayOfInt[4] = (m + n + i3);
    jdField_a_of_type_ArrayOfInt[5] = (localn + paramn + i1);
    jdField_a_of_type_ArrayOfInt[10] = (-i1 / 3);
    jdField_a_of_type_ArrayOfInt[11] = (-n / 3);
    jdField_a_of_type_ArrayOfInt[12] = (n / 3);
    jdField_a_of_type_ArrayOfInt[13] = (i1 / 3);
    j();
    g(1);
    jdField_f_of_type_Int = f.jdField_a_of_type_Int;
    jdField_g_of_type_Int = f.jdField_b_of_type_Int;
    jdField_b_of_type_Boolean = false;
    if (e.jdField_a_of_type_G.jdField_b_of_type_Boolean) {
      jdField_f_of_type_Boolean = true;
    }
    if (e.jdField_a_of_type_Bc.a("tip") != null) {
      e.jdField_a_of_type_Bc.e("tip");
    }
  }
  
  public static void a()
  {
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= 4) {
        break;
      }
      int n = -1;
      for (;;)
      {
        n++;
        if (n >= 4) {
          break;
        }
        if (jdField_a_of_type_Array2dOfA[m][n] == null) {
          jdField_a_of_type_Array2dOfA[m][n] = new a();
        } else {
          jdField_a_of_type_Array2dOfA[m][n].a();
        }
      }
    }
  }
  
  private static void a(a[][] paramArrayOfa, int paramInt1, int paramInt2)
  {
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= paramArrayOfa.length) {
        break;
      }
      a locala = paramArrayOfa[m][paramInt1];
      paramArrayOfa[m][paramInt1] = paramArrayOfa[m][paramInt2];
      if (paramArrayOfa[m][paramInt1].jdField_j_of_type_Byte == 1)
      {
        paramArrayOfa[m][paramInt1].l = paramInt1;
        paramArrayOfa[m][paramInt1].a(true);
      }
      paramArrayOfa[m][paramInt2] = locala;
      if (paramArrayOfa[m][paramInt2].jdField_j_of_type_Byte == 1)
      {
        paramArrayOfa[m][paramInt2].l = paramInt2;
        paramArrayOfa[m][paramInt2].a(false);
      }
    }
  }
  
  public static final void b(n paramn)
  {
    int m = paramn.a();
    jdField_i_of_type_Byte = 0;
    int n = -1;
    for (;;)
    {
      n++;
      if (n >= m) {
        break;
      }
      au localau = jdField_b_of_type_Au;
      n localn = paramn;
      v localv1 = new v();
      v localv2 = null;
      if (localau.jdField_a_of_type_Int != 0) {
        localv2 = (v)localau.b();
      }
      int i2 = localn.a();
      localv1.jdField_a_of_type_ArrayOfW = new w[i2];
      int i3 = -1;
      Object localObject;
      w localw;
      for (;;)
      {
        i3++;
        if (i3 >= i2) {
          break;
        }
        localv1.jdField_a_of_type_ArrayOfW[i3] = new w(localv1);
        localObject = localn;
        (localw = localv1.jdField_a_of_type_ArrayOfW[i3]).jdField_a_of_type_A = a(((n)localObject).a());
        localw.jdField_b_of_type_A = a(((n)localObject).a());
        localw.jdField_a_of_type_Int = ((n)localObject).a();
        localw.jdField_b_of_type_Int = (localw.jdField_c_of_type_Int = localw.jdField_d_of_type_Int = localw.jdField_a_of_type_Byte = -1);
        if (localw.jdField_a_of_type_Int == 1)
        {
          localw.jdField_b_of_type_Int = ((n)localObject).d();
          if (localw.jdField_b_of_type_Int == 255) {
            localw.jdField_a_of_type_Int = 8;
          }
          localw.jdField_a_of_type_Short = ((short)((n)localObject).d());
          localw.jdField_c_of_type_Int = ((n)localObject).a();
          localw.jdField_d_of_type_Int = ((n)localObject).a();
          if (localw.jdField_c_of_type_Int == 3) {
            localw.jdField_d_of_type_Int = 1;
          }
          new StringBuffer().append("_effectID:").append(localw.jdField_b_of_type_Int).append(",_playEffect:").append(0).append(",_rangeEffect:").append(localw.jdField_c_of_type_Int).append(",_skillAttackType:").append(localw.jdField_d_of_type_Int).toString();
        }
        else if (localw.jdField_a_of_type_Int == 0)
        {
          localw.jdField_b_of_type_Byte = ((n)localObject).a();
          new StringBuffer().append("meleeAttackType:").append(localw.jdField_b_of_type_Byte).toString();
          if (localw.jdField_b_of_type_Byte == 50)
          {
            localw.jdField_a_of_type_Int = 1;
            localw.jdField_b_of_type_Int = localw.jdField_b_of_type_Byte;
            localw.jdField_a_of_type_Short = -1;
            localw.jdField_c_of_type_Int = 0;
            localw.jdField_d_of_type_Int = 1;
            localw.jdField_a_of_type_Byte = 0;
          }
        }
        int i4;
        if ((((i4 = ((n)localObject).a()) == 0) && (localw.jdField_a_of_type_Int != 8)) || (localw.jdField_a_of_type_A == null) || (localw.jdField_b_of_type_A == null)) {
          localw.jdField_a_of_type_Int = 8;
        }
        localw.jdField_a_of_type_ArrayOfU = new u[i4];
        int i5 = -1;
        for (;;)
        {
          i5++;
          if (i5 >= i4) {
            break;
          }
          localw.jdField_a_of_type_ArrayOfU[i5] = new u((n)localObject);
        }
        localw.b();
        localw.a();
      }
      localv1.jdField_b_of_type_Int = 0;
      if (localv1.jdField_a_of_type_ArrayOfW.length > 0) {
        switch (localv1.jdField_a_of_type_ArrayOfW[localv1.jdField_b_of_type_Int].jdField_a_of_type_Int)
        {
        case 0: 
          if ((localv2 != null) && (!localv2.jdField_a_of_type_ArrayOfW[localv1.jdField_b_of_type_Int].a())) {
            if ((((localw = localv2.jdField_a_of_type_ArrayOfW[localv1.jdField_b_of_type_Int]).jdField_a_of_type_A != null) && (localw.jdField_a_of_type_A.jdField_f_of_type_A != null) && (localw.jdField_a_of_type_A.jdField_f_of_type_A.jdField_a_of_type_Int == 35) ? 1 : 0) == 0)
            {
              localObject = localv1.jdField_a_of_type_ArrayOfW[localv1.jdField_b_of_type_Int].jdField_a_of_type_A;
              localw = localv2.jdField_a_of_type_ArrayOfW[localv1.jdField_b_of_type_Int];
              int i1 = ((a)localObject).l > 1 ? 1 : 0;
              i2 = localw.jdField_a_of_type_A.l > 1 ? 1 : 0;
              if ((i1 == i2 ? 1 : (localObject == null) || (((a)localObject).jdField_j_of_type_Byte != 1) ? 0 : 0) != 0) {
                if ((localv2.jdField_a_of_type_ArrayOfW[localv1.jdField_b_of_type_Int].jdField_a_of_type_Int == 0) && (localv2.jdField_a_of_type_ArrayOfW.length <= 1) && (localv1.jdField_a_of_type_ArrayOfW.length <= 1))
                {
                  while (localv2.jdField_a_of_type_V != null) {
                    localv2 = localv2.jdField_a_of_type_V;
                  }
                  localv2.jdField_a_of_type_V = localv1;
                  jdField_i_of_type_Byte = (byte)(jdField_i_of_type_Byte + 1);
                  localv2.jdField_a_of_type_V.jdField_a_of_type_ArrayOfW[0].jdField_c_of_type_Byte = jdField_i_of_type_Byte;
                  continue;
                }
              }
            }
          }
          localau.a(localv1);
          break;
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 7: 
        case 8: 
          localau.a(localv1);
        }
      }
    }
    if ((jdField_e_of_type_Boolean = paramn.a() == 1 ? 1 : 0) != 0)
    {
      jdField_a_of_type_JavaLangString = paramn.a();
      jdField_d_of_type_Byte = paramn.a();
    }
    m();
    jdField_e_of_type_Int = jdField_a_of_type_Short = -1;
    jdField_a_of_type_Byte = 0;
    g(3);
  }
  
  public static final a a(long paramLong)
  {
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= 4) {
        break;
      }
      int n = -1;
      do
      {
        n++;
        if (n >= 4) {
          break;
        }
      } while ((jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Byte != 1) || (jdField_a_of_type_Array2dOfA[m][n].jdField_a_of_type_Long != paramLong));
      return jdField_a_of_type_Array2dOfA[m][n];
    }
    return null;
  }
  
  public static final void b()
  {
    if ((jdField_a_of_type_Int == 1) && (!jdField_f_of_type_Boolean)) {
      z.a(0);
    }
    if ((jdField_a_of_type_Int != 4) && (jdField_a_of_type_Int != 3) && (jdField_a_of_type_Int != 2) && (d.e() > 0)) {
      if (e.jdField_a_of_type_G.jdField_b_of_type_Boolean)
      {
        d.f();
      }
      else
      {
        int m = d.jdField_a_of_type_Int > 320 ? 60 : 30;
        if (ad.a(d.f(), d.h(), d.jdField_a_of_type_Int - m, d.jdField_b_of_type_Int - m, m, m))
        {
          jdField_f_of_type_Boolean = !jdField_f_of_type_Boolean;
          d.f();
        }
      }
    }
    int n = -1;
    for (;;)
    {
      n++;
      if (n >= 4) {
        break;
      }
      int i1 = -1;
      for (;;)
      {
        i1++;
        if (i1 >= 4) {
          break;
        }
        a locala;
        if (((locala = jdField_a_of_type_Array2dOfA[n][i1]) == null) || (locala.jdField_j_of_type_Byte == 1))
        {
          locala.c();
          locala = locala;
          int i2 = -1;
          for (;;)
          {
            i2++;
            if (i2 >= locala.jdField_a_of_type_Array2dOfInt.length) {
              break;
            }
            if ((locala.jdField_a_of_type_Array2dOfInt[i2][6] += 1 > 0) && (locala.jdField_a_of_type_Array2dOfInt[i2][6] != 99) && (locala.jdField_a_of_type_Array2dOfInt[i2][0] > 0))
            {
              locala.jdField_a_of_type_Array2dOfInt[i2][0] -= 1;
              if (locala.jdField_a_of_type_Array2dOfInt[i2][0] == 9)
              {
                locala.jdField_a_of_type_Array2dOfInt[i2][1] += (locala.jdField_a_of_type_Array2dOfInt[i2][7] << 2);
                locala.jdField_a_of_type_Array2dOfInt[i2][2] += (locala.jdField_a_of_type_Array2dOfInt[i2][8] << 2);
              }
              else if (locala.jdField_a_of_type_Array2dOfInt[i2][0] != 8)
              {
                if (locala.jdField_a_of_type_Array2dOfInt[i2][0] == 7)
                {
                  locala.jdField_a_of_type_Array2dOfInt[i2][1] += 2;
                  locala.jdField_a_of_type_Array2dOfInt[i2][2] += 2;
                }
                else if (locala.jdField_a_of_type_Array2dOfInt[i2][0] == 6)
                {
                  locala.jdField_a_of_type_Array2dOfInt[i2][1] -= 2;
                  locala.jdField_a_of_type_Array2dOfInt[i2][2] -= 2;
                }
                else if (locala.jdField_a_of_type_Array2dOfInt[i2][0] == 5)
                {
                  locala.jdField_a_of_type_Array2dOfInt[i2][2] += 1;
                }
                else if (locala.jdField_a_of_type_Array2dOfInt[i2][0] == 4)
                {
                  locala.jdField_a_of_type_Array2dOfInt[i2][2] -= 1;
                }
                else if (locala.jdField_a_of_type_Array2dOfInt[i2][0] <= 0)
                {
                  locala.jdField_a_of_type_Array2dOfInt[i2][6] = 99;
                  locala.jdField_a_of_type_Array2dOfInt[i2][0] = 0;
                  locala.jdField_a_of_type_Array2dOfInt[i2][9] = 1;
                }
              }
            }
          }
        }
      }
    }
    g.l.jdField_a_of_type_J.a(0);
    l();
    if (jdField_f_of_type_Byte > 0) {
      jdField_f_of_type_Byte = (byte)(jdField_f_of_type_Byte - 1);
    }
    p();
    switch (jdField_d_of_type_Int)
    {
    case 1: 
      if ((++jdField_b_of_type_Int % 10 == 0) && (--jdField_c_of_type_Int < -90))
      {
        e.w();
        e.jdField_a_of_type_Q.d();
        e.d("假死异常,请重新登录!");
      }
      switch (jdField_a_of_type_Int)
      {
      case 0: 
        if (((d.jdField_a_of_type_Boolean) || (!jdField_h_of_type_Boolean)) && (jdField_a_of_type_Int == 0))
        {
          jdField_a_of_type_Int = 1;
          jdField_h_of_type_Int = 0;
        }
        if (d.a(18) == 1)
        {
          if (e.jdField_a_of_type_G.jdField_b_of_type_Boolean)
          {
            d.b();
            return;
          }
          jdField_f_of_type_Boolean = !jdField_f_of_type_Boolean;
        }
        else if (d.a(15) == 1)
        {
          if (!e.jdField_a_of_type_G.jdField_b_of_type_Boolean) {
            return;
          }
          jdField_f_of_type_Boolean = e.jdField_a_of_type_G.jdField_b_of_type_Boolean = !e.jdField_a_of_type_G.jdField_b_of_type_Boolean ? 1 : 0;
        }
        break;
      case 1: 
        k();
        if (jdField_a_of_type_Byte == -1) {
          return;
        }
        o();
        h();
        if (d.a(0) == 1)
        {
          if ((e.jdField_a_of_type_G.jdField_b_of_type_Boolean) || (jdField_f_of_type_Boolean))
          {
            d.b();
            return;
          }
          jdField_c_of_type_Byte = 1;
          g();
          jdField_h_of_type_Int = 0;
          jdField_a_of_type_Int = 4;
        }
        else if (d.a(1) == 1)
        {
          if ((e.jdField_a_of_type_G.jdField_b_of_type_Boolean) || (jdField_f_of_type_Boolean))
          {
            d.b();
            return;
          }
          jdField_h_of_type_Int = 3;
          g(2);
        }
        else if (d.a(2) == 1)
        {
          if ((e.jdField_a_of_type_G.jdField_b_of_type_Boolean) || (jdField_f_of_type_Boolean))
          {
            d.b();
            return;
          }
          jdField_h_of_type_Int = 2;
          jdField_a_of_type_Int = 3;
          jdField_e_of_type_Int = jdField_a_of_type_Short = -1;
          e.jdField_a_of_type_Bc.a(bc.a(bc.a("pkitems"), "_ilist", b()));
          d.b();
        }
        else if (d.a(3) == 1)
        {
          if ((e.jdField_a_of_type_G.jdField_b_of_type_Boolean) || (jdField_f_of_type_Boolean))
          {
            d.b();
            return;
          }
          if (!a())
          {
            a(d.jdField_a_of_type_Int - (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth("没有可援护的目标!") >> 1) + jdField_f_of_type_Int, d.jdField_b_of_type_Int - 50 + jdField_g_of_type_Int, "没有可援护的目标!", 0);
            d.b();
            return;
          }
          jdField_c_of_type_Byte = 5;
          g();
          jdField_h_of_type_Int = 6;
          jdField_a_of_type_Int = 4;
        }
        else if (d.a(4) == 1)
        {
          if ((e.jdField_a_of_type_G.jdField_b_of_type_Boolean) || (jdField_f_of_type_Boolean))
          {
            d.b();
            return;
          }
          if (!b())
          {
            a(d.jdField_a_of_type_Int - (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth("沉默不可使用技能!") >> 1) + jdField_f_of_type_Int, d.jdField_b_of_type_Int - 50 + jdField_g_of_type_Int, "沉默不可使用技能!", 0);
            d.b();
            return;
          }
          jdField_h_of_type_Int = 1;
          jdField_a_of_type_Int = 2;
          jdField_e_of_type_Int = jdField_a_of_type_Short = -1;
          e.jdField_a_of_type_Bc.a(bc.a(bc.a("pkskill"), "_slist", a()));
        }
        else if (d.a(18) == 1)
        {
          if (e.jdField_a_of_type_G.jdField_b_of_type_Boolean)
          {
            d.b();
            return;
          }
          jdField_f_of_type_Boolean = !jdField_f_of_type_Boolean;
        }
        else if (d.a(15) == 1)
        {
          if (!e.jdField_a_of_type_G.jdField_b_of_type_Boolean) {
            return;
          }
          jdField_f_of_type_Boolean = e.jdField_a_of_type_G.jdField_b_of_type_Boolean = !e.jdField_a_of_type_G.jdField_b_of_type_Boolean ? 1 : 0;
        }
        if (d.a()) {
          d.b();
        }
        break;
      case 2: 
        if ((jdField_a_of_type_Short >= 201) && (jdField_a_of_type_Short <= 202))
        {
          switch (jdField_a_of_type_Short)
          {
          case 201: 
            jdField_h_of_type_Int = 7;
            jdField_c_of_type_Byte = 1;
            g();
            jdField_a_of_type_Int = 4;
            break;
          case 202: 
            jdField_h_of_type_Int = 4;
            g(2);
          }
          g.j = jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int];
        }
        else if ((jdField_a_of_type_Short > 0) && (jdField_a_of_type_Short <= 200))
        {
          e(0);
          g();
          if (jdField_c_of_type_Byte != -1)
          {
            jdField_a_of_type_Int = 4;
          }
          else
          {
            g.j = jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int];
            g(2);
          }
        }
        if ((!d.a((byte)12)) && (jdField_a_of_type_Short < 0)) {
          jdField_a_of_type_Int = 1;
        }
        break;
      case 3: 
        if (jdField_e_of_type_Int > 0)
        {
          e(1);
          g();
          if (jdField_c_of_type_Byte != -1)
          {
            jdField_a_of_type_Int = 4;
          }
          else
          {
            g.j = jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int];
            g(2);
          }
        }
        if ((!d.a((byte)12)) && (jdField_e_of_type_Int < 0)) {
          jdField_a_of_type_Int = 1;
        }
        break;
      case 4: 
        i();
        if (d.a(0) == 1) {
          f(0);
        } else if (d.a(1) == 1) {
          f(1);
        } else if (d.a(2) == 1) {
          f(2);
        } else if (d.a(3) == 1) {
          f(3);
        } else if (d.a(18) == 1) {
          jdField_a_of_type_Int = 1;
        }
        g.j = jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int];
        if (d.a(4) == 1) {
          g(2);
        }
        break;
      }
      if (jdField_c_of_type_Int <= 0)
      {
        if (e.jdField_a_of_type_Bc.a("pkskill") != null) {
          e.jdField_a_of_type_Bc.e("pkskill");
        }
        if (e.jdField_a_of_type_Bc.a("pkitems") != null) {
          e.jdField_a_of_type_Bc.e("pkitems");
        }
        jdField_c_of_type_Byte = 1;
        g();
        jdField_h_of_type_Int = 0;
        g(2);
      }
      break;
    case 2: 
      if (d.a(18) == 1)
      {
        if (e.jdField_a_of_type_G.jdField_b_of_type_Boolean)
        {
          d.b();
          return;
        }
        jdField_f_of_type_Boolean = !jdField_f_of_type_Boolean;
      }
      else if (d.a(15) == 1)
      {
        if (!e.jdField_a_of_type_G.jdField_b_of_type_Boolean) {
          return;
        }
        jdField_f_of_type_Boolean = e.jdField_a_of_type_G.jdField_b_of_type_Boolean = !e.jdField_a_of_type_G.jdField_b_of_type_Boolean ? 1 : 0;
      }
      break;
    case 3: 
      if (d.a(18) == 1)
      {
        if (e.jdField_a_of_type_G.jdField_b_of_type_Boolean)
        {
          d.b();
          return;
        }
        jdField_f_of_type_Boolean = !jdField_f_of_type_Boolean;
      }
      else if (d.a(15) == 1)
      {
        if (!e.jdField_a_of_type_G.jdField_b_of_type_Boolean) {
          return;
        }
        jdField_f_of_type_Boolean = e.jdField_a_of_type_G.jdField_b_of_type_Boolean = !e.jdField_a_of_type_G.jdField_b_of_type_Boolean ? 1 : 0;
      }
      v localv;
      if ((localv = (v)jdField_b_of_type_Au.a(jdField_k_of_type_Int)).jdField_a_of_type_Int == 0) {
        localv.a(1);
      }
      if ((localv.a() == 2) && (++jdField_k_of_type_Int == jdField_b_of_type_Au.jdField_a_of_type_Int)) {
        if (jdField_e_of_type_Boolean) {
          g(5);
        } else {
          g(4);
        }
      }
      break;
    case 5: 
      if (++jdField_b_of_type_Int % 10 == 0) {
        jdField_c_of_type_Int -= 1;
      }
      if (jdField_c_of_type_Int <= 0)
      {
        d();
        bc.i();
        if (!jdField_d_of_type_Boolean)
        {
          d.a();
          d.a((byte)8, 0);
        }
        else
        {
          d.a();
          d.a((byte)7, 64);
          d.b();
          f();
          return;
        }
        c();
        d.b();
        f();
      }
      break;
    }
    if (d.a(16) == 1)
    {
      if (e.jdField_a_of_type_G.jdField_b_of_type_Boolean)
      {
        d.f();
        d.b();
        return;
      }
      d.f();
      y.a();
      d.b();
    }
    if (d.e() > 0) {
      d.f();
    }
  }
  
  private static void f()
  {
    e.jdField_a_of_type_G.k();
    jdField_b_of_type_Int = 0;
    jdField_c_of_type_Int = 5;
    jdField_b_of_type_Boolean = true;
    ab.a();
  }
  
  public static void c()
  {
    if ((jdField_a_of_type_JavaLangString == null) || (jdField_a_of_type_JavaLangString.length() <= 0)) {
      jdField_a_of_type_JavaLangString = "没有任何事发生";
    }
    if (jdField_d_of_type_Byte == 0)
    {
      if (jdField_a_of_type_JavaLangString != null) {
        e.b(jdField_a_of_type_JavaLangString);
      }
      jdField_a_of_type_JavaLangString = null;
      return;
    }
    if (e.jdField_a_of_type_G.jdField_b_of_type_Boolean) {
      e.jdField_a_of_type_G.jdField_b_of_type_Boolean = false;
    }
    e();
  }
  
  private static void g()
  {
    a locala1 = jdField_a_of_type_Byte == 0 ? e.jdField_a_of_type_G : jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][Math.abs(e.jdField_a_of_type_G.l - 1)];
    a locala2 = null;
    if (locala1 == null) {
      return;
    }
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= 4) {
        break;
      }
      int n = -1;
      for (;;)
      {
        n++;
        if (n >= 4) {
          break;
        }
        if (jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Byte == 1)
        {
          locala2 = jdField_a_of_type_Array2dOfA[m][n];
          switch (jdField_c_of_type_Byte)
          {
          case 0: 
            break;
          case -1: 
          case 1: 
            switch (locala1.l)
            {
            case 0: 
            case 1: 
              if ((locala2.l >= 2) && ((locala2.jdField_j_of_type_Int & 0x40) == 0))
              {
                jdField_i_of_type_Int = locala2.jdField_k_of_type_Int;
                jdField_j_of_type_Int = locala2.l;
              }
              break;
            case 2: 
            case 3: 
              if ((locala2.l < 2) && ((locala2.jdField_j_of_type_Int & 0x40) == 0))
              {
                jdField_i_of_type_Int = locala2.jdField_k_of_type_Int;
                jdField_j_of_type_Int = locala2.l;
              }
              break;
            }
            break;
          case 2: 
            switch (locala1.l)
            {
            case 0: 
            case 1: 
              if (locala2.l < 2)
              {
                jdField_i_of_type_Int = locala2.jdField_k_of_type_Int;
                jdField_j_of_type_Int = locala2.l;
              }
              break;
            case 2: 
            case 3: 
              if (locala2.l >= 2)
              {
                jdField_i_of_type_Int = locala2.jdField_k_of_type_Int;
                jdField_j_of_type_Int = locala2.l;
              }
              break;
            }
            break;
          case 3: 
            jdField_i_of_type_Int = e.jdField_a_of_type_G.jdField_k_of_type_Int;
            jdField_j_of_type_Int = e.jdField_a_of_type_G.l;
            break;
          case 4: 
            break;
          case 5: 
            switch (locala1.l)
            {
            case 0: 
            case 1: 
              if ((locala2.l < 2) && (locala2.jdField_a_of_type_Long != locala1.jdField_a_of_type_Long))
              {
                jdField_i_of_type_Int = locala2.jdField_k_of_type_Int;
                jdField_j_of_type_Int = locala2.l;
              }
              break;
            case 2: 
            case 3: 
              if ((locala2.l >= 2) && (locala2.jdField_a_of_type_Long != locala1.jdField_a_of_type_Long))
              {
                jdField_i_of_type_Int = locala2.jdField_k_of_type_Int;
                jdField_j_of_type_Int = locala2.l;
              }
              break;
            }
            break;
          }
        }
      }
    }
    if ((jdField_i_of_type_Int == -1) || (jdField_j_of_type_Int == -1))
    {
      jdField_i_of_type_Int = locala1.jdField_k_of_type_Int;
      jdField_j_of_type_Int = locala1.l;
    }
    g.j = jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int];
  }
  
  private static void e(int paramInt)
  {
    au localau = paramInt == 0 ? jdField_d_of_type_Au : jdField_a_of_type_Byte == 0 ? jdField_c_of_type_Au : jdField_a_of_type_Au;
    int m = -1;
    while (localau != null)
    {
      m++;
      if (m >= localau.jdField_a_of_type_Int) {
        break;
      }
      aa localaa;
      if ((localaa = (aa)localau.a(m)).jdField_a_of_type_Int == (paramInt == 0 ? jdField_a_of_type_Short : jdField_e_of_type_Int)) {
        switch (localaa.jdField_a_of_type_Byte)
        {
        case 0: 
          jdField_c_of_type_Byte = -1;
          break;
        case 1: 
        case 3: 
          jdField_c_of_type_Byte = 1;
          break;
        case 2: 
        case 4: 
          jdField_c_of_type_Byte = 2;
          break;
        case 5: 
          jdField_c_of_type_Byte = 3;
          break;
        case 6: 
          jdField_c_of_type_Byte = 4;
        }
      }
    }
  }
  
  private static void h()
  {
    if (d.e() > 0)
    {
      if ((e.jdField_a_of_type_G.jdField_b_of_type_Boolean) || (jdField_f_of_type_Boolean))
      {
        d.f();
        return;
      }
      int m = d.jdField_a_of_type_Int < 240 ? 36 : 49;
      int n = d.jdField_a_of_type_Int < 320 ? 50 : 60;
      int i1 = m - 29 >> 1;
      int i2 = n - 45 >> 1;
      int i3 = d.jdField_a_of_type_Int - m * 3 >> 1;
      int i4 = d.jdField_b_of_type_Int - n * 3 >> 1;
      if (ad.a(d.f(), d.h(), i3 + m + i1, i4 + i2, m, n))
      {
        jdField_h_of_type_Int = 0;
        jdField_c_of_type_Byte = 1;
        g();
        jdField_a_of_type_Int = 4;
        return;
      }
      if (ad.a(d.f(), d.h(), i3 + m + i1, i4 + i2 + (n << 1), m, n))
      {
        jdField_h_of_type_Int = 3;
        g(2);
        d.f();
        return;
      }
      if (ad.a(d.f(), d.h(), i3 + i1, i4 + i2 + n, m, n))
      {
        jdField_h_of_type_Int = 2;
        jdField_a_of_type_Int = 3;
        jdField_e_of_type_Int = jdField_a_of_type_Short = -1;
        e.jdField_a_of_type_Bc.a(bc.a(bc.a("pkitems"), "_ilist", b()));
        return;
      }
      if (ad.a(d.f(), d.h(), i3 + (m << 1) + i1, i4 + i2 + n, m, n))
      {
        if (!a())
        {
          a(d.jdField_a_of_type_Int - (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth("没有可援护的目标!") >> 1) + jdField_f_of_type_Int, d.jdField_b_of_type_Int - 50 + jdField_g_of_type_Int, "没有可援护的目标!", 0);
          d.f();
          return;
        }
        jdField_c_of_type_Byte = 5;
        g();
        jdField_h_of_type_Int = 6;
        jdField_a_of_type_Int = 4;
        return;
      }
      if (ad.a(d.f(), d.h(), i3 + m + i1, i4 + i2 + n, m, n))
      {
        if (!b())
        {
          a(d.jdField_a_of_type_Int - (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth("沉默不可使用技能!") >> 1) + jdField_f_of_type_Int, d.jdField_b_of_type_Int - 50 + jdField_g_of_type_Int, "沉默不可使用技能!", 0);
          d.f();
          return;
        }
        jdField_h_of_type_Int = 1;
        jdField_a_of_type_Int = 2;
        jdField_e_of_type_Int = jdField_a_of_type_Short = -1;
        e.jdField_a_of_type_Bc.a(bc.a(bc.a("pkskill"), "_slist", a()));
      }
    }
  }
  
  private static void i()
  {
    if (d.e() > 0)
    {
      int i3 = -1;
      for (;;)
      {
        i3++;
        if (i3 >= 4) {
          break;
        }
        int i4 = -1;
        a locala;
        int m;
        int n;
        int i1;
        int i2;
        do
        {
          do
          {
            i4++;
            if (i4 >= 4) {
              break;
            }
          } while (((locala = jdField_a_of_type_Array2dOfA[i3][i4]).jdField_j_of_type_Byte != 1) || (!a(jdField_c_of_type_Byte, locala.jdField_k_of_type_Int, locala.l)));
          m = d.f();
          n = d.h();
          i1 = locala.jdField_b_of_type_Int - jdField_f_of_type_Int;
          i2 = locala.jdField_c_of_type_Int - jdField_g_of_type_Int;
        } while (!ad.a(m, n, i1 - 15, i2 - 20, 30, 40));
        jdField_j_of_type_Int = locala.l;
        jdField_i_of_type_Int = locala.jdField_k_of_type_Int;
        if (g.j != jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int]) {
          g.j = jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int];
        } else {
          g(2);
        }
        d.f();
      }
      if (ad.a(d.f(), d.h(), d.jdField_a_of_type_Int - 60, d.jdField_b_of_type_Int - 60, 60, 60))
      {
        jdField_a_of_type_Int = 1;
        d.f();
      }
    }
  }
  
  private static void f(int paramInt)
  {
    int m = jdField_i_of_type_Int;
    int n = jdField_j_of_type_Int;
    if (paramInt == 0)
    {
      do
      {
        m--;
        if (m < 0) {
          m = jdField_a_of_type_Array2dOfA.length - 1;
        }
      } while ((jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Byte != 1) || (!a(jdField_c_of_type_Byte, m, n)));
    }
    else if (paramInt == 1)
    {
      do
      {
        m++;
        if (m >= jdField_a_of_type_Array2dOfA.length) {
          m = 0;
        }
      } while ((jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Byte != 1) || (!a(jdField_c_of_type_Byte, m, n)));
    }
    else
    {
      if (paramInt == 2)
      {
        n--;
        if (n < 0) {
          n = jdField_a_of_type_Array2dOfA.length - 1;
        }
        while ((jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Byte != 1) || (!a(jdField_c_of_type_Byte, m, n)))
        {
          m++;
          if (m >= jdField_a_of_type_Array2dOfA.length)
          {
            m = 0;
            n--;
            if (n < 0) {
              n = jdField_a_of_type_Array2dOfA.length - 1;
            }
          }
        }
      }
      if (paramInt == 3)
      {
        n++;
        if (n >= jdField_a_of_type_Array2dOfA.length) {
          n = 0;
        }
        while ((jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Byte != 1) || (!a(jdField_c_of_type_Byte, m, n)))
        {
          m++;
          if (m >= jdField_a_of_type_Array2dOfA.length)
          {
            m = 0;
            n++;
            if (n >= jdField_a_of_type_Array2dOfA.length) {
              n = 0;
            }
          }
        }
      }
    }
    jdField_i_of_type_Int = m;
    jdField_j_of_type_Int = n;
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3)
  {
    a locala;
    if ((locala = jdField_a_of_type_Byte == 0 ? e.jdField_a_of_type_G : jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][Math.abs(e.jdField_a_of_type_G.l - 1)]) == null) {
      return false;
    }
    switch (paramInt1)
    {
    case 0: 
      break;
    case 1: 
      switch (locala.l)
      {
      case 0: 
      case 1: 
        if (paramInt3 >= 2) {
          return true;
        }
        break;
      case 2: 
      case 3: 
        if (paramInt3 < 2) {
          return true;
        }
        break;
      }
      break;
    case 2: 
      switch (locala.l)
      {
      case 0: 
      case 1: 
        if (paramInt3 < 2) {
          return true;
        }
        break;
      case 2: 
      case 3: 
        if (paramInt3 >= 2) {
          return true;
        }
        break;
      }
      break;
    case 3: 
      if (a(e.jdField_a_of_type_G)) {
        return ((paramInt3 == e.jdField_a_of_type_G.l) && (paramInt2 == e.jdField_a_of_type_G.jdField_k_of_type_Int)) || ((paramInt2 == e.jdField_a_of_type_G.jdField_k_of_type_Int) && (paramInt3 == Math.abs(e.jdField_a_of_type_G.l - 1)));
      }
      return (paramInt3 == e.jdField_a_of_type_G.l) && (paramInt2 == e.jdField_a_of_type_G.jdField_k_of_type_Int);
    case 4: 
      return true;
    case 5: 
      switch (locala.l)
      {
      case 0: 
      case 1: 
        if ((paramInt3 < 2) && (jdField_a_of_type_Array2dOfA[paramInt2][paramInt3].jdField_a_of_type_Long != locala.jdField_a_of_type_Long)) {
          return true;
        }
        break;
      case 2: 
      case 3: 
        if ((paramInt3 >= 2) && (jdField_a_of_type_Array2dOfA[paramInt2][paramInt3].jdField_a_of_type_Long != locala.jdField_a_of_type_Long)) {
          return true;
        }
        break;
      }
      break;
    }
    return false;
  }
  
  private static void g(int paramInt)
  {
    for (;;)
    {
      Object localObject;
      switch (jdField_d_of_type_Int = paramInt)
      {
      case 1: 
        paramInt = jdField_a_of_type_Byte == 0 ? jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][e.jdField_a_of_type_G.l] : jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][Math.abs(e.jdField_a_of_type_G.l - 1)];
        if (((localObject = jdField_a_of_type_Byte == 0 ? jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][Math.abs(e.jdField_a_of_type_G.l - 1)] : jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][e.jdField_a_of_type_G.l]) != null) && ((localObject = localObject).h != null)) {
          ((a)localObject).h.jdField_j_of_type_Int &= 0xFFFFFFFD;
        }
        if (paramInt != null)
        {
          localObject = paramInt;
          if (paramInt.h == null) {
            ((a)localObject).h = new a();
          }
          ((a)localObject).h.a(4);
          ((a)localObject).h.a(40, 1, 0);
        }
        j();
        jdField_a_of_type_Int = 0;
        if (jdField_a_of_type_Byte != 0) {
          return;
        }
        jdField_b_of_type_Int = 0;
        jdField_c_of_type_Int = 30;
        n();
        return;
      case 2: 
        paramInt = e.jdField_a_of_type_Q.b();
        switch (jdField_h_of_type_Int)
        {
        case 0: 
          paramInt.a(48);
          paramInt.a(jdField_a_of_type_Byte);
          paramInt.a(jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int].jdField_a_of_type_Long);
          break;
        case 1: 
          paramInt.a(49);
          paramInt.a(jdField_a_of_type_Byte);
          if ((jdField_c_of_type_Byte != -1) && (jdField_c_of_type_Byte != 3)) {
            paramInt.a(jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int].jdField_a_of_type_Long);
          } else {
            paramInt.a(e.jdField_a_of_type_G.jdField_a_of_type_Long);
          }
          paramInt.a(jdField_a_of_type_Short);
          break;
        case 3: 
          paramInt.a(51);
          paramInt.a(jdField_a_of_type_Byte);
          break;
        case 6: 
          paramInt.a(53);
          paramInt.a(jdField_a_of_type_Byte);
          paramInt.a(jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int].jdField_a_of_type_Long);
          break;
        case 2: 
          paramInt.a(50);
          paramInt.a(jdField_a_of_type_Byte);
          paramInt.a(jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int].jdField_a_of_type_Long);
          paramInt.c(jdField_e_of_type_Int);
          break;
        case 4: 
          paramInt.a(52);
          break;
        case 5: 
          h.b("PkPets:0");
          break;
        case 7: 
          paramInt.a(54);
          paramInt.a(jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int].jdField_a_of_type_Long);
        }
        e.jdField_a_of_type_Q.c();
        jdField_a_of_type_Byte = (byte)(jdField_a_of_type_Byte + 1);
        if ((!a(e.jdField_a_of_type_G)) || (jdField_a_of_type_Byte != 1)) {
          return;
        }
        paramInt = 1;
        break;
      case 3: 
        jdField_k_of_type_Int = 0;
        return;
      case 4: 
        jdField_b_of_type_Au.a();
        paramInt = jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][e.jdField_a_of_type_G.l];
        localObject = jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][Math.abs(e.jdField_a_of_type_G.l - 1)];
        if (((paramInt.jdField_j_of_type_Int & 0x40) != 0) && (localObject != null) && ((((a)localObject).jdField_j_of_type_Int & 0x40) == 0))
        {
          jdField_a_of_type_Byte = 1;
          jdField_b_of_type_Int = 0;
          jdField_c_of_type_Int = 30;
          n();
        }
        else if (((paramInt.jdField_j_of_type_Int & 0x40) == 0) && (paramInt.jdField_a_of_type_Int != 61))
        {
          jdField_a_of_type_Byte = 0;
        }
        else
        {
          jdField_a_of_type_Byte = -1;
        }
        jdField_h_of_type_Boolean = false;
        paramInt = 1;
      }
    }
    d.c();
    paramInt = -1;
    for (;;)
    {
      paramInt++;
      if (paramInt >= 4) {
        break;
      }
      int m = -1;
      for (;;)
      {
        m++;
        if (m >= 4) {
          break;
        }
        if ((jdField_a_of_type_Array2dOfA[paramInt][m].jdField_j_of_type_Byte == 1) && (jdField_a_of_type_Array2dOfA[paramInt][m].jdField_a_of_type_Int != 61) && ((jdField_a_of_type_Array2dOfA[paramInt][m].jdField_j_of_type_Int & 0x40) == 0)) {
          jdField_a_of_type_Array2dOfA[paramInt][m].a(13, 0, 16);
        }
      }
    }
    if ((paramInt = jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][e.jdField_a_of_type_G.l]).jdField_j_of_type_Byte == 2)
    {
      jdField_b_of_type_Int = 0;
      jdField_c_of_type_Int = 2;
      return;
    }
    Math.abs(paramInt.l - 1);
    a(e.jdField_a_of_type_G);
    jdField_b_of_type_Int = 0;
    jdField_c_of_type_Int = 2;
  }
  
  public static void d()
  {
    g.j = null;
    jdField_h_of_type_Int = 0;
    jdField_b_of_type_Au.a();
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= 4) {
        break;
      }
      int n = -1;
      for (;;)
      {
        n++;
        if (n >= 4) {
          break;
        }
        if (jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Byte != 0) {
          jdField_a_of_type_Array2dOfA[m][n].a();
        }
      }
    }
    jdField_a_of_type_ArrayOfByte = new byte[4];
    jdField_a_of_type_Array4dOfInt = new int[4][4][3][2];
    if (jdField_a_of_type_Au != null) {
      jdField_a_of_type_Au.a();
    }
    m = -1;
    for (;;)
    {
      m++;
      if (m >= 7) {
        break;
      }
      g.a[m].jdField_b_of_type_Short = 0;
      g.c[m].jdField_b_of_type_Short = 0;
    }
    m = -1;
    for (;;)
    {
      m++;
      if (m >= jdField_a_of_type_Array2dOfInt.length) {
        break;
      }
      if (jdField_a_of_type_Array2dOfInt[m][0] > 0) {
        jdField_a_of_type_Array2dOfInt[m][0] = 0;
      }
      jdField_c_of_type_ArrayOfJavaLangString[m] = "";
      jdField_b_of_type_ArrayOfByte[m] = 0;
    }
    jdField_c_of_type_Int = -1;
    jdField_b_of_type_Int = 0;
    e.jdField_a_of_type_G.jdField_j_of_type_Byte = 0;
  }
  
  public static final void a(Graphics paramGraphics)
  {
    if (jdField_f_of_type_Byte > 0)
    {
      switch (jdField_e_of_type_Byte)
      {
      case 0: 
        if (!jdField_c_of_type_Boolean)
        {
          f.a(paramGraphics);
        }
        else
        {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
        }
        break;
      case 3: 
        paramGraphics.setColor(0);
        paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
        break;
      case 4: 
        paramGraphics.setColor(-1);
        paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
        break;
      case 5: 
        if (jdField_f_of_type_Byte % 4 <= 1) {
          paramGraphics.setColor(0);
        } else {
          paramGraphics.setColor(-1);
        }
        paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
        break;
      case 1: 
      case 2: 
      default: 
        if (!jdField_c_of_type_Boolean)
        {
          f.a(paramGraphics);
        }
        else
        {
          paramGraphics.setColor(0);
          paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
        }
        break;
      }
    }
    else if (!jdField_c_of_type_Boolean)
    {
      f.a(paramGraphics);
    }
    else
    {
      paramGraphics.setColor(0);
      paramGraphics.fillRect(0, 0, d.jdField_a_of_type_Int, d.jdField_b_of_type_Int);
    }
    for (int m = 0; m < d.jdField_b_of_type_Int; m += 10) {
      paramGraphics.drawImage(e.a(15), 0, m, 0);
    }
    int n = -1;
    for (;;)
    {
      n++;
      if (n >= 4) {
        break;
      }
      i2 = -1;
      for (;;)
      {
        i2++;
        if (i2 >= 4) {
          break;
        }
        if ((localObject1 = jdField_a_of_type_Array2dOfA[n][i2]).jdField_j_of_type_Byte == 1) {
          ((a)localObject1).a(paramGraphics, f.jdField_a_of_type_Int, f.jdField_b_of_type_Int);
        }
      }
    }
    n = paramGraphics.getColor();
    paramGraphics.setColor(-1);
    paramGraphics.drawString(jdField_b_of_type_ArrayOfJavaLangString[jdField_b_of_type_Byte], d.jdField_a_of_type_Int - bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth(jdField_b_of_type_ArrayOfJavaLangString[jdField_b_of_type_Byte]) >> 1, 2, 0);
    paramGraphics.setColor(n);
    int i2 = jdField_g_of_type_Int;
    n = jdField_f_of_type_Int;
    Object localObject1 = paramGraphics;
    int i3 = -1;
    int i4;
    for (;;)
    {
      i3++;
      if (i3 >= jdField_a_of_type_Array2dOfInt.length) {
        break;
      }
      if (jdField_a_of_type_Array2dOfInt[i3][0] > 0)
      {
        i4 = jdField_a_of_type_Array2dOfInt[i3][1] - (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth(jdField_a_of_type_ArrayOfJavaLangString[jdField_a_of_type_Array2dOfInt[i3][3]]) >> 1);
        if (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth(jdField_a_of_type_ArrayOfJavaLangString[jdField_a_of_type_Array2dOfInt[i3][3]]) > bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight() << 2) {
          if (i4 >= d.jdField_a_of_type_Int >> 1) {
            i4 -= (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight() << 1);
          } else {
            i4 += (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight() << 1);
          }
        }
        ae.a((Graphics)localObject1, i4 - n, jdField_a_of_type_Array2dOfInt[i3][2] - i2, jdField_a_of_type_ArrayOfJavaLangString[jdField_a_of_type_Array2dOfInt[i3][3]], 16777215, 0, 0);
      }
      if ((jdField_c_of_type_ArrayOfJavaLangString[i3] != null) && (!jdField_c_of_type_ArrayOfJavaLangString[i3].equals("")))
      {
        int tmp548_547 = (i3 + 8);
        jdField_b_of_type_ArrayOfByte;
        if (((tmp548_540[tmp548_547] = (byte)(tmp548_540[tmp548_547] + 1)) > 0) && (jdField_b_of_type_ArrayOfByte[(i3 + 8)] != 99) && (jdField_b_of_type_ArrayOfByte[i3] > 0))
        {
          i4 = jdField_b_of_type_ArrayOfInt[(i3 << 1)] - (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth(jdField_c_of_type_ArrayOfJavaLangString[i3]) >> 1);
          if (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth(jdField_c_of_type_ArrayOfJavaLangString[i3]) > bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight() << 2) {
            if (i4 >= d.jdField_a_of_type_Int >> 1) {
              i4 -= (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight() << 1);
            } else {
              i4 += (bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight() << 1);
            }
          }
          ae.a((Graphics)localObject1, i4 - n, jdField_b_of_type_ArrayOfInt[((i3 << 1) + 1)] - i2, jdField_c_of_type_ArrayOfJavaLangString[i3], 16777215, 0, 0);
        }
      }
    }
    if ((jdField_a_of_type_Byte == 0) || ((jdField_a_of_type_Byte == 1) && (a(e.jdField_a_of_type_G))))
    {
      i3 = d.jdField_b_of_type_Int - 27;
      i2 = (d.jdField_a_of_type_Int - 175 >> 1) - (d.jdField_a_of_type_Int == 240 ? 10 : 0);
      localObject1 = paramGraphics;
      int[] arrayOfInt = { 5, 6, 7, 8 };
      ad.a((Graphics)localObject1, i2 - 13, i3, jdField_a_of_type_Byte == 0 ? arrayOfInt[e.jdField_a_of_type_G.m] : 17);
      i4 = -1;
      for (;;)
      {
        i4++;
        if (i4 >= 7) {
          break;
        }
        z localz = jdField_a_of_type_Byte == 0 ? g.a[i4] : g.c[i4];
        int i1 = i2 + i4 * 25;
        int i5 = ((Graphics)localObject1).getColor();
        ((Graphics)localObject1).setColor(76, 77, 78);
        ((Graphics)localObject1).fillRoundRect(i1 + 3, i3 + 3, 18, 18, 3, 3);
        ((Graphics)localObject1).setColor(i5);
        f.a((Graphics)localObject1, e.a(7), i1, i3, 130, 0, 24, 24, 0);
        Object localObject2 = localObject1;
        Object localObject3 = null;
        if ((localz = localz).jdField_a_of_type_Boolean)
        {
          switch (localz.jdField_a_of_type_Byte)
          {
          case 0: 
            f.a((Graphics)localObject2, e.a(4), localz.jdField_a_of_type_Int + 3, localz.jdField_b_of_type_Int + 3, localz.jdField_a_of_type_Short % 7 * 18, localz.jdField_a_of_type_Short / 7 * 18, 18, 18, 0);
            break;
          case 1: 
            f.a((Graphics)localObject2, e.a(11), localz.jdField_a_of_type_Int + 3, localz.jdField_b_of_type_Int + 3, (localz.jdField_a_of_type_Short - 100) % 7 * 18, (localz.jdField_a_of_type_Short - 100) / 7 * 18, 18, 18, 0);
          }
          if (localz.jdField_b_of_type_Short > 0)
          {
            int i8 = localz.jdField_b_of_type_Short * localz.jdField_b_of_type_Byte > 20 ? 20 : localz.jdField_b_of_type_Short * localz.jdField_b_of_type_Byte;
            int i7 = localz.jdField_b_of_type_Int + 3;
            int i6 = localz.jdField_a_of_type_Int + 3;
            int i9 = (localObject3 = localObject2).getClipX();
            int i10 = ((Graphics)localObject3).getClipY();
            int i11 = ((Graphics)localObject3).getClipWidth();
            int i12 = ((Graphics)localObject3).getClipHeight();
            ((Graphics)localObject3).setClip(i6, i7, 20, i8);
            for (int i13 = 0; i13 < i8; i13 += 10) {
              ((Graphics)localObject3).drawImage(e.a(15), i6, i7 - 1 + i13, 0);
            }
            ((Graphics)localObject3).setClip(i9, i10, i11, i12);
            if (localz.jdField_b_of_type_Short == 1)
            {
              ((Graphics)localObject2).setColor(65280);
              ((Graphics)localObject2).drawRoundRect(localz.jdField_a_of_type_Int + 3 - 2, localz.jdField_b_of_type_Int + 3 - 2, 21, 21, 5, 5);
            }
          }
          if ((localz.b()) || (localz.c()))
          {
            ((Graphics)localObject2).setColor(16777215);
            ((Graphics)localObject2).drawRect(localz.jdField_a_of_type_Int + 3 - 1, localz.jdField_b_of_type_Int + 3 - 1, 21, 21);
          }
        }
        switch (i4 + 1)
        {
        case 1: 
          tmpTernaryOp = 1;
          break;
        case 2: 
          tmpTernaryOp = 2;
          break;
        case 3: 
          tmpTernaryOp = 3;
          break;
        case 4: 
          tmpTernaryOp = 4;
          break;
        case 5: 
          tmpTernaryOp = 5;
          break;
        case 6: 
          tmpTernaryOp = 6;
          break;
        case 7: 
          tmpTernaryOp = 7;
          break;
        }
        ad.a((Graphics)localObject1, e.a(3), -1, i1 + 18, i3 + 2, 3);
      }
    }
    if (jdField_d_of_type_Int == 1)
    {
      e.a(paramGraphics, d.jdField_a_of_type_Int - 15 >> 1, jdField_c_of_type_Int);
      switch (jdField_a_of_type_Int)
      {
      case 4: 
        break;
      case 1: 
        if ((!jdField_f_of_type_Boolean) && ((jdField_a_of_type_Byte == 0) || ((jdField_a_of_type_Byte == 1) && (a(e.jdField_a_of_type_G)))))
        {
          f.a(paramGraphics, e.a(14), jdField_a_of_type_ArrayOfInt[0], jdField_a_of_type_ArrayOfInt[1], 58, 0, 29, 45, 0);
          f.a(paramGraphics, e.a(14), jdField_a_of_type_ArrayOfInt[2], jdField_a_of_type_ArrayOfInt[3], 0, 0, 29, 45, 0);
          f.a(paramGraphics, e.a(14), jdField_a_of_type_ArrayOfInt[4], jdField_a_of_type_ArrayOfInt[5], 116, 0, 29, 45, 0);
          f.a(paramGraphics, e.a(14), jdField_a_of_type_ArrayOfInt[6], jdField_a_of_type_ArrayOfInt[7], 87, 0, 29, 45, 0);
          f.a(paramGraphics, e.a(14), jdField_a_of_type_ArrayOfInt[8], jdField_a_of_type_ArrayOfInt[9], 29, 0, 29, 45, 0);
        }
        break;
      }
    }
    if (jdField_h_of_type_Boolean) {
      jdField_h_of_type_Boolean = !ab.a();
    }
    ab.a(paramGraphics);
    ae.a(paramGraphics);
    e.a(paramGraphics, jdField_f_of_type_Boolean == true ? "取消" : "自动", d.jdField_a_of_type_Int - ((bg.jdField_a_of_type_Byte << 1) + 8) - 1, d.jdField_b_of_type_Int - (bg.jdField_b_of_type_Byte + 6), e.jdField_a_of_type_G.jdField_b_of_type_Boolean ? 8947848 : 16761897);
  }
  
  private static void j()
  {
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= 10) {
        break;
      }
      if (m % 2 == 0) {
        jdField_a_of_type_ArrayOfInt[m] = jdField_a_of_type_ArrayOfInt[4];
      } else {
        jdField_a_of_type_ArrayOfInt[m] = jdField_a_of_type_ArrayOfInt[5];
      }
    }
    jdField_a_of_type_ArrayOfInt[14] = 3;
  }
  
  private static void k()
  {
    if (jdField_a_of_type_ArrayOfInt[14] >= -2)
    {
      jdField_a_of_type_ArrayOfInt[14] -= 1;
      if (jdField_a_of_type_ArrayOfInt[14] >= 0)
      {
        jdField_a_of_type_ArrayOfInt[1] += jdField_a_of_type_ArrayOfInt[10];
        jdField_a_of_type_ArrayOfInt[2] += jdField_a_of_type_ArrayOfInt[11];
        jdField_a_of_type_ArrayOfInt[6] += jdField_a_of_type_ArrayOfInt[12];
        jdField_a_of_type_ArrayOfInt[9] += jdField_a_of_type_ArrayOfInt[13];
        return;
      }
      if (jdField_a_of_type_ArrayOfInt[14] == -1)
      {
        jdField_a_of_type_ArrayOfInt[1] -= 5;
        jdField_a_of_type_ArrayOfInt[2] -= 5;
        jdField_a_of_type_ArrayOfInt[6] += 5;
        jdField_a_of_type_ArrayOfInt[9] += 5;
        return;
      }
      if (jdField_a_of_type_ArrayOfInt[14] == -2)
      {
        jdField_a_of_type_ArrayOfInt[1] += 5;
        jdField_a_of_type_ArrayOfInt[2] += 5;
        jdField_a_of_type_ArrayOfInt[6] -= 5;
        jdField_a_of_type_ArrayOfInt[9] -= 5;
      }
    }
  }
  
  public static void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (paramInt3 < 0) {
      return;
    }
    int[] arrayOfInt;
    (arrayOfInt = jdField_a_of_type_Array2dOfInt[(jdField_j_of_type_Byte++)])[0] = 5;
    switch (paramInt4)
    {
    case 0: 
      if (paramInt1 - jdField_f_of_type_Int > d.jdField_a_of_type_Int >> 1) {
        arrayOfInt[1] = (paramInt1 + 10);
      } else {
        arrayOfInt[1] = (paramInt1 - 10);
      }
      arrayOfInt[2] = (paramInt2 - 35);
      break;
    case 1: 
      if (paramInt1 - jdField_f_of_type_Int > d.jdField_a_of_type_Int >> 1) {
        arrayOfInt[1] = (paramInt1 - 10);
      } else {
        arrayOfInt[1] = (paramInt1 + 10);
      }
      arrayOfInt[2] = (paramInt2 - 35);
      break;
    case 2: 
      if (paramInt1 - jdField_f_of_type_Int > d.jdField_a_of_type_Int >> 1) {
        arrayOfInt[1] = (paramInt1 + 10);
      } else {
        arrayOfInt[1] = (paramInt1 - 10);
      }
      arrayOfInt[2] = (paramInt2 - 15);
      break;
    case 3: 
      if (paramInt1 - jdField_f_of_type_Int > d.jdField_a_of_type_Int >> 1) {
        arrayOfInt[1] = (paramInt1 - 10);
      } else {
        arrayOfInt[1] = (paramInt1 + 10);
      }
      arrayOfInt[2] = (paramInt2 - 15);
      break;
    default: 
      arrayOfInt[1] = paramInt1;
      arrayOfInt[2] = (paramInt2 - 35);
    }
    arrayOfInt[3] = paramInt3;
    arrayOfInt[4] = paramInt4;
    if (jdField_j_of_type_Byte >= jdField_a_of_type_Array2dOfInt.length) {
      jdField_j_of_type_Byte = 0;
    }
  }
  
  public static void a(int paramInt1, int paramInt2, String paramString, int paramInt3)
  {
    if ((jdField_k_of_type_Byte = (byte)(jdField_k_of_type_Byte + 1)) >= jdField_c_of_type_ArrayOfJavaLangString.length) {
      jdField_k_of_type_Byte = 0;
    }
    jdField_c_of_type_ArrayOfJavaLangString[jdField_k_of_type_Byte] = paramString;
    jdField_b_of_type_ArrayOfByte[jdField_k_of_type_Byte] = 10;
    jdField_b_of_type_ArrayOfByte[(jdField_k_of_type_Byte + 8)] = ((byte)paramInt3);
    if (paramInt1 - jdField_f_of_type_Int > d.jdField_a_of_type_Int >> 1) {
      jdField_b_of_type_ArrayOfInt[(jdField_k_of_type_Byte << 1)] = (paramInt1 - bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight());
    } else {
      jdField_b_of_type_ArrayOfInt[(jdField_k_of_type_Byte << 1)] = (paramInt1 + bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.getHeight());
    }
    jdField_b_of_type_ArrayOfInt[((jdField_k_of_type_Byte << 1) + 1)] = (paramInt2 - 35);
  }
  
  public static void a(String paramString)
  {
    a locala;
    int n = (locala = jdField_a_of_type_Byte == 0 ? jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][e.jdField_a_of_type_G.l] : jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][Math.abs(e.jdField_a_of_type_G.l - 1)]).jdField_b_of_type_Int;
    int m = locala.jdField_c_of_type_Int - 35;
    a(n, m, paramString, 0);
  }
  
  private static void l()
  {
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= jdField_a_of_type_Array2dOfInt.length) {
        break;
      }
      if (jdField_a_of_type_Array2dOfInt[m][0] > 0)
      {
        jdField_a_of_type_Array2dOfInt[m][0] += 1;
        if (jdField_a_of_type_Array2dOfInt[m][0] > 10) {
          jdField_a_of_type_Array2dOfInt[m][0] = 0;
        }
      }
      int tmp61_60 = (m + 8);
      jdField_b_of_type_ArrayOfByte;
      if (((tmp61_54[tmp61_60] = (byte)(tmp61_54[tmp61_60] + 1)) > 0) && (jdField_b_of_type_ArrayOfByte[(m + 8)] != 99) && (jdField_b_of_type_ArrayOfByte[m] > 0))
      {
        int tmp96_95 = m;
        byte[] tmp96_92 = jdField_b_of_type_ArrayOfByte;
        tmp96_92[tmp96_95] = ((byte)(tmp96_92[tmp96_95] - 1));
        if (jdField_b_of_type_ArrayOfByte[m] <= 0)
        {
          jdField_b_of_type_ArrayOfByte[m] = 0;
          jdField_c_of_type_ArrayOfJavaLangString[m] = "";
          jdField_b_of_type_ArrayOfByte[(m + 8)] = 99;
        }
      }
    }
  }
  
  private static String a()
  {
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    String str1 = "<tr h='20'><td><a pl='min' ";
    String str2 = "c='ffffff' cc='00ff00' cmd='g:useSkill:";
    String str3 = "c='cccccc' cc='ff0000' cmd='g:cdNotYet:0";
    String str4 = "c='cccccc' cc='ff0000' cmd='";
    String str5 = "'>";
    String str6 = "</a></td></tr>";
    au localau = jdField_a_of_type_Byte == 0 ? jdField_c_of_type_Au : jdField_d_of_type_Au;
    int m = -1;
    while (localau != null)
    {
      m++;
      if (m >= (jdField_a_of_type_Byte == 0 ? localau.jdField_a_of_type_Int - 2 : localau.jdField_a_of_type_Int)) {
        break;
      }
      aa localaa;
      int i1 = (localaa = (aa)localau.a(m)).jdField_c_of_type_Byte;
      String str8 = localaa.jdField_a_of_type_JavaLangString;
      int n = localaa.jdField_a_of_type_Int;
      e.jdField_a_of_type_JavaLangStringBuffer.append(str1).append(i1 == 0 ? str2 + n : str3).append(str5).append(str8).append(str6);
    }
    if ((localau == null) || (localau.jdField_a_of_type_Int <= 0)) {
      e.jdField_a_of_type_JavaLangStringBuffer.append(str1).append(str4).append("g:alwaysback:0").append(str5).append("没有可用技能").append(str6);
    }
    String str7 = jdField_g_of_type_Boolean ? "<tr h='20'><td><a pl='min' cmd='g:useSkill:201'>捕捉</a></td></tr><tr h='20'><td><a pl='min' cmd='g:useSkill:202'>逃跑</a></td></tr>" : "<tr h='20'><td><a pl='min' cmd='g:useSkill:201'>捕捉</a></td></tr>";
    e.jdField_a_of_type_JavaLangStringBuffer.append(jdField_a_of_type_Byte == 0 ? str7 : "");
    return e.jdField_a_of_type_JavaLangStringBuffer.toString();
  }
  
  private static String b()
  {
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    String str1 = "<tr h='20'><td><a pl='min' ";
    String str2 = "c='ffffff' cc='00ff00' cmd='g:useItem:";
    String str3 = "c='cccccc' cc='ff0000' cmd='";
    String str4 = "'>";
    String str5 = "</a></td></tr>";
    au localau = jdField_a_of_type_Au;
    int m = -1;
    while (localau != null)
    {
      m++;
      if (m >= localau.jdField_a_of_type_Int) {
        break;
      }
      aa localaa;
      int i1 = (localaa = (aa)localau.a(m)).jdField_c_of_type_Byte;
      String str6 = localaa.jdField_a_of_type_JavaLangString;
      int n = localaa.jdField_a_of_type_Int;
      e.jdField_a_of_type_JavaLangStringBuffer.append(str1).append(i1 == 0 ? str2 + n : str3).append(str4).append(str6).append(str5);
    }
    if ((localau == null) || (localau.jdField_a_of_type_Int <= 0)) {
      e.jdField_a_of_type_JavaLangStringBuffer.append(str1).append(str3).append("g:alwaysback:0").append(str4).append("没有战斗可用物品").append(str5);
    }
    return e.jdField_a_of_type_JavaLangStringBuffer.toString();
  }
  
  public static void c(n paramn)
  {
    int m = paramn.a();
    int n = paramn.a();
    if (m == 0)
    {
      (jdField_c_of_type_Au = new au()).a(n + 2);
    }
    else if (m == 1)
    {
      (jdField_d_of_type_Au = new au()).a(n);
      z.c();
    }
    int i1 = -1;
    for (;;)
    {
      i1++;
      if (i1 >= n) {
        break;
      }
      byte b1 = paramn.a();
      byte b2 = paramn.a();
      byte b3 = paramn.a();
      String str = paramn.a();
      byte b4 = paramn.a();
      aa localaa2;
      (localaa2 = new aa()).jdField_a_of_type_Int = b1;
      localaa2.jdField_a_of_type_Byte = b3;
      localaa2.jdField_b_of_type_Byte = b4;
      localaa2.jdField_a_of_type_JavaLangString = str;
      if (m == 0) {
        jdField_c_of_type_Au.a(localaa2, i1);
      } else if (m == 1) {
        jdField_d_of_type_Au.a(localaa2, i1);
      }
      if ((m != 0) && (i1 < 7))
      {
        b3 = b2;
        b2 = b1;
        b1 = i1;
        g.c[b1].a(b3, (short)0, 0, b2);
      }
    }
    if (m == 0)
    {
      i1 = -1;
      for (;;)
      {
        i1++;
        if (i1 >= 2) {
          break;
        }
        aa localaa1;
        (localaa1 = new aa()).jdField_a_of_type_Int = (i1 + 201);
        localaa1.jdField_b_of_type_Byte = -1;
        jdField_c_of_type_Au.a(localaa1, n + i1);
      }
    }
  }
  
  public static void d(n paramn)
  {
    int m = paramn.c();
    paramn = paramn.a();
    int n = -1;
    int i1;
    while (jdField_c_of_type_Au != null)
    {
      n++;
      if (n < jdField_c_of_type_Au.jdField_a_of_type_Int - 2) {
        if ((((aa)jdField_c_of_type_Au.a(n)).jdField_a_of_type_Int == (byte)m) && (((aa)jdField_c_of_type_Au.a(n)).jdField_b_of_type_Byte == paramn))
        {
          ((aa)jdField_c_of_type_Au.a(n)).jdField_c_of_type_Byte = ((aa)jdField_c_of_type_Au.a(n)).jdField_b_of_type_Byte;
          n = ((aa)jdField_c_of_type_Au.a(n)).jdField_c_of_type_Byte;
          i1 = -1;
          for (;;)
          {
            i1++;
            if (i1 >= g.a.length) {
              break;
            }
            g.a[i1].a(m, n);
          }
        }
      }
    }
    n = -1;
    while (jdField_d_of_type_Au != null)
    {
      n++;
      if (n < jdField_d_of_type_Au.jdField_a_of_type_Int) {
        if ((((aa)jdField_d_of_type_Au.a(n)).jdField_a_of_type_Int == (byte)m) && (((aa)jdField_d_of_type_Au.a(n)).jdField_b_of_type_Byte == paramn))
        {
          ((aa)jdField_d_of_type_Au.a(n)).jdField_c_of_type_Byte = ((aa)jdField_d_of_type_Au.a(n)).jdField_b_of_type_Byte;
          n = ((aa)jdField_d_of_type_Au.a(n)).jdField_c_of_type_Byte;
          i1 = -1;
          for (;;)
          {
            i1++;
            if (i1 >= g.c.length) {
              break;
            }
            g.c[i1].a(m, n);
          }
        }
      }
    }
  }
  
  private static void m()
  {
    int m = -1;
    while (jdField_c_of_type_Au != null)
    {
      m++;
      if (m >= jdField_c_of_type_Au.jdField_a_of_type_Int - 2) {
        break;
      }
      if (((aa)jdField_c_of_type_Au.a(m)).jdField_c_of_type_Byte > 0) {
        if (((aa)jdField_c_of_type_Au.a(m)).jdField_c_of_type_Byte-- <= 0) {
          ((aa)jdField_c_of_type_Au.a(m)).jdField_c_of_type_Byte = 0;
        }
      }
    }
    m = -1;
    while (jdField_d_of_type_Au != null)
    {
      m++;
      if (m >= jdField_d_of_type_Au.jdField_a_of_type_Int) {
        break;
      }
      if (((aa)jdField_d_of_type_Au.a(m)).jdField_c_of_type_Byte > 0) {
        if (((aa)jdField_d_of_type_Au.a(m)).jdField_c_of_type_Byte-- <= 0) {
          ((aa)jdField_d_of_type_Au.a(m)).jdField_c_of_type_Byte = 0;
        }
      }
    }
    m = -1;
    for (;;)
    {
      m++;
      if (m >= 7) {
        break;
      }
      if (g.a[m].a()) {
        g.a[m].a();
      }
    }
    m = -1;
    for (;;)
    {
      m++;
      if (m >= 7) {
        break;
      }
      if (g.c[m].a()) {
        g.c[m].a();
      }
    }
  }
  
  public static void e(n paramn)
  {
    if (((paramn = a(paramn.a())) != null) && (paramn.jdField_j_of_type_Byte == 1) && ((paramn.jdField_j_of_type_Int & 0x4) != 0)) {
      paramn.jdField_c_of_type_Byte = 2;
    }
  }
  
  private static void n()
  {
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= 4) {
        break;
      }
      int n = -1;
      for (;;)
      {
        n++;
        if (n >= 4) {
          break;
        }
        if ((jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Byte == 1) && ((jdField_a_of_type_Array2dOfA[m][n].jdField_j_of_type_Int & 0x4) != 0)) {
          if (jdField_a_of_type_Array2dOfA[m][n].jdField_a_of_type_Long != e.jdField_a_of_type_G.jdField_a_of_type_Long) {
            jdField_a_of_type_Array2dOfA[m][n].jdField_c_of_type_Byte = 1;
          } else {
            jdField_a_of_type_Array2dOfA[m][n].jdField_c_of_type_Byte = 0;
          }
        }
      }
    }
  }
  
  public static void a(int paramInt)
  {
    jdField_a_of_type_Short = (short)paramInt;
    e(0);
    g();
    jdField_h_of_type_Int = 1;
    if (jdField_c_of_type_Byte != -1)
    {
      jdField_a_of_type_Int = 4;
      return;
    }
    g.j = jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int];
    g(2);
  }
  
  public static void b(int paramInt)
  {
    jdField_e_of_type_Int = paramInt;
    e(1);
    g();
    jdField_h_of_type_Int = 2;
    if (jdField_c_of_type_Byte != -1)
    {
      jdField_a_of_type_Int = 4;
      return;
    }
    g.j = jdField_a_of_type_Array2dOfA[jdField_i_of_type_Int][jdField_j_of_type_Int];
    g(2);
  }
  
  public static void a(long paramLong)
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(55);
    localn.a(paramLong);
    e.jdField_a_of_type_Q.c();
  }
  
  public static void b(long paramLong)
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(56);
    localn.a(paramLong);
    e.jdField_a_of_type_Q.c();
  }
  
  private static boolean a(a parama)
  {
    if ((parama == null) || (parama.jdField_j_of_type_Byte != 1)) {
      return false;
    }
    return (jdField_a_of_type_Array2dOfA[parama.jdField_k_of_type_Int][Math.abs(parama.l - 1)].jdField_j_of_type_Byte == 1) && ((jdField_a_of_type_Array2dOfA[parama.jdField_k_of_type_Int][Math.abs(parama.l - 1)].jdField_j_of_type_Int & 0x10000) != 0) && ((jdField_a_of_type_Array2dOfA[parama.jdField_k_of_type_Int][Math.abs(parama.l - 1)].jdField_j_of_type_Int & 0x40) == 0);
  }
  
  private static void o()
  {
    if (!jdField_f_of_type_Boolean) {
      return;
    }
    jdField_a_of_type_Short = -1;
    jdField_h_of_type_Int = 1;
    if (a(e.jdField_a_of_type_G))
    {
      jdField_a_of_type_Short = -1;
      jdField_h_of_type_Int = 1;
    }
    jdField_c_of_type_Byte = 1;
    g();
    g(2);
  }
  
  public static void e()
  {
    if (jdField_d_of_type_Byte == 0) {
      return;
    }
    e.a("rebornmenu");
    if (n.a(e.jdField_a_of_type_G.jdField_a_of_type_ArrayOfByte, 0) > 10)
    {
      StringBuffer localStringBuffer;
      (localStringBuffer = e.jdField_a_of_type_JavaLangStringBuffer).setLength(0);
      localStringBuffer.append("update(").append('"').append(1).append('"').append(",").append('"').append("原地复活(1元宝)").append('"').append(")");
      e.jdField_a_of_type_Bc.a("rebornM", localStringBuffer.toString());
    }
    e.jdField_a_of_type_G.m();
  }
  
  public static void c(int paramInt)
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(57);
    localn.a(paramInt);
    e.jdField_a_of_type_Q.c();
  }
  
  public static void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int m = 0;
    int n = 0;
    int i1 = 0;
    switch (paramInt4)
    {
    case 1: 
    case 6: 
      i1 = 0;
      m = 17;
      n = 31;
      break;
    case 2: 
    case 3: 
      i1 = 31;
      m = 13;
      n = 17;
      break;
    case 4: 
      i1 = 48;
      m = 13;
      n = 17;
    }
    if ((paramInt1 > 0) && ((paramInt4 == 2) || (paramInt4 == 3)))
    {
      a(paramGraphics, paramImage, paramInt2, paramInt3, 1, paramInt5);
      paramInt2 += paramInt5 * 13;
    }
    else if ((paramInt1 <= 0) && ((paramInt4 == 2) || (paramInt4 == 3)))
    {
      a(paramGraphics, paramImage, paramInt2, paramInt3, 0, paramInt5);
      paramInt2 += paramInt5 * 13;
    }
    paramInt4 = new StringBuffer();
    paramInt1 = Math.abs(paramInt1);
    paramInt4.append(paramInt1);
    for (int i2 = 0; i2 < paramInt4.length(); i2++)
    {
      paramInt1 = paramInt4.charAt(i2) - '0';
      f.a(paramGraphics, paramImage, paramInt2, paramInt3, 0 + (paramInt1 == 0 ? 9 : paramInt1 - 1) * m * paramInt5, i1 * paramInt5, m * paramInt5, n * paramInt5, 0);
      paramInt2 += m * paramInt5;
    }
  }
  
  private static void a(Graphics paramGraphics, Image paramImage, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    switch (paramInt3)
    {
    case 0: 
      f.a(paramGraphics, paramImage, paramInt1, paramInt2, paramInt4 * 130, paramInt4 * 31, paramInt4 * 13, paramInt4 * 17, 0);
      return;
    case 1: 
      f.a(paramGraphics, paramImage, paramInt1, paramInt2, paramInt4 * 143, paramInt4 * 31, paramInt4 * 13, paramInt4 * 17, 0);
    }
  }
  
  private static boolean a()
  {
    a locala2 = jdField_a_of_type_Byte == 0 ? e.jdField_a_of_type_G : jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][Math.abs(e.jdField_a_of_type_G.l - 1)];
    int n = -1;
    for (;;)
    {
      n++;
      if (n >= 4) {
        break;
      }
      int i1 = -1;
      for (;;)
      {
        i1++;
        if (i1 >= 4) {
          break;
        }
        a locala1;
        if (((locala1 = jdField_a_of_type_Array2dOfA[n][i1]).jdField_j_of_type_Byte == 1) && (locala1.jdField_a_of_type_Long != locala2.jdField_a_of_type_Long) && ((locala1.jdField_j_of_type_Int & 0x40) == 0))
        {
          int m = locala1.l > 1 ? 1 : 0;
          int i2 = e.jdField_a_of_type_G.l > 1 ? 1 : 0;
          if (m == i2) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private static boolean b()
  {
    a locala;
    return ((locala = jdField_a_of_type_Byte == 0 ? e.jdField_a_of_type_G : jdField_a_of_type_Array2dOfA[e.jdField_a_of_type_G.jdField_k_of_type_Int][Math.abs(e.jdField_a_of_type_G.l - 1)]).jdField_f_of_type_A == null) || ((locala.jdField_f_of_type_A != null) && (locala.jdField_f_of_type_A.jdField_a_of_type_J.jdField_b_of_type_Int != 38));
  }
  
  public static final void d(int paramInt)
  {
    jdField_e_of_type_Byte = (byte)paramInt;
    jdField_g_of_type_Byte = jdField_f_of_type_Byte = 8;
    jdField_h_of_type_Byte = 4;
  }
  
  private static void p()
  {
    if (jdField_f_of_type_Byte <= 0)
    {
      f.jdField_a_of_type_Int = jdField_f_of_type_Int;
      f.jdField_b_of_type_Int = jdField_g_of_type_Int;
    }
    if ((jdField_f_of_type_Byte <= 0) || (jdField_e_of_type_Byte > 2)) {
      return;
    }
    switch (jdField_e_of_type_Byte)
    {
    case 0: 
      if (jdField_f_of_type_Byte == jdField_g_of_type_Byte >> 1) {
        jdField_h_of_type_Byte = (byte)(jdField_h_of_type_Byte >> 1);
      } else if (jdField_f_of_type_Byte == jdField_g_of_type_Byte >> 2) {
        jdField_h_of_type_Byte = (byte)(jdField_h_of_type_Byte >> 1);
      }
      if (jdField_f_of_type_Byte % 2 == 0)
      {
        f.jdField_a_of_type_Int += jdField_h_of_type_Byte;
        return;
      }
      f.jdField_a_of_type_Int -= jdField_h_of_type_Byte;
      return;
    case 1: 
      if (jdField_f_of_type_Byte == jdField_g_of_type_Byte >> 1) {
        jdField_h_of_type_Byte = (byte)(jdField_h_of_type_Byte >> 1);
      } else if (jdField_f_of_type_Byte == jdField_g_of_type_Byte >> 2) {
        jdField_h_of_type_Byte = (byte)(jdField_h_of_type_Byte >> 1);
      }
      if (jdField_f_of_type_Byte % 2 == 0)
      {
        f.jdField_b_of_type_Int += jdField_h_of_type_Byte;
        return;
      }
      f.jdField_b_of_type_Int -= jdField_h_of_type_Byte;
      return;
    case 2: 
      if (jdField_f_of_type_Byte == jdField_g_of_type_Byte >> 1) {
        jdField_h_of_type_Byte = (byte)(jdField_h_of_type_Byte >> 1);
      } else if (jdField_f_of_type_Byte == jdField_g_of_type_Byte >> 2) {
        jdField_h_of_type_Byte = (byte)(jdField_h_of_type_Byte >> 1);
      }
      if (jdField_f_of_type_Byte % 2 == 0)
      {
        f.jdField_a_of_type_Int += jdField_h_of_type_Byte;
        f.jdField_b_of_type_Int += jdField_h_of_type_Byte;
        return;
      }
      f.jdField_a_of_type_Int -= jdField_h_of_type_Byte;
      f.jdField_b_of_type_Int -= jdField_h_of_type_Byte;
    }
  }
  
  static
  {
    jdField_a_of_type_Array4dOfInt = new int[4][4][3][2];
    jdField_a_of_type_Array2dOfA = new a[4][4];
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\t.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */