import java.util.Hashtable;

public final class i
{
  private static final au jdField_a_of_type_Au = new au(1600, 50);
  private static final Hashtable jdField_a_of_type_JavaUtilHashtable = new Hashtable(1600);
  private static final au jdField_b_of_type_Au = new au(1600, 50);
  private static final Hashtable jdField_b_of_type_JavaUtilHashtable = new Hashtable(1600);
  private static ar jdField_a_of_type_Ar;
  private static int[] jdField_a_of_type_ArrayOfInt = { 0, 0, -1, 1 };
  private static int[] jdField_b_of_type_ArrayOfInt = { -1, 1, 0, 0 };
  
  private static ar a()
  {
    ar localar;
    if (jdField_a_of_type_Ar == null) {
      localar = new ar();
    } else {
      localar = jdField_a_of_type_Ar;
    }
    jdField_a_of_type_Ar = localar.jdField_a_of_type_Ar;
    localar.jdField_a_of_type_Ar = null;
    return localar;
  }
  
  public static final void a(ar paramar)
  {
    if (paramar.jdField_a_of_type_Ar != null) {
      a(paramar.jdField_a_of_type_Ar);
    }
    paramar.jdField_a_of_type_Ar = jdField_a_of_type_Ar;
    jdField_a_of_type_Ar = paramar;
  }
  
  public static final void a(a parama)
  {
    if (parama.jdField_a_of_type_Ar != null)
    {
      a(parama.jdField_a_of_type_Ar);
      parama.jdField_a_of_type_Ar = null;
    }
    jdField_a_of_type_Au.a();
    jdField_a_of_type_JavaUtilHashtable.clear();
    jdField_b_of_type_Au.a();
    jdField_b_of_type_JavaUtilHashtable.clear();
    int i = parama.h >> 4;
    int k = parama.i >> 4;
    int n = parama.b >> 4;
    int i1 = parama.c >> 4;
    int i2 = (n << 16) + i1;
    ar localar3;
    (localar3 = a()).a(i, k, 0, 0);
    int i3;
    int i4;
    if (parama != e.a)
    {
      parama.jdField_a_of_type_Ar = localar3;
      i3 = 1;
      i4 = 1;
      if (n < i) {
        i3 = -1;
      }
      if (i1 < k) {
        i4 = -1;
      }
      int i5 = 0;
      int i7 = 0;
      if (0 == (byte)f.b(n, i1)) {
        i7 = 1;
      }
      ar localar6;
      while (n != i)
      {
        if ((i7 == 0) && (0 == (byte)f.b(i, k)))
        {
          i5 = 1;
          break;
        }
        i += i3;
        (localar6 = a()).a(i, k, 0, 0);
        localar6.jdField_a_of_type_Ar = parama.jdField_a_of_type_Ar;
        parama.jdField_a_of_type_Ar = localar6;
      }
      if ((i5 == 0) && (i7 == 0)) {
        while (i1 != k)
        {
          if ((i7 == 0) && (0 == (byte)f.b(i, k)))
          {
            i5 = 1;
            break;
          }
          k += i4;
          (localar6 = a()).a(i, k, 0, 0);
          localar6.jdField_a_of_type_Ar = parama.jdField_a_of_type_Ar;
          parama.jdField_a_of_type_Ar = localar6;
        }
      }
      if ((i7 == 0) && (i5 != 0)) {}
      while (parama.jdField_a_of_type_Ar != localar3)
      {
        localar6 = parama.jdField_a_of_type_Ar.jdField_a_of_type_Ar;
        parama.jdField_a_of_type_Ar.jdField_a_of_type_Ar = null;
        parama.jdField_a_of_type_Ar = localar6;
        continue;
        return;
      }
    }
    b(localar3);
    int i9 = 0;
    ar localar2;
    while (jdField_a_of_type_Au.jdField_a_of_type_Int != 0)
    {
      au localau;
      localar3 = (ar)(localau = jdField_a_of_type_Au).a();
      jdField_a_of_type_JavaUtilHashtable.remove(localar3);
      ar localar1 = (ar)localau.b();
      localau.b(localau.jdField_a_of_type_Int - 1);
      if ((i4 = localau.jdField_a_of_type_Int - 1) >= 0)
      {
        i3 = 0;
        localau.a(localar1, 0);
        j = 1;
        while ((j <<= 1) - 1 <= i4)
        {
          ar localar4 = (ar)localau.a(j - 1);
          ar localar7;
          if (j <= i4)
          {
            ar localar5 = (ar)localau.a(j);
            if (localar4.c > localar5.c)
            {
              if ((localar7 = (ar)localau.a(i3)).c <= localar5.c) {
                break;
              }
              localau.a(localar7, j);
              localau.a(localar5, i3);
              i3 = j;
              j++;
            }
            else
            {
              if ((localar7 = (ar)localau.a(i3)).c <= localar4.c) {
                break;
              }
              localau.a(localar7, j - 1);
              localau.a(localar4, i3);
              i3 = j - 1;
            }
          }
          else
          {
            if ((localar7 = (ar)localau.a(i3)).c <= localar4.c) {
              break;
            }
            localau.a(localar7, j - 1);
            localau.a(localar4, i3);
            i3 = j - 1;
          }
        }
      }
      localar3 = localar3;
      jdField_b_of_type_Au.a(localar3);
      jdField_b_of_type_JavaUtilHashtable.put(new Integer(localar3.d), localar3);
      if (localar3.d == i2)
      {
        i9 = 1;
        break;
      }
      for (j = 0; j < 4; j++)
      {
        int m = jdField_a_of_type_ArrayOfInt[j];
        i3 = jdField_b_of_type_ArrayOfInt[j];
        int i6 = localar3.e + m;
        int i8 = localar3.f + i3;
        if ((i6 >= 0) && (i6 < f.d) && (i8 >= 0) && (i8 < f.e))
        {
          m = (i6 << 16) + i8;
          if (e.a(i6, i8))
          {
            i3 = m;
            if ((ar)jdField_b_of_type_JavaUtilHashtable.get(new Integer(i3)) == null)
            {
              i3 = m;
              if ((localar2 = (ar)jdField_a_of_type_JavaUtilHashtable.get(new Integer(i3))) == null)
              {
                i3 = Math.abs(n - i6) + Math.abs(i1 - i8);
                (localar2 = a()).a(i6, i8, localar3.jdField_a_of_type_Int + 1, i3);
                localar2.jdField_a_of_type_Ar = localar3;
                b(localar2);
              }
              else
              {
                i3 = localar3.jdField_a_of_type_Int + 1;
                if (localar2.jdField_a_of_type_Int > i3)
                {
                  localar2.jdField_a_of_type_Ar = localar3;
                  localar2.jdField_a_of_type_Int = i3;
                  localar2.c = (localar2.jdField_a_of_type_Int + localar2.b);
                }
              }
            }
          }
        }
      }
    }
    if (i9 != 0)
    {
      localar3 = (ar)jdField_b_of_type_Au.a(jdField_b_of_type_Au.jdField_a_of_type_Int - 1);
      parama.jdField_a_of_type_Ar = localar3;
    }
    else if (parama == e.a)
    {
      e.c("好像走不到的样子");
    }
    jdField_a_of_type_JavaUtilHashtable.clear();
    int j = jdField_a_of_type_Au.jdField_a_of_type_Int;
    for (;;)
    {
      j--;
      if (j < 0) {
        break;
      }
      (localar3 = (ar)jdField_a_of_type_Au.a(j)).jdField_a_of_type_Ar = null;
      a(localar3);
    }
    jdField_b_of_type_JavaUtilHashtable.clear();
    j = jdField_b_of_type_Au.jdField_a_of_type_Int;
    for (;;)
    {
      j--;
      if (j < 0) {
        break;
      }
      localar3 = (ar)jdField_b_of_type_Au.a(j);
      localar2 = parama.jdField_a_of_type_Ar;
      i3 = 0;
      while (localar2 != null)
      {
        if (localar3 == localar2)
        {
          i3 = 1;
          break;
        }
        localar2 = localar2.jdField_a_of_type_Ar;
      }
      if (i3 == 0)
      {
        localar3.jdField_a_of_type_Ar = null;
        a(localar3);
      }
    }
  }
  
  private static void b(ar paramar)
  {
    jdField_a_of_type_JavaUtilHashtable.put(new Integer(paramar.d), paramar);
    au localau;
    (localau = jdField_a_of_type_Au).a(paramar);
    int i = (paramar = localau.jdField_a_of_type_Int - 1) + 1;
    while (i >>= 1 != 0)
    {
      ar localar1 = (ar)localau.a(i - 1);
      ar localar2 = (ar)localau.a(paramar);
      if (localar1.c <= localar2.c) {
        break;
      }
      localau.a(localar2, i - 1);
      localau.a(localar1, paramar);
      paramar = i - 1;
    }
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\i.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */