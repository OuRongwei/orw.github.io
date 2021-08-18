import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public class a
{
  public a a;
  public a b;
  public int a;
  public int b;
  public int c;
  public String a;
  private String[] jdField_a_of_type_ArrayOfJavaLangString = new String[3];
  public int d;
  public long a;
  private int u;
  private int v;
  public int e;
  private int w;
  public int f;
  public int g;
  public int h;
  public int i;
  public byte[] a;
  public int j;
  public ar a;
  public a c;
  public byte[] b;
  public j a;
  public int k;
  public int l;
  static a d;
  public au a;
  public byte a;
  public a e;
  public a f;
  private a i;
  public a g;
  public int m;
  public byte b;
  public byte c;
  public boolean a;
  public int n;
  public byte d;
  public int o;
  private byte k;
  public int p;
  public byte e;
  short jdField_a_of_type_Short;
  public a h;
  public byte f;
  public byte g;
  private byte l;
  public byte h;
  public byte i;
  public byte j;
  public int q = 0;
  public int r = 0;
  public int s = 0;
  public int t = 0;
  public int[][] a;
  private byte m;
  
  public a()
  {
    this.jdField_a_of_type_Byte = -1;
    this.jdField_a_of_type_Array2dOfInt = new int[8][10];
  }
  
  public static final a a()
  {
    a locala;
    if (jdField_d_of_type_A == null) {
      locala = new a();
    } else {
      locala = jdField_d_of_type_A;
    }
    jdField_d_of_type_A = locala.jdField_b_of_type_A;
    locala.jdField_a_of_type_A = null;
    locala.jdField_b_of_type_A = null;
    locala.jdField_c_of_type_A = null;
    locala.jdField_a_of_type_JavaLangString = null;
    locala.jdField_j_of_type_Int = 0;
    locala.jdField_b_of_type_ArrayOfByte = null;
    locala.jdField_e_of_type_A = null;
    locala.jdField_a_of_type_Au = null;
    locala.jdField_f_of_type_A = null;
    locala.jdField_i_of_type_A = null;
    locala.jdField_g_of_type_A = null;
    locala.jdField_h_of_type_A = null;
    locala.a(0, 0);
    locala.jdField_a_of_type_J = null;
    locala.jdField_f_of_type_Byte = 0;
    locala.jdField_e_of_type_Byte = 0;
    return locala;
  }
  
  public static final void a(a parama)
  {
    if (parama.jdField_c_of_type_A != null) {
      a(parama.jdField_c_of_type_A);
    }
    if (parama.jdField_e_of_type_A != null) {
      parama.jdField_e_of_type_A = null;
    }
    if (parama.jdField_a_of_type_Au != null) {
      parama.jdField_a_of_type_Au = null;
    }
    if (parama.jdField_f_of_type_A != null) {
      parama.jdField_f_of_type_A = null;
    }
    if (parama.jdField_i_of_type_A != null) {
      parama.jdField_i_of_type_A = null;
    }
    if (parama.jdField_g_of_type_A != null) {
      parama.jdField_g_of_type_A = null;
    }
    if (parama.jdField_h_of_type_A != null) {
      parama.jdField_h_of_type_A = null;
    }
    parama.e();
    if (parama.jdField_f_of_type_Byte != 0) {
      parama.jdField_f_of_type_Byte = 0;
    }
    if (parama.jdField_e_of_type_Byte != 0) {
      parama.jdField_e_of_type_Byte = 0;
    }
    if (parama == e.jdField_a_of_type_G)
    {
      parama.jdField_a_of_type_A = null;
      parama.jdField_b_of_type_A = null;
      parama.jdField_c_of_type_A = null;
      return;
    }
    parama.jdField_b_of_type_A = jdField_d_of_type_A;
    jdField_d_of_type_A = parama;
  }
  
  public final void a()
  {
    this.jdField_a_of_type_A = null;
    this.jdField_b_of_type_A = null;
    this.jdField_c_of_type_A = null;
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_j_of_type_Int = 0;
    this.jdField_b_of_type_ArrayOfByte = null;
    this.jdField_e_of_type_A = null;
    if (this.jdField_a_of_type_Au != null)
    {
      this.jdField_a_of_type_Au.a();
      this.jdField_a_of_type_Au = null;
    }
    this.jdField_f_of_type_A = null;
    this.jdField_i_of_type_A = null;
    this.jdField_g_of_type_A = null;
    this.jdField_h_of_type_A = null;
    a(0, 0);
    this.jdField_a_of_type_J = null;
    this.jdField_f_of_type_Byte = 0;
    this.jdField_e_of_type_Byte = 0;
    this.jdField_j_of_type_Byte = 0;
    e();
    int i1 = -1;
    for (;;)
    {
      i1++;
      if (i1 >= this.jdField_a_of_type_Array2dOfInt.length) {
        break;
      }
      if (this.jdField_a_of_type_Array2dOfInt[i1][0] > 0) {
        this.jdField_a_of_type_Array2dOfInt[i1][0] = 0;
      }
    }
    this.jdField_m_of_type_Byte = 0;
  }
  
  public final void a(int paramInt)
  {
    this.jdField_a_of_type_Int = paramInt;
    this.jdField_j_of_type_Int |= 0x2;
    ad localad;
    if ((localad = e.jdField_a_of_type_Ad).a[paramInt] == null)
    {
      int[] arrayOfInt = { paramInt };
      localad.b(arrayOfInt);
    }
    if (this.jdField_a_of_type_J == null) {
      this.jdField_a_of_type_J = new j();
    }
    this.jdField_a_of_type_J.jdField_a_of_type_B = e.jdField_a_of_type_Ad.a[paramInt];
  }
  
  public final void a(n paramn, int paramInt)
  {
    this.jdField_j_of_type_Int |= paramInt;
    paramInt = paramn.d();
    a(paramInt);
    this.jdField_a_of_type_JavaLangString = paramn.a();
    this.jdField_b_of_type_Int = paramn.a();
    this.jdField_c_of_type_Int = paramn.a();
    this.jdField_e_of_type_Int = paramn.a();
    paramInt = paramn.d();
    this.jdField_a_of_type_ArrayOfByte = new byte[33];
    if ((this.jdField_j_of_type_Int & 0x4) != 0)
    {
      n.a(this.jdField_a_of_type_ArrayOfByte, 16, this.jdField_e_of_type_Int & 0xF);
      this.jdField_e_of_type_Int = (this.jdField_e_of_type_Int >> 4 & 0xF);
      if ((i1 = paramInt & 0xF) == 6)
      {
        i1 = n.a(this.jdField_a_of_type_ArrayOfByte, 20) | 0x20;
        n.a(this.jdField_a_of_type_ArrayOfByte, 20, i1);
      }
      else if (i1 == 7)
      {
        i1 = n.a(this.jdField_a_of_type_ArrayOfByte, 20) | 0x2;
        n.a(this.jdField_a_of_type_ArrayOfByte, 20, i1);
      }
      paramInt = paramInt >> 4 & 0xF;
      this.jdField_m_of_type_Int = this.jdField_a_of_type_Int;
      b();
      n.a(this.jdField_a_of_type_ArrayOfByte, 13, paramInt);
      g();
      n.a(this.jdField_a_of_type_ArrayOfByte, 0, paramn.a());
      int i1 = paramn.c();
      b(i1);
      if (ag.a(this.jdField_a_of_type_Long)) {
        n.a(this.jdField_a_of_type_ArrayOfByte, 20, 16);
      }
    }
    if ((this.jdField_j_of_type_Int & 0x10) != 0)
    {
      this.jdField_a_of_type_Short = ((short)((paramInt >= 255) || (paramInt >= e.jdField_a_of_type_ArrayOfJavaLangString.length) ? 3 : paramInt));
      if ((paramInt = paramn.a()) == 3)
      {
        this.jdField_j_of_type_Int &= 0xFFFFFFEF;
        this.jdField_j_of_type_Int |= 0x200;
      }
      else if (paramInt == 1)
      {
        this.jdField_j_of_type_Int &= 0xFFFFFFEF;
        this.jdField_j_of_type_Int |= 0x80;
      }
      else if ((paramInt != 2) && (paramInt == 4))
      {
        this.jdField_j_of_type_Int &= 0xFFFFFFEF;
        this.jdField_j_of_type_Int |= 0x100;
      }
    }
    a(0, 1, 0);
    a(d.jdField_c_of_type_Int % 2 == 0);
    this.jdField_a_of_type_J.a();
    a(this.jdField_b_of_type_Int, this.jdField_c_of_type_Int);
    this.jdField_j_of_type_Int |= 0x2;
  }
  
  public final void b()
  {
    String str1 = "`";
    au localau = new au();
    int i2 = 0;
    for (int i1 = this.jdField_a_of_type_JavaLangString.indexOf(str1); (i1 < this.jdField_a_of_type_JavaLangString.length()) && (i1 != -1); i1 = this.jdField_a_of_type_JavaLangString.indexOf(str1, i1 + str1.length()))
    {
      String str2 = this.jdField_a_of_type_JavaLangString.substring(i2, i1);
      localau.a(str2);
      i3 = i1 + str1.length();
    }
    localau.a(this.jdField_a_of_type_JavaLangString.substring(i3 + 1 - str1.length()));
    this.jdField_a_of_type_ArrayOfJavaLangString = new String[localau.jdField_a_of_type_Int - 1];
    int i3 = 0;
    for (;;)
    {
      i3++;
      if (i3 >= localau.jdField_a_of_type_Int) {
        break;
      }
      this.jdField_a_of_type_ArrayOfJavaLangString[(i3 - 1)] = ((String)localau.a(i3));
    }
    i3 = this.jdField_a_of_type_ArrayOfJavaLangString.length - 1;
    this.jdField_a_of_type_JavaLangString = this.jdField_a_of_type_ArrayOfJavaLangString[0];
  }
  
  public void a(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramInt1 = this.jdField_b_of_type_Int - paramInt1;
    paramInt2 = this.jdField_c_of_type_Int - paramInt2;
    int i1 = this.jdField_m_of_type_Int == 1 ? 15 : 0;
    if (((this.jdField_j_of_type_Int & 0x4) != 0) && (this != e.jdField_a_of_type_G) && (this.k > 0) && (d.b() != 13)) {
      f.a(paramGraphics, e.a(13), paramInt1 - 10, paramInt2 + (this.jdField_a_of_type_J.jdField_f_of_type_Int - 23 + i1), 95 + (this.k - 1) * 19, 0, 19, 18, 0);
    }
    if ((t.jdField_d_of_type_Int == 1) && ((t.jdField_a_of_type_Int == 4) || (t.jdField_a_of_type_Int == 1)) && (this.jdField_h_of_type_A != null)) {
      this.jdField_h_of_type_A.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2, null);
    }
    this.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2, this.jdField_b_of_type_ArrayOfByte);
    int i2 = 0;
    int i4 = 0;
    if (!d.a((byte)13))
    {
      if (this.jdField_a_of_type_JavaLangString != null)
      {
        if ((this.jdField_b_of_type_ArrayOfByte != null) && (this.jdField_b_of_type_ArrayOfByte[3] > 1)) {
          switch (this.jdField_b_of_type_ArrayOfByte[3])
          {
          case 2: 
            i4 = 20;
            break;
          case 3: 
            i4 = 35;
            break;
          case 4: 
            i4 = 35;
            break;
          case 5: 
            i4 = 40;
            break;
          case 6: 
            i4 = 30;
            break;
          case 7: 
            i4 = 25;
            break;
          case 8: 
            i4 = 40;
            break;
          case 9: 
            i4 = 28;
            break;
          default: 
            i4 = 30;
          }
        }
        switch (this.jdField_a_of_type_Int)
        {
        case 3: 
          i2 = 44;
          break;
        case 1: 
          i2 = 42;
          break;
        case 0: 
          i2 = 48;
          break;
        case 2: 
          i2 = 45;
          break;
        case 168: 
          i2 = 45;
          break;
        case 166: 
          i2 = 45;
          break;
        case 62: 
        case 177: 
          i2 = 40;
          break;
        default: 
          i2 = -this.jdField_a_of_type_J.jdField_f_of_type_Int;
        }
        i2 = i2 + i4 + bg.jdField_b_of_type_Byte;
        b(paramGraphics, paramInt1, paramInt2 - i2);
      }
    }
    else if ((t.jdField_d_of_type_Int == 1) && (this.jdField_a_of_type_JavaLangString != null))
    {
      b(paramGraphics, paramInt1, paramInt2 + (this.jdField_a_of_type_J.jdField_f_of_type_Int - 10 + i1));
      if (((this.jdField_j_of_type_Int & 0x8) != 0) && (this.jdField_f_of_type_Byte > 0))
      {
        i4 = bg.a.stringWidth(this.jdField_a_of_type_JavaLangString) >> 1;
        f.a(paramGraphics, e.a(0), paramInt1 + i4, paramInt2 + (this.jdField_a_of_type_J.jdField_f_of_type_Int - 10 + i1), (this.jdField_f_of_type_Byte - 1) * 14, 0, 14, 20, 0);
      }
    }
    if (this.jdField_a_of_type_ArrayOfJavaLangString != null)
    {
      if ((this.jdField_a_of_type_ArrayOfJavaLangString[0] != null) && (!this.jdField_a_of_type_ArrayOfJavaLangString[0].equals("")) && (e.a(8))) {
        i2 += bg.jdField_b_of_type_Byte;
      }
      if ((this.jdField_a_of_type_ArrayOfJavaLangString[1] != null) && (!this.jdField_a_of_type_ArrayOfJavaLangString[1].equals("")) && (e.a(16))) {
        i2 += bg.jdField_b_of_type_Byte;
      }
    }
    if (g.jdField_i_of_type_A == this) {
      if (this.k == 0) {
        g.k.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2 - i2, null);
      } else {
        f.a(paramGraphics, e.a(13), paramInt1, paramInt2 + i2, 95 + (this.k - 1) * 19, 0, 19, 18, 0);
      }
    }
    Object localObject2;
    if (d.a((byte)13))
    {
      i4 = -1;
      Object localObject1;
      int i7;
      int i6;
      while (this.jdField_a_of_type_Au != null)
      {
        i4++;
        if (i4 >= this.jdField_a_of_type_Au.a()) {
          break;
        }
        if ((localObject1 = (a)this.jdField_a_of_type_Au.a(i4)) != null)
        {
          i7 = paramInt2 - 50 + i4 * 12;
          i6 = paramInt1 + (this.jdField_l_of_type_Int < 2 ? -20 : 10);
          Graphics localGraphics1 = paramGraphics;
          if ((localObject1 = localObject1).jdField_a_of_type_Byte >= 0) {
            f.a(localGraphics1, e.a(6), i6, i7, ((a)localObject1).jdField_a_of_type_Byte % 4 * 12, ((a)localObject1).jdField_a_of_type_Byte / 4 * 12, 12, 12, 0);
          }
        }
      }
      if (((this.jdField_j_of_type_Int & 0x4) != 0) && (this.jdField_c_of_type_Byte == 1))
      {
        i6 = paramInt2 - 55;
        int i5 = paramInt1 + (this.jdField_l_of_type_Int < 2 ? 20 : -20);
        localObject1 = paramGraphics;
        switch (d.jdField_c_of_type_Int % 10)
        {
        case 0: 
        case 1: 
        case 2: 
          f.a((Graphics)localObject1, e.a(2), i5, i6, 260, 0, 13, 12, 0);
          break;
        case 3: 
        case 4: 
        case 5: 
          f.a((Graphics)localObject1, e.a(2), i5, i6, 273, 0, 13, 12, 0);
          break;
        case 6: 
        case 7: 
          f.a((Graphics)localObject1, e.a(2), i5, i6, 286, 0, 13, 12, 0);
          break;
        case 8: 
        case 9: 
          f.a((Graphics)localObject1, e.a(2), i5, i6, 286, 0, 13, 12, 2);
        }
      }
      if ((g.j == this) && (t.jdField_d_of_type_Int == 1) && (t.jdField_a_of_type_Int == 4)) {
        g.l.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2 + (this.jdField_a_of_type_J.jdField_f_of_type_Int + i1) + 10, null);
      }
      if ((this.jdField_j_of_type_Int & 0x40) == 0)
      {
        i4 = n.a(this.jdField_a_of_type_ArrayOfByte, 2);
        int i3 = n.a(this.jdField_a_of_type_ArrayOfByte, 3);
        i4 = i3;
        i1 = i4;
        i7 = paramInt2 + 3;
        i6 = paramInt1 - 12;
        Graphics localGraphics2 = paramGraphics;
        localObject2 = this;
        if (this.jdField_g_of_type_Byte != i1)
        {
          Object tmp1187_1185 = localObject2;
          if ((tmp1187_1185.jdField_h_of_type_Byte = (byte)(tmp1187_1185.jdField_h_of_type_Byte + 1)) >= 5)
          {
            ((a)localObject2).jdField_h_of_type_Byte = 0;
            ((a)localObject2).jdField_g_of_type_Byte = ((byte)i1);
          }
        }
        if (((a)localObject2).jdField_l_of_type_Byte != i4)
        {
          Object tmp1228_1226 = localObject2;
          if ((tmp1228_1226.jdField_i_of_type_Byte = (byte)(tmp1228_1226.jdField_i_of_type_Byte + 1)) >= 5)
          {
            ((a)localObject2).jdField_i_of_type_Byte = 0;
            ((a)localObject2).jdField_l_of_type_Byte = ((byte)i4);
          }
        }
        int i8 = localGraphics2.getColor();
        localGraphics2.setColor(4671303);
        localGraphics2.drawLine(i6, i7 + 1, i6, i7 + 4);
        localGraphics2.drawLine(i6 + 25, i7 + 1, i6 + 25, i7 + 4);
        localGraphics2.drawLine(i6 + 1, i7, i6 + 25, i7);
        localGraphics2.drawLine(i6 + 1, i7 + 4, i6 + 25, i7 + 4);
        localGraphics2.setColor(0);
        localGraphics2.fillRect(i6 + 1, i7 + 1, 24, 3);
        if ((((a)localObject2).jdField_h_of_type_Byte > 0) && (((a)localObject2).jdField_h_of_type_Byte <= 5))
        {
          localGraphics2.setColor(8011050);
          localGraphics2.fillRect(i6 + 1, i7 + 1, ((a)localObject2).jdField_g_of_type_Byte, 1);
          localGraphics2.setColor(8007190);
          localGraphics2.fillRect(i6 + 1, i7 + 2, ((a)localObject2).jdField_g_of_type_Byte, 2);
        }
        localGraphics2.setColor(16744023);
        localGraphics2.fillRect(i6 + 1, i7 + 1, i1, 1);
        localGraphics2.setColor(16604975);
        localGraphics2.fillRect(i6 + 1, i7 + 2, i1, 2);
        i7 += 6;
        localGraphics2.setColor(4671303);
        localGraphics2.drawLine(i6, i7 + 1, i6, i7 + 4);
        localGraphics2.drawLine(i6 + 25, i7 + 1, i6 + 25, i7 + 4);
        localGraphics2.drawLine(i6 + 1, i7, i6 + 25, i7);
        localGraphics2.drawLine(i6 + 1, i7 + 4, i6 + 25, i7 + 4);
        localGraphics2.setColor(0);
        localGraphics2.fillRect(i6 + 1, i7 + 1, 24, 3);
        if ((((a)localObject2).jdField_i_of_type_Byte > 0) && (((a)localObject2).jdField_i_of_type_Byte <= 5))
        {
          localGraphics2.setColor(2185338);
          localGraphics2.fillRect(i6 + 1, i7 + 1, ((a)localObject2).jdField_l_of_type_Byte, 1);
          localGraphics2.setColor(806522);
          localGraphics2.fillRect(i6 + 1, i7 + 2, ((a)localObject2).jdField_l_of_type_Byte, 2);
        }
        localGraphics2.setColor(4503551);
        localGraphics2.fillRect(i6 + 1, i7 + 1, i4, 1);
        localGraphics2.setColor(1680893);
        localGraphics2.fillRect(i6 + 1, i7 + 2, i4, 2);
        localGraphics2.setColor(i8);
      }
    }
    for (a locala = this.jdField_c_of_type_A; locala != null; locala = locala.jdField_c_of_type_A) {
      if (((((localObject2 = locala).jdField_j_of_type_Int & 0x400) != 0) && (((a)localObject2).jdField_a_of_type_J.jdField_b_of_type_Int == 4) ? 1 : 0) != 0) {
        switch (this.jdField_l_of_type_Int)
        {
        case 0: 
        case 1: 
          locala.jdField_a_of_type_J.a(paramGraphics, 48, 112, null);
          break;
        case 2: 
        case 3: 
          locala.jdField_a_of_type_J.a(paramGraphics, 184, 112, null);
        }
      } else {
        locala.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2, null);
      }
    }
    if (this.jdField_e_of_type_A != null) {
      this.jdField_e_of_type_A.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2, null);
    }
    if (this.jdField_i_of_type_A != null) {
      this.jdField_i_of_type_A.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2, null);
    }
    if (this.jdField_f_of_type_A != null) {
      this.jdField_f_of_type_A.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2, null);
    }
    if (this.jdField_g_of_type_A != null) {
      this.jdField_g_of_type_A.jdField_a_of_type_J.a(paramGraphics, paramInt1, paramInt2, null);
    }
    if (d.a((byte)13)) {
      c(paramGraphics, paramInt1, paramInt2);
    }
    if (!t.jdField_a_of_type_Boolean)
    {
      f.a(paramGraphics, this.jdField_b_of_type_Int >> f.jdField_c_of_type_Int, this.jdField_c_of_type_Int >> f.jdField_c_of_type_Int);
      f.a(paramGraphics, (this.jdField_b_of_type_Int >> f.jdField_c_of_type_Int) + 1, this.jdField_c_of_type_Int >> f.jdField_c_of_type_Int);
      f.a(paramGraphics, (this.jdField_b_of_type_Int >> f.jdField_c_of_type_Int) - 1, this.jdField_c_of_type_Int >> f.jdField_c_of_type_Int);
      if ((this.jdField_b_of_type_ArrayOfByte != null) && (this.jdField_b_of_type_ArrayOfByte[3] > 1))
      {
        f.a(paramGraphics, (this.jdField_b_of_type_Int >> f.jdField_c_of_type_Int) + 2, this.jdField_c_of_type_Int >> f.jdField_c_of_type_Int);
        f.a(paramGraphics, (this.jdField_b_of_type_Int >> f.jdField_c_of_type_Int) - 2, this.jdField_c_of_type_Int >> f.jdField_c_of_type_Int);
      }
    }
  }
  
  private void b(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    if (this.jdField_a_of_type_JavaLangString.length() <= 0) {
      return;
    }
    e.jdField_a_of_type_JavaLangStringBuffer.setLength(0);
    int i1 = -1;
    if (((this.jdField_j_of_type_Int & 0x4) != 0) && (!ad.a(e.jdField_a_of_type_G, this, 64, 64, 64, 64)) && (!d.a((byte)13))) {
      return;
    }
    if (((this.jdField_j_of_type_Int & 0x10) != 0) && ((this.jdField_j_of_type_Int & 0x4) == 0))
    {
      i1 = -1;
      e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_JavaLangString);
    }
    else if ((this.jdField_j_of_type_Int & 0x4) != 0)
    {
      if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 3) {
        i1 = 16603995;
      } else if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 1) {
        i1 = 2936739;
      } else if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 2) {
        i1 = -1;
      } else if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 4) {
        i1 = 16761897;
      } else if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 5) {
        i1 = 14377961;
      }
      if ((this.jdField_a_of_type_ArrayOfJavaLangString != null) && (!d.a((byte)13)))
      {
        if (this.jdField_a_of_type_ArrayOfJavaLangString[2] != null) {
          e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_ArrayOfJavaLangString[2]);
        }
        if (this.jdField_a_of_type_ArrayOfJavaLangString[1] != null) {
          e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_ArrayOfJavaLangString[1]);
        }
      }
      else
      {
        e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_JavaLangString);
      }
    }
    else if (this == e.jdField_a_of_type_G)
    {
      if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 3) {
        i1 = 16603995;
      } else if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 1) {
        i1 = 2936739;
      } else if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 2) {
        i1 = -1;
      } else if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 4) {
        i1 = 16761897;
      } else if (n.a(this.jdField_a_of_type_ArrayOfByte, 16) == 5) {
        i1 = 14377961;
      }
      if (this.jdField_a_of_type_ArrayOfJavaLangString != null)
      {
        if (this.jdField_a_of_type_ArrayOfJavaLangString[2] != null) {
          e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_ArrayOfJavaLangString[2]);
        }
        if (this.jdField_a_of_type_ArrayOfJavaLangString[1] != null) {
          e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_ArrayOfJavaLangString[1]);
        }
      }
      else
      {
        e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_JavaLangString);
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x100) != 0)
    {
      i1 = 14377961;
      e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_JavaLangString);
    }
    else if ((this.jdField_j_of_type_Int & 0x10000) != 0)
    {
      i1 = -1;
      e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_JavaLangString);
    }
    else
    {
      i1 = 16603995;
      e.jdField_a_of_type_JavaLangStringBuffer.append(this.jdField_a_of_type_JavaLangString);
    }
    String str = e.jdField_a_of_type_JavaLangStringBuffer.toString();
    int i2 = bg.a.stringWidth(str);
    i2 = paramInt1 - (i2 >> 1);
    if ((this.jdField_j_of_type_Int & 0x80) != 0) {
      i1 = -1;
    }
    if (((this.jdField_j_of_type_Int & 0x10) != 0) && (e.a(0) != null))
    {
      if ((this.jdField_a_of_type_ArrayOfByte == null) || (this.jdField_a_of_type_ArrayOfByte.length < 6))
      {
        a(paramGraphics, i2, paramInt2, str, i1, 20);
        return;
      }
      i2 = paramInt1 - 27;
      switch (n.a(this.jdField_a_of_type_ArrayOfByte, 5))
      {
      case 1: 
        if (d.jdField_c_of_type_Int % 300 < 280) {
          f.a(paramGraphics, e.a(0), i2, paramInt2 - 20, 170, 0, 55, 20, 0);
        }
        i2 += 15;
        break;
      case 2: 
        if (d.jdField_c_of_type_Int % 300 < 280) {
          f.a(paramGraphics, e.a(0), i2, paramInt2 - 20, 280, 0, 55, 20, 0);
        }
        i2 += 15;
        break;
      case 3: 
        if (d.jdField_c_of_type_Int % 300 < 280) {
          f.a(paramGraphics, e.a(0), i2, paramInt2 - 20, 225, 0, 55, 20, 0);
        }
        i2 += 15;
      }
    }
    int i3;
    if ((((this.jdField_j_of_type_Int & 0x4) != 0) || (this == e.jdField_a_of_type_G)) && (!d.a((byte)13)))
    {
      if (this.jdField_a_of_type_ArrayOfJavaLangString != null)
      {
        if ((e.a(8)) && (this.jdField_a_of_type_ArrayOfJavaLangString[0] != null) && (!this.jdField_a_of_type_ArrayOfJavaLangString[0].equals(""))) {
          if ((this.jdField_a_of_type_ArrayOfJavaLangString[1] != null) && (!this.jdField_a_of_type_ArrayOfJavaLangString[1].equals("")))
          {
            if (e.a(16)) {
              a(paramGraphics, paramInt1, paramInt2 - bg.jdField_b_of_type_Byte, this.jdField_a_of_type_ArrayOfJavaLangString[0], i1, 33);
            } else {
              a(paramGraphics, paramInt1, paramInt2, this.jdField_a_of_type_ArrayOfJavaLangString[0], i1, 33);
            }
          }
          else {
            a(paramGraphics, paramInt1, paramInt2, this.jdField_a_of_type_ArrayOfJavaLangString[0], i1, 33);
          }
        }
        if ((e.a(16)) && (this.jdField_a_of_type_ArrayOfJavaLangString[1] != null) && (!this.jdField_a_of_type_ArrayOfJavaLangString[1].equals("")))
        {
          i3 = (n.a(this.jdField_a_of_type_ArrayOfByte, 20) & 0x20) != 0 ? 16603995 : -1;
          a(paramGraphics, paramInt1, paramInt2 - bg.jdField_b_of_type_Byte, this.jdField_a_of_type_ArrayOfJavaLangString[1], i3, 17);
        }
        if ((e.a(4)) && (this.jdField_a_of_type_ArrayOfJavaLangString[2] != null)) {
          a(paramGraphics, paramInt1, paramInt2, this.jdField_a_of_type_ArrayOfJavaLangString[2], i1, 17);
        }
      }
    }
    else
    {
      if ((this.jdField_j_of_type_Int & 0x190) != 0)
      {
        i2 = bg.a.stringWidth(str);
        i3 = paramInt1 - (i2 >> 1);
        paramInt1 = paramGraphics.getColor();
        paramGraphics.setColor(0);
        paramGraphics.drawString(str, i3 + 1, paramInt2 + 1, 20);
        paramGraphics.setColor(i1);
        paramGraphics.drawString(str, i3, paramInt2, 20);
        paramGraphics.setColor(paramInt1);
        return;
      }
      if (!e.a(2)) {
        return;
      }
      i3 = paramGraphics.getColor();
      if (d.a((byte)13))
      {
        paramGraphics.setColor(0);
        paramGraphics.drawString(str, i2 + 1, paramInt2 + 1, 20);
      }
      paramGraphics.setColor(i1);
      paramGraphics.drawString(str, i2, paramInt2, 20);
      paramGraphics.setColor(i3);
    }
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, String paramString, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(0);
    paramGraphics.drawString(paramString, paramInt1 + 1, paramInt2, paramInt4);
    paramGraphics.drawString(paramString, paramInt1 - 1, paramInt2, paramInt4);
    paramGraphics.drawString(paramString, paramInt1, paramInt2 + 1, paramInt4);
    paramGraphics.drawString(paramString, paramInt1, paramInt2 - 1, paramInt4);
    paramGraphics.setColor(paramInt3);
    paramGraphics.drawString(paramString, paramInt1, paramInt2, paramInt4);
  }
  
  public final void a(boolean paramBoolean)
  {
    boolean bool = paramBoolean;
    if (bool) {
      paramBoolean.jdField_d_of_type_Int |= 0x2;
    } else {
      paramBoolean.jdField_d_of_type_Int &= 0xFFFFFFFD;
    }
    paramBoolean.a(0, paramBoolean.jdField_a_of_type_ArrayOfInt);
    if (((((paramBoolean = this.jdField_a_of_type_J).jdField_d_of_type_Int & 0x2) != 0) == bool ? 0 : 1) != 0) {
      this.u = (-this.u);
    }
  }
  
  public void c()
  {
    if ((this.jdField_j_of_type_Int & 0x2) == 0) {
      return;
    }
    a locala;
    if ((this.jdField_j_of_type_Int & 0x1000C) != 0)
    {
      h();
      d();
      locala = this;
      if ((this.jdField_a_of_type_Au == null) || (locala.jdField_a_of_type_Au.jdField_a_of_type_Int > 0))
      {
        int i1 = -1;
        for (;;)
        {
          i1++;
          if (i1 >= locala.jdField_a_of_type_Au.jdField_a_of_type_Int) {
            break;
          }
          ((a)locala.jdField_a_of_type_Au.a(i1)).c();
        }
      }
      locala = this;
      if (this.jdField_f_of_type_A != null)
      {
        locala.jdField_f_of_type_A.c();
        if ((locala.jdField_f_of_type_A.jdField_j_of_type_Int & 0x2) == 0) {
          locala.jdField_f_of_type_A = null;
        }
      }
      locala = this;
      if (this.jdField_e_of_type_A != null)
      {
        locala.jdField_e_of_type_A.c();
        if ((locala.jdField_e_of_type_A.jdField_j_of_type_Int & 0x2) == 0) {
          locala.jdField_e_of_type_A = null;
        }
      }
      locala = this;
      if (this.jdField_i_of_type_A != null)
      {
        locala.jdField_i_of_type_A.c();
        if ((locala.jdField_i_of_type_A.jdField_j_of_type_Int & 0x2) == 0) {
          locala.jdField_i_of_type_A = null;
        }
      }
      locala = this;
      if (this.jdField_g_of_type_A != null)
      {
        locala.jdField_g_of_type_A.c();
        if ((locala.jdField_g_of_type_A.jdField_j_of_type_Int & 0x2) == 0) {
          locala.jdField_g_of_type_A = null;
        }
      }
      locala = this;
      if (this.jdField_h_of_type_A != null)
      {
        locala.jdField_h_of_type_A.c();
        if ((locala.jdField_h_of_type_A.jdField_j_of_type_Int & 0x2) == 0) {
          locala.jdField_h_of_type_A = null;
        }
      }
      if ((this.jdField_a_of_type_Int == 61) && ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) && (this.jdField_a_of_type_J.jdField_b_of_type_Int == 0)) {
        this.jdField_a_of_type_J.a(1, 0, null);
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x400) != 0)
    {
      locala = this;
      if ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x40) == 0)
      {
        if ((locala.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0)
        {
          locala.jdField_j_of_type_Int &= 0xFFFFFFFD;
          break label795;
        }
      }
      else if (locala.jdField_a_of_type_J.a())
      {
        locala.jdField_j_of_type_Int &= 0xFFFFFFFD;
        locala.jdField_a_of_type_J.jdField_d_of_type_Int &= 0xFFFFFFBF;
        j tmp385_382 = locala.jdField_a_of_type_J;
        tmp385_382.jdField_b_of_type_Byte = (tmp385_382.jdField_a_of_type_Byte = 0);
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x800) != 0)
    {
      locala = this;
      if ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) {
        locala.jdField_j_of_type_Int &= 0xFFFFFFFD;
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x80) != 0)
    {
      locala = this;
      if ((ad.a(e.jdField_a_of_type_G, locala)) && ((e.jdField_a_of_type_G.z == -1) || (e.jdField_a_of_type_G.a())))
      {
        h.a(locala.jdField_a_of_type_Long);
        locala.jdField_j_of_type_Int &= 0xFFFFFFFD;
        e.jdField_a_of_type_G.k();
        d.a();
        d.a((byte)7, 112);
        f.jdField_a_of_type_ArrayOfInt = null;
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x200) != 0)
    {
      locala = this;
      if (!ad.a(e.jdField_a_of_type_G, locala))
      {
        if ((locala.jdField_j_of_type_Int & 0x20000) != 0) {
          locala.jdField_j_of_type_Int &= 0xFFFDFFFF;
        }
      }
      else if ((locala.jdField_j_of_type_Int & 0x20000) == 0)
      {
        h.a(locala.jdField_a_of_type_Long);
        locala.jdField_j_of_type_Int |= 0x20000;
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x4000) != 0)
    {
      locala = this;
      if ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) {
        locala.jdField_j_of_type_Int &= 0xFFFFFFFD;
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x2000) != 0)
    {
      locala = this;
      if (((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x10) != 0) && ((locala.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0)) {
        locala.jdField_j_of_type_Int &= 0xFFFFFFFD;
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x8000) != 0)
    {
      locala = this;
      if ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) {
        locala.jdField_j_of_type_Int &= 0xFFFFFFFD;
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x10) != 0)
    {
      if ((this.jdField_e_of_type_Byte == 1) && (!ad.a(this, e.jdField_a_of_type_G)))
      {
        e.jdField_a_of_type_G.jdField_e_of_type_Byte = (this.jdField_e_of_type_Byte = 0);
        g.jdField_i_of_type_A = e.jdField_a_of_type_G;
      }
    }
    else if ((this.jdField_j_of_type_Int & 0x100) != 0)
    {
      h();
    }
    label795:
    if ((this.jdField_j_of_type_Int & 0x1010) == 0) {
      this.jdField_a_of_type_J.a(0);
    }
  }
  
  public final void d()
  {
    Object localObject = this;
    for (a locala = this.jdField_c_of_type_A; locala != null; locala = locala.jdField_c_of_type_A) {
      if (this.jdField_a_of_type_Boolean)
      {
        if (this.n-- <= 0) {
          this.jdField_a_of_type_Boolean = false;
        }
      }
      else
      {
        locala.c();
        if ((locala.jdField_j_of_type_Int & 0x2) == 0)
        {
          ((a)localObject).jdField_c_of_type_A = locala.jdField_c_of_type_A;
          locala.jdField_c_of_type_A = null;
          a(locala);
        }
        else
        {
          localObject = locala;
        }
      }
    }
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3)
  {
    byte[] arrayOfByte = this.jdField_b_of_type_ArrayOfByte;
    int i1 = paramInt3;
    paramInt3 = paramInt2;
    paramInt2 = paramInt1;
    paramInt1 = this;
    this.jdField_a_of_type_J.a(paramInt2, i1, arrayOfByte);
    if ((paramInt1.jdField_a_of_type_J.jdField_c_of_type_Int != -1) && ((paramInt3 & 0x1) > 0))
    {
      if ((paramInt3 = paramInt1.jdField_a_of_type_J.jdField_a_of_type_B.jdField_b_of_type_ArrayOfByte) == null)
      {
        switch (paramInt2)
        {
        case 3: 
        case 4: 
          switch (paramInt1.jdField_d_of_type_Int)
          {
          case 0: 
            paramInt1.u = (-paramInt1.jdField_e_of_type_Int);
            paramInt1.v = 0;
            return;
          case 2: 
            paramInt1.u = paramInt1.jdField_e_of_type_Int;
            paramInt1.v = 0;
            return;
          case 1: 
            paramInt1.u = 0;
            paramInt1.v = (-paramInt1.jdField_e_of_type_Int);
            return;
          case 3: 
            paramInt1.u = 0;
            paramInt1.v = paramInt1.jdField_e_of_type_Int;
          }
          return;
        }
        paramInt1.u = 0;
        paramInt1.v = 0;
        return;
      }
      if (((paramInt2 = paramInt3[(paramInt1.jdField_a_of_type_J.jdField_c_of_type_Int * 5)]) & 0x1) != 0)
      {
        paramInt1.u = paramInt3[(paramInt1.jdField_a_of_type_J.jdField_c_of_type_Int * 5 + 1)];
        if ((paramInt1.jdField_a_of_type_J.jdField_d_of_type_Int & 0x2) != 0) {
          paramInt1.u = (-paramInt1.u);
        }
      }
      if ((paramInt2 & 0x2) != 0)
      {
        paramInt1.v = paramInt3[(paramInt1.jdField_a_of_type_J.jdField_c_of_type_Int * 5 + 2)];
        if ((paramInt1.jdField_a_of_type_J.jdField_d_of_type_Int & 0x1) != 0) {
          paramInt1.v = (-paramInt1.v);
        }
      }
      if ((paramInt2 & 0x4) != 0)
      {
        paramInt1.jdField_e_of_type_Int = paramInt3[(paramInt1.jdField_a_of_type_J.jdField_c_of_type_Int * 5 + 3)];
        if ((paramInt1.jdField_a_of_type_J.jdField_d_of_type_Int & 0x2) != 0) {
          paramInt1.jdField_e_of_type_Int = (-paramInt1.jdField_e_of_type_Int);
        }
      }
      if ((paramInt2 & 0x8) != 0)
      {
        paramInt1.w = paramInt3[(paramInt1.jdField_a_of_type_J.jdField_c_of_type_Int * 5 + 4)];
        if ((paramInt1.jdField_a_of_type_J.jdField_d_of_type_Int & 0x1) != 0) {
          paramInt1.w = (-paramInt1.w);
        }
      }
    }
  }
  
  public final void a(boolean paramBoolean, int paramInt1, int paramInt2)
  {
    if ((!paramBoolean) || ((this.u == 0) && (this.v == 0)))
    {
      this.jdField_b_of_type_Int += this.u;
      this.jdField_c_of_type_Int += this.v;
      if ((paramInt1 == -1) || (paramInt2 == -1)) {
        return;
      }
      switch (this.jdField_d_of_type_Int)
      {
      case 0: 
        if (this.jdField_b_of_type_Int < paramInt1)
        {
          this.jdField_b_of_type_Int = paramInt1;
          return;
        }
        break;
      case 1: 
        if (this.jdField_c_of_type_Int < paramInt2)
        {
          this.jdField_c_of_type_Int = paramInt2;
          return;
        }
        break;
      case 2: 
        if (this.jdField_b_of_type_Int > paramInt1)
        {
          this.jdField_b_of_type_Int = paramInt1;
          return;
        }
        break;
      case 3: 
        if (this.jdField_c_of_type_Int > paramInt2) {
          this.jdField_c_of_type_Int = paramInt2;
        }
        break;
      }
      return;
    }
    paramBoolean = Math.max(Math.abs(this.u) >> 4, Math.abs(this.v) >> 4) + 1;
    paramInt1 = this.u / paramBoolean;
    paramInt2 = this.v / paramBoolean;
    boolean bool = true;
    for (;;)
    {
      bool++;
      if (bool >= paramBoolean) {
        break;
      }
      int i1 = 0;
      if (this.u != 0)
      {
        this.jdField_b_of_type_Int += paramInt1;
        if (((i1 = a((byte)(this.jdField_d_of_type_Int == 2 ? 1 : -1))) & 0x8) != 0) {
          if ((i1 & 0x4) != 0)
          {
            this.jdField_c_of_type_Int -= Math.abs(paramInt1);
            a(-1);
          }
          else if ((i1 & 0x2) != 0)
          {
            this.jdField_c_of_type_Int += Math.abs(paramInt1);
            a(1);
          }
        }
      }
      if (this.v != 0)
      {
        this.jdField_c_of_type_Int += paramInt2;
        if (((i1 = a(this.jdField_d_of_type_Int == 1 ? -1 : 1)) & 0x8) != 0) {
          if ((i1 & 0x4) != 0)
          {
            this.jdField_b_of_type_Int -= Math.abs(paramInt2);
            a((byte)-1);
          }
          else if ((i1 & 0x2) != 0)
          {
            this.jdField_b_of_type_Int += Math.abs(paramInt2);
            a((byte)1);
          }
        }
      }
    }
  }
  
  private int a(byte paramByte)
  {
    int i1 = this.jdField_b_of_type_Int;
    int i2 = this.jdField_c_of_type_Int;
    i1 += (paramByte == -1 ? -5 : 5);
    int i3 = i2 - 10 + 1 >> 4;
    i2 >>= 4;
    i1 >>= 4;
    int i4 = 0;
    for (int i5 = i3; i5 <= i2; i5++) {
      if ((byte)f.b(i1, i5) == 0)
      {
        if (i5 == i3) {
          i4 = 1;
        } else {
          i4 = 16;
        }
        if ((paramByte == -1) || ((paramByte == 0) && ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x2) != 0)))
        {
          this.jdField_b_of_type_Int = ((i1 + 1) * f.jdField_f_of_type_Int - -5 + 1);
          break;
        }
        this.jdField_b_of_type_Int = (i1 * f.jdField_f_of_type_Int - 1 - 5);
        break;
      }
    }
    i5 = 0;
    if (i4 != 0)
    {
      i5 = 8;
      if (((i4 & 0x1) == 0) && ((i4 & 0x10) != 0))
      {
        i5 = 12;
      }
      else if (((i4 & 0x10) == 0) && ((i4 & 0x1) != 0) && (i3 != i2))
      {
        i5 = 10;
      }
      else
      {
        paramByte = (byte)f.b(i1, i3 - 1);
        i1 = (byte)f.b(i1, i2 + 1);
        if ((paramByte != 0) && (i1 != 0))
        {
          if ((byte)f.b(this.jdField_b_of_type_Int, i3 - 1) == 0) {
            i5 = 10;
          } else {
            i5 = 12;
          }
        }
        else if (paramByte != 0) {
          i5 = 12;
        } else if (i1 != 0) {
          i5 = 10;
        }
      }
    }
    return i5;
  }
  
  private int a(int paramInt)
  {
    int i1 = this.jdField_b_of_type_Int;
    int i2 = this.jdField_c_of_type_Int + (paramInt == -1 ? -10 : 0);
    int i3 = i1 + -5 + 1 >> 4;
    i1 = i1 + 5 >> 4;
    i2 >>= 4;
    int i4 = 0;
    for (int i5 = i3; i5 <= i1; i5++) {
      if ((byte)f.b(i5, i2) == 0)
      {
        if (i5 == i3) {
          i4 = 1;
        } else {
          i4 = 16;
        }
        if (paramInt == -1)
        {
          this.jdField_c_of_type_Int = ((i2 + 1 << 4) + 10);
          break;
        }
        this.jdField_c_of_type_Int = ((i2 << 4) - 1);
        break;
      }
    }
    i5 = 0;
    if (i4 != 0)
    {
      i5 = 8;
      if (((i4 & 0x1) == 0) && ((i4 & 0x10) != 0))
      {
        i5 = 12;
      }
      else if (((i4 & 0x10) == 0) && ((i4 & 0x1) != 0) && (i3 != i1))
      {
        i5 = 10;
      }
      else
      {
        i3--;
        paramInt = (byte)f.b(i3, i2);
        i1++;
        i1 = (byte)f.b(i1, i2);
        if ((paramInt != 0) && (i1 != 0))
        {
          if ((byte)f.b(i3 - 1, this.jdField_c_of_type_Int) == 0) {
            i5 = 10;
          } else {
            i5 = 12;
          }
        }
        else if (paramInt != 0) {
          i5 = 12;
        } else if (i1 != 0) {
          i5 = 10;
        }
      }
    }
    return i5;
  }
  
  private void h()
  {
    switch ()
    {
    case 8: 
      if (e.a(f.jdField_a_of_type_Int, f.jdField_b_of_type_Int, this))
      {
        switch (this.jdField_a_of_type_J.jdField_b_of_type_Int)
        {
        case 3: 
        case 4: 
          if (!a(this)) {
            break;
          }
          if (this.jdField_d_of_type_Int == 1) {
            a(1, 1, 0);
          } else {
            a(0, 1, 0);
          }
          break;
        case 0: 
        case 1: 
          if ((this.jdField_b_of_type_Int == this.jdField_h_of_type_Int) && (this.jdField_c_of_type_Int == this.jdField_i_of_type_Int)) {
            break;
          }
          e.a(this);
          i();
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
          if ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) == 0) {
            break;
          }
          a(0, 1, 0);
          break;
        }
      }
      else
      {
        a(this.jdField_h_of_type_Int, this.jdField_i_of_type_Int);
        e();
      }
      a(false, this.jdField_f_of_type_Int, this.jdField_g_of_type_Int);
      return;
    case 13: 
      if (this.jdField_a_of_type_Int == 61) {
        return;
      }
      if ((this.jdField_a_of_type_J.jdField_b_of_type_Int != 5) && ((this.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0)) {
        a(5, 0, 0);
      }
      break;
    }
  }
  
  public final void b(a parama)
  {
    if (parama == null) {
      return;
    }
    this.jdField_e_of_type_A = parama;
  }
  
  public final void c(a parama)
  {
    if (parama == null) {
      return;
    }
    this.jdField_i_of_type_A = parama;
  }
  
  private void i()
  {
    if (this.jdField_g_of_type_Int < this.jdField_c_of_type_Int)
    {
      if ((this.jdField_d_of_type_Int != 1) || (this.jdField_a_of_type_J.jdField_b_of_type_Int != 4))
      {
        this.jdField_d_of_type_Int = 1;
        this.jdField_d_of_type_Byte = 1;
        a(4, 1, 0);
      }
    }
    else if (this.jdField_f_of_type_Int > this.jdField_b_of_type_Int)
    {
      if ((this.jdField_d_of_type_Int != 2) || ((this.jdField_d_of_type_Byte == 0) && (this.jdField_a_of_type_J.jdField_b_of_type_Int != 3)) || ((this.jdField_d_of_type_Byte == 1) && (this.jdField_a_of_type_J.jdField_b_of_type_Int != 4)))
      {
        this.jdField_d_of_type_Int = 2;
        a(true);
        a(this.jdField_d_of_type_Byte == 1 ? 4 : 3, 1, 0);
      }
    }
    else if (this.jdField_f_of_type_Int < this.jdField_b_of_type_Int)
    {
      if ((this.jdField_d_of_type_Int != 0) || ((this.jdField_d_of_type_Byte == 0) && (this.jdField_a_of_type_J.jdField_b_of_type_Int != 3)) || ((this.jdField_d_of_type_Byte == 1) && (this.jdField_a_of_type_J.jdField_b_of_type_Int != 4)))
      {
        this.jdField_d_of_type_Int = 0;
        a(false);
        a(this.jdField_d_of_type_Byte == 1 ? 4 : 3, 1, 0);
      }
    }
    else if ((this.jdField_g_of_type_Int > this.jdField_c_of_type_Int) && ((this.jdField_d_of_type_Int != 3) || (this.jdField_a_of_type_J.jdField_b_of_type_Int != 3)))
    {
      this.jdField_d_of_type_Int = 3;
      this.jdField_d_of_type_Byte = 0;
      a(3, 1, 0);
    }
  }
  
  public final boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    paramInt1 -= this.jdField_b_of_type_Int;
    paramInt2 -= this.jdField_c_of_type_Int;
    int[] arrayOfInt = this.jdField_a_of_type_J.jdField_a_of_type_ArrayOfInt;
    if ((paramInt1 + paramInt5 > arrayOfInt[2] + paramInt6) || (paramInt2 > arrayOfInt[3] + paramInt6)) {
      return false;
    }
    return (paramInt1 + paramInt3 >= arrayOfInt[0] - paramInt6) && (paramInt2 + paramInt4 >= arrayOfInt[1] - paramInt6);
  }
  
  public final void a(int paramInt1, int paramInt2)
  {
    this.jdField_b_of_type_Int = paramInt1;
    this.jdField_c_of_type_Int = paramInt2;
    this.jdField_h_of_type_Int = paramInt1;
    this.jdField_i_of_type_Int = paramInt2;
    this.jdField_f_of_type_Int = paramInt1;
    this.jdField_g_of_type_Int = paramInt2;
  }
  
  public final void b(int paramInt1, int paramInt2)
  {
    this.jdField_b_of_type_Int = paramInt1;
    this.jdField_c_of_type_Int = paramInt2;
  }
  
  public final void c(int paramInt1, int paramInt2)
  {
    int i1 = paramInt1 >> 4;
    int i2 = paramInt2 >> 4;
    int i3 = this.jdField_h_of_type_Int >> 4;
    int i4 = this.jdField_i_of_type_Int >> 4;
    if ((i1 != i3) || (i2 != i4))
    {
      this.jdField_h_of_type_Int = paramInt1;
      this.jdField_i_of_type_Int = paramInt2;
      e();
      i.a(this);
      if (this.jdField_a_of_type_Ar != null)
      {
        this.jdField_f_of_type_Int = ((this.jdField_a_of_type_Ar.jdField_e_of_type_Int << 4) + 8);
        this.jdField_g_of_type_Int = ((this.jdField_a_of_type_Ar.jdField_f_of_type_Int << 4) + 12);
      }
    }
  }
  
  public final boolean a(a parama)
  {
    if (this.jdField_a_of_type_Ar == null) {
      return true;
    }
    if ((parama.jdField_b_of_type_Int != this.jdField_f_of_type_Int) || (parama.jdField_c_of_type_Int != this.jdField_g_of_type_Int))
    {
      i();
    }
    else if ((parama.jdField_b_of_type_Int != this.jdField_h_of_type_Int) || (parama.jdField_c_of_type_Int != this.jdField_i_of_type_Int))
    {
      e.a(this);
      i();
    }
    else
    {
      i.a(this.jdField_a_of_type_Ar);
      this.jdField_a_of_type_Ar = null;
      return true;
    }
    return false;
  }
  
  public final void e()
  {
    if (this.jdField_a_of_type_Ar == null) {
      return;
    }
    i.a(this.jdField_a_of_type_Ar);
    this.jdField_a_of_type_Ar = null;
  }
  
  public final void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    int[] arrayOfInt = this.jdField_a_of_type_Array2dOfInt[(this.jdField_m_of_type_Byte++)];
    switch (paramInt4)
    {
    case 1: 
    case 5: 
      arrayOfInt[0] = 10;
      arrayOfInt[1] = -25;
      arrayOfInt[2] = (paramInt2 - 35);
      arrayOfInt[3] = paramInt1;
      arrayOfInt[4] = paramInt3;
      arrayOfInt[5] = paramInt4;
      arrayOfInt[6] = paramInt5;
      arrayOfInt[7] = (arrayOfInt[4] == 1 ? -2 : paramInt1 <= 64536 ? -6 : 1);
      arrayOfInt[8] = -9;
      break;
    case 2: 
      arrayOfInt[0] = 10;
      arrayOfInt[1] = -20;
      arrayOfInt[2] = (paramInt2 - 20);
      arrayOfInt[3] = paramInt1;
      arrayOfInt[4] = paramInt3;
      arrayOfInt[5] = paramInt4;
      arrayOfInt[6] = paramInt5;
      arrayOfInt[7] = (arrayOfInt[4] == 1 ? 4 : -4);
      arrayOfInt[1] += (arrayOfInt[4] == 1 ? -20 : 20);
      arrayOfInt[8] = -9;
      break;
    case 3: 
      arrayOfInt[0] = 10;
      arrayOfInt[1] = -20;
      arrayOfInt[2] = (paramInt2 - 40);
      arrayOfInt[3] = paramInt1;
      arrayOfInt[4] = paramInt3;
      arrayOfInt[5] = paramInt4;
      arrayOfInt[6] = paramInt5;
      arrayOfInt[7] = (arrayOfInt[4] == 1 ? 4 : -4);
      tmpTernaryOp = (arrayOfInt[1] + (arrayOfInt[4] == 1 ? -20 : 20));
      break;
    case 4: 
      arrayOfInt[0] = 10;
      arrayOfInt[1] = -30;
      arrayOfInt[2] = (paramInt2 - 35);
      arrayOfInt[3] = paramInt1;
      arrayOfInt[4] = paramInt3;
      arrayOfInt[5] = paramInt4;
      arrayOfInt[6] = paramInt5;
      arrayOfInt[7] = (arrayOfInt[4] == 1 ? -4 : 4);
      arrayOfInt[8] = -1;
      tmpTernaryOp = tmp303_302;
      break;
    case 6: 
      arrayOfInt[0] = 10;
      arrayOfInt[1] = -25;
      arrayOfInt[2] = (paramInt2 - 35);
      arrayOfInt[3] = paramInt1;
      arrayOfInt[4] = paramInt3;
      arrayOfInt[5] = paramInt4;
      arrayOfInt[6] = paramInt5;
      arrayOfInt[7] = (arrayOfInt[4] == 1 ? -2 : paramInt1 <= 64536 ? -6 : 1);
      arrayOfInt[8] = 9;
    }
    arrayOfInt[9] = 1;
    if (this.jdField_m_of_type_Byte >= this.jdField_a_of_type_Array2dOfInt.length) {
      this.jdField_m_of_type_Byte = 0;
    }
  }
  
  private void c(Graphics paramGraphics, int paramInt1, int paramInt2)
  {
    paramGraphics.setColor(16711680);
    int i1 = -1;
    for (;;)
    {
      i1++;
      if (i1 >= this.jdField_a_of_type_Array2dOfInt.length) {
        break;
      }
      if ((this.jdField_a_of_type_Array2dOfInt[i1][6] > 0) && (this.jdField_a_of_type_Array2dOfInt[i1][6] != 99) && (this.jdField_a_of_type_Array2dOfInt[i1][0] > 0))
      {
        int i2 = this.jdField_a_of_type_Array2dOfInt[i1][3];
        if (this.jdField_a_of_type_Array2dOfInt[i1][5] == 5)
        {
          paramGraphics.drawString("MISS", paramInt1 + this.jdField_a_of_type_Array2dOfInt[i1][1], paramInt2 + this.jdField_a_of_type_Array2dOfInt[i1][2] + 10, 0);
          paramGraphics.drawString("MISS", paramInt1 + this.jdField_a_of_type_Array2dOfInt[i1][1] + 1, paramInt2 + this.jdField_a_of_type_Array2dOfInt[i1][2] + 10, 0);
        }
        else
        {
          t.a(paramGraphics, this.jdField_a_of_type_Array2dOfInt[i1][9] == 1 ? e.a(1) : null, i2, paramInt1 + this.jdField_a_of_type_Array2dOfInt[i1][1], paramInt2 + this.jdField_a_of_type_Array2dOfInt[i1][2], this.jdField_a_of_type_Array2dOfInt[i1][5], this.jdField_a_of_type_Array2dOfInt[i1][9]);
        }
      }
    }
  }
  
  public final void b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i7 = this.jdField_b_of_type_Int;
    int i8 = this.jdField_c_of_type_Int;
    paramInt1 -= i7;
    paramInt2 -= i8;
    int i3;
    if (paramInt1 >= 0)
    {
      i3 = 1;
    }
    else
    {
      i3 = -1;
      paramInt1 = -paramInt1;
    }
    int i4;
    if (paramInt2 >= 0)
    {
      i4 = 1;
    }
    else
    {
      i4 = -1;
      paramInt2 = -paramInt2;
    }
    int i1 = paramInt1 << 1;
    int i2 = paramInt2 << 1;
    int i6 = 0;
    if (paramInt1 > paramInt2)
    {
      i5 = i2 - paramInt1;
      while ((i6 <= paramInt1) && (paramInt3-- > 0))
      {
        i6++;
        if (i5 >= 0)
        {
          i5 -= i1;
          i8 += i4;
        }
        i5 += i2;
        i7 += i3;
      }
    }
    int i5 = i1 - paramInt2;
    while ((i6 <= paramInt2) && (paramInt3-- >= 0))
    {
      i6++;
      if (i5 >= 0)
      {
        i5 -= i2;
        i7 += i3;
      }
      i5 += i1;
      i8 += i4;
    }
    this.jdField_b_of_type_Int = i7;
    this.jdField_c_of_type_Int = i8;
  }
  
  public final void b(int paramInt)
  {
    this.p = paramInt;
    a locala = this;
    if (this.jdField_b_of_type_ArrayOfByte == null)
    {
      locala.jdField_b_of_type_ArrayOfByte = new byte[4];
      i1 = -1;
      for (;;)
      {
        i1++;
        if (i1 >= locala.jdField_b_of_type_ArrayOfByte.length - 1) {
          break;
        }
        locala.jdField_b_of_type_ArrayOfByte[i1] = 1;
      }
      locala.jdField_b_of_type_ArrayOfByte[3] = 1;
    }
    d(paramInt & 0xF);
    c(paramInt >> 4 & 0xF);
    int i1 = paramInt >> 8 & 0xF;
    locala = this;
    if (this.jdField_b_of_type_ArrayOfByte != null)
    {
      locala.jdField_b_of_type_ArrayOfByte[2] = ((byte)i1);
      locala.a(locala.jdField_a_of_type_J.jdField_b_of_type_Int, 0, 0);
    }
    i1 = paramInt >> 12 & 0xF;
    locala = this;
    if (this.jdField_b_of_type_ArrayOfByte != null)
    {
      if (i1 == 0) {
        i1 = 1;
      }
      locala.jdField_b_of_type_ArrayOfByte[3] = ((byte)i1);
      locala.a(locala.jdField_a_of_type_J.jdField_b_of_type_Int, 0, 0);
    }
    i1 = paramInt >> 16 & 0xF;
    locala = this;
    if (this.jdField_b_of_type_ArrayOfByte != null)
    {
      if (i1 > 0)
      {
        locala.c(1);
        locala.d(i1 > 5 ? i1 - 5 : i1);
        paramInt = new short[] { 166, 177, 62, 168 };
        locala.a(paramInt[locala.jdField_m_of_type_Int]);
        return;
      }
      if ((i1 == 0) && (locala.jdField_a_of_type_Int >= 4)) {
        locala.a(locala.jdField_m_of_type_Int);
      }
    }
  }
  
  private void c(int paramInt)
  {
    if (this.jdField_b_of_type_ArrayOfByte == null) {
      return;
    }
    this.jdField_b_of_type_ArrayOfByte[1] = ((byte)paramInt);
    a(this.jdField_a_of_type_J.jdField_b_of_type_Int, 0, 0);
  }
  
  private void d(int paramInt)
  {
    if (this.jdField_b_of_type_ArrayOfByte == null) {
      return;
    }
    this.jdField_b_of_type_ArrayOfByte[0] = ((byte)paramInt);
    a(this.jdField_a_of_type_J.jdField_b_of_type_Int, 0, 0);
  }
  
  public final void f()
  {
    a(61);
    a(0, 0, 16);
    n.a(this.jdField_a_of_type_ArrayOfByte, 2, 0);
    n.a(this.jdField_a_of_type_ArrayOfByte, 3, 0);
    if ((this.jdField_a_of_type_Au != null) && (this.jdField_a_of_type_Au.jdField_a_of_type_Int > 0)) {
      this.jdField_a_of_type_Au.a();
    }
    if (this.jdField_f_of_type_A != null) {
      this.jdField_f_of_type_A = null;
    }
  }
  
  public final void g()
  {
    this.k = n.a(this.jdField_a_of_type_ArrayOfByte, 13);
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\a.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */