import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;

public final class w
{
  private int jdField_e_of_type_Int;
  public int a;
  public int b;
  public int c;
  public short a;
  public int d;
  public a a;
  public a b;
  private a jdField_c_of_type_A;
  private a jdField_d_of_type_A;
  private int jdField_f_of_type_Int;
  private int[] jdField_a_of_type_ArrayOfInt;
  public u[] a;
  private v jdField_a_of_type_V;
  private a jdField_e_of_type_A;
  byte jdField_a_of_type_Byte;
  private au jdField_a_of_type_Au;
  private au jdField_b_of_type_Au;
  private u jdField_a_of_type_U;
  private u jdField_b_of_type_U;
  private u jdField_c_of_type_U;
  private au jdField_c_of_type_Au;
  private au jdField_d_of_type_Au;
  private byte jdField_d_of_type_Byte;
  private byte jdField_e_of_type_Byte;
  byte jdField_b_of_type_Byte;
  public byte c;
  private byte jdField_f_of_type_Byte;
  private byte jdField_g_of_type_Byte;
  private byte jdField_h_of_type_Byte;
  private int[] jdField_b_of_type_ArrayOfInt;
  private int[] jdField_c_of_type_ArrayOfInt;
  private byte i;
  private byte j;
  private boolean jdField_a_of_type_Boolean;
  private byte k;
  private byte l;
  private byte m;
  private byte n;
  private final int jdField_g_of_type_Int;
  private final int jdField_h_of_type_Int;
  private byte o;
  
  public w(v paramv)
  {
    this.jdField_a_of_type_ArrayOfInt = new int[4];
    this.jdField_b_of_type_ArrayOfInt = new int[] { 0, 27, 10, 20, 5, 26, 54 };
    this.jdField_c_of_type_ArrayOfInt = new int[] { 61, 17 };
    this.jdField_g_of_type_Int = (d.jdField_a_of_type_Int / 6);
    this.jdField_h_of_type_Int = (this.jdField_g_of_type_Int << 1);
    this.jdField_a_of_type_V = paramv;
  }
  
  final void a()
  {
    int i1 = -1;
    for (;;)
    {
      i1++;
      if (i1 >= this.jdField_b_of_type_ArrayOfInt.length) {
        break;
      }
      if ((this.jdField_b_of_type_Int == this.jdField_b_of_type_ArrayOfInt[i1]) && (this.jdField_h_of_type_Byte == 0)) {
        this.jdField_h_of_type_Byte = 3;
      }
    }
    i1 = -1;
    for (;;)
    {
      i1++;
      if (i1 >= this.jdField_c_of_type_ArrayOfInt.length) {
        break;
      }
      if ((this.jdField_b_of_type_Int == this.jdField_c_of_type_ArrayOfInt[i1]) && (this.jdField_h_of_type_Byte == 0)) {
        this.jdField_h_of_type_Byte = 4;
      }
    }
  }
  
  final void b()
  {
    if ((this.jdField_a_of_type_A == null) || (this.jdField_b_of_type_A == null)) {
      return;
    }
    this.jdField_a_of_type_Au = new au(0);
    this.jdField_b_of_type_Au = new au(0);
    int i1 = -1;
    while (this.jdField_a_of_type_ArrayOfU != null)
    {
      i1++;
      if (i1 >= this.jdField_a_of_type_ArrayOfU.length) {
        break;
      }
      if ((this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_Int == 0) && (this.jdField_a_of_type_ArrayOfU[i1].jdField_b_of_type_Int == 8))
      {
        if (this.jdField_c_of_type_Au == null) {
          this.jdField_c_of_type_Au = new au(0);
        }
        this.jdField_c_of_type_Au.a(this.jdField_a_of_type_ArrayOfU[i1]);
      }
      else if ((this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_Int == 1) && (this.jdField_a_of_type_ArrayOfU[i1].jdField_b_of_type_Int == 8))
      {
        if (this.jdField_d_of_type_Au == null) {
          this.jdField_d_of_type_Au = new au(0);
        }
        this.jdField_d_of_type_Au.a(this.jdField_a_of_type_ArrayOfU[i1]);
      }
      else if (this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_A.jdField_a_of_type_Long != this.jdField_a_of_type_A.jdField_a_of_type_Long)
      {
        if ((this.jdField_a_of_type_Au.jdField_a_of_type_Int > 0) && (this.jdField_c_of_type_Int == 1))
        {
          this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_A.jdField_a_of_type_Boolean = true;
          this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_A.n = (i1 * 3);
        }
        if (this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_Int == 6)
        {
          this.jdField_b_of_type_U = this.jdField_a_of_type_ArrayOfU[i1];
          this.jdField_c_of_type_A = this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_A;
        }
        else
        {
          this.jdField_a_of_type_Au.a(this.jdField_a_of_type_ArrayOfU[i1]);
        }
        if ((this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_Int == 0) && (this.jdField_a_of_type_ArrayOfU[i1].jdField_b_of_type_Int == 1) && (this.jdField_g_of_type_Byte == 0))
        {
          this.jdField_g_of_type_Byte = 1;
          this.jdField_h_of_type_Byte = 1;
        }
        else if ((this.jdField_a_of_type_ArrayOfU[i1].jdField_b_of_type_Int == 3) && (this.jdField_g_of_type_Byte == 0))
        {
          this.jdField_h_of_type_Byte = 2;
        }
      }
      else if ((this.jdField_c_of_type_Int == 4) && (this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_Int == 0) && (this.jdField_a_of_type_ArrayOfU[i1].jdField_b_of_type_Int == 6))
      {
        this.jdField_a_of_type_U = this.jdField_a_of_type_ArrayOfU[i1];
      }
      else if ((this.jdField_a_of_type_Int == 1) && (this.jdField_a_of_type_ArrayOfU[i1].jdField_a_of_type_Int == 1) && (this.jdField_a_of_type_ArrayOfU[i1].jdField_c_of_type_Int < 0))
      {
        this.jdField_c_of_type_U = this.jdField_a_of_type_ArrayOfU[i1];
      }
      else
      {
        this.jdField_b_of_type_Au.a(this.jdField_a_of_type_ArrayOfU[i1]);
      }
    }
  }
  
  public final int a()
  {
    if ((this.jdField_e_of_type_Int == 1) || (this.jdField_e_of_type_Int == 2))
    {
      Object localObject;
      switch (this.jdField_a_of_type_Int)
      {
      case 0: 
        d();
        break;
      case 3: 
        if ((this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0)
        {
          c();
          a(3);
        }
        break;
      case 1: 
        switch (this.jdField_d_of_type_Int)
        {
        case 0: 
          d();
          break;
        case 1: 
          localObject = this;
          switch (this.jdField_f_of_type_Int)
          {
          case 0: 
            ((w)localObject).a(0);
            if ((((w)localObject).a() ? 2 : 0) >= ((w)localObject).jdField_d_of_type_Byte) {
              ((w)localObject).e();
            }
            break;
          case 4: 
            if (((w)localObject).a(2)) {
              ((w)localObject).a(3);
            }
            break;
          }
          break;
        }
        break;
      case 2: 
        a(3);
        break;
      case 4: 
        if ((this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0)
        {
          c();
          a(3);
        }
        break;
      case 5: 
        if ((this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) {
          a(3);
        }
        break;
      case 8: 
        if ((this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0)
        {
          c();
          a(3);
        }
        break;
      case 7: 
        if ((this.jdField_e_of_type_Byte == 0) && ((this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0))
        {
          (localObject = new a()).jdField_j_of_type_Int |= 0x800;
          ((a)localObject).a(4);
          ((a)localObject).a(33, 0, 16);
          if (this.jdField_d_of_type_A != null) {
            this.jdField_b_of_type_A.b((a)localObject);
          }
          this.jdField_e_of_type_Byte = 1;
        }
        if ((this.jdField_e_of_type_Byte == 1) && ((this.jdField_b_of_type_A.jdField_e_of_type_A == null) || (this.jdField_d_of_type_A != null)))
        {
          c();
          a(3);
          this.jdField_e_of_type_Byte = 0;
          this.jdField_d_of_type_A = null;
        }
        break;
      }
    }
    if (!this.jdField_a_of_type_Boolean)
    {
      if ((this.jdField_j_of_type_Byte = (byte)(this.jdField_j_of_type_Byte + 1)) % 10 == 0) {
        this.i = ((byte)(this.i + 1));
      }
      if (this.i >= 5)
      {
        c();
        if ((a(this.jdField_a_of_type_A)) && (a(2))) {
          a(3);
        }
      }
    }
    return this.jdField_e_of_type_Int;
  }
  
  private void c()
  {
    int i1 = -1;
    u localu;
    while (this.jdField_a_of_type_Au != null)
    {
      i1++;
      if (i1 >= this.jdField_a_of_type_Au.jdField_a_of_type_Int) {
        break;
      }
      switch ((localu = (u)this.jdField_a_of_type_Au.a(i1)).jdField_a_of_type_Int)
      {
      case 0: 
        a(localu, i1, 2);
        break;
      case 1: 
        a(localu);
        break;
      case 2: 
        c(localu);
        break;
      case 3: 
        b(localu);
        break;
      case 4: 
        a(localu, this.m++);
        break;
      case 5: 
        d(localu);
      }
    }
    i1 = -1;
    while (this.jdField_b_of_type_Au != null)
    {
      i1++;
      if (i1 >= this.jdField_b_of_type_Au.jdField_a_of_type_Int) {
        break;
      }
      switch ((localu = (u)this.jdField_b_of_type_Au.a(i1)).jdField_a_of_type_Int)
      {
      case 0: 
        a(localu, i1, 1);
        break;
      case 1: 
        a(localu);
        break;
      case 2: 
        c(localu);
        break;
      case 3: 
        b(localu);
        break;
      case 4: 
        a(localu, this.n++);
        break;
      case 5: 
        d(localu);
      }
    }
  }
  
  private void d()
  {
    Object localObject;
    switch (this.jdField_f_of_type_Int)
    {
    case 0: 
      a(0);
      if ((this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) {
        if ((a() ? 1 : 0) == this.jdField_d_of_type_Byte)
        {
          if (this.jdField_b_of_type_Byte == 0)
          {
            if ((b(this.jdField_b_of_type_A)) && (b(this.jdField_a_of_type_A)))
            {
              b(1);
              return;
            }
            b(2);
            return;
          }
          b(2);
          return;
        }
      }
      break;
    case 1: 
      int i3 = this.jdField_a_of_type_A.jdField_f_of_type_Byte == 2 ? 75 : 0;
      int[] arrayOfInt;
      i3 = (arrayOfInt = t.jdField_a_of_type_Array4dOfInt[this.jdField_b_of_type_A.k][this.jdField_b_of_type_A.l][1])[0] + t.jdField_f_of_type_Int - i3;
      int i1 = arrayOfInt[1] + t.jdField_g_of_type_Int;
      this.jdField_a_of_type_A.b(i3, i1, this.jdField_g_of_type_Int);
      if ((Math.abs(this.jdField_a_of_type_A.jdField_b_of_type_Int - i3) < 3) && (Math.abs(this.jdField_a_of_type_A.jdField_c_of_type_Int - i1) < 3))
      {
        this.jdField_a_of_type_A.b(i3, i1);
        b(2);
        return;
      }
      break;
    case 2: 
      switch (this.jdField_a_of_type_Int)
      {
      case 0: 
        localObject = this;
        a locala = this.jdField_a_of_type_A;
        w localw = this;
        locala.jdField_a_of_type_J.a(1, localw.jdField_a_of_type_ArrayOfInt);
        if ((localw.jdField_a_of_type_ArrayOfInt[0] != 0) || (localw.jdField_a_of_type_ArrayOfInt[1] != 0) || (localw.jdField_a_of_type_ArrayOfInt[2] != 0) || (localw.jdField_a_of_type_ArrayOfInt[3] != 0))
        {
          int i5 = -1;
          u localu;
          while (localw.jdField_a_of_type_Au != null)
          {
            i5++;
            if (i5 >= localw.jdField_a_of_type_Au.jdField_a_of_type_Int) {
              break;
            }
            switch ((localu = (u)localw.jdField_a_of_type_Au.a(i5)).jdField_a_of_type_Int)
            {
            case 0: 
              localw.a(localu, i5, 0);
              break;
            case 1: 
              localw.a(localu);
              break;
            case 2: 
              localw.c(localu);
              break;
            case 3: 
              b(localu);
              break;
            case 4: 
              a(localu, localw.m++);
              break;
            case 5: 
              d(localu);
            }
          }
          i5 = -1;
          while (localw.jdField_b_of_type_Au != null)
          {
            i5++;
            if (i5 >= localw.jdField_b_of_type_Au.jdField_a_of_type_Int) {
              break;
            }
            switch ((localu = (u)localw.jdField_b_of_type_Au.a(i5)).jdField_a_of_type_Int)
            {
            case 0: 
              localw.a(localu, i5, 0);
              break;
            case 1: 
              localw.a(localu);
              break;
            case 2: 
              localw.c(localu);
              break;
            case 3: 
              b(localu);
              break;
            case 4: 
              a(localu, localw.n++);
              break;
            case 5: 
              d(localu);
            }
          }
        }
        if ((((w)localObject).jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0)
        {
          if (b(((w)localObject).jdField_a_of_type_A)) {
            ((w)localObject).b(4);
          } else {
            ((w)localObject).b(3);
          }
          ((w)localObject).a(2);
        }
        a(1);
        return;
      case 1: 
        e();
      }
      return;
    case 3: 
      if (this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_b_of_type_Int != 7)
      {
        this.jdField_a_of_type_A.a(7, 0, 0);
        this.jdField_a_of_type_A.a((this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x2) == 0);
      }
      a(2);
      int i4 = (localObject = t.jdField_a_of_type_Array4dOfInt[this.jdField_a_of_type_A.k][this.jdField_a_of_type_A.l][0])[0] + t.jdField_f_of_type_Int;
      int i2 = localObject[1] + t.jdField_g_of_type_Int;
      this.jdField_a_of_type_A.b(i4, i2, this.jdField_g_of_type_Int);
      if ((Math.abs(this.jdField_a_of_type_A.jdField_b_of_type_Int - i4) < 2) && (Math.abs(this.jdField_a_of_type_A.jdField_c_of_type_Int - i2) < 2))
      {
        this.jdField_a_of_type_A.b(i4, i2);
        this.jdField_a_of_type_A.a(this.jdField_a_of_type_A.l < 2);
        if ((a() ? 3 : 0) == this.jdField_d_of_type_Byte) {
          b(4);
        }
        return;
      }
      break;
    case 4: 
      if ((b(this.jdField_a_of_type_A)) && (a(2))) {
        a(3);
      }
      break;
    }
  }
  
  private static boolean a(a parama)
  {
    if ((parama == null) || (parama.jdField_j_of_type_Byte != 1)) {
      return true;
    }
    parama.a(7, 0, 0);
    parama.a((parama.jdField_a_of_type_J.jdField_d_of_type_Int & 0x2) == 0);
    int[] arrayOfInt;
    int i2 = (arrayOfInt = t.jdField_a_of_type_Array4dOfInt[parama.k][parama.l][0])[0] + t.jdField_f_of_type_Int;
    int i1 = arrayOfInt[1] + t.jdField_g_of_type_Int;
    parama.b(i2, i1, d.jdField_a_of_type_Int);
    if ((Math.abs(parama.jdField_b_of_type_Int - i2) < 2) && (Math.abs(parama.jdField_c_of_type_Int - i1) < 2))
    {
      parama.b(i2, i1);
      parama.a(parama.l < 2);
      if ((parama.jdField_j_of_type_Int & 0x40) == 0) {
        parama.a(5, 0, 0);
      } else {
        parama.f();
      }
      return true;
    }
    return false;
  }
  
  private boolean a(int paramInt)
  {
    if ((!a()) || (paramInt != this.jdField_d_of_type_Byte)) {
      return true;
    }
    int i1;
    switch (this.jdField_d_of_type_Byte)
    {
    case 0: 
      i1 = (paramInt = t.jdField_a_of_type_Array4dOfInt[this.jdField_b_of_type_A.k][this.jdField_b_of_type_A.l][2])[0] + t.jdField_f_of_type_Int;
      paramInt = paramInt[1] + t.jdField_g_of_type_Int;
      this.jdField_c_of_type_A.b(i1, paramInt, this.jdField_h_of_type_Int);
      if ((Math.abs(this.jdField_c_of_type_A.jdField_b_of_type_Int - i1) < 3) && (Math.abs(this.jdField_c_of_type_A.jdField_c_of_type_Int - paramInt) < 3))
      {
        this.jdField_c_of_type_A.b(i1, paramInt);
        this.jdField_d_of_type_Byte = 1;
      }
      break;
    case 1: 
      this.jdField_d_of_type_Byte = 2;
      break;
    case 2: 
      i1 = (paramInt = t.jdField_a_of_type_Array4dOfInt[this.jdField_c_of_type_A.k][this.jdField_c_of_type_A.l][0])[0] + t.jdField_f_of_type_Int;
      paramInt = paramInt[1] + t.jdField_g_of_type_Int;
      this.jdField_c_of_type_A.b(i1, paramInt, this.jdField_h_of_type_Int);
      if ((Math.abs(this.jdField_c_of_type_A.jdField_b_of_type_Int - i1) < 3) && (Math.abs(this.jdField_c_of_type_A.jdField_c_of_type_Int - paramInt) < 3))
      {
        this.jdField_c_of_type_A.b(i1, paramInt);
        this.jdField_c_of_type_A.a(this.jdField_c_of_type_A.l < 2);
        this.jdField_d_of_type_Byte = 3;
        return true;
      }
      break;
    }
    return false;
  }
  
  private void e()
  {
    if (d.b() != 13)
    {
      a(2);
      this.i = 4;
      return;
    }
    a(1);
    w localw = this;
    if (this.jdField_c_of_type_Int == 4)
    {
      a locala;
      (locala = new a()).jdField_j_of_type_Int |= 0x8000;
      locala.a(4);
      locala.a(16, 0, 16);
      if ((localw.jdField_a_of_type_A.jdField_a_of_type_J.jdField_a_of_type_Int == 0) && (localw.jdField_a_of_type_A.jdField_a_of_type_J.jdField_c_of_type_Int == 8)) {
        localw.jdField_a_of_type_A.g = locala;
      }
    }
    a(this.jdField_a_of_type_A);
    if ((this.jdField_a_of_type_ArrayOfInt[0] != 0) || (this.jdField_a_of_type_ArrayOfInt[1] != 0) || (this.jdField_a_of_type_ArrayOfInt[2] != 0) || (this.jdField_a_of_type_ArrayOfInt[3] != 0))
    {
      if (this.jdField_d_of_type_Int == 0)
      {
        a(this.jdField_b_of_type_Int, this.jdField_c_of_type_Int);
        if (this.jdField_a_of_type_Byte == -1)
        {
          if ((b(this.jdField_a_of_type_A)) && (a(2))) {
            b(4);
          } else {
            b(3);
          }
          a(2);
          return;
        }
        this.jdField_e_of_type_A = a(this.jdField_a_of_type_ArrayOfU[this.jdField_a_of_type_Byte].jdField_a_of_type_A);
      }
      if (this.jdField_d_of_type_Int == 0) {
        b(this.jdField_a_of_type_A);
      }
    }
    if (((this.jdField_a_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) && (this.o == 0))
    {
      if (this.jdField_d_of_type_Int == 1) {
        t.a(this.jdField_a_of_type_A.jdField_b_of_type_Int, this.jdField_a_of_type_A.jdField_c_of_type_Int, this.jdField_a_of_type_Short, 4);
      }
      a(this.jdField_b_of_type_Int, this.jdField_c_of_type_Int);
      if (this.jdField_a_of_type_Byte == -1)
      {
        if ((b(this.jdField_a_of_type_A)) && (a(2))) {
          b(4);
        } else {
          b(3);
        }
        a(2);
        return;
      }
      this.jdField_e_of_type_A = a(this.jdField_a_of_type_ArrayOfU[this.jdField_a_of_type_Byte].jdField_a_of_type_A);
      this.o = 1;
    }
    if ((this.jdField_d_of_type_Int == 1) && (this.jdField_e_of_type_A != null) && (this.o == 1))
    {
      a(this.jdField_e_of_type_A);
      b(this.jdField_e_of_type_A);
    }
    if ((this.jdField_e_of_type_A != null) && ((this.jdField_e_of_type_A.jdField_a_of_type_J.jdField_d_of_type_Int & 0x8) != 0) && (this.jdField_e_of_type_A.jdField_a_of_type_J.a()))
    {
      this.o = 2;
      if (this.jdField_h_of_type_Byte == 4) {
        t.d(1);
      }
      if ((a(2)) && (b(this.jdField_a_of_type_A))) {
        b(4);
      } else {
        b(3);
      }
      a(2);
    }
  }
  
  public final void a(int paramInt)
  {
    for (;;)
    {
      this.jdField_e_of_type_Int = paramInt;
      if (this.jdField_e_of_type_Int == 3)
      {
        this.jdField_a_of_type_Boolean = true;
        if (!b(this.jdField_b_of_type_A)) {
          a(this.jdField_b_of_type_A);
        }
      }
      switch (paramInt)
      {
      case 1: 
        if (this.jdField_a_of_type_A != null)
        {
          b(0);
          return;
        }
        paramInt = 3;
        this = this;
      }
    }
    (paramInt = this.jdField_a_of_type_V).jdField_b_of_type_Int += 1;
    if (paramInt.jdField_b_of_type_Int >= paramInt.a.length) {
      paramInt.jdField_b_of_type_Int -= 1;
    } else {
      paramInt.a[paramInt.jdField_b_of_type_Int].a(1);
    }
    a(2);
  }
  
  private void b(int paramInt)
  {
    this.jdField_f_of_type_Int = paramInt;
    switch (paramInt)
    {
    case 0: 
      if (this.jdField_a_of_type_A.jdField_a_of_type_Int == 61) {
        return;
      }
      switch (this.jdField_a_of_type_Int)
      {
      case 0: 
        this.jdField_a_of_type_A.a(6, 0, 16);
        if (this.jdField_g_of_type_Byte == 1)
        {
          (paramInt = new a()).jdField_j_of_type_Int |= 0x4000;
          paramInt.a(4);
          paramInt.a(41, 1, 16);
          this.jdField_a_of_type_A.c(paramInt);
          this.jdField_g_of_type_Byte = 2;
          return;
        }
        break;
      case 3: 
        this.jdField_a_of_type_A.a(6, 0, 0);
        t.a(this.jdField_a_of_type_A.jdField_b_of_type_Int - 10, this.jdField_a_of_type_A.jdField_c_of_type_Int, "防御", 0);
        return;
      case 4: 
        this.jdField_a_of_type_A.a(14, 0, 0);
        return;
      case 1: 
        if (this.jdField_d_of_type_Int == 0)
        {
          this.jdField_a_of_type_A.a(6, 0, 16);
          t.a(this.jdField_a_of_type_A.jdField_b_of_type_Int, this.jdField_a_of_type_A.jdField_c_of_type_Int, this.jdField_a_of_type_Short, 4);
        }
        else if (this.jdField_d_of_type_Int == 1)
        {
          this.jdField_a_of_type_A.a(9, 0, 16);
        }
        if ((this.jdField_c_of_type_Int == 4) && (this.jdField_a_of_type_U != null))
        {
          this.jdField_a_of_type_A.a(this.jdField_a_of_type_U.jdField_c_of_type_Int, 0, this.jdField_a_of_type_A.l > 1 ? 1 : 0, 1, 1);
          n.a(this.jdField_a_of_type_U.jdField_a_of_type_A.jdField_a_of_type_ArrayOfByte, 2, this.jdField_a_of_type_U.jdField_d_of_type_Int);
        }
        if (this.jdField_c_of_type_U == null) {
          return;
        }
        a(this.jdField_c_of_type_U);
        return;
      case 8: 
        this.jdField_a_of_type_A.a(5, 0, 0);
        return;
      case 7: 
        this.jdField_a_of_type_A.a(9, 0, 0);
      }
      return;
    case 1: 
      if (this.jdField_a_of_type_A.jdField_a_of_type_Int == 61) {
        return;
      }
      this.jdField_a_of_type_A.a(7, 0, 0);
      return;
    case 2: 
      if (this.jdField_a_of_type_A.jdField_a_of_type_Int == 61) {
        return;
      }
      switch (this.jdField_a_of_type_Int)
      {
      case 0: 
        this.jdField_a_of_type_A.a(8, 0, 16);
        break;
      case 1: 
        if ((this.jdField_a_of_type_A.m == 3) || (this.jdField_a_of_type_A.m == 0) || (this.jdField_a_of_type_A.jdField_f_of_type_Byte == 2)) {
          this.jdField_a_of_type_A.a(8, 0, 16);
        } else {
          this.jdField_a_of_type_A.a(9, 0, 16);
        }
        break;
      }
      if (this.jdField_h_of_type_Byte == 2)
      {
        t.d(0);
        return;
      }
      break;
    case 3: 
      if (this.jdField_a_of_type_A.jdField_a_of_type_Int == 61) {
        return;
      }
      this.jdField_a_of_type_A.a(5, 0, 0);
      return;
    case 4: 
      if ((this.jdField_a_of_type_A.jdField_j_of_type_Int & 0x40) == 0) {
        this.jdField_a_of_type_A.a(5, 0, 0);
      } else {
        this.jdField_a_of_type_A.f();
      }
      if (!b(this.jdField_a_of_type_A)) {
        a(this.jdField_a_of_type_A);
      }
      if (a())
      {
        if ((this.jdField_c_of_type_A.jdField_j_of_type_Int & 0x40) != 0) {
          this.jdField_c_of_type_A.f();
        }
        if (!b(this.jdField_c_of_type_A)) {
          a(this.jdField_c_of_type_A);
        }
      }
      break;
    }
  }
  
  private static boolean b(a parama)
  {
    int[] arrayOfInt;
    int i2 = (arrayOfInt = t.jdField_a_of_type_Array4dOfInt[parama.k][parama.l][0])[0] + t.jdField_f_of_type_Int;
    int i1 = arrayOfInt[1] + t.jdField_g_of_type_Int;
    return (parama.jdField_b_of_type_Int == i2) && (parama.jdField_c_of_type_Int == i1);
  }
  
  private void a(a parama)
  {
    parama.jdField_a_of_type_J.a(1, this.jdField_a_of_type_ArrayOfInt);
  }
  
  private void b(a parama)
  {
    if ((this.jdField_a_of_type_ArrayOfInt[0] != 0) || (this.jdField_a_of_type_ArrayOfInt[1] != 0) || (this.jdField_a_of_type_ArrayOfInt[2] != 0) || (this.jdField_a_of_type_ArrayOfInt[3] != 0))
    {
      if (this.jdField_h_of_type_Byte == 3) {
        t.d(1);
      }
      int i1 = -1;
      u localu;
      while (this.jdField_a_of_type_Au != null)
      {
        i1++;
        if (i1 >= this.jdField_a_of_type_Au.jdField_a_of_type_Int) {
          break;
        }
        localu = (u)this.jdField_a_of_type_Au.a(i1);
        j localj;
        if (((localj = parama.jdField_a_of_type_J).jdField_b_of_type_Byte >= localj.jdField_a_of_type_Byte - 1 ? 1 : 0) == 0) {
          if ((i1 > 0) && (this.jdField_c_of_type_Int == 3)) {
            return;
          }
        }
        switch (localu.jdField_a_of_type_Int)
        {
        case 0: 
          a(localu, this.k++ + this.jdField_f_of_type_Byte, 1);
          if (this.jdField_c_of_type_Int == 3)
          {
            this.jdField_a_of_type_Au.b(i1);
            this.jdField_f_of_type_Byte = ((byte)(this.jdField_f_of_type_Byte + 1));
          }
          break;
        case 1: 
          a(localu);
          break;
        case 2: 
          c(localu);
          break;
        case 3: 
          b(localu);
          break;
        case 4: 
          a(localu, this.m++);
          if (this.jdField_c_of_type_Int == 3) {
            this.jdField_a_of_type_Au.b(i1);
          }
          break;
        case 5: 
          d(localu);
        }
      }
      i1 = -1;
      while (this.jdField_b_of_type_Au != null)
      {
        i1++;
        if (i1 >= this.jdField_b_of_type_Au.jdField_a_of_type_Int) {
          break;
        }
        switch ((localu = (u)this.jdField_b_of_type_Au.a(i1)).jdField_a_of_type_Int)
        {
        case 0: 
          a(localu, this.l++, 1);
          if (this.jdField_c_of_type_Int == 3) {
            this.jdField_b_of_type_Au.b(i1);
          }
          break;
        case 1: 
          a(localu);
          break;
        case 2: 
          c(localu);
          break;
        case 3: 
          b(localu);
          break;
        case 4: 
          a(localu, this.n++);
          break;
        case 5: 
          d(localu);
        }
      }
    }
  }
  
  private void a(u paramu)
  {
    if (paramu.jdField_a_of_type_Int != 1) {
      return;
    }
    if ((this.jdField_c_of_type_Int == 3) && (this.jdField_e_of_type_A != null) && (this.jdField_e_of_type_A.jdField_a_of_type_J.jdField_b_of_type_Byte > 0)) {
      return;
    }
    int i1 = paramu.jdField_c_of_type_Int;
    int i2 = paramu.jdField_d_of_type_Int;
    paramu = paramu.jdField_a_of_type_A;
    if ((this.jdField_b_of_type_Int == 31) && (i1 >= 0))
    {
      n.a(paramu.jdField_a_of_type_ArrayOfByte, 3, i2);
    }
    else
    {
      paramu.a(i1, 0, paramu.l > 1 ? 1 : 0, i1 >= 0 ? 2 : 3, 1);
      n.a(paramu.jdField_a_of_type_ArrayOfByte, 3, i2);
    }
    paramu.i = 0;
  }
  
  private void a(u paramu, int paramInt1, int paramInt2)
  {
    if (paramu.jdField_a_of_type_Int != 0) {
      return;
    }
    int i1 = paramu.jdField_b_of_type_Int;
    int i2 = paramu.jdField_c_of_type_Int;
    int i3 = paramu.jdField_d_of_type_Int;
    paramu = paramu.jdField_a_of_type_A;
    a locala;
    if ((paramInt2 == 0) && (i1 != 4) && (i1 != 7) && (paramu != this.jdField_a_of_type_A) && (this.jdField_b_of_type_Byte > 0))
    {
      (locala = new a()).jdField_j_of_type_Int |= 0x4000;
      locala.a(4);
      locala.a(this.jdField_b_of_type_Byte, 1, 16);
      if (this.jdField_a_of_type_A.l >= 2) {
        locala.a(false);
      } else {
        locala.a(true);
      }
      paramu.c(locala);
    }
    if (i1 == 2)
    {
      paramu.a(10, 0, 16);
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, 1, 4);
      return;
    }
    if (i1 == 9) {
      return;
    }
    switch (i1)
    {
    case 0: 
      break;
    case 1: 
      if (this.jdField_h_of_type_Byte == 1) {
        t.d(2);
      }
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, 4, 0);
      break;
    case 3: 
      t.a(this.jdField_a_of_type_A.jdField_b_of_type_Int, this.jdField_a_of_type_A.jdField_c_of_type_Int, 2, 1);
      break;
    case 4: 
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, 5, 3);
      break;
    case 5: 
      t.a(this.jdField_a_of_type_A.jdField_b_of_type_Int, this.jdField_a_of_type_A.jdField_c_of_type_Int, 3, 2);
    }
    if (i2 < 0)
    {
      if ((paramu.jdField_j_of_type_Int & 0x40) == 0)
      {
        paramu.a(11, 0, 16);
        (locala = new a()).jdField_j_of_type_Int |= 0x800;
        locala.a(4);
        locala.a(9, 1, 0);
        paramu.b(locala);
        if (n.a(paramu.jdField_a_of_type_ArrayOfByte, 2) >= i3)
        {
          n.a(paramu.jdField_a_of_type_ArrayOfByte, 2, i3);
          paramu.jdField_h_of_type_Byte = 0;
        }
      }
    }
    else {
      n.a(paramu.jdField_a_of_type_ArrayOfByte, 2, i3);
    }
    int i4;
    if (i2 > 0) {
      i4 = 4;
    } else {
      i4 = 1;
    }
    if (i1 == 4) {
      i4 = 6;
    }
    if (paramInt2 == 0)
    {
      paramu.a(i2, 0 - this.jdField_c_of_type_Byte * 20 + (paramu == this.jdField_c_of_type_A ? 25 : 0), paramu.l > 1 ? 1 : 0, i4, this.jdField_c_of_type_Byte * -4 + 1);
      return;
    }
    if (paramInt2 == 1)
    {
      paramu.a(i2, 0 - ((this.jdField_c_of_type_Int != 4) && (this.jdField_c_of_type_Int != 3) && (this.jdField_c_of_type_Int != 0) ? 0 : paramInt1 * 20) + (paramu == this.jdField_c_of_type_A ? 25 : 0), paramu.l > 1 ? 1 : 0, i4, paramInt1 * (this.jdField_c_of_type_Int != 4 ? -4 : -7));
      return;
    }
    if (paramInt2 == 2) {
      paramu.a(i2, 0 - paramInt1 * 20 + (paramu == this.jdField_c_of_type_A ? 25 : 0), paramu.l > 1 ? 1 : 0, i4, paramInt1 * -4);
    }
  }
  
  private static void b(u paramu)
  {
    if (paramu.jdField_a_of_type_Int != 3) {
      return;
    }
    a locala1 = paramu.jdField_a_of_type_A;
    a locala2 = paramu.jdField_b_of_type_Int;
    a locala3 = paramu.jdField_c_of_type_Int;
    paramu = paramu.jdField_d_of_type_Int;
    a locala4;
    if ((locala3 >= 0) && (locala2 >= 0))
    {
      t.a(locala1.jdField_b_of_type_Int, locala1.jdField_c_of_type_Int, paramu, 3);
      locala1 = locala3;
      if ((locala4 = paramu = locala1).jdField_a_of_type_Au == null) {
        locala4.jdField_a_of_type_Au = new au(0);
      }
      (locala4 = new a()).jdField_j_of_type_Int |= 0x1000;
      locala4.jdField_a_of_type_Byte = ((byte)locala1);
      locala4.jdField_j_of_type_Int |= 0x2;
      if ((paramu.jdField_a_of_type_Au.jdField_a_of_type_Int > locala2) && (((a)paramu.jdField_a_of_type_Au.a(locala2)).jdField_a_of_type_Byte != -1))
      {
        paramu.jdField_a_of_type_Au.a(locala4, locala2);
        return;
      }
      paramu.jdField_a_of_type_Au.a(locala4);
      return;
    }
    if (locala2 == -2)
    {
      t.a(locala1.jdField_b_of_type_Int, locala1.jdField_c_of_type_Int, paramu, 3);
      return;
    }
    if ((locala4 == -1) || (locala4 == -2))
    {
      locala1 = locala2;
      if (((paramu = locala1).jdField_a_of_type_Au == null) || (paramu.jdField_a_of_type_Au.jdField_a_of_type_Int <= 0) || (locala1 >= paramu.jdField_a_of_type_Au.jdField_a_of_type_Int) || (locala1 < 0)) {
        return;
      }
      ((a)paramu.jdField_a_of_type_Au.a(locala1)).jdField_a_of_type_Byte = -1;
      ((a)paramu.jdField_a_of_type_Au.a(locala1)).jdField_j_of_type_Int &= 0xFFFFFFFD;
      paramu.jdField_a_of_type_Au.b(locala1);
    }
  }
  
  private void c(u paramu)
  {
    if (paramu.jdField_a_of_type_Int != 2) {
      return;
    }
    int i1 = paramu.jdField_b_of_type_Int;
    paramu = paramu.jdField_a_of_type_A;
    switch (i1)
    {
    case 1: 
      if (b(paramu))
      {
        paramu.jdField_j_of_type_Int |= 0x40;
        paramu.f();
        return;
      }
      paramu.jdField_j_of_type_Int |= 0x40;
      return;
    case 8: 
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, 21, 4);
      t.jdField_a_of_type_Array2dOfA[paramu.k][paramu.l].jdField_j_of_type_Byte = 2;
      return;
    case 9: 
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, 22, 4);
      return;
    case 12: 
      u localu2 = a(this.jdField_d_of_type_Au, paramu);
      u localu1 = a(this.jdField_c_of_type_Au, paramu);
      (paramu = paramu).a(0, 0, 16);
      int i3;
      int i2;
      if (localu1 != null)
      {
        i3 = localu1.jdField_c_of_type_Int;
        i2 = localu1.jdField_d_of_type_Int;
        n.a(paramu.jdField_a_of_type_ArrayOfByte, 2, i2);
        paramu.a(i3, 0, paramu.l > 1 ? 1 : 0, 4, -1);
      }
      if (localu2 != null)
      {
        i3 = localu2.jdField_c_of_type_Int;
        i2 = localu2.jdField_d_of_type_Int;
        n.a(paramu.jdField_a_of_type_ArrayOfByte, 3, i2);
        paramu.a(i3, 0, paramu.l > 1 ? 1 : 0, 2, -1);
      }
      if (paramu.jdField_a_of_type_Int == 61) {
        paramu.a(paramu.m);
      }
      if ((paramu.jdField_j_of_type_Int & 0x4) != 0) {
        paramu.b(paramu.p);
      }
      paramu.jdField_j_of_type_Int &= 0xFFFFFFBF;
      paramu.a(5, 0, 0);
      return;
    case 14: 
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, 18, 0);
      return;
    case 15: 
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, 19, 2);
      return;
    case 16: 
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, 20, 2);
      return;
    case 17: 
      this.jdField_d_of_type_A = t.jdField_a_of_type_Array2dOfA[this.jdField_b_of_type_A.k][this.jdField_b_of_type_A.l];
      this.jdField_d_of_type_A.jdField_j_of_type_Byte = 3;
    }
  }
  
  private static void d(u paramu)
  {
    if (paramu.jdField_a_of_type_Int != 5) {
      return;
    }
    int i1 = paramu.jdField_b_of_type_Int;
    int i2 = paramu.jdField_c_of_type_Int;
    int i3 = paramu.jdField_d_of_type_Int;
    paramu = paramu.jdField_a_of_type_A;
    if ((i1 != -1) && (i1 != -2))
    {
      t.a(paramu.jdField_b_of_type_Int, paramu.jdField_c_of_type_Int, i3, 3);
      i3 = paramu.l < 2 ? 1 : 0;
      i2 = i2;
      i1 = i1;
      paramu = paramu;
      if ((i1 < 0) || (i1 >= 76)) {
        return;
      }
      a locala;
      (locala = new a()).jdField_j_of_type_Int |= 0x2000;
      locala.a(4);
      locala.a(i1, 0, 0);
      locala.a(i3);
      switch (i2)
      {
      case 0: 
        break;
      case 1: 
        locala.jdField_a_of_type_J.jdField_d_of_type_Int |= 0x10;
        break;
      case 2: 
        locala.jdField_a_of_type_J.jdField_d_of_type_Int |= 0x80;
      }
      if (paramu.jdField_f_of_type_A != null) {
        paramu.jdField_f_of_type_A = null;
      }
      paramu.jdField_f_of_type_A = locala;
      return;
    }
    paramu = paramu;
    if (paramu.jdField_f_of_type_A != null) {
      paramu.jdField_f_of_type_A.jdField_j_of_type_Int &= 0xFFFFFFFD;
    }
  }
  
  private static void a(u paramu, int paramInt)
  {
    if (paramu.jdField_a_of_type_Int != 4) {
      return;
    }
    String str = paramu.jdField_a_of_type_JavaLangString;
    t.a((paramu = paramu.jdField_a_of_type_A).jdField_b_of_type_Int, paramu.jdField_c_of_type_Int - paramInt * 20, str, paramInt * -4);
  }
  
  private void a(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    int i2 = 0;
    int i3 = -1;
    Object localObject1;
    while (this.jdField_a_of_type_Au != null)
    {
      i3++;
      if (i3 >= this.jdField_a_of_type_Au.jdField_a_of_type_Int) {
        break;
      }
      if (((localObject1 = (u)this.jdField_a_of_type_Au.a(i3)).jdField_a_of_type_Int == 0) && (((u)localObject1).jdField_a_of_type_A != this.jdField_c_of_type_A)) {
        i2++;
      }
    }
    i3 = -1;
    while (this.jdField_a_of_type_ArrayOfU != null)
    {
      i3++;
      if (i3 >= this.jdField_a_of_type_ArrayOfU.length) {
        break;
      }
      if ((i1 > 0) && ((this.jdField_c_of_type_Int == 2) || (this.jdField_c_of_type_Int == 3))) {
        return;
      }
      (localObject1 = a.a()).jdField_j_of_type_Int |= 0x400;
      ((a)localObject1).a(4);
      ((a)localObject1).a(paramInt1, 0, this.jdField_c_of_type_Int == 3 ? 64 : 16);
      if (this.jdField_a_of_type_A.l >= 2) {
        ((a)localObject1).a(false);
      } else {
        ((a)localObject1).a(true);
      }
      int i4 = paramInt2 == 3 ? i2 : 0;
      Object localObject2;
      (localObject2 = ((a)localObject1).jdField_a_of_type_J).jdField_b_of_type_Byte = 0;
      ((j)localObject2).jdField_a_of_type_Byte = ((byte)i4);
      if (((this.jdField_a_of_type_Au.jdField_a_of_type_Int > 0) && (this.jdField_a_of_type_Au.a(this.jdField_a_of_type_ArrayOfU[i3]))) || ((this.jdField_a_of_type_ArrayOfU[i3].jdField_b_of_type_Int != 7) && (this.jdField_b_of_type_Au.jdField_a_of_type_Int > 0) && (this.jdField_b_of_type_Au.a(this.jdField_a_of_type_ArrayOfU[i3])))) {
        if (((this.jdField_a_of_type_ArrayOfU[i3].jdField_a_of_type_Int != 0) || ((this.jdField_a_of_type_ArrayOfU[i3].jdField_b_of_type_Int != 4) && (this.jdField_a_of_type_ArrayOfU[i3].jdField_b_of_type_Int != 7))) && ((this.jdField_a_of_type_ArrayOfU[i3].jdField_a_of_type_Int != 3) || (this.jdField_a_of_type_ArrayOfU[i3].jdField_c_of_type_Int != -1)) && ((this.jdField_a_of_type_ArrayOfU[i3].jdField_a_of_type_Int != 5) || (this.jdField_a_of_type_ArrayOfU[i3].jdField_b_of_type_Int != -1)) && ((this.jdField_a_of_type_ArrayOfU[i3].jdField_a_of_type_Int != 2) || (this.jdField_a_of_type_ArrayOfU[i3].jdField_b_of_type_Int != 1)) && (this.jdField_a_of_type_ArrayOfU[i3].jdField_a_of_type_A != this.jdField_c_of_type_A))
        {
          if (this.jdField_a_of_type_Byte == -1) {
            this.jdField_a_of_type_Byte = ((byte)i3);
          }
          Object localObject3 = localObject1;
          localObject1 = localObject2 = this.jdField_a_of_type_ArrayOfU[i3].jdField_a_of_type_A;
          for (localObject2 = ((a)localObject2).jdField_c_of_type_A; localObject2 != null; localObject2 = ((a)localObject2).jdField_c_of_type_A) {
            localObject1 = localObject2;
          }
          ((a)localObject1).jdField_c_of_type_A = ((a)localObject3);
          i1++;
        }
      }
    }
  }
  
  private static a a(a parama)
  {
    a locala = null;
    for (parama = parama.jdField_c_of_type_A; parama != null; parama = parama.jdField_c_of_type_A) {
      locala = parama;
    }
    return locala;
  }
  
  public final boolean a()
  {
    return (this.jdField_b_of_type_U != null) || (this.jdField_c_of_type_A != null);
  }
  
  private static u a(au paramau, a parama)
  {
    u localu;
    if ((paramau != null) && (parama != null))
    {
      localu = null;
      if (paramau.jdField_a_of_type_Int > 0) {}
    }
    else
    {
      return null;
    }
    int i1 = -1;
    for (;;)
    {
      i1++;
      if (i1 >= paramau.jdField_a_of_type_Int) {
        break;
      }
      if ((localu = (u)paramau.a(i1)).jdField_a_of_type_A.jdField_a_of_type_Long == parama.jdField_a_of_type_Long) {
        return localu;
      }
    }
    return null;
  }
  
  public w() {}
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramGraphics.setColor(139, 146, 146);
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, paramInt4);
    paramGraphics.setColor(81, 88, 88);
    paramGraphics.drawLine(paramInt1, paramInt2 + paramInt4 + 1, paramInt1 + paramInt3, paramInt2 + paramInt4 + 1);
    f.a(paramGraphics, e.a(7), paramInt1, paramInt2 + 2, 0, 0, 34, 23, 0);
    f.a(paramGraphics, e.a(7), paramInt1 + paramInt3 - 35, paramInt2 + 2, 0, 0, 34, 23, 2);
    paramGraphics.setColor(0);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3)
  {
    paramGraphics.setColor(158, 127, 103);
    paramGraphics.fillRect(paramInt1, paramInt2, paramInt3, 30);
    f.a(paramGraphics, e.a(14), 0, paramInt2, 145, 0, 32, 30, 0);
    f.a(paramGraphics, e.a(14), paramInt3 - 32, paramInt2, 145, 0, 32, 30, 2);
    paramGraphics.setColor(76, 77, 78);
    paramGraphics.setColor(0);
    paramGraphics.drawLine(paramInt1, paramInt2, paramInt1 + paramInt3, paramInt2);
    paramGraphics.drawLine(paramInt1, paramInt2 + 29, paramInt1 + paramInt3, paramInt2 + 29);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, String paramString, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      f.a(paramGraphics, e.a(7), paramInt1 + 12, paramInt2 + 3, 41, 0, 26, 18, 0);
      f.a(paramGraphics, e.a(7), paramInt1 + paramInt3 - 35, paramInt2 + 3, 41, 0, 26, 18, 2);
    }
    f.a(paramGraphics, e.a(7), paramInt1 + 42, paramInt2, 34, 0, 7, 24, 0);
    f.a(paramGraphics, e.a(7), paramInt1 + paramInt3 - 48, paramInt2, 34, 0, 7, 24, 2);
    if (bg.jdField_b_of_type_Byte > 21)
    {
      paramGraphics.setColor(4414582);
      paramBoolean = paramInt1 + 49;
      i1 = paramInt2 + (bb.jdField_c_of_type_Byte - 24) / 2 + 1;
      paramGraphics.fillRect(paramBoolean, i1, paramInt3 - 96, 20);
      paramGraphics.setColor(6003415);
      paramGraphics.drawLine(paramBoolean, i1 - 1, paramBoolean + paramInt3 - 96, i1 - 1);
      paramGraphics.drawLine(paramBoolean, i1 + 20, paramBoolean + paramInt3 - 96, i1 + 20);
      paramGraphics.setColor(0);
      paramGraphics.drawLine(paramBoolean, i1 - 2, paramBoolean + paramInt3 - 96, i1 - 2);
      paramGraphics.drawLine(paramBoolean, i1 + 21, paramBoolean + paramInt3 - 96, i1 + 21);
      ae.a(paramGraphics, paramInt1 + paramInt3 / 2 + 2, paramInt2, paramString, 16761897, 0, 17);
      paramGraphics.setColor(0);
      return;
    }
    paramGraphics.setColor(4414582);
    paramBoolean = paramInt1 + 49;
    int i1 = paramInt2 + (bb.jdField_c_of_type_Byte - 24) / 2 + 1;
    paramGraphics.fillRect(paramBoolean, i1, 63, 20);
    paramGraphics.setColor(6003415);
    paramGraphics.drawLine(paramBoolean, i1 - 1, paramBoolean + true, i1 - 1);
    paramGraphics.drawLine(paramBoolean, i1 + 20, paramBoolean + true, i1 + 20);
    paramGraphics.setColor(0);
    paramGraphics.drawLine(paramBoolean, i1 - 2, paramBoolean + true, i1 - 2);
    paramGraphics.drawLine(paramBoolean, i1 + 21, paramBoolean + true, i1 + 21);
    ae.a(paramGraphics, paramInt1 + paramInt3 / 2 + 2, paramInt2 + (24 - bg.jdField_b_of_type_Byte >> 1), paramString, 16761897, 0, 17);
    paramGraphics.setColor(0);
  }
  
  public static void a(Graphics paramGraphics, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    int i1 = paramGraphics.getColor();
    switch (paramInt1)
    {
    case 0: 
      paramGraphics.setColor(76, 77, 78);
      paramGraphics.fillRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      paramGraphics.setColor(3746862);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 - 1, paramInt3 + paramInt5 - 2, paramInt4 - 1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + paramInt6, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3, paramInt4 + 1, paramInt3, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 1, paramInt4 + 1, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6 - 1);
      paramGraphics.setColor(152, 215, 240);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3 + paramInt5, paramInt4);
      paramGraphics.drawLine(paramInt3, paramInt4 + 1, paramInt3 + paramInt5, paramInt4 + 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 - 1, paramInt3 + paramInt5, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 - 2, paramInt3 + paramInt5, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4, paramInt3 + 1, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + 2, paramInt4, paramInt3 + 2, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 2, paramInt4, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 3, paramInt4, paramInt3 + paramInt5 - 3, paramInt4 + paramInt6);
      paramGraphics.setColor(3746862);
      paramGraphics.drawLine(paramInt3, paramInt4 + 2, paramInt3 + paramInt5, paramInt4 + 2);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 - 3, paramInt3 + paramInt5, paramInt4 + paramInt6 - 3);
      paramGraphics.drawLine(paramInt3 + 3, paramInt4, paramInt3 + 3, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 4, paramInt4, paramInt3 + paramInt5 - 4, paramInt4 + paramInt6);
      f.a(paramGraphics, e.a(0), paramInt3, paramInt4 - 1, 101, 12, 8, 8, 0);
      f.a(paramGraphics, e.a(0), paramInt3, paramInt4 + paramInt6 - 7, 109, 12, 8, 8, 0);
      f.a(paramGraphics, e.a(0), paramInt3 + paramInt5 - 8, paramInt4 - 1, 100, 12, 9, 8, 2);
      f.a(paramGraphics, e.a(0), paramInt3 + paramInt5 - 8, paramInt4 + paramInt6 - 7, 108, 12, 9, 8, 2);
      break;
    case 1: 
      if (paramInt2 == 0) {
        paramGraphics.setColor(6003415);
      } else {
        paramGraphics.setColor(paramInt2);
      }
      paramGraphics.fillRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      paramGraphics.setColor(7255260);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      paramGraphics.setColor(0);
      paramGraphics.drawRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      break;
    case 2: 
      break;
    case 3: 
      paramGraphics.setColor(paramInt2);
      paramGraphics.drawRect(paramInt3, paramInt4, paramInt5 - 1, paramInt6 - 1);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 3, paramInt6 - 3);
      break;
    case 4: 
      paramGraphics.setColor(paramInt2);
      paramGraphics.drawRect(paramInt3, paramInt4, paramInt5 - 1, paramInt6 - 1);
      break;
    case 5: 
      paramGraphics.setColor(9147026);
      paramGraphics.fillRect(paramInt3 + 3, paramInt4 + 2, paramInt5 - 6, paramInt6 - 4);
      paramGraphics.setColor(11319479);
      paramGraphics.drawLine(paramInt3 + 2, paramInt4 + 1, paramInt3 + paramInt5 - 3, paramInt4 + 1);
      paramGraphics.drawLine(paramInt3 + 2, paramInt4 + 1, paramInt3 + 2, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + 2, paramInt4 + paramInt6 - 2, paramInt3 + paramInt5 - 3, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 3, paramInt4 + 1, paramInt3 + paramInt5 - 3, paramInt4 + paramInt6 - 2);
      paramGraphics.setColor(3357242);
      paramGraphics.drawLine(paramInt3 + 2, paramInt4, paramInt3 + paramInt5 - 3, paramInt4);
      paramGraphics.drawLine(paramInt3 + 2, paramInt4 + paramInt6 - 1, paramInt3 + paramInt5 - 3, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + 1, paramInt3 + 1, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 2, paramInt4 + 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 2);
      break;
    case 6: 
      paramGraphics.setColor(paramInt2);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      break;
    case 7: 
      paramGraphics.setColor(paramInt2);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 - 2, paramInt3 + paramInt5, paramInt4 + paramInt6 - 2);
      break;
    case 8: 
      paramGraphics.setColor(74, 74, 48);
      paramGraphics.fillRoundRect(paramInt3, paramInt4, paramInt5 - 1, paramInt6 - 1, 3, 3);
      paramGraphics.setColor(139, 138, 95);
      paramGraphics.drawRoundRect(paramInt3, paramInt4, paramInt5 - 2, paramInt6 - 1, 3, 3);
      break;
    case 9: 
      paramGraphics.setColor(7296868);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(14343122);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3 + paramInt5, paramInt4);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6, paramInt3 + paramInt5, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5, paramInt4, paramInt3 + paramInt5, paramInt4 + paramInt6);
      paramGraphics.setColor(9005947);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 4, paramInt6 - 2);
      break;
    case 10: 
      paramGraphics.setColor(7296868);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(0);
      paramGraphics.drawRoundRect(paramInt3, paramInt4, paramInt5 - 2, paramInt6, 3, 3);
      paramGraphics.setColor(9005947);
      paramGraphics.drawRoundRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 4, paramInt6 - 2, 3, 3);
      paramGraphics.setColor(4929602);
      paramGraphics.fillRect(paramInt3 + 7, paramInt4 + 7, paramInt5 - 14, paramInt6 - 14);
      paramGraphics.setColor(9005947);
      paramGraphics.drawRoundRect(paramInt3 + 7, paramInt4 + 7, paramInt5 - 14, paramInt6 - 14, 3, 3);
      break;
    case 11: 
      paramGraphics.setColor(0);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(11643029);
      paramGraphics.fillRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      paramGraphics.setColor(10459016);
      paramGraphics.fillRect(paramInt3 + 2, paramInt4 + 2, paramInt5 - 4, paramInt6 - 4);
      break;
    case 12: 
      paramGraphics.setColor(76, 86, 51);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(157, 163, 129);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      paramGraphics.setColor(81, 80, 50);
      paramGraphics.drawRect(paramInt3, paramInt4, paramInt5, paramInt6);
      break;
    case 13: 
      paramGraphics.setColor(120, 130, 80);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(paramInt2);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      break;
    case 14: 
      paramGraphics.setColor(11643029);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 2, paramInt4 - 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5, paramInt4 - 1, paramInt3 + paramInt5, paramInt4 + paramInt6);
      paramGraphics.setColor(10459016);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 1, paramInt4 - 2, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6);
      break;
    case 15: 
      if (paramInt2 == 0) {
        paramGraphics.setColor(4929602);
      } else {
        paramGraphics.setColor(paramInt2);
      }
      paramGraphics.fillRect(paramInt3 + 5, paramInt4, paramInt5 - 10, paramInt6 - 1);
      break;
    case 16: 
      if (paramInt2 == -1) {
        paramGraphics.setColor(12106654);
      } else {
        paramGraphics.setColor(paramInt2);
      }
      paramGraphics.fillRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      break;
    case 17: 
      f.a(paramGraphics, e.a(33), paramInt3, paramInt4, 9, 0, 11, 22, 0);
      f.a(paramGraphics, e.a(33), paramInt3 + paramInt5 - 11, paramInt4, 9, 0, 11, 22, 2);
      paramInt1 = -1;
      for (;;)
      {
        paramInt1++;
        if (paramInt1 >= paramInt5 - 22) {
          break;
        }
        f.a(paramGraphics, e.a(33), paramInt3 + 11 + paramInt1, paramInt4, 19, 0, 1, 22, 2);
      }
      break;
    case 18: 
      if (paramInt2 == -1) {
        paramGraphics.setColor(4088712);
      } else {
        paramGraphics.setColor(paramInt2);
      }
      paramGraphics.fillRect(paramInt3 + 1, paramInt4 + 1, paramInt5, paramInt6 - 2);
      paramGraphics.setColor(7255260);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      paramGraphics.setColor(0);
      paramGraphics.drawRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      break;
    case 19: 
      paramGraphics.setColor(15328734);
      paramGraphics.fillRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      paramGraphics.setColor(0);
      paramGraphics.drawRoundRect(paramInt3, paramInt4, paramInt5 - 1, paramInt6 - 1, 3, 3);
      paramGraphics.setColor(11512474);
      paramGraphics.drawRect(paramInt3 + 2, paramInt4 + 2, paramInt5 - 5, paramInt6 - 5);
      paramGraphics.drawRect(paramInt3 + 3, paramInt4 + 3, paramInt5 - 7, paramInt6 - 7);
      break;
    case 20: 
      if (bg.jdField_b_of_type_Byte > 21) {
        paramInt6 += (paramInt6 << 1) / 10;
      }
      paramGraphics.setColor(0);
      paramGraphics.drawRoundRect(paramInt3, paramInt4, paramInt5 - 1, paramInt6, 3, 3);
      paramGraphics.setColor(5601693);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 3, paramInt6 - 2);
      paramGraphics.setColor(0);
      paramGraphics.drawRect(paramInt3 + 2, paramInt4 + 2, paramInt5 - 5, paramInt6 - 4);
      paramGraphics.setColor(5601693);
      paramGraphics.fillRect(paramInt3 + 3, paramInt4 + 3, paramInt5 - 6, paramInt6 - 5);
      paramGraphics.setColor(-1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + 1, paramInt3 + 8, paramInt4 + 1);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 9, paramInt4 + 1, paramInt3 + paramInt5 - 2, paramInt4 + 1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + paramInt6 - 1, paramInt3 + 8, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 9, paramInt4 + paramInt6 - 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + 1, paramInt3 + 1, paramInt4 + 8);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 2, paramInt4 + 9, paramInt3 + paramInt5 - 2, paramInt4 + 2);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + paramInt6 - 1, paramInt3 + 1, paramInt4 + paramInt6 - 8);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 9, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 2);
      break;
    case 21: 
      paramInt3 += 2;
      paramGraphics.setColor(4088712);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(0);
      paramGraphics.drawRect(paramInt3, paramInt4, paramInt5 - 1, paramInt6);
      paramGraphics.setColor(7255260);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 3, paramInt6 - 2);
      break;
    case 22: 
      paramInt3 += 2;
      paramGraphics.setColor(6003415);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(0);
      paramGraphics.drawRect(paramInt3, paramInt4, paramInt5 - 1, paramInt6);
      paramGraphics.setColor(10866928);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 3, paramInt6 - 2);
      paramGraphics.setColor(-1);
      paramGraphics.drawRoundRect(paramInt3 - 1, paramInt4 - 1, paramInt5 + 1, paramInt6 + 2, 3, 3);
      break;
    case 23: 
      paramGraphics.setColor(paramInt2);
      paramGraphics.fillRect(paramInt3 + 3, paramInt4 + 3, paramInt5 - 6, paramInt6 - 6);
      f.a(paramGraphics, e.a(7), paramInt3, paramInt4, 130, 0, 24, 24, 0);
      break;
    case 24: 
      paramGraphics.setColor(paramInt2);
      if (d.jdField_a_of_type_Int > 240)
      {
        paramInt1 = d.jdField_a_of_type_Int / 240;
        paramInt1++;
        for (paramInt2 = 0; paramInt2 < paramInt1; paramInt2++) {
          if (paramInt2 % 2 == 0) {
            f.a(paramGraphics, e.a(35), paramInt3 + paramInt2 * 240, paramInt4, 0, 0, 240, 143, 0);
          } else {
            f.a(paramGraphics, e.a(35), paramInt3 + paramInt2 * 240, paramInt4, 0, 0, 240, 143, 2);
          }
        }
      }
      else
      {
        f.a(paramGraphics, e.a(35), paramInt3, paramInt4, 0, 0, 240, 143, 0);
      }
      break;
    case 25: 
      paramInt4 -= 4;
      paramGraphics.setColor(158, 127, 103);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, 30);
      paramInt1 = bg.jdField_b_of_type_Byte;
      paramInt1 += 4;
      paramInt2 = bg.jdField_a_of_type_JavaxMicroeditionLcduiFont.stringWidth("输入角色昵称") + (bg.jdField_a_of_type_Byte << 2);
      f.a(paramGraphics, e.a(14), 0, paramInt4, 145, 0, 32, 30, 0);
      f.a(paramGraphics, e.a(14), paramInt5 - 32, paramInt4, 145, 0, 32, 30, 2);
      paramGraphics.setColor(76, 77, 78);
      paramGraphics.fillRoundRect(d.jdField_a_of_type_Int - paramInt2 >> 1, paramInt4 + (paramInt6 - paramInt1 >> 1) - 1, paramInt2, paramInt1, 4, 4);
      paramGraphics.setColor(0);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3 + paramInt5, paramInt4);
      paramGraphics.drawLine(paramInt3, paramInt4 + 29, paramInt3 + paramInt5, paramInt4 + 29);
      break;
    case 26: 
      paramGraphics.setColor(76, 77, 78);
      paramGraphics.fillRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      paramGraphics.setColor(3746862);
      paramGraphics.drawLine(paramInt3, paramInt4 - 1, paramInt3 + paramInt5, paramInt4 - 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6, paramInt3 + paramInt5, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 1, paramInt4, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6);
      paramGraphics.setColor(152, 215, 240);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3 + paramInt5, paramInt4);
      paramGraphics.drawLine(paramInt3, paramInt4 + 1, paramInt3 + paramInt5, paramInt4 + 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 - 1, paramInt3 + paramInt5, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 - 2, paramInt3 + paramInt5, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4, paramInt3 + 1, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + 2, paramInt4, paramInt3 + 2, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 2, paramInt4, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 3, paramInt4, paramInt3 + paramInt5 - 3, paramInt4 + paramInt6);
      paramGraphics.setColor(3746862);
      paramGraphics.drawLine(paramInt3, paramInt4 + 2, paramInt3 + paramInt5, paramInt4 + 2);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 - 3, paramInt3 + paramInt5, paramInt4 + paramInt6 - 3);
      paramGraphics.drawLine(paramInt3 + 3, paramInt4, paramInt3 + 3, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 4, paramInt4, paramInt3 + paramInt5 - 4, paramInt4 + paramInt6);
      f.a(paramGraphics, e.a(0), paramInt3 - 1, paramInt4 - 1, 100, 12, 9, 8, 0);
      f.a(paramGraphics, e.a(0), paramInt3 - 1, paramInt4 + paramInt6 - 7, 108, 12, 9, 8, 0);
      f.a(paramGraphics, e.a(0), paramInt3 + paramInt5 - 8, paramInt4 - 1, 100, 12, 9, 8, 2);
      f.a(paramGraphics, e.a(0), paramInt3 + paramInt5 - 8, paramInt4 + paramInt6 - 7, 108, 12, 9, 8, 2);
      paramGraphics.setColor(3746862);
      paramGraphics.drawLine(paramInt3, paramInt4 - 1, paramInt3 + paramInt5, paramInt4 - 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6, paramInt3 + paramInt5, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 1, paramInt4, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6);
      break;
    case 27: 
      paramGraphics.setColor(7236463);
      paramGraphics.fillRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      paramGraphics.setColor(0);
      paramGraphics.drawLine(paramInt3, paramInt4 - 1, paramInt3 + paramInt5 - 1, paramInt4 - 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 + 1, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6 + 1);
      paramGraphics.drawLine(paramInt3 - 1, paramInt4, paramInt3 - 1, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5, paramInt4, paramInt3 + paramInt5, paramInt4 + paramInt6);
      paramGraphics.setColor(152, 215, 240);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3 + paramInt5 - 1, paramInt4);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 1, paramInt4, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6);
      paramGraphics.setColor(0);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + 1, paramInt3 + paramInt5 - 2, paramInt4 + 1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + paramInt6 - 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + 1, paramInt3 + 1, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 2, paramInt4 + 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 2);
      break;
    case 28: 
      paramGraphics.setColor(5065038);
      paramGraphics.fillRoundRect(paramInt3, paramInt4, paramInt5, paramInt6, 3, 3);
      paramGraphics.setColor(0);
      paramGraphics.drawLine(paramInt3, paramInt4 - 1, paramInt3 + paramInt5 - 1, paramInt4 - 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6 + 1, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6 + 1);
      paramGraphics.drawLine(paramInt3 - 1, paramInt4, paramInt3 - 1, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5, paramInt4, paramInt3 + paramInt5, paramInt4 + paramInt6);
      paramGraphics.setColor(7236463);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3 + paramInt5 - 1, paramInt4);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3, paramInt4, paramInt3, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 1, paramInt4, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6);
      paramGraphics.setColor(0);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + 1, paramInt3 + paramInt5 - 2, paramInt4 + 1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + paramInt6 - 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + 1, paramInt3 + 1, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 2, paramInt4 + 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 2);
      break;
    case 29: 
      paramGraphics.setColor(3746866);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(10255471);
      paramGraphics.fillRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      paramGraphics.setColor(8546142);
      paramGraphics.fillRect(paramInt3 + 2, paramInt4 + 2, paramInt5 - 3, paramInt6 - 3);
      break;
    case 30: 
      paramGraphics.setColor(3746866);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(6508357);
      paramGraphics.fillRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      paramGraphics.setColor(10016752);
      paramGraphics.drawLine(paramInt3, paramInt4 - 1, paramInt3 + paramInt5 - 1, paramInt4 - 1);
      paramGraphics.drawLine(paramInt3, paramInt4 + paramInt6, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6);
      paramGraphics.drawLine(paramInt3 - 1, paramInt4, paramInt3 - 1, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + paramInt5, paramInt4, paramInt3 + paramInt5, paramInt4 + paramInt6 - 1);
      break;
    case 31: 
      paramGraphics.setColor(15789801);
      paramGraphics.fillRect(paramInt3, paramInt4, paramInt5, paramInt6);
      paramGraphics.setColor(13881804);
      paramGraphics.drawRect(paramInt3, paramInt4, paramInt5 - 1, paramInt6);
      break;
    case 32: 
      paramGraphics.setColor(8418927);
      paramGraphics.fillRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      paramGraphics.setColor(0);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4, paramInt3 + paramInt5 - 2, paramInt4);
      paramGraphics.drawLine(paramInt3, paramInt4 + 1, paramInt3, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + paramInt6 - 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 1, paramInt4 + 1, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6 - 2);
      paramGraphics.setColor(10016752);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 3, paramInt6 - 3);
      paramGraphics.setColor(0);
      paramGraphics.drawRect(paramInt3 + 2, paramInt4 + 2, paramInt5 - 5, paramInt6 - 5);
      paramGraphics.setColor(13881804);
      paramGraphics.drawRect(paramInt3 + 3, paramInt4 + 3, paramInt5 - 7, paramInt6 - 7);
      break;
    case 33: 
      paramGraphics.setColor(13083766);
      paramGraphics.fillRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 2, paramInt6 - 2);
      paramGraphics.setColor(0);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4, paramInt3 + paramInt5 - 2, paramInt4);
      paramGraphics.drawLine(paramInt3, paramInt4 + 1, paramInt3, paramInt4 + paramInt6 - 2);
      paramGraphics.drawLine(paramInt3 + 1, paramInt4 + paramInt6 - 1, paramInt3 + paramInt5 - 2, paramInt4 + paramInt6 - 1);
      paramGraphics.drawLine(paramInt3 + paramInt5 - 1, paramInt4 + 1, paramInt3 + paramInt5 - 1, paramInt4 + paramInt6 - 2);
      paramGraphics.setColor(10016752);
      paramGraphics.drawRect(paramInt3 + 1, paramInt4 + 1, paramInt5 - 3, paramInt6 - 3);
      paramGraphics.setColor(0);
      paramGraphics.drawRect(paramInt3 + 2, paramInt4 + 2, paramInt5 - 5, paramInt6 - 5);
      paramGraphics.setColor(13881804);
      paramGraphics.drawRect(paramInt3 + 3, paramInt4 + 3, paramInt5 - 7, paramInt6 - 7);
    }
    paramGraphics.setColor(i1);
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\w.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */