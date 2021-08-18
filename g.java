import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class g
  extends a
{
  public static int u;
  public static int v;
  public static int w;
  public static int x;
  public static int y;
  public static a i;
  public static a j;
  public static a k;
  public static a l;
  public static z[] a;
  public static z[] b;
  public static z[] c;
  public boolean b;
  boolean c;
  public int[] a;
  public int z = -1;
  private int[][] b;
  private byte k;
  private String[] a;
  private int B;
  public int A;
  
  public g()
  {
    this.jdField_b_of_type_Array2dOfInt = new int[2][4];
    this.jdField_a_of_type_ArrayOfJavaLangString = new String[] { "气血过低", "法力过低" };
    a(0);
    this.jdField_a_of_type_ArrayOfByte = new byte[33];
    jdField_a_of_type_ArrayOfZ = new z[14];
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= 14) {
        break;
      }
      jdField_a_of_type_ArrayOfZ[m] = new z((m + 7) % 7, 0);
    }
    c = new z[7];
    m = -1;
    for (;;)
    {
      m++;
      if (m >= 7) {
        break;
      }
      c[m] = new z(m, 0);
    }
    jdField_b_of_type_ArrayOfZ = new z[7];
    m = -1;
    for (;;)
    {
      m++;
      if (m >= 7) {
        break;
      }
      jdField_b_of_type_ArrayOfZ[m] = new z(m, 1);
    }
    i = this;
    (jdField_k_of_type_A = new a()).a(4);
    jdField_k_of_type_A.a(8, 1, 0);
    (l = new a()).a(165);
    l.a(0, 1, 0);
    this.j |= 0x2;
    a(this.jdField_a_of_type_J.jdField_b_of_type_Int, 1, 0);
    a(this.jdField_b_of_type_Int, this.c);
    this.jdField_b_of_type_Boolean = false;
  }
  
  public final void c()
  {
    u = v = this.jdField_a_of_type_J.jdField_b_of_type_Int;
    switch (w)
    {
    case 0: 
      switch (u)
      {
      case 0: 
      case 1: 
      case 3: 
      case 4: 
        ad.a(-1, -1);
        if ((d.a(2) > 0) || (d.a(8) > 0))
        {
          if ((ag.a()) || (this.jdField_b_of_type_Boolean))
          {
            d.b();
            return;
          }
          ad.a(0, d.d());
          e.jdField_a_of_type_G.m();
        }
        else if ((d.a(3) > 0) || (d.a(10) > 0))
        {
          if ((ag.a()) || (this.jdField_b_of_type_Boolean))
          {
            d.b();
            return;
          }
          ad.a(2, d.d());
          e.jdField_a_of_type_G.m();
        }
        else if ((d.a(0) > 0) || (d.a(6) > 0))
        {
          if ((ag.a()) || (this.jdField_b_of_type_Boolean))
          {
            d.b();
            return;
          }
          ad.a(1, d.d());
          e.jdField_a_of_type_G.m();
        }
        else if ((d.a(1) > 0) || (d.a(12) > 0))
        {
          if ((ag.a()) || (this.jdField_b_of_type_Boolean))
          {
            d.b();
            return;
          }
          ad.a(3, d.d());
          e.jdField_a_of_type_G.m();
        }
        else if ((d.a(4) == 1) || (d.a(9) == 1))
        {
          if ((ag.a()) || (this.jdField_b_of_type_Boolean))
          {
            d.b();
            return;
          }
          j();
        }
        else
        {
          ad.a();
        }
        break;
      case 12: 
        break;
      case 2: 
      case 5: 
      case 6: 
      case 7: 
      case 8: 
      case 9: 
      case 10: 
      case 11: 
      default: 
        if ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) {
          v = 0;
        }
        break;
      }
      break;
    case 1: 
      if ((!d.a((byte)13)) && (a(this)))
      {
        if ((e.jdField_a_of_type_G.z != -1) && (a()))
        {
          e.jdField_a_of_type_G.z += 1;
          if (e.jdField_a_of_type_G.z * 3 >= e.jdField_a_of_type_G.jdField_a_of_type_ArrayOfInt.length) {
            e.jdField_a_of_type_G.m();
          }
        }
        c(0);
        v = 0;
      }
      if ((d.a(1) > 0) || (d.a(2) > 0) || (d.a(3) > 0) || (d.a(0) > 0) || (d.a(6) > 0) || (d.a(8) > 0) || (d.a(10) > 0) || (d.a(12) > 0))
      {
        if (this.jdField_b_of_type_Boolean)
        {
          d.b();
          return;
        }
        c(0);
        e.jdField_a_of_type_G.m();
      }
      else if (((e.jdField_a_of_type_Short & 0x20) != 0) && (d.e() == -1) && (ad.a(d.g(), d.jdField_d_of_type_Int)) && (ad.a(d.i(), d.e)) && (d.i() < d.jdField_b_of_type_Int - 40))
      {
        if (this.jdField_b_of_type_Boolean)
        {
          d.b();
          return;
        }
        c(0);
        e.jdField_a_of_type_G.m();
      }
      else
      {
        ad.a();
      }
      break;
    }
    if (d.a(17) == 1)
    {
      if (this.jdField_b_of_type_Boolean)
      {
        d.b();
        return;
      }
      e.a("sysMenu");
      d.b();
    }
    else if (d.a(18) == 1)
    {
      if ((ag.a()) || (this.jdField_b_of_type_Boolean))
      {
        d.b();
        return;
      }
      h.b("vm:memo");
      d.f();
      d.b();
    }
    if (v != u) {
      a(v, 1, 0);
    }
    if (w == 0) {
      a(true, -1, -1);
    } else {
      a(false, this.f, this.g);
    }
    d();
    jdField_k_of_type_A.c();
    this.jdField_a_of_type_J.a(0);
    if ((this.jdField_b_of_type_Boolean) && (this.A < 30))
    {
      g localg1 = this;
      g localg2 = this;
      Object localObject2 = null;
      int i2 = Integer.MAX_VALUE;
      int i4 = -1;
      int i3;
      for (;;)
      {
        i4++;
        if (i4 >= f.g) {
          break;
        }
        if ((f.a[i4].j & 0x8) != 0)
        {
          int n = localg2.c;
          int i6 = localg2.jdField_b_of_type_Int;
          int i5 = f.a[i4].c;
          i3 = ((i3 = f.a[i4].jdField_b_of_type_Int) - i6) * (i3 - i6) + (i5 - n) * (i5 - n);
          if ((f.a[i4].a(localg2.jdField_b_of_type_Int, localg2.c, 0, 0, 0, 30 + localg2.B * 20)) && (i2 > i3))
          {
            i2 = i3;
            localObject2 = f.a[i4];
          }
        }
      }
      Object localObject1;
      if (((localObject1 = localObject2) == null) && (localg1.A < 4))
      {
        localg1.A += 1;
        localg1.B = ((localg1.B + 1) % 4);
      }
      else if (localObject1 != null)
      {
        h();
        localg1.i();
        i3 = 0;
        localObject2 = localObject1;
        localg2 = localg1;
        if (localObject2 == localg2)
        {
          localg2.a(0, 1, 0);
        }
        else
        {
          Object localObject3 = localObject2;
          g localg3;
          int i1 = Math.abs((localg3 = localg2).jdField_b_of_type_Int - ((a)localObject3).jdField_b_of_type_Int);
          i3 = localg3.jdField_b_of_type_Int - ((a)localObject3).jdField_b_of_type_Int >= 0 ? 0 : Math.abs(localg3.c - ((a)localObject3).c) > i1 ? 3 : localg3.c - ((a)localObject3).c >= 0 ? 1 : 2;
          localg2.jdField_d_of_type_Int = i3;
          localg2.a(0, 1, 0);
          localg2.a(i3 == 0);
        }
        ad.b(((a)localObject1).jdField_b_of_type_Int, ((a)localObject1).c);
        localg1.A = 30;
      }
      else if ((localg1.A >= 4) && (localg1.A < 25))
      {
        localg1.A += 1;
      }
      else if (localg1.A >= 25)
      {
        localg1.A = 0;
      }
    }
    else if ((this.jdField_b_of_type_Boolean) && (this.A >= 30) && (this.A < 50))
    {
      this.A += 1;
    }
    else if (this.A >= 50)
    {
      this.A = 0;
    }
    if (ag.a()) {
      return;
    }
    if ((d.c % 10 == 0) && ((x != this.jdField_b_of_type_Int) || (y != this.c)))
    {
      i();
      if (d.b() == 8) {
        h();
      }
    }
    if ((this.jdField_b_of_type_Boolean) || (w == 1) || (this.e == 1)) {
      return;
    }
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= f.g) {
        break;
      }
      if ((f.a[m] != this) && ((f.a[m].j & 0x10) != 0) && (ad.a(this, f.a[m])) && (f.a[m].e == 0) && (this.e == 0))
      {
        this.e = (f.a[m].e = 1);
        k();
        if (i != f.a[m]) {
          i = f.a[m];
        }
      }
    }
  }
  
  public static void h()
  {
    if ((t.c > 0) && (t.jdField_b_of_type_Boolean))
    {
      t.c = -1;
      t.jdField_b_of_type_Int = 0;
      n localn;
      (localn = e.jdField_a_of_type_Q.b()).a(58);
      localn.a(t.jdField_b_of_type_Byte);
      e.jdField_a_of_type_Q.c();
    }
  }
  
  public final void i()
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(33);
    localn.b(this.jdField_b_of_type_Int);
    localn.b(this.c);
    e.jdField_a_of_type_Q.c();
    x = this.jdField_b_of_type_Int;
    y = this.c;
  }
  
  public final void j()
  {
    if (d.a()) {
      return;
    }
    int m;
    if (i == e.jdField_a_of_type_G)
    {
      g localg = this;
      au localau = new au();
      int n = -1;
      for (;;)
      {
        n++;
        if (n >= f.g) {
          break;
        }
        if ((f.a[n] != localg) && ((f.a[n].j & 0x188) == 0) && (f.a[n].a(localg.jdField_b_of_type_Int, localg.c, 0, 0, 0, 40)))
        {
          f.a[n].o = 0;
          if ((f.a[n].j & 0x10) != 0)
          {
            f.a[n].o += n + 6000;
            switch (n.a(f.a[n].jdField_a_of_type_ArrayOfByte, 5))
            {
            case 1: 
              f.a[n].o += 300;
              break;
            case 2: 
              f.a[n].o += 100;
              break;
            case 3: 
              f.a[n].o += 200;
            }
          }
          else if ((f.a[n].j & 0x4) != 0)
          {
            f.a[n].o += n + 3000;
          }
          localau.a(f.a[n]);
        }
      }
      a locala2;
      for (n = 0;; n++)
      {
        a locala1 = null;
        if (n >= localau.jdField_a_of_type_Int - 1) {
          break;
        }
        for (m = 0; m < localau.jdField_a_of_type_Int - n - 1; m++)
        {
          locala1 = (a)localau.a(m);
          locala2 = (a)localau.a(m + 1);
          if (locala1.o < locala2.o)
          {
            localau.a(locala2, m);
            localau.a(locala1, m + 1);
          }
        }
      }
      StringBuffer localStringBuffer;
      (localStringBuffer = e.jdField_a_of_type_JavaLangStringBuffer).setLength(0);
      m = localau.jdField_a_of_type_Int > 8 ? 8 : localau.jdField_a_of_type_Int;
      int i1 = -1;
      for (;;)
      {
        i1++;
        if (i1 >= m) {
          break;
        }
        String str = (locala2 = (a)localau.a(i1)).jdField_a_of_type_JavaLangString;
        long l1 = locala2.jdField_a_of_type_Long;
        int i2 = n.a(locala2.jdField_a_of_type_ArrayOfByte, 0);
        if ((locala2.j & 0x4) != 0) {
          localStringBuffer.append("<tr><td><a  w='120' cmd='' oc='playerFun(").append('"').append(str).append('"').append(",").append('"').append(l1).append('"').append(")'>").append("~~~" + str).append("</a></td><td w='50'><a>").append(i2).append("</a></td></tr>");
        } else {
          localStringBuffer.append("<tr><td><a  w='120' cmd='' oc='npcFun(").append('"').append(str).append('"').append(",").append('"').append(l1).append('"').append(")'>").append("~~~" + str).append("</a></td>").append("</tr>");
        }
      }
      e.jdField_a_of_type_Bc.a(bc.a(bc.a("closerPlayerList"), "_list", localStringBuffer.toString()));
      return;
    }
    if ((i.j & 0x4) == 0)
    {
      m = 0;
      if (((i.j & 0x10) != 0) && (i.e == 1)) {
        m = 1;
      }
      if ((i.j & 0x8) != 0) {
        m |= 0x2;
      }
      if (m == 3)
      {
        if ((n.a(i.jdField_a_of_type_ArrayOfByte, 20) & 0x3) == 32) {}
      }
      else
      {
        if (m == 1) {
          h.a(i.jdField_a_of_type_Long);
        } else if ((m == 2) && ((n.a(i.jdField_a_of_type_ArrayOfByte, 20) & 0x3) != 2)) {
          return;
        }
        c(0);
      }
    }
  }
  
  public final void k()
  {
    if (this.z == -1)
    {
      c(0);
      a(this.jdField_b_of_type_Int, this.c);
      a(this.jdField_d_of_type_Byte == 0 ? 0 : 1, 1, 0);
      x = this.jdField_b_of_type_Int;
      y = this.c;
    }
  }
  
  public final void c(int paramInt)
  {
    w = paramInt;
    switch (paramInt)
    {
    case 0: 
      e();
    }
  }
  
  public final void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    super.a(paramGraphics, paramInt1, paramInt2);
    int m = -1;
    for (;;)
    {
      m++;
      if (m >= this.jdField_b_of_type_Array2dOfInt.length) {
        break;
      }
      if (this.jdField_b_of_type_Array2dOfInt[m][1] -= 1 > 0)
      {
        if ((this.jdField_b_of_type_Array2dOfInt[m][0] & 0x1) == 1) {
          this.jdField_b_of_type_Array2dOfInt[m][2] += 1;
        } else {
          this.jdField_b_of_type_Array2dOfInt[m][2] -= 1;
        }
        this.jdField_b_of_type_Array2dOfInt[m][3] -= 1;
        ae.a(paramGraphics, this.jdField_b_of_type_Array2dOfInt[m][2] - paramInt1, this.jdField_b_of_type_Array2dOfInt[m][3] - paramInt2, this.jdField_a_of_type_ArrayOfJavaLangString[this.jdField_b_of_type_Array2dOfInt[m][0]], 16711680, 0, 20);
      }
    }
  }
  
  public final void l()
  {
    int m = n.a(this.jdField_a_of_type_ArrayOfByte, 2);
    int n = n.a(this.jdField_a_of_type_ArrayOfByte, 3);
    if (m < 8) {
      d(0);
    }
    if (n < 8) {
      d(1);
    }
  }
  
  private void d(int paramInt)
  {
    int[] arrayOfInt;
    (arrayOfInt = this.jdField_b_of_type_Array2dOfInt[(this.jdField_k_of_type_Byte++)])[0] = paramInt;
    arrayOfInt[1] = 10;
    if ((paramInt & 0x1) == 1) {
      arrayOfInt[2] = this.jdField_b_of_type_Int;
    } else if ((paramInt & 0x1) == 0) {
      arrayOfInt[2] = (this.jdField_b_of_type_Int - bg.a.stringWidth(this.jdField_a_of_type_ArrayOfJavaLangString[paramInt]));
    }
    arrayOfInt[3] = (this.c - 20);
    if (this.jdField_k_of_type_Byte >= this.jdField_b_of_type_Array2dOfInt.length) {
      this.jdField_k_of_type_Byte = 0;
    }
  }
  
  public final boolean a()
  {
    if (e.jdField_a_of_type_Int != this.jdField_a_of_type_ArrayOfInt[(this.z * 3)]) {
      return false;
    }
    if (this.jdField_b_of_type_Int != this.jdField_a_of_type_ArrayOfInt[(this.z * 3 + 1)]) {
      return false;
    }
    return this.c == this.jdField_a_of_type_ArrayOfInt[(this.z * 3 + 2)];
  }
  
  public final void m()
  {
    this.z = -1;
    this.jdField_a_of_type_ArrayOfInt = null;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\g.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */