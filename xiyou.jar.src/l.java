import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Hashtable;

public final class l
{
  private Hashtable jdField_a_of_type_JavaUtilHashtable = null;
  public int a;
  private String[] jdField_a_of_type_ArrayOfJavaLangString = null;
  private int[] jdField_a_of_type_ArrayOfInt = null;
  private Reader jdField_a_of_type_JavaIoReader = null;
  private char[] jdField_a_of_type_ArrayOfChar = null;
  private int jdField_d_of_type_Int = 0;
  private int e = 0;
  private int f = 0;
  private int g = 0;
  private char[] jdField_b_of_type_ArrayOfChar = null;
  private int h = 0;
  public int b;
  private boolean jdField_a_of_type_Boolean = false;
  private String jdField_b_of_type_JavaLangString = null;
  private String jdField_c_of_type_JavaLangString = null;
  public String a;
  private boolean jdField_b_of_type_Boolean = false;
  public int c;
  private String[] jdField_b_of_type_ArrayOfJavaLangString = null;
  private int i = 0;
  private int[] jdField_b_of_type_ArrayOfInt = null;
  private int j = 0;
  private boolean jdField_c_of_type_Boolean = false;
  private boolean jdField_d_of_type_Boolean = false;
  private static String[] jdField_c_of_type_ArrayOfJavaLangString = { "START_DOCUMENT", "END_DOCUMENT", "START_TAG", "END_TAG", "TEXT", "CDSECT", "ENTITY_REF", "IGNORABLE_WHITESPACE", "PROCESSING_INSTRUCTION", "COMMENT", "DOCDECL" };
  
  public l()
  {
    this.jdField_a_of_type_Int = 0;
    this.jdField_b_of_type_Int = 0;
    this.jdField_a_of_type_JavaLangString = null;
    this.jdField_c_of_type_Int = 0;
  }
  
  private static String[] a(String[] paramArrayOfString, int paramInt)
  {
    if (paramArrayOfString.length >= paramInt) {
      return paramArrayOfString;
    }
    paramInt = new String[paramInt + 16];
    System.arraycopy(paramArrayOfString, 0, paramInt, 0, paramArrayOfString.length);
    return paramInt;
  }
  
  private final void a(String paramString)
  {
    throw new m(paramString.length() >= 100 ? paramString.substring(0, 100) + "\n" : paramString, this, null);
  }
  
  private final void a()
  {
    if (this.jdField_a_of_type_JavaIoReader == null) {
      a("No Input specified");
    }
    if (this.jdField_b_of_type_Int == 3) {
      this.jdField_a_of_type_Int -= 1;
    }
    do
    {
      this.jdField_c_of_type_Int = -1;
      if (this.jdField_b_of_type_Boolean)
      {
        this.jdField_b_of_type_Boolean = false;
        this.jdField_b_of_type_Int = 3;
        return;
      }
      this.jdField_c_of_type_JavaLangString = null;
      this.jdField_a_of_type_JavaLangString = null;
      this.jdField_b_of_type_JavaLangString = null;
      this.jdField_b_of_type_Int = b();
      switch (this.jdField_b_of_type_Int)
      {
      case 6: 
        b();
        return;
      case 2: 
        b(false);
        return;
      case 3: 
        l locall = this;
        c();
        locall.c();
        locall.jdField_a_of_type_JavaLangString = locall.d();
        locall.c();
        locall.a('>');
        int k = locall.jdField_a_of_type_Int - 1 << 2;
        if (locall.jdField_a_of_type_Int == 0)
        {
          locall.a("element stack empty");
          locall.jdField_b_of_type_Int = 9;
          return;
        }
        if (!locall.jdField_a_of_type_JavaLangString.equals(locall.jdField_a_of_type_ArrayOfJavaLangString[(k + 3)]))
        {
          locall.a("expected: /" + locall.jdField_a_of_type_ArrayOfJavaLangString[(k + 3)] + " read: " + locall.jdField_a_of_type_JavaLangString);
          for (int m = k; (m >= 0) && (!locall.jdField_a_of_type_JavaLangString.toLowerCase().equals(locall.jdField_a_of_type_ArrayOfJavaLangString[(m + 3)].toLowerCase())); m -= 4) {
            locall.i += 1;
          }
          if (m < 0)
          {
            locall.i = 0;
            locall.jdField_b_of_type_Int = 9;
            return;
          }
        }
        locall.jdField_b_of_type_JavaLangString = locall.jdField_a_of_type_ArrayOfJavaLangString[k];
        locall.jdField_c_of_type_JavaLangString = locall.jdField_a_of_type_ArrayOfJavaLangString[(k + 1)];
        locall.jdField_a_of_type_JavaLangString = locall.jdField_a_of_type_ArrayOfJavaLangString[(k + 2)];
        return;
      case 1: 
        return;
      case 4: 
        b(60);
        if ((this.jdField_a_of_type_Int == 0) && (this.jdField_a_of_type_Boolean)) {
          this.jdField_b_of_type_Int = 7;
        }
        return;
      }
      this.jdField_b_of_type_Int = a(false);
    } while (this.jdField_b_of_type_Int == 998);
  }
  
  private final int a(boolean paramBoolean)
  {
    String str = "";
    int k = 0;
    c();
    int m;
    int n;
    if ((m = c()) == 63)
    {
      if (((a(0) == 120) || (a(0) == 88)) && ((a(1) == 109) || (a(1) == 77)))
      {
        c();
        c();
        if (((a(0) == 108) || (a(0) == 76)) && (a(1) <= 32))
        {
          if ((this.f != 1) || (this.g > 4)) {
            a("PI must not start with xml");
          }
          b(true);
          if ((this.jdField_c_of_type_Int <= 0) || (!"version".equals(this.jdField_b_of_type_ArrayOfJavaLangString[2]))) {
            a("version expected");
          }
          i1 = 1;
          if ((1 < this.jdField_c_of_type_Int) && ("encoding".equals(this.jdField_b_of_type_ArrayOfJavaLangString[6]))) {
            i1++;
          }
          if ((i1 < this.jdField_c_of_type_Int) && ("standalone".equals(this.jdField_b_of_type_ArrayOfJavaLangString[((i1 << 2) + 2)])))
          {
            paramBoolean = this.jdField_b_of_type_ArrayOfJavaLangString[(3 + (i1 << 2))];
            if ("yes".equals(paramBoolean)) {
              new Boolean(true);
            } else if ("no".equals(paramBoolean)) {
              new Boolean(false);
            } else {
              a("illegal standalone value: " + paramBoolean);
            }
            i1++;
          }
          if (i1 != this.jdField_c_of_type_Int) {
            a("illegal xmldecl");
          }
          this.jdField_a_of_type_Boolean = true;
          this.h = 0;
          return 998;
        }
      }
      m = 63;
      n = 8;
    }
    else if (m == 33)
    {
      if (a(0) == 45)
      {
        n = 9;
        str = "--";
        m = 45;
      }
      else if (a(0) == 91)
      {
        n = 5;
        str = "[CDATA[";
        m = 93;
        paramBoolean = true;
      }
      else
      {
        n = 10;
        str = "DOCTYPE";
        m = -1;
      }
    }
    else
    {
      a("illegal: <" + m);
      return 9;
    }
    for (int i1 = 0; i1 < str.length(); i1++) {
      a(str.charAt(i1));
    }
    if (n == 10)
    {
      a(paramBoolean);
    }
    else
    {
      for (;;)
      {
        if ((i1 = c()) == -1)
        {
          a("Unexpected EOF");
          return 9;
        }
        if (paramBoolean) {
          a(i1);
        }
        if (((m == 63) || (i1 == m)) && (a(0) == m) && (a(1) == 62)) {
          break;
        }
        k = i1;
      }
      if ((m == 45) && (k == 45)) {
        a("illegal comment delimiter: --->");
      }
      c();
      c();
      if ((paramBoolean) && (m != 63)) {
        this.h -= 1;
      }
    }
    return n;
  }
  
  private final void a(boolean paramBoolean)
  {
    int k = 1;
    int m = 0;
    for (;;)
    {
      int n;
      switch (n = c())
      {
      case -1: 
        a("Unexpected EOF");
        return;
      case 39: 
        m = m == 0 ? 1 : 0;
        break;
      case 60: 
        if (m == 0) {
          k++;
        }
        break;
      case 62: 
        if (m == 0)
        {
          k--;
          if (k == 0) {
            return;
          }
        }
        break;
      }
      if (paramBoolean) {
        a(n);
      }
    }
  }
  
  private final int b()
  {
    switch (a(0))
    {
    case -1: 
      return 1;
    case 38: 
      return 6;
    case 60: 
      switch (a(1))
      {
      case 47: 
        return 3;
      case 33: 
      case 63: 
        return 999;
      }
      return 2;
    }
    return 4;
  }
  
  private final String c(int paramInt)
  {
    return new String(this.jdField_b_of_type_ArrayOfChar, paramInt, this.h - paramInt);
  }
  
  private final void a(int paramInt)
  {
    this.jdField_a_of_type_Boolean &= paramInt <= 32;
    if (this.h == this.jdField_b_of_type_ArrayOfChar.length)
    {
      char[] arrayOfChar = new char[(this.h << 2) / 3 + 4];
      System.arraycopy(this.jdField_b_of_type_ArrayOfChar, 0, arrayOfChar, 0, this.h);
      this.jdField_b_of_type_ArrayOfChar = arrayOfChar;
    }
    this.jdField_b_of_type_ArrayOfChar[(this.h++)] = ((char)paramInt);
  }
  
  private final void b(boolean paramBoolean)
  {
    if (!paramBoolean) {
      c();
    }
    this.jdField_a_of_type_JavaLangString = d();
    this.jdField_c_of_type_Int = 0;
    for (;;)
    {
      c();
      k = a(0);
      if (paramBoolean)
      {
        if (k == 63)
        {
          c();
          a('>');
        }
      }
      else
      {
        if (k == 47)
        {
          this.jdField_b_of_type_Boolean = true;
          c();
          c();
          a('>');
          break;
        }
        if ((k == 62) && (!paramBoolean))
        {
          c();
          break;
        }
      }
      if (k == -1)
      {
        a("Unexpected EOF");
        return;
      }
      String str;
      if ((str = d()).length() == 0)
      {
        a("attr name expected");
        break;
      }
      k = this.jdField_c_of_type_Int++ << 2;
      this.jdField_b_of_type_ArrayOfJavaLangString = a(this.jdField_b_of_type_ArrayOfJavaLangString, k + 4);
      this.jdField_b_of_type_ArrayOfJavaLangString[(k++)] = "";
      this.jdField_b_of_type_ArrayOfJavaLangString[(k++)] = null;
      this.jdField_b_of_type_ArrayOfJavaLangString[(k++)] = str;
      c();
      if (a(0) != 61)
      {
        a("Attr.value missing f. " + str);
        this.jdField_b_of_type_ArrayOfJavaLangString[k] = "1";
      }
      else
      {
        a('=');
        c();
        int m;
        if (((m = a(0)) != 39) && (m != 34))
        {
          a("attr value delimiter missing!");
          m = 32;
        }
        else
        {
          c();
        }
        int n = this.h;
        b(m);
        this.jdField_b_of_type_ArrayOfJavaLangString[k] = c(n);
        this.h = n;
        if (m != 32) {
          c();
        }
      }
    }
    int k = this.jdField_a_of_type_Int++ << 2;
    this.jdField_a_of_type_ArrayOfJavaLangString = a(this.jdField_a_of_type_ArrayOfJavaLangString, k + 4);
    this.jdField_a_of_type_ArrayOfJavaLangString[(k + 3)] = this.jdField_a_of_type_JavaLangString;
    if (this.jdField_a_of_type_Int >= this.jdField_a_of_type_ArrayOfInt.length)
    {
      int[] arrayOfInt = new int[this.jdField_a_of_type_Int + 4];
      System.arraycopy(this.jdField_a_of_type_ArrayOfInt, 0, arrayOfInt, 0, this.jdField_a_of_type_ArrayOfInt.length);
      this.jdField_a_of_type_ArrayOfInt = arrayOfInt;
    }
    this.jdField_a_of_type_ArrayOfInt[this.jdField_a_of_type_Int] = this.jdField_a_of_type_ArrayOfInt[(this.jdField_a_of_type_Int - 1)];
    this.jdField_b_of_type_JavaLangString = "";
    this.jdField_a_of_type_ArrayOfJavaLangString[k] = this.jdField_b_of_type_JavaLangString;
    this.jdField_a_of_type_ArrayOfJavaLangString[(k + 1)] = this.jdField_c_of_type_JavaLangString;
    this.jdField_a_of_type_ArrayOfJavaLangString[(k + 2)] = this.jdField_a_of_type_JavaLangString;
  }
  
  private final void b()
  {
    a(c());
    int k = this.h;
    int m;
    while ((m = c()) != 59)
    {
      if ((m < 128) && ((m < 48) || (m > 57)) && ((m < 97) || (m > 122)) && ((m < 65) || (m > 90)) && (m != 95) && (m != 45) && (m != 35))
      {
        a("unterminated entity ref");
        if (m != -1) {
          a(m);
        }
        return;
      }
      a(m);
    }
    String str2 = c(k);
    this.h = (k - 1);
    if (str2.charAt(0) == '#')
    {
      k = str2.charAt(1) != 'x' ? Integer.parseInt(str2.substring(1)) : Integer.parseInt(str2.substring(2), 16);
      a(k);
      return;
    }
    String str1 = (String)this.jdField_a_of_type_JavaUtilHashtable.get(str2);
    this.jdField_d_of_type_Boolean = (str1 == null);
    if (this.jdField_d_of_type_Boolean)
    {
      a("unresolved: &" + str2 + ";");
      return;
    }
    for (int n = 0; n < str1.length(); n++) {
      a(str1.charAt(n));
    }
  }
  
  private final void b(int paramInt)
  {
    int k = a(0);
    int m = 0;
    while ((k != -1) && (k != paramInt))
    {
      if (paramInt == 32)
      {
        if (k <= 32) {
          break;
        }
        if (k == 62) {
          return;
        }
      }
      if (k == 38)
      {
        b();
      }
      else if ((k == 10) && (this.jdField_b_of_type_Int == 2))
      {
        c();
        a(32);
      }
      else
      {
        a(c());
      }
      if ((k == 62) && (m >= 2) && (paramInt != 93)) {
        a("Illegal: ]]>");
      }
      if (k == 93) {
        m++;
      } else {
        m = 0;
      }
      k = a(0);
    }
  }
  
  private final void a(char paramChar)
  {
    int k;
    if ((k = c()) != paramChar) {
      a("expected: '" + paramChar + "' actual: '" + (char)k + "'");
    }
  }
  
  private final int c()
  {
    int k;
    if (this.j == 0)
    {
      k = a(0);
    }
    else
    {
      k = this.jdField_b_of_type_ArrayOfInt[0];
      this.jdField_b_of_type_ArrayOfInt[0] = this.jdField_b_of_type_ArrayOfInt[1];
    }
    this.j -= 1;
    this.g += 1;
    if (k == 10)
    {
      this.f += 1;
      this.g = 1;
    }
    return k;
  }
  
  private final int a(int paramInt)
  {
    while (paramInt >= this.j)
    {
      int k;
      if (this.jdField_a_of_type_ArrayOfChar.length <= 1)
      {
        k = this.jdField_a_of_type_JavaIoReader.read();
      }
      else if (this.jdField_d_of_type_Int < this.e)
      {
        k = this.jdField_a_of_type_ArrayOfChar[(this.jdField_d_of_type_Int++)];
      }
      else
      {
        this.e = this.jdField_a_of_type_JavaIoReader.read(this.jdField_a_of_type_ArrayOfChar, 0, this.jdField_a_of_type_ArrayOfChar.length);
        if (this.e <= 0) {
          k = -1;
        } else {
          k = this.jdField_a_of_type_ArrayOfChar[0];
        }
        this.jdField_d_of_type_Int = 1;
      }
      if (k == 13)
      {
        this.jdField_c_of_type_Boolean = true;
        this.jdField_b_of_type_ArrayOfInt[(this.j++)] = 10;
      }
      else
      {
        if (k == 10)
        {
          if (!this.jdField_c_of_type_Boolean) {
            this.jdField_b_of_type_ArrayOfInt[(this.j++)] = 10;
          }
        }
        else {
          this.jdField_b_of_type_ArrayOfInt[(this.j++)] = k;
        }
        this.jdField_c_of_type_Boolean = false;
      }
    }
    return this.jdField_b_of_type_ArrayOfInt[paramInt];
  }
  
  private final String d()
  {
    int k = this.h;
    int m;
    if ((((m = a(0)) < 97) || (m > 122)) && ((m < 65) || (m > 90)) && (m != 95) && (m != 58) && (m < 192)) {
      a("name expected");
    }
    do
    {
      a(c());
    } while ((((m = a(0)) >= 97) && (m <= 122)) || ((m >= 65) && (m <= 90)) || ((m >= 48) && (m <= 57)) || (m == 95) || (m == 45) || (m == 58) || (m == 46) || (m >= 183));
    String str = c(k);
    this.h = k;
    return str;
  }
  
  private final void c()
  {
    int k;
    while ((k = a(0)) <= 32)
    {
      if (k == -1) {
        return;
      }
      c();
    }
  }
  
  public final void a(InputStream paramInputStream, String paramString)
  {
    this.jdField_d_of_type_Int = 0;
    this.e = 0;
    paramString = paramString;
    if (paramInputStream == null) {
      throw new IllegalArgumentException();
    }
    try
    {
      if (paramString != null)
      {
        k = 0;
        int m;
        while ((this.e < 4) && ((m = paramInputStream.read()) != -1))
        {
          k = k << 8 | m;
          this.jdField_a_of_type_ArrayOfChar[(this.e++)] = ((char)m);
        }
        if (this.e == 4)
        {
          switch (k)
          {
          default: 
            break;
          case 65279: 
            paramString = "UTF-32BE";
            this.e = 0;
            break;
          case -131072: 
            paramString = "UTF-32LE";
            this.e = 0;
            break;
          case 60: 
            paramString = "UTF-32BE";
            this.jdField_a_of_type_ArrayOfChar[0] = '<';
            this.e = 1;
            break;
          case 1006632960: 
            paramString = "UTF-32LE";
            this.jdField_a_of_type_ArrayOfChar[0] = '<';
            this.e = 1;
            break;
          case 3932223: 
            paramString = "UTF-16BE";
            this.jdField_a_of_type_ArrayOfChar[0] = '<';
            this.jdField_a_of_type_ArrayOfChar[1] = '?';
            this.e = 2;
            break;
          case 1006649088: 
            paramString = "UTF-16LE";
            this.jdField_a_of_type_ArrayOfChar[0] = '<';
            this.jdField_a_of_type_ArrayOfChar[1] = '?';
            this.e = 2;
            break;
          case 1010792557: 
            while ((m = paramInputStream.read()) != -1)
            {
              this.jdField_a_of_type_ArrayOfChar[(this.e++)] = ((char)m);
              if (m == 62)
              {
                String str;
                int n;
                if ((n = (str = new String(this.jdField_a_of_type_ArrayOfChar, 0, this.e)).indexOf("encoding")) != -1)
                {
                  while ((str.charAt(n) != '"') && (str.charAt(n) != '\'')) {
                    n++;
                  }
                  paramString = str.charAt(n++);
                  paramString = str.indexOf(paramString, n);
                  paramString = str.substring(n, paramString);
                }
              }
            }
          }
          if ((k & 0xFFFF0000) == -16842752)
          {
            paramString = "UTF-16BE";
            this.jdField_a_of_type_ArrayOfChar[0] = ((char)(this.jdField_a_of_type_ArrayOfChar[2] << '\b' | this.jdField_a_of_type_ArrayOfChar[3]));
            this.e = 1;
          }
          else if ((k & 0xFFFF0000) == -131072)
          {
            paramString = "UTF-16LE";
            this.jdField_a_of_type_ArrayOfChar[0] = ((char)(this.jdField_a_of_type_ArrayOfChar[3] << '\b' | this.jdField_a_of_type_ArrayOfChar[2]));
            this.e = 1;
          }
          else if ((k & 0xFF00) == -272908544)
          {
            paramString = "UTF-8";
            this.jdField_a_of_type_ArrayOfChar[0] = this.jdField_a_of_type_ArrayOfChar[3];
            this.e = 1;
          }
        }
      }
      if (paramString == null) {
        paramString = "UTF-8";
      }
      int k = this.e;
      paramString = new InputStreamReader(paramInputStream, paramString);
      paramInputStream = this;
      this.jdField_a_of_type_JavaIoReader = paramString;
      paramInputStream.f = 1;
      paramInputStream.g = 0;
      paramInputStream.jdField_b_of_type_Int = 0;
      paramInputStream.jdField_a_of_type_JavaLangString = null;
      paramInputStream.jdField_b_of_type_JavaLangString = null;
      paramInputStream.jdField_b_of_type_Boolean = false;
      paramInputStream.jdField_c_of_type_Int = -1;
      paramInputStream.jdField_d_of_type_Int = 0;
      paramInputStream.e = 0;
      paramInputStream.j = 0;
      paramInputStream.jdField_a_of_type_Int = 0;
      paramInputStream.jdField_a_of_type_JavaUtilHashtable = new Hashtable();
      paramInputStream.jdField_a_of_type_JavaUtilHashtable.put("amp", "&");
      paramInputStream.jdField_a_of_type_JavaUtilHashtable.put("apos", "'");
      paramInputStream.jdField_a_of_type_JavaUtilHashtable.put("gt", ">");
      paramInputStream.jdField_a_of_type_JavaUtilHashtable.put("lt", "<");
      paramInputStream.jdField_a_of_type_JavaUtilHashtable.put("quot", "\"");
      this.e = k;
      return;
    }
    catch (Exception localException)
    {
      throw new m("Invalid stream or encoding: " + localException.toString(), this, localException);
    }
  }
  
  public final String a()
  {
    StringBuffer localStringBuffer;
    (localStringBuffer = new StringBuffer(this.jdField_b_of_type_Int >= jdField_c_of_type_ArrayOfJavaLangString.length ? "unknown" : jdField_c_of_type_ArrayOfJavaLangString[this.jdField_b_of_type_Int])).append(' ');
    if ((this.jdField_b_of_type_Int == 2) || (this.jdField_b_of_type_Int == 3))
    {
      if (this.jdField_b_of_type_Boolean) {
        localStringBuffer.append("(empty) ");
      }
      localStringBuffer.append('<');
      if (this.jdField_b_of_type_Int == 3) {
        localStringBuffer.append('/');
      }
      if (this.jdField_c_of_type_JavaLangString != null) {
        localStringBuffer.append("{" + this.jdField_b_of_type_JavaLangString + "}" + this.jdField_c_of_type_JavaLangString + ":");
      }
      localStringBuffer.append(this.jdField_a_of_type_JavaLangString);
      int k = this.jdField_c_of_type_Int << 2;
      for (int m = 0; m < k; m += 4)
      {
        localStringBuffer.append(' ');
        if (this.jdField_b_of_type_ArrayOfJavaLangString[(m + 1)] != null) {
          localStringBuffer.append("{" + this.jdField_b_of_type_ArrayOfJavaLangString[m] + "}" + this.jdField_b_of_type_ArrayOfJavaLangString[(m + 1)] + ":");
        }
        localStringBuffer.append(this.jdField_b_of_type_ArrayOfJavaLangString[(m + 2)] + "='" + this.jdField_b_of_type_ArrayOfJavaLangString[(m + 3)] + "'");
      }
      localStringBuffer.append('>');
    }
    else if (this.jdField_b_of_type_Int != 7)
    {
      if (this.jdField_b_of_type_Int != 4)
      {
        localStringBuffer.append(b());
      }
      else if (this.jdField_a_of_type_Boolean)
      {
        localStringBuffer.append("(whitespace)");
      }
      else
      {
        String str;
        if ((str = b()).length() > 16) {
          str = str.substring(0, 16) + "...";
        }
        localStringBuffer.append(str);
      }
    }
    localStringBuffer.append("@" + this.f + ":" + this.g);
    if (this.jdField_a_of_type_JavaIoReader != null)
    {
      localStringBuffer.append(" in ");
      localStringBuffer.append(this.jdField_a_of_type_JavaIoReader.toString());
    }
    return localStringBuffer.toString();
  }
  
  public final String b()
  {
    if ((this.jdField_b_of_type_Int < 4) || ((this.jdField_b_of_type_Int == 6) && (this.jdField_d_of_type_Boolean))) {
      return null;
    }
    return c(0);
  }
  
  public final String a(int paramInt)
  {
    if (paramInt >= this.jdField_c_of_type_Int) {
      throw new IndexOutOfBoundsException();
    }
    return this.jdField_b_of_type_ArrayOfJavaLangString[((paramInt << 2) + 2)];
  }
  
  public final String b(int paramInt)
  {
    if (paramInt >= this.jdField_c_of_type_Int) {
      throw new IndexOutOfBoundsException();
    }
    return this.jdField_b_of_type_ArrayOfJavaLangString[((paramInt << 2) + 3)];
  }
  
  public final String a(String paramString)
  {
    for (int k = (this.jdField_c_of_type_Int << 2) - 4; k >= 0; k -= 4) {
      if (this.jdField_b_of_type_ArrayOfJavaLangString[(k + 2)].equals(paramString)) {
        return this.jdField_b_of_type_ArrayOfJavaLangString[(k + 3)];
      }
    }
    return null;
  }
  
  public final int a()
  {
    this.h = 0;
    this.jdField_a_of_type_Boolean = true;
    int k = 9999;
    do
    {
      a();
      if (this.jdField_b_of_type_Int < k) {
        k = this.jdField_b_of_type_Int;
      }
    } while ((k > 6) || ((k >= 4) && (b() >= 4)));
    this.jdField_b_of_type_Int = k;
    if (this.jdField_b_of_type_Int > 4) {
      this.jdField_b_of_type_Int = 4;
    }
    return this.jdField_b_of_type_Int;
  }
  
  public final void a(int paramInt, String paramString)
  {
    if ((paramInt != this.jdField_b_of_type_Int) || ((paramString != null) && (!paramString.equals(this.jdField_a_of_type_JavaLangString)))) {
      a("expected: " + jdField_c_of_type_ArrayOfJavaLangString[paramInt] + " {" + null + "}" + paramString);
    }
  }
  
  public final String c()
  {
    if (this.jdField_b_of_type_Int != 2) {
      a("precondition: START_TAG");
    }
    a();
    String str;
    if (this.jdField_b_of_type_Int == 4)
    {
      str = b();
      a();
    }
    else
    {
      str = "";
    }
    if (this.jdField_b_of_type_Int != 3) {
      a("END_TAG expected");
    }
    return str;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\l.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */