import javax.microedition.io.ConnectionNotFoundException;

public final class q
  extends o
{
  s jdField_a_of_type_S;
  s b;
  private p jdField_a_of_type_P = new p(this);
  public boolean b;
  
  public q()
  {
    this.jdField_b_of_type_Boolean = false;
  }
  
  public final n a(int paramInt)
  {
    return this.jdField_a_of_type_P.a(paramInt);
  }
  
  public final n b()
  {
    p localp;
    return (localp = this.jdField_a_of_type_P).jdField_a_of_type_ArrayOfN[localp.jdField_a_of_type_Int].a();
  }
  
  public final void a()
  {
    p tmp4_1 = this.jdField_a_of_type_P;
    p localp;
    tmp4_1.jdField_b_of_type_Int = (((localp = tmp4_1).jdField_b_of_type_Int + 1) % localp.jdField_b_of_type_ArrayOfN.length);
  }
  
  public final void c()
  {
    p tmp4_1 = this.jdField_a_of_type_P;
    p localp;
    tmp4_1.jdField_a_of_type_Int = (((localp = tmp4_1).jdField_a_of_type_Int + 1) % localp.jdField_a_of_type_ArrayOfN.length);
  }
  
  public final n a()
  {
    p localp;
    int i = (localp = this.jdField_a_of_type_P).jdField_a_of_type_Int;
    int j = localp.d;
    if (i - j == 0) {
      return null;
    }
    localp.jdField_a_of_type_N.a();
    while (j != i)
    {
      n localn2 = localp.jdField_a_of_type_ArrayOfN[j].b();
      n localn1 = localp.jdField_a_of_type_N;
      q localq = localp.jdField_a_of_type_Q;
      localn1.b(localn2.e() + 1);
      localn1.a(localq.jdField_b_of_type_Int++);
      localn1.a(localn2);
      j++;
      if (j == localp.jdField_a_of_type_ArrayOfN.length) {
        j = 0;
      }
    }
    localp.d = i;
    return localp.jdField_a_of_type_N.b();
  }
  
  public final void b()
  {
    p localp;
    int i = (localp = this.jdField_a_of_type_P).jdField_b_of_type_Int;
    int j = localp.c;
    if (i != j)
    {
      while (j != i)
      {
        h.a(localp.jdField_b_of_type_ArrayOfN[j].b());
        j++;
        if (j == localp.jdField_b_of_type_ArrayOfN.length) {
          j = 0;
        }
      }
      localp.c = i;
    }
  }
  
  public final boolean b(n paramn, int paramInt)
  {
    int i = this.jdField_a_of_type_Int;
    for (;;)
    {
      paramInt--;
      if (paramInt < 0) {
        break;
      }
      int tmp17_16 = paramInt;
      byte[] tmp17_13 = paramn.a;
      tmp17_13[tmp17_16] = ((byte)(tmp17_13[tmp17_16] ^ i));
    }
    return true;
  }
  
  public final boolean a(n paramn, int paramInt)
  {
    int i = 0;
    while (paramInt > 0)
    {
      int j = this.jdField_a_of_type_Int;
      int k;
      int m = (k = paramn.a(i) + 2) + i;
      while (i < m)
      {
        int tmp37_36 = i;
        byte[] tmp37_33 = paramn.a;
        tmp37_33[tmp37_36] = ((byte)(tmp37_33[tmp37_36] ^ this.jdField_a_of_type_Int));
        int tmp51_50 = i;
        byte[] tmp51_47 = paramn.a;
        tmp51_47[tmp51_50] = ((byte)(tmp51_47[tmp51_50] ^ j));
        j = paramn.a[i];
        i++;
      }
      i = m;
      paramInt -= k;
    }
    return true;
  }
  
  public final void d()
  {
    if (this.jdField_b_of_type_S != null) {
      this.jdField_b_of_type_S.a = false;
    }
    if (this.jdField_a_of_type_S != null) {
      this.jdField_a_of_type_S.a = false;
    }
    Object localObject = this;
    if (this.jdField_a_of_type_P != null)
    {
      p tmp43_40 = ((q)localObject).jdField_a_of_type_P;
      tmp43_40.c = (localObject = tmp43_40).jdField_b_of_type_Int;
      ((p)localObject).d = ((p)localObject).jdField_a_of_type_Int;
    }
  }
  
  public final void a(Exception paramException)
  {
    if (this.jdField_b_of_type_Boolean) {
      return;
    }
    if ((paramException instanceof SecurityException))
    {
      d();
      b(4);
      return;
    }
    if ((paramException instanceof ConnectionNotFoundException))
    {
      d();
      b(5);
      return;
    }
    d();
    if (Thread.currentThread() == this.jdField_a_of_type_S)
    {
      b(0);
      return;
    }
    if (Thread.currentThread() == this.jdField_b_of_type_S)
    {
      b(1);
      return;
    }
    b(3);
  }
  
  public static void b(int paramInt)
  {
    String str = "异常的网络！";
    switch (paramInt)
    {
    case 6: 
      str = "服务器没开门，要等会哦！";
      break;
    case 4: 
      str = "您没有同意程序访问网络，请重起程序重新连接...";
      break;
    case 5: 
      str = "游戏维护了，可能会有新东东？";
      break;
    case 3: 
      str = "服务器连不通！";
      break;
    case 0: 
      str = "发送连接已断开！";
      break;
    case 1: 
      str = "接收连接已断开！";
      break;
    case 7: 
      str = "网络好象不稳定了哦！";
    }
    e.d(str);
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\q.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */