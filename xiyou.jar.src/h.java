import engine.Ancient;
import java.io.IOException;

public final class h
{
  private static int a;
  
  public static final void a(n paramn)
  {
    try
    {
      int i = paramn.a() & 0xFF;
      jdField_a_of_type_Int += 1;
      Object localObject;
      int n;
      String str1;
      switch (i)
      {
      case 5: 
        i = paramn.c();
        e.jdField_a_of_type_Q.a(e.a(i));
        e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = true;
        break;
      case 6: 
        paramn = paramn;
        switch (paramn.a())
        {
        case 0: 
        case 2: 
          switch (e.jdField_b_of_type_Byte)
          {
          case 0: 
          case 1: 
            (localObject = e.jdField_a_of_type_Q.b()).a(1);
            ((n)localObject).a(e.d);
            ((n)localObject).a(e.e);
            ((n)localObject).a(Ancient.jdField_a_of_type_JavaLangString);
            ((n)localObject).a(Ancient.jdField_b_of_type_JavaLangString);
            e.jdField_a_of_type_Q.c();
            break;
          case 2: 
          case 7: 
          case 8: 
          case 9: 
            b(e.jdField_b_of_type_JavaLangString);
            e.jdField_b_of_type_JavaLangString = null;
          }
          break;
        case 1: 
          e.d("键值错误");
          break;
        case 3: 
          e.d(null);
          e.jdField_a_of_type_Bc.a(paramn.a());
        }
        break;
      case 8: 
        paramn = paramn;
        e.jdField_a_of_type_Boolean = true;
        e.jdField_a_of_type_Q.d();
        i = paramn.a();
        e.B();
        switch (i)
        {
        case 0: 
          e.d(null);
          e.c("绑定成功");
          break;
        case 1: 
          e.a("login");
          e.c("绑定失败:帐户名密码不正确");
          break;
        case 2: 
          e.a("login");
          e.c("绑定失败:手机号码不正确");
          break;
        case 3: 
          e.a("login");
          e.c("绑定失败:关键字不正确");
          break;
        case 4: 
          e.a("login");
          e.c("绑定失败:该账户已设置绑定");
          break;
        case 5: 
          e.a("login");
          e.c("绑定失败:该手机号码已设置绑定");
        }
        break;
      case 9: 
        paramn = paramn;
        e.jdField_a_of_type_Boolean = true;
        e.jdField_a_of_type_Q.d();
        i = paramn.a();
        e.B();
        switch (i)
        {
        case 0: 
          e.d(null);
          e.c("您的帐户名及密码已经通过手机短信发送，请注意查收");
          break;
        case 1: 
          e.a("login");
          e.c("手机号码不正确");
          break;
        case 2: 
          e.a("login");
          e.c("关键字不正确");
          break;
        case 3: 
          e.a("login");
          e.c("手机号码与关键字不匹配");
        }
        break;
      case 18: 
        i = paramn.c();
        e.jdField_a_of_type_Q.a(e.a(i));
        e.jdField_a_of_type_Q.jdField_a_of_type_Boolean = true;
        (localObject = e.jdField_a_of_type_Q.b()).a(19);
        ((n)localObject).a(e.f);
        e.jdField_a_of_type_Q.c();
        break;
      case 4: 
        paramn = paramn;
        e.jdField_a_of_type_Q.b = true;
        e.jdField_a_of_type_Q.d();
        e.F();
        e.f = paramn.a();
        if (e.jdField_b_of_type_Byte == 1)
        {
          e.jdField_a_of_type_N.a();
          if (u.a("data", 3, e.jdField_a_of_type_N))
          {
            e.b(e.jdField_a_of_type_N.a(), e.jdField_a_of_type_N.a());
          }
          else
          {
            e.jdField_b_of_type_Byte = 0;
            e.d("历史登陆服务器有误,请正常登陆!");
          }
        }
        else
        {
          i = paramn.a();
          (localObject = e.jdField_a_of_type_JavaLangStringBuffer).setLength(0);
          int k = 0;
          while (k++ < i)
          {
            n = paramn.a();
            String str3 = paramn.a();
            String str4 = paramn.a();
            int i1 = paramn.a();
            if (k == 1) {
              ((StringBuffer)localObject).append("<tr h='8'><td></td></tr>");
            }
            ((StringBuffer)localObject).append("<tr><td><a pl='min' c='ffffff' cc='000000' type='double' nm='server").append(n);
            ((StringBuffer)localObject).append("' cmd='' oc='check()' val='").append(str4).append("'>").append(str3).append("</a></td>");
            if (i1 == 0)
            {
              ((StringBuffer)localObject).append("<td w='60'><a  c='bdf663' cc='2c2213' type='double' pl='min'>");
              ((StringBuffer)localObject).append("正常");
            }
            else if (i1 == 1)
            {
              ((StringBuffer)localObject).append("<td w='60'><a c='fe830b' cc='2c2213' type='double' pl='min'>");
              ((StringBuffer)localObject).append("热闹");
            }
            else if (i1 == 2)
            {
              ((StringBuffer)localObject).append("<td w='60'><a c='fe830b' cc='2c2213' type='double' pl='min'>");
              ((StringBuffer)localObject).append("爆满");
            }
            else if (i1 == 3)
            {
              ((StringBuffer)localObject).append("<td w='60'><a c='7c7c7c' cc='2c2213' type='double' pl='min'>");
              ((StringBuffer)localObject).append("维护");
            }
            else
            {
              ((StringBuffer)localObject).append("<td w='60'><a c='bdf663' cc='2c2213' type='double' pl='min'>");
              ((StringBuffer)localObject).append("良好");
            }
            ((StringBuffer)localObject).append("</a></td></tr>");
          }
          String str2 = paramn.a();
          e.B();
          e.jdField_a_of_type_Bc.a(bc.a(bc.a("serverList"), "$_txt1", ((StringBuffer)localObject).toString()));
          if (!"".equals(str2)) {
            e.jdField_a_of_type_Bc.a(str2);
          }
          e.jdField_a_of_type_Q.b = true;
        }
        break;
      case 17: 
        paramn = paramn;
        if (e.jdField_b_of_type_Byte != 1) {
          e.G();
        }
        e.B();
        e.jdField_a_of_type_Bc.c("playerList");
        i = paramn.a();
        e.jdField_a_of_type_Bc.a("playerList", "setmax(" + i + ")");
        localObject = new StringBuffer();
        int m = 0;
        for (n = 0; n < i; n++)
        {
          ((StringBuffer)localObject).append("set(").append(paramn.a()).append(",\"").append(paramn.a()).append("\",\"").append(paramn.a()).append("\",").append(paramn.a());
          m = paramn.a();
          switch (m)
          {
          case 0: 
            tmpTernaryOp = "战鬼";
            break;
          case 1: 
            tmpTernaryOp = "仙灵";
            break;
          case 2: 
            tmpTernaryOp = "圣僧";
            break;
          case 3: 
            tmpTernaryOp = "罗刹";
            break;
          }
          ((StringBuffer)localObject).append(",\"").append(m).append("\",").append(paramn.c()).append(",\"").append("无").append("\")");
          e.jdField_a_of_type_Bc.a("playerList", ((StringBuffer)localObject).toString());
          ((StringBuffer)localObject).setLength(0);
        }
        break;
      case 16: 
        k(paramn);
        break;
      case 1: 
        paramn = paramn;
        e.jdField_a_of_type_Q.d();
        e.B();
        e.a("reg");
        e.c(paramn.a());
        break;
      case 7: 
        paramn = paramn;
        e.jdField_a_of_type_Q.d();
        str1 = "";
        switch (paramn.a())
        {
        case 0: 
          str1 = "修改成功!";
          localObject = paramn.a();
          e.jdField_a_of_type_N.a();
          if (u.a("data", 1, e.jdField_a_of_type_N)) {
            e.d = e.jdField_a_of_type_N.a();
          }
          e.e = (String)localObject;
          e.F();
          e.B();
          e.a("login");
          break;
        case 2: 
          str1 = "旧密码不正确!";
          break;
        case 3: 
          str1 = "账户名不正确!";
        }
        e.c(str1);
        break;
      case 0: 
        paramn = paramn;
        e.jdField_a_of_type_Q.d();
        e.d(null);
        e.w();
        e.c(paramn.a());
        break;
      case 33: 
        l(paramn);
        break;
      case 40: 
        e.jdField_a_of_type_Ah.a(paramn);
        break;
      case 34: 
      case 35: 
      case 37: 
        a(str1, paramn);
        break;
      case 36: 
        b(paramn);
        break;
      case 32: 
        m(paramn);
        break;
      case 39: 
        n(paramn);
        break;
      case 48: 
        e.jdField_a_of_type_Bc.h();
        if (d.b() == 7)
        {
          d.a();
          t.d = true;
          d.a((byte)13, 64);
          t.c = true;
        }
        else if (!d.a((byte)13))
        {
          d.a((byte)13, 48);
          t.c = false;
        }
        else
        {
          t.d();
          t.c = false;
        }
        t.a(paramn);
        break;
      case 49: 
        t.b(paramn);
        break;
      case 51: 
        t.c(paramn);
        break;
      case 53: 
        p(paramn);
        break;
      case 55: 
        t.d(paramn);
        break;
      case 56: 
        z.a(paramn);
        break;
      case 57: 
        t.e(paramn);
        break;
      case 64: 
        e.jdField_a_of_type_Bc.h();
        o(paramn);
        break;
      case 38: 
        i(paramn);
        break;
      case 65: 
        j(paramn);
        break;
      case 66: 
        h(paramn);
        break;
      case 67: 
        g(paramn);
        break;
      case 68: 
        y.a(paramn);
        break;
      case 69: 
        e(paramn);
        break;
      case 70: 
        ag.a(paramn.a());
        break;
      case 71: 
        c(paramn);
        break;
      case 72: 
        d(paramn);
        break;
      case 73: 
        paramn = paramn;
        int j = paramn.a();
        paramn = paramn.a();
        e.jdField_a_of_type_ArrayOfByte[j] = paramn;
        break;
      case 74: 
        bc.i();
        break;
      case 96: 
        f(paramn);
      }
      e.x();
      return;
    }
    catch (Exception localException)
    {
      localException;
    }
  }
  
  private static void b(n paramn)
  {
    long l = paramn.a();
    a locala3 = (paramn = e.jdField_a_of_type_C).jdField_a_of_type_A;
    a locala4 = null;
    while ((locala3 != null) && (locala3.jdField_a_of_type_Long != l))
    {
      locala4 = locala3;
      if (locala3.jdField_a_of_type_Long > l) {
        locala3 = locala3.jdField_a_of_type_A;
      } else {
        locala3 = locala3.jdField_b_of_type_A;
      }
    }
    if (locala3 != null)
    {
      if (locala3.jdField_b_of_type_A == null)
      {
        if (locala4 == null) {
          paramn.jdField_a_of_type_A = locala3.jdField_a_of_type_A;
        } else if (locala3 == locala4.jdField_a_of_type_A) {
          locala4.jdField_a_of_type_A = locala3.jdField_a_of_type_A;
        } else {
          locala4.jdField_b_of_type_A = locala3.jdField_a_of_type_A;
        }
      }
      else
      {
        a locala1 = locala3.jdField_b_of_type_A;
        a locala2 = locala3.jdField_b_of_type_A;
        while (locala1.jdField_a_of_type_A != null)
        {
          locala2 = locala1;
          locala1 = locala1.jdField_a_of_type_A;
        }
        if (locala1 == locala2)
        {
          if (locala4 == null) {
            paramn.jdField_a_of_type_A = locala2;
          } else if (locala3 == locala4.jdField_a_of_type_A) {
            locala4.jdField_a_of_type_A = locala2;
          } else {
            locala4.jdField_b_of_type_A = locala2;
          }
          locala2.jdField_a_of_type_A = locala3.jdField_a_of_type_A;
        }
        else
        {
          locala2.jdField_a_of_type_A = locala1.jdField_b_of_type_A;
          if (locala4 == null) {
            paramn.jdField_a_of_type_A = locala1;
          } else if (locala3 == locala4.jdField_a_of_type_A) {
            locala4.jdField_a_of_type_A = locala1;
          } else {
            locala4.jdField_b_of_type_A = locala1;
          }
          locala1.jdField_a_of_type_A = locala3.jdField_a_of_type_A;
          locala1.jdField_b_of_type_A = locala3.jdField_b_of_type_A;
        }
      }
      a.a(locala3);
    }
    af.a(l);
  }
  
  private static void c(n paramn)
  {
    int i = paramn.a();
    for (int j = 0; j < i; j++) {
      ag.b(paramn.a());
    }
  }
  
  private static void d(n paramn)
  {
    int i = paramn.a();
    for (int j = 0; j < i; j++) {
      ag.a(paramn.a(), paramn.a(), paramn.a(), paramn.a(), paramn.a());
    }
  }
  
  private static void e(n paramn)
  {
    int i = paramn.a();
    for (int j = 0; j < i; j++) {
      ag.a(paramn.a(), paramn.a(), paramn.a(), paramn.a(), paramn.a(), paramn.a());
    }
  }
  
  private static void f(n paramn)
  {
    long l = paramn.a();
    bc.a[0] = String.valueOf(l);
    String str = paramn.a();
    paramn = paramn.a();
    StringBuffer localStringBuffer;
    (localStringBuffer = e.jdField_a_of_type_JavaLangStringBuffer).append("<tr><td><a pl='min' type='double'>").append(str).append("</a></td></tr>");
    localStringBuffer.append("<tr ><td>").append(paramn).append("</td></tr>");
    e.jdField_a_of_type_Bc.a(bc.a(bc.a("bagInfo"), "$_txt1", localStringBuffer.toString()));
  }
  
  private static void g(n paramn)
  {
    String str = paramn.a();
    int i = paramn.a();
    for (;;)
    {
      i = (byte)(i - 1);
      if (i <= 0) {
        break;
      }
      e.jdField_a_of_type_Bc.a(str, paramn.a());
    }
  }
  
  private static void h(n paramn)
  {
    int i = paramn.a();
    paramn = paramn.a();
    if ((i & 0x1) != 0) {
      e.w();
    }
    if ((i & 0x2) != 0) {
      bc.i();
    }
    if (d.a((byte)13)) {
      return;
    }
    e.c(paramn);
  }
  
  private static void i(n paramn)
  {
    long l = paramn.a();
    a locala;
    if ((locala = e.jdField_a_of_type_C.a(l)) == null) {
      return;
    }
    int i;
    if ((i = paramn.a()) == 14)
    {
      locala.jdField_a_of_type_JavaLangString = paramn.a();
      locala.b();
      return;
    }
    paramn = paramn.c();
    if (i == 7)
    {
      n.a(locala.jdField_a_of_type_ArrayOfByte, i, (byte)(paramn >>> 8));
      n.a(locala.jdField_a_of_type_ArrayOfByte, i + 1, (byte)paramn);
      return;
    }
    if (i == 13)
    {
      n.a(locala.jdField_a_of_type_ArrayOfByte, i, paramn);
      locala.g();
      return;
    }
    if (i == 16)
    {
      if (paramn == 6)
      {
        paramn = n.a(locala.jdField_a_of_type_ArrayOfByte, 20) | 0x20;
        n.a(locala.jdField_a_of_type_ArrayOfByte, 20, paramn);
        return;
      }
      if (paramn == 7)
      {
        paramn = n.a(locala.jdField_a_of_type_ArrayOfByte, 20) & 0xFFFFFFDF | 0x2;
        n.a(locala.jdField_a_of_type_ArrayOfByte, 20, paramn);
        return;
      }
      n.a(locala.jdField_a_of_type_ArrayOfByte, i, paramn);
      return;
    }
    if (i == 6)
    {
      locala.b(paramn);
      return;
    }
    n.a(locala.jdField_a_of_type_ArrayOfByte, i, paramn);
  }
  
  private static void j(n paramn)
  {
    int i = paramn.a();
    int j = paramn.a();
    paramn = paramn.a(j);
    try
    {
      paramn = as.a(paramn);
    }
    catch (IOException localIOException)
    {
      e.c("打开页面错误.");
      e.w();
      return;
    }
    if (i == 1) {
      e.jdField_a_of_type_Bc.h();
    }
    try
    {
      if (d.a((byte)13))
      {
        e.w();
        return;
      }
      e.jdField_a_of_type_Bc.a(paramn);
    }
    catch (Exception localException)
    {
      localException;
    }
    e.w();
  }
  
  public static void a()
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(2);
    localn.a(Ancient.jdField_b_of_type_Byte);
    localn.b(Ancient.jdField_a_of_type_Byte);
    localn.a(Ancient.jdField_a_of_type_JavaLangString);
    localn.a(Ancient.jdField_b_of_type_JavaLangString);
    e.jdField_a_of_type_Q.c();
  }
  
  public static void a(String paramString)
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(16);
    localn.a(paramString);
    e.jdField_a_of_type_Q.c();
    for (paramString = 0; paramString < e.jdField_a_of_type_ArrayOfByte.length; paramString++) {
      e.jdField_a_of_type_ArrayOfByte[paramString] = 0;
    }
  }
  
  private static void k(n paramn)
  {
    if (e.jdField_a_of_type_G != null)
    {
      e.jdField_a_of_type_C.a();
      f.b();
      y.b();
      if (a.d != null)
      {
        a.d.jdField_b_of_type_A = null;
        a.d.jdField_a_of_type_A = null;
        a.d = null;
      }
      ag.jdField_a_of_type_ArrayOfLong = null;
      ag.jdField_a_of_type_Array2dOfByte = null;
      t.d();
      z.c();
      i = -1;
      for (;;)
      {
        i++;
        if (i >= g.a.length) {
          break;
        }
        g.a[i].b();
      }
    }
    e.jdField_a_of_type_G = new g();
    t.a();
    int[] arrayOfInt = { 14, 5, 7, 11, 13, 16, 15 };
    int i = -1;
    for (;;)
    {
      i++;
      if (i >= arrayOfInt.length) {
        break;
      }
      z.a(arrayOfInt[i], 2, i + 1, -1);
    }
    g localg = e.jdField_a_of_type_G;
    e.jdField_a_of_type_C.jdField_a_of_type_A = localg;
    localg.jdField_a_of_type_Long = paramn.a();
    localg.jdField_a_of_type_JavaLangString = paramn.a();
    localg.b();
    n.a(localg.jdField_a_of_type_ArrayOfByte, 0, paramn.a());
    localg.m = paramn.a();
    localg.a((byte)localg.m);
    localg.b(paramn.c());
    int j = paramn.a();
    localg.jdField_e_of_type_Int = (j >> 4 & 0xF);
    n.a(localg.jdField_a_of_type_ArrayOfByte, 16, j & 0xF);
    j = paramn.a();
    n.a(localg.jdField_a_of_type_ArrayOfByte, 7, (byte)(j >>> 8));
    n.a(localg.jdField_a_of_type_ArrayOfByte, 8, (byte)j);
    j = paramn.a();
    n.a(localg.jdField_a_of_type_ArrayOfByte, 2, j);
    j = paramn.a();
    n.a(localg.jdField_a_of_type_ArrayOfByte, 3, j);
    paramn.a();
    localg.a(0, 1, 0);
    localg.jdField_a_of_type_J.a();
    t.c(paramn);
    t.c(paramn);
    while (d.b() != -1) {
      d.a();
    }
    localg.c = true;
  }
  
  private static void l(n paramn)
  {
    e.jdField_a_of_type_Bc.h();
    int i = paramn.a();
    e.jdField_a_of_type_JavaLangString = paramn.a();
    d.b();
    e.jdField_a_of_type_G.c(0);
    g.i = e.jdField_a_of_type_G;
    e.jdField_a_of_type_G.jdField_e_of_type_Byte = 0;
    e.jdField_a_of_type_G.a(paramn.a(), paramn.a());
    e.jdField_a_of_type_G.k();
    int j = paramn.a();
    byte[] arrayOfByte = paramn.a(j);
    try
    {
      arrayOfByte = as.a(arrayOfByte);
      paramn.d(f.a(arrayOfByte, e.jdField_a_of_type_Int != i));
    }
    catch (IOException localIOException)
    {
      localIOException;
    }
    e.jdField_a_of_type_Int = i;
    if (d.b() == 13)
    {
      t.d = true;
      t.c = true;
    }
    else
    {
      if (d.b() == 7) {
        d.a();
      }
      d.a((byte)7, 112);
    }
    e.x();
  }
  
  public static void a(int paramInt, n paramn)
  {
    long l1;
    x localx = af.a(l1 = paramn.a());
    a locala;
    (locala = a.a()).jdField_a_of_type_Long = l1;
    if (localx == null) {
      (localx = new x()).jdField_a_of_type_Long = l1;
    }
    if (paramInt == 34)
    {
      locala.a(paramn, 4);
      localx.jdField_a_of_type_Byte = 2;
      localx.jdField_a_of_type_Int = -1;
    }
    else if (paramInt == 35)
    {
      locala.a(paramn, 16);
      if ((locala.j & 0x80) != 0)
      {
        localx.jdField_a_of_type_Byte = 4;
        localx.jdField_a_of_type_Int = 14505727;
      }
      else
      {
        localx.jdField_a_of_type_Byte = 3;
        localx.jdField_a_of_type_Int = 6959771;
      }
    }
    else
    {
      locala.a(paramn, 8);
    }
    if ((locala.j & 0x100) == 0)
    {
      localx.a(locala.jdField_b_of_type_Int, locala.c);
      af.a(localx);
    }
    paramInt = locala;
    long l2 = locala.jdField_a_of_type_Long;
    c localc = e.jdField_a_of_type_C;
    n localn = null;
    if ((paramn = localc.jdField_a_of_type_A) == null)
    {
      localc.jdField_a_of_type_A = paramInt;
      return;
    }
    paramn = paramn;
    while (paramn != null)
    {
      localn = paramn;
      if (paramn.jdField_a_of_type_Long > l2) {
        paramn = paramn.jdField_a_of_type_A;
      } else {
        paramn = paramn.jdField_b_of_type_A;
      }
    }
    if (localn.jdField_a_of_type_Long == l2)
    {
      a.a(paramInt);
      return;
    }
    if (localn.jdField_a_of_type_Long > l2)
    {
      localn.jdField_a_of_type_A = paramInt;
      return;
    }
    localn.jdField_b_of_type_A = paramInt;
  }
  
  private static void m(n paramn)
  {
    long l = paramn.a();
    a locala;
    if ((locala = e.jdField_a_of_type_C.a(l)) != null)
    {
      int i = paramn.a();
      paramn = paramn.a();
      if ((locala != null) && (locala.jdField_a_of_type_Long != e.jdField_a_of_type_G.jdField_a_of_type_Long))
      {
        locala.c(i, paramn);
        return;
      }
      e.jdField_a_of_type_G.a(e.jdField_a_of_type_G.jdField_b_of_type_Int, e.jdField_a_of_type_G.c);
      e.jdField_a_of_type_G.c(i, paramn);
      if (g.w != 1) {
        e.jdField_a_of_type_G.c(1);
      }
    }
  }
  
  private static void n(n paramn)
  {
    int k = paramn.a();
    int m = 0;
    while (m++ < k)
    {
      long l = paramn.a();
      a locala = e.jdField_a_of_type_C.a(l);
      int i = paramn.a();
      int j = paramn.a();
      if (locala != null) {
        if ((locala != null) && (locala.jdField_a_of_type_Long != e.jdField_a_of_type_G.jdField_a_of_type_Long))
        {
          locala.c(i, j);
        }
        else
        {
          e.jdField_a_of_type_G.a(e.jdField_a_of_type_G.jdField_b_of_type_Int, e.jdField_a_of_type_G.c);
          e.jdField_a_of_type_G.c(i, j);
          if (g.w != 1) {
            e.jdField_a_of_type_G.c(1);
          }
        }
      }
    }
  }
  
  private static void o(n paramn)
  {
    String str1 = paramn.a();
    String str2 = paramn.a();
    String str3 = paramn.a();
    int k = paramn.a();
    StringBuffer localStringBuffer;
    (localStringBuffer = e.jdField_a_of_type_JavaLangStringBuffer).setLength(0);
    localStringBuffer.append("<form nm='npcmsg' tl='").append(str1).append("'><tb ln='n' bt='0' w='100%' h='");
    int i = ((i = str2.length() * bg.jdField_a_of_type_Byte / d.jdField_a_of_type_Int * bg.jdField_b_of_type_Byte + (bg.jdField_b_of_type_Byte << 1)) < 40 ? i + 40 : i) + 2 * bg.jdField_b_of_type_Byte;
    localStringBuffer.append(i);
    localStringBuffer.append("'><tr><td>").append(str2).append("</td></tr></tb><tb bt='5' w='100%' h='");
    int j = (j = k * bg.jdField_b_of_type_Byte + bg.jdField_b_of_type_Byte) + i < d.jdField_b_of_type_Int - 60 ? d.jdField_b_of_type_Int - 60 - i : j;
    localStringBuffer.append(j).append("'>");
    i = 0;
    while (i++ < k)
    {
      localStringBuffer.append("<tr><td><a pl='min' type='double' nm='s").append(i).append("' cmd='").append(paramn.a()).append("'>").append(paramn.a()).append("</a>");
      localStringBuffer.append("</td></tr>");
    }
    localStringBuffer.append("</tb>");
    if ((str3 != null) && (!"".equals(str3))) {
      localStringBuffer.append("<s>").append(str3).append("</s>");
    }
    localStringBuffer.append("</form>");
    e.jdField_a_of_type_Bc.a(localStringBuffer.toString());
    e.w();
  }
  
  public static void b(String paramString)
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(30);
    localn.a(paramString);
    e.jdField_a_of_type_Q.c();
    e.y();
  }
  
  public static void a(long paramLong)
  {
    n localn;
    (localn = e.jdField_a_of_type_Q.b()).a(32);
    localn.a(paramLong);
    e.jdField_a_of_type_Q.c();
  }
  
  private static void p(n paramn)
  {
    int i = paramn.a();
    if (t.a == null) {
      t.a = new au();
    } else {
      t.a.a();
    }
    t.a.a(i);
    int j = -1;
    for (;;)
    {
      j++;
      if (j >= i) {
        break;
      }
      aa localaa;
      (localaa = new aa()).jdField_a_of_type_Int = paramn.c();
      paramn.a();
      localaa.jdField_a_of_type_Byte = paramn.a();
      localaa.jdField_a_of_type_JavaLangString = paramn.a();
      t.a.a(localaa, j);
    }
  }
  
  static
  {
    jdField_a_of_type_Int = 0;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\h.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */