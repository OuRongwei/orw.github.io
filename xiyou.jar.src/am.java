import java.io.PrintStream;
import java.util.Hashtable;

public final class am
{
  private static final String[] jdField_a_of_type_ArrayOfJavaLangString = { "if", "else", "eif", "while", "loop", "sub", "ret" };
  private static String[] jdField_b_of_type_ArrayOfJavaLangString = { " Illegal statment ,", " Invalid variable name ", " Data type error ", " No such method ", " No such variable ", " Method parameter error ", " Parameter count error ", " Code not load yet ", " Operation symbol error  ", " Array out of bounds  " };
  private String[] c = null;
  private Hashtable jdField_a_of_type_JavaUtilHashtable = null;
  private Hashtable jdField_b_of_type_JavaUtilHashtable = null;
  private au jdField_a_of_type_Au = null;
  
  public final void a(String paramString)
  {
    am localam = this;
    this.c = null;
    localam.jdField_b_of_type_JavaUtilHashtable.clear();
    localam.jdField_a_of_type_Au.a();
    localam.jdField_a_of_type_JavaUtilHashtable.clear();
    Object localObject = new ao();
    localam.a((an)localObject);
    int i = 0;
    localObject = new StringBuffer();
    au localau = new au();
    int j = 0;
    int k = paramString.length();
    while (j < k)
    {
      int m;
      if ((m = paramString.charAt(j)) == '"') {
        i++;
      }
      String str;
      if ((i % 2 == 0) && ((m == 59) || (m == 10)))
      {
        if ((str = ((StringBuffer)localObject).toString().trim()).length() > 0) {
          localau.a(str);
        }
        ((StringBuffer)localObject).setLength(0);
      }
      else
      {
        ((StringBuffer)localObject).append(str);
      }
      j++;
    }
    this.c = new String[localau.a];
    j = 0;
    k = localau.a;
    while (j < k)
    {
      this.c[j] = ((String)localau.a(j));
      j++;
    }
    a();
  }
  
  private void a()
  {
    for (int i = 0; i < this.c.length; i++)
    {
      if (this.c[i] == null) {
        this.c[i] = "";
      }
      if (this.c[i].indexOf('\'') >= 0)
      {
        int j = 0;
        for (int k = 0; k < this.c[i].length(); k++)
        {
          int m;
          if ((m = this.c[i].charAt(k)) == '"') {
            j++;
          }
          if ((m == 39) && (j % 2 == 0))
          {
            this.c[i] = this.c[i].substring(0, k);
            break;
          }
        }
        this.c[i] = this.c[i].trim();
      }
      String str1;
      if ((str1 = this.c[i]).startsWith(jdField_a_of_type_ArrayOfJavaLangString[5] + " "))
      {
        String str2 = a(str1.substring(str1.indexOf(jdField_a_of_type_ArrayOfJavaLangString[5]) + jdField_a_of_type_ArrayOfJavaLangString[5].length()));
        this.jdField_b_of_type_JavaUtilHashtable.put(str2, new al(i));
      }
    }
  }
  
  public final Object a(String paramString)
  {
    try
    {
      return c(paramString, new Hashtable());
    }
    catch (Exception localException) {}
    return null;
  }
  
  public final void a(String paramString, ak paramak)
  {
    this.jdField_a_of_type_JavaUtilHashtable.put(paramString, paramak);
  }
  
  public final Object b(String paramString)
  {
    return this.jdField_a_of_type_JavaUtilHashtable.get(paramString);
  }
  
  public final void a(an paraman)
  {
    this.jdField_a_of_type_Au.a(paraman);
  }
  
  private Object a(au paramau, int paramInt)
  {
    int i = paramInt;
    Hashtable localHashtable = new Hashtable();
    try
    {
      Object localObject1;
      if (a(localObject1 = this.c[paramInt]).equals(jdField_a_of_type_ArrayOfJavaLangString[5]))
      {
        String str1 = null;
        localObject1 = a(((String)localObject1).substring(((String)localObject1).indexOf('(') + 1, ((String)localObject1).lastIndexOf(')')));
        while (((au)localObject1).a > 0) {
          if ((str1 = (String)b((au)localObject1)).charAt(0) != ',') {
            localHashtable.put(str1, a(paramau));
          }
        }
        i++;
      }
    }
    catch (Exception localException1)
    {
      a(paramInt, jdField_b_of_type_ArrayOfJavaLangString[6]);
    }
    while (i < this.c.length)
    {
      int k;
      try
      {
        Object localObject2;
        if ((localObject2 = this.c[i]).length() != 0)
        {
          int m;
          String str2;
          if ((m = a(a((String)localObject2))) < 0)
          {
            if ((a((String)localObject2) == '[' ? 1 : 0) != 0)
            {
              a((String)localObject2, localHashtable);
            }
            else if ((a((String)localObject2) == '(' ? 1 : 0) != 0)
            {
              c((String)localObject2, localHashtable);
            }
            else if ((a((String)localObject2) == '=' ? 1 : 0) != 0)
            {
              localObject2 = localHashtable;
              paramInt = (int)localObject2;
              paramau = this;
              str2 = paramInt.substring(paramInt.indexOf('=') + 1);
              String str3 = ((String)b(paramInt = a(paramInt))).toLowerCase();
              Object localObject3 = paramau.a(str3, (Hashtable)localObject2);
              if (((String)b(paramInt)).charAt(0) == '=')
              {
                if ((paramInt = paramau.b(str2, (Hashtable)localObject2)) != null) {
                  if (localObject3 == null) {
                    ((Hashtable)localObject2).put(str3, paramInt);
                  } else if ((((paramInt instanceof ap)) && ((localObject3 instanceof ap))) || (((paramInt instanceof al)) && ((localObject3 instanceof al))) || (((paramInt instanceof aj)) && ((localObject3 instanceof aj))) || (((paramInt instanceof ai)) && ((localObject3 instanceof ai))))
                  {
                    if (((Hashtable)localObject2).get(str3) != null) {
                      ((Hashtable)localObject2).put(str3, paramInt);
                    } else {
                      paramau.jdField_a_of_type_JavaUtilHashtable.put(str3, paramInt);
                    }
                  }
                  else {
                    throw new Exception(jdField_b_of_type_ArrayOfJavaLangString[2]);
                  }
                }
              }
              else {
                throw new Exception(jdField_b_of_type_ArrayOfJavaLangString[1]);
              }
            }
            else
            {
              a(i, jdField_b_of_type_ArrayOfJavaLangString[0]);
            }
          }
          else
          {
            int n;
            int j;
            switch (str2)
            {
            case 3: 
              if (!((aj)b(((String)localObject2).substring(jdField_a_of_type_ArrayOfJavaLangString[3].length()), localHashtable)).a)
              {
                n = 1;
                for (paramau = i + 1; paramau < this.c.length; paramau++)
                {
                  if ((paramInt = a(this.c[paramau])).equals(jdField_a_of_type_ArrayOfJavaLangString[3])) {
                    n++;
                  } else if (paramInt.equals(jdField_a_of_type_ArrayOfJavaLangString[4])) {
                    n--;
                  }
                  if ((paramInt.equals(jdField_a_of_type_ArrayOfJavaLangString[4])) && (n == 0))
                  {
                    j = paramau;
                    break;
                  }
                }
              }
              break;
            case 4: 
              n = 1;
              paramau = j - 1;
            case 0: 
            case 1: 
            case 5: 
            case 6: 
              while (paramau > 0)
              {
                if ((paramInt = a(this.c[paramau])).equals(jdField_a_of_type_ArrayOfJavaLangString[3])) {
                  n--;
                } else if (paramInt.equals(jdField_a_of_type_ArrayOfJavaLangString[4])) {
                  n++;
                }
                if ((paramInt.equals(jdField_a_of_type_ArrayOfJavaLangString[3])) && (n == 0))
                {
                  k = paramau - 1;
                }
                else
                {
                  paramau--;
                  continue;
                  if (!((aj)b(((String)localObject2).substring(jdField_a_of_type_ArrayOfJavaLangString[0].length()), localHashtable)).a)
                  {
                    paramau = 1;
                    for (paramInt = k + 1; paramInt < this.c.length; paramInt++)
                    {
                      if ((localObject2 = a(this.c[paramInt])).equals(jdField_a_of_type_ArrayOfJavaLangString[0])) {
                        paramau++;
                      } else if (((String)localObject2).equals(jdField_a_of_type_ArrayOfJavaLangString[2])) {
                        paramau--;
                      }
                      if ((((String)localObject2).equals(jdField_a_of_type_ArrayOfJavaLangString[1])) && (paramau == 1))
                      {
                        k = paramInt;
                        break;
                      }
                      if ((((String)localObject2).equals(jdField_a_of_type_ArrayOfJavaLangString[2])) && (paramau == 0))
                      {
                        k = paramInt;
                        break;
                      }
                    }
                    break;
                    paramau = 1;
                    paramInt = k + 1;
                    while (paramInt < this.c.length)
                    {
                      if ((localObject2 = a(this.c[paramInt])).equals(jdField_a_of_type_ArrayOfJavaLangString[0])) {
                        paramau++;
                      } else if (((String)localObject2).equals(jdField_a_of_type_ArrayOfJavaLangString[2])) {
                        paramau--;
                      }
                      if ((((String)localObject2).equals(jdField_a_of_type_ArrayOfJavaLangString[2])) && (paramau == 0))
                      {
                        k = paramInt;
                      }
                      else
                      {
                        paramInt++;
                        continue;
                        return null;
                        if (((String)localObject2).length() > jdField_a_of_type_ArrayOfJavaLangString[6].length()) {
                          return b(((String)localObject2).substring(((String)localObject2).indexOf(" ")), localHashtable);
                        }
                        return null;
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
      catch (Exception localException2)
      {
        a(k, jdField_b_of_type_ArrayOfJavaLangString[0] + localException2.getMessage());
        localException2.printStackTrace();
      }
      k++;
    }
    return null;
  }
  
  private static String a(String paramString)
  {
    paramString = paramString.trim();
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; (i < paramString.length()) && (!a(paramString.charAt(i))); i++) {
      localStringBuffer.append(paramString.charAt(i));
    }
    return localStringBuffer.toString().trim().toLowerCase();
  }
  
  private static int a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return -1;
    }
    for (int i = 0; i < jdField_a_of_type_ArrayOfJavaLangString.length; i++) {
      if (paramString.equals(jdField_a_of_type_ArrayOfJavaLangString[i])) {
        return i;
      }
    }
    return -1;
  }
  
  private static char a(String paramString)
  {
    for (int i = 0; i < paramString.length(); i++) {
      if ("(=[".indexOf(paramString.charAt(i)) >= 0) {
        return paramString.charAt(i);
      }
    }
    return '\000';
  }
  
  private static boolean a(char paramChar)
  {
    return "+-*/><()=, []:&|!'".indexOf(paramChar) >= 0;
  }
  
  private static boolean b(char paramChar)
  {
    return "0123456789".indexOf(paramChar) >= 0;
  }
  
  private static au a(String paramString)
  {
    au localau = new au();
    int i = paramString.length();
    StringBuffer localStringBuffer = new StringBuffer();
    for (int j = 0; j < paramString.length(); j++)
    {
      char c1;
      if ((c1 = paramString.charAt(j)) != ' ')
      {
        if (c1 == '\'') {
          break;
        }
        if (c1 == '"')
        {
          localStringBuffer.append(c1);
          j++;
          while (j < paramString.length())
          {
            c1 = paramString.charAt(j);
            localStringBuffer.append(c1);
            if (c1 == '"') {
              break;
            }
            j++;
          }
        }
        if (a(c1))
        {
          localStringBuffer.append(c1);
          if (c1 == '>')
          {
            if ((j + 1 < i) && (paramString.charAt(j + 1) == '='))
            {
              localStringBuffer.append(paramString.charAt(j + 1));
              j++;
            }
          }
          else if ((c1 == '<') && (j + 1 < i) && ((paramString.charAt(j + 1) == '=') || (paramString.charAt(j + 1) == '>')))
          {
            localStringBuffer.append(paramString.charAt(j + 1));
            j++;
          }
        }
        else
        {
          char c2;
          if (((((c2 = c1) >= 'a') && (c2 <= 'z')) || ((c2 >= 'A') && (c2 <= 'Z')) ? 1 : 0) != 0)
          {
            while ((j < paramString.length()) && (!a(c1 = paramString.charAt(j))))
            {
              localStringBuffer.append(c1);
              j++;
            }
            while ((j < paramString.length()) && ((c1 = paramString.charAt(j)) == ' ')) {
              j++;
            }
            if (c1 == '[')
            {
              c2 = '\000';
              do
              {
                if (c1 == '[') {
                  c2++;
                }
                if (c1 == ']') {
                  c2--;
                }
                localStringBuffer.append(c1);
                j++;
              } while ((j < paramString.length()) && (("+-*/,)=:><".indexOf(c1 = paramString.charAt(j)) < 0) || (c2 > 0)));
            }
            else if (c1 == '(')
            {
              c2 = '\000';
              do
              {
                if ((c1 = paramString.charAt(j)) == '(') {
                  c2++;
                }
                if (c1 == ')') {
                  c2--;
                }
                localStringBuffer.append(c1);
                j++;
              } while ((c2 > 0) && (j < paramString.length()));
            }
            j--;
          }
          else if (b(c1))
          {
            while (j < paramString.length())
            {
              if (a(c2 = paramString.charAt(j)))
              {
                j--;
                break;
              }
              localStringBuffer.append(c2);
              j++;
            }
          }
        }
        localau.a(localStringBuffer.toString());
        localStringBuffer.setLength(0);
      }
    }
    return localau;
  }
  
  private void a(int paramInt, String paramString)
  {
    System.out.println(paramInt + 1 + " " + this.c[paramInt] + " : " + paramString);
  }
  
  private static Object b(au paramau)
  {
    if (paramau.a <= 0) {
      return null;
    }
    Object localObject = paramau.a();
    if (paramau.a > 0) {
      paramau.b(0);
    }
    return localObject;
  }
  
  public static final Object a(au paramau)
  {
    if (paramau.a <= 0) {
      return null;
    }
    Object localObject = paramau.b();
    if (paramau.a > 0) {
      paramau.b(paramau.a - 1);
    }
    return localObject;
  }
  
  private Object a(String paramString, Hashtable paramHashtable)
  {
    paramString = paramString.toLowerCase();
    if ((paramHashtable = paramHashtable.get(paramString)) == null) {
      paramHashtable = this.jdField_a_of_type_JavaUtilHashtable.get(paramString);
    }
    if (paramHashtable != null) {
      return paramHashtable;
    }
    return null;
  }
  
  private Object b(String paramString, Hashtable paramHashtable)
  {
    paramString = a(paramString);
    Hashtable localHashtable = paramHashtable;
    paramHashtable = paramString;
    paramString = this;
    Object localObject2 = new au();
    Object localObject4;
    while (paramHashtable.a > 0)
    {
      Object localObject3;
      if ((localObject4 = (String)b(paramHashtable)).charAt(0) == '"')
      {
        localObject4 = ((String)localObject4).substring(1, ((String)localObject4).length() - 1);
        localObject3 = new ap((String)localObject4);
      }
      else if (a(((String)localObject4).charAt(0)))
      {
        if (((aq)(localObject3 = new aq((String)localObject4))).jdField_a_of_type_Byte == 0) {
          throw new Exception((String)localObject4 + jdField_b_of_type_ArrayOfJavaLangString[8]);
        }
      }
      else if (b(((String)localObject4).charAt(0)))
      {
        localObject3 = new al((String)localObject4);
      }
      else if (((String)localObject4).charAt(((String)localObject4).length() - 1) == ')')
      {
        localObject3 = paramString.c((String)localObject4, localHashtable);
      }
      else if (((String)localObject4).charAt(((String)localObject4).length() - 1) == ']')
      {
        localObject3 = paramString.d((String)localObject4, localHashtable);
      }
      else if ((((localObject3 = localObject4).toLowerCase().equals("true")) || (((String)localObject3).toLowerCase().equals("false")) ? 1 : 0) != 0)
      {
        localObject3 = new aj((String)localObject4);
      }
      else if ((localObject3 = paramString.a((String)localObject4, localHashtable)) == null)
      {
        throw new Exception((String)localObject4 + jdField_b_of_type_ArrayOfJavaLangString[4]);
      }
      ((au)localObject2).a(localObject3);
    }
    paramString = (String)localObject2;
    paramHashtable = 0;
    for (int i = 0; i < paramString.a; i++) {
      if (((localObject2 = paramString.a(i)) instanceof ap)) {
        paramHashtable |= 0x2;
      } else if ((localObject2 instanceof aq))
      {
        if (((aq)localObject2).a()) {
          paramHashtable |= 0x10;
        }
      }
      else if ((localObject2 instanceof aj)) {
        paramHashtable |= 0x4;
      } else if ((localObject2 instanceof ai)) {
        paramHashtable |= 0x8;
      } else if ((localObject2 instanceof al)) {
        paramHashtable |= 0x1;
      }
    }
    if (((paramHashtable & 0x1) != 0) && ((paramHashtable & 0x2) == 0) && ((paramHashtable & 0x8) == 0) && ((paramHashtable & 0x4) == 0) && ((paramHashtable & 0x10) == 0)) {
      paramHashtable = 1;
    } else if (((paramHashtable & 0x2) != 0) && ((paramHashtable & 0x10) == 0)) {
      paramHashtable = 2;
    } else if ((((paramHashtable & 0x4) != 0) || ((paramHashtable & 0x10) != 0)) && ((paramHashtable & 0x2) == 0) && ((paramHashtable & 0x8) == 0)) {
      paramHashtable = 4;
    } else if (((paramHashtable & 0x8) != 0) && ((paramHashtable & 0x2) == 0) && ((paramHashtable & 0x1) == 0) && ((paramHashtable & 0x4) == 0) && ((paramHashtable & 0x10) == 0)) {
      paramHashtable = 8;
    } else {
      throw new Exception(jdField_b_of_type_ArrayOfJavaLangString[0]);
    }
    Object localObject1 = null;
    switch (paramHashtable)
    {
    case 1: 
    case 3: 
    case 5: 
    case 6: 
    case 7: 
    default: 
      while (paramString.a > 1) {
        b(paramString);
      }
      localObject1 = a(paramString);
      break;
    case 4: 
      localObject2 = new au();
      paramHashtable = new au();
      while (paramString.a > 0)
      {
        localObject1 = b(paramString);
        paramHashtable.a();
        int j;
        if (((localObject1 instanceof aq)) && (((aq)localObject1).b()))
        {
          j = 0;
          while (((au)localObject2).a > 0)
          {
            if (((localObject4 = a((au)localObject2)) instanceof aq))
            {
              if (((aq)localObject4).jdField_a_of_type_Byte == 15) {
                j++;
              }
              if ((((aq)localObject4).a()) || ((((aq)localObject4).jdField_a_of_type_Byte == 14) && (j == 0)))
              {
                ((au)localObject2).a(localObject4);
                break;
              }
              if (((aq)localObject4).jdField_a_of_type_Byte == 14) {
                j--;
              }
            }
            paramHashtable.b(localObject4, 0);
          }
          while (paramHashtable.a > 1) {
            b(paramHashtable);
          }
          if (paramHashtable.a > 0) {
            ((au)localObject2).a(b(paramHashtable));
          }
        }
        ((au)localObject2).a(localObject1);
        paramHashtable.a();
        if (((localObject1 instanceof aq)) && (((aq)localObject1).b()))
        {
          j = 0;
          while (paramString.a > 0)
          {
            if (((localObject4 = b(paramString)) instanceof aq))
            {
              int k;
              if ((k = (localObject1 = (aq)localObject4).jdField_a_of_type_Byte) == 14) {
                j++;
              }
              if ((((aq)localObject1).a()) || ((k == 15) && (j == 0)))
              {
                paramString.b(localObject4, 0);
                break;
              }
              if (k == 15) {
                j--;
              }
            }
            paramHashtable.a(localObject4);
          }
          while (paramHashtable.a > 1) {
            b(paramHashtable);
          }
          if (paramHashtable.a > 0) {
            ((au)localObject2).a(b(paramHashtable));
          }
        }
      }
      while (((au)localObject2).a > 1) {
        c((au)localObject2);
      }
      localObject1 = a((au)localObject2);
      break;
    case 2: 
      a(paramString);
    case 8: 
      localObject1 = a(paramString);
    }
    return localObject1;
  }
  
  private static void a(au paramau)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    while (paramau.a > 0)
    {
      Object localObject;
      if (!((localObject = b(paramau)) instanceof aq)) {
        localStringBuffer.append(((ak)localObject).a());
      }
    }
    paramau.b(new ap(localStringBuffer.toString()), 0);
  }
  
  private void b(au paramau)
  {
    Object localObject2;
    int j;
    al localal;
    for (;;)
    {
      Object localObject4 = null;
      if (paramau.a == 1) {
        return;
      }
      Object localObject1;
      Object localObject3;
      if (((localObject1 = b(paramau)) instanceof aq))
      {
        if (((aq)localObject1).jdField_a_of_type_Byte == 14)
        {
          b(paramau);
          localObject2 = b(paramau);
          if ((((localObject3 = b(paramau)) instanceof aq)) && (((aq)localObject3).jdField_a_of_type_Byte == 15))
          {
            paramau.b(localObject2, 0);
            return;
          }
          paramau.b(localObject3, 0);
          paramau.b(localObject2, 0);
          paramau.b(localObject1, 0);
          paramau = paramau;
          this = this;
        }
        else
        {
          if (((aq)localObject1).jdField_a_of_type_Byte == 1) {
            b(paramau);
          }
          if (((aq)localObject1).jdField_a_of_type_Byte == 2)
          {
            if (((localObject2 = b(paramau)) instanceof al))
            {
              localObject2 = new al(-((al)localObject2).a);
              paramau.b(localObject2, 0);
              return;
            }
            paramau.b(localObject2, 0);
            b(paramau);
            paramau.b(localObject1, 0);
            paramau = paramau;
            this = this;
          }
        }
      }
      else
      {
        if (!(localObject1 instanceof al)) {
          return;
        }
        localObject2 = (aq)b(paramau);
        localObject3 = b(paramau);
        int k;
        Object localObject5;
        if ((((aq)localObject2).jdField_a_of_type_Byte == 3) || (((aq)localObject2).jdField_a_of_type_Byte == 4))
        {
          if ((localObject3 instanceof al))
          {
            k = ((al)localObject1).a;
            int m = ((al)localObject3).a;
            localObject1 = new al(((aq)localObject2).jdField_a_of_type_Byte != 3 ? k / m : k * m);
            paramau = (au)localObject1;
            localObject5 = null;
            paramau.b(paramau, 0);
            return;
          }
          paramau.b(localObject3, 0);
          b(paramau);
          paramau.b(localObject2, 0);
          paramau.b(localObject1, 0);
          paramau = paramau;
          this = this;
        }
        else
        {
          if ((((aq)localObject2).jdField_a_of_type_Byte != 1) && (((aq)localObject2).jdField_a_of_type_Byte != 2)) {
            break;
          }
          k = 0;
          if ((localObject3 instanceof al)) {
            if (paramau.a == 0)
            {
              k = 1;
            }
            else if ((localObject5 = b(paramau)) != null)
            {
              if ((((aq)localObject5).jdField_a_of_type_Byte != 3) && (((aq)localObject5).jdField_a_of_type_Byte != 4)) {
                k = 1;
              }
              paramau.b(localObject5, 0);
            }
          }
          if (k != 0)
          {
            int i = ((al)localObject1).a;
            j = ((al)localObject3).a;
            localal = new al(((aq)localObject2).jdField_a_of_type_Byte != 1 ? i - j : i + j);
            paramau.b(localal, 0);
            return;
          }
          paramau.b(j, 0);
          b(paramau);
          paramau.b(localObject2, 0);
          paramau.b(localal, 0);
          paramau = paramau;
          this = this;
        }
      }
    }
    if (((aq)localObject2).jdField_a_of_type_Byte == 15)
    {
      if (j != null) {
        paramau.b(j, 0);
      }
      paramau.b(localObject2, 0);
      paramau.b(localal, 0);
      return;
    }
  }
  
  private void c(au paramau)
  {
    Object localObject1;
    aq localaq;
    Object localObject4;
    for (;;)
    {
      if (paramau.a == 1) {
        return;
      }
      Object localObject3;
      if (((localObject1 = b(paramau)) instanceof aq))
      {
        Object localObject2;
        if (((aq)localObject1).jdField_a_of_type_Byte == 14)
        {
          c(paramau);
          localObject2 = b(paramau);
          if ((((localObject3 = b(paramau)) instanceof aq)) && (((aq)localObject3).jdField_a_of_type_Byte == 15))
          {
            paramau.b(localObject2, 0);
            return;
          }
          paramau.b(localObject3, 0);
          paramau.b(localObject2, 0);
          paramau.b(localObject1, 0);
          paramau = paramau;
          this = this;
        }
        else
        {
          if (((aq)localObject1).jdField_a_of_type_Byte != 11) {
            return;
          }
          if (((localObject2 = b(paramau)) instanceof aj))
          {
            localObject2 = new aj(!((aj)localObject2).a);
            paramau.b(localObject2, 0);
            return;
          }
          paramau.b(localObject2, 0);
          c(paramau);
          paramau.b(localObject1, 0);
          paramau = paramau;
          this = this;
        }
      }
      else
      {
        Object localObject6;
        if ((localObject1 instanceof al))
        {
          int i = ((al)localObject1).a;
          localObject3 = b(paramau);
          Object localObject5 = b(paramau);
          localObject6 = (aq)localObject3;
          int j = ((al)localObject5).a;
          bool1 = false;
          if (((aq)localObject6).jdField_a_of_type_Byte == 5) {
            bool1 = i > j;
          } else if (((aq)localObject6).jdField_a_of_type_Byte == 6) {
            bool1 = i < j;
          } else if (((aq)localObject6).jdField_a_of_type_Byte == 8) {
            bool1 = i >= j;
          } else if (((aq)localObject6).jdField_a_of_type_Byte == 9) {
            bool1 = i <= j;
          } else if (((aq)localObject6).jdField_a_of_type_Byte == 10) {
            bool1 = i != j;
          } else if (((aq)localObject6).jdField_a_of_type_Byte == 7) {
            bool1 = i == j;
          }
          paramau.b(new aj(bool1), 0);
        }
        if (!(localObject1 instanceof aj)) {
          return;
        }
        localaq = (aq)b(paramau);
        localObject4 = b(paramau);
        if (localaq.jdField_a_of_type_Byte == 12) {
          if ((localObject4 instanceof aj))
          {
            bool1 = (((aj)localObject1).a) && (((aj)localObject4).a);
            paramau.b(new aj(bool1), 0);
          }
          else
          {
            paramau.b(localObject4, 0);
            c(paramau);
            paramau.b(localaq, 0);
            paramau.b(localObject1, 0);
            paramau = paramau;
            this = this;
            continue;
          }
        }
        if (localaq.jdField_a_of_type_Byte != 13) {
          break;
        }
        boolean bool1 = false;
        if ((localObject4 instanceof aj)) {
          if (paramau.a == 0)
          {
            bool1 = true;
          }
          else
          {
            if ((((localObject6 = b(paramau)) instanceof aq)) && (((aq)localObject6).jdField_a_of_type_Byte != 12)) {
              bool1 = true;
            }
            paramau.b(localObject6, 0);
          }
        }
        if (bool1)
        {
          boolean bool2 = (((aj)localObject1).a) || (((aj)localObject4).a);
          paramau.b(new aj(bool2), 0);
          return;
        }
        paramau.b(localObject4, 0);
        c(paramau);
        paramau.b(localaq, 0);
        paramau.b(localObject1, 0);
        paramau = paramau;
        this = this;
      }
    }
    if (localaq.jdField_a_of_type_Byte == 15)
    {
      if (localObject4 != null) {
        paramau.b(localObject4, 0);
      }
      paramau.b(localaq, 0);
      paramau.b(localObject1, 0);
      return;
    }
  }
  
  private Object c(String paramString, Hashtable paramHashtable)
  {
    if (paramString == null) {
      return a(null, 0);
    }
    Object localObject1 = paramString.substring(paramString.indexOf('(') + 1, paramString.lastIndexOf(')'));
    au localau = new au();
    Object localObject2;
    if (((String)localObject1).length() != 0)
    {
      localObject1 = a((String)localObject1);
      while (((au)localObject1).a > 0)
      {
        localObject2 = new StringBuffer();
        String str;
        while ((((au)localObject1).a > 0) && ((str = b((au)localObject1).toString()).charAt(0) != ',')) {
          ((StringBuffer)localObject2).append(str);
        }
        localObject2 = ((StringBuffer)localObject2).toString();
        Object localObject3;
        if ((localObject3 = b((String)localObject2, paramHashtable)) != null) {
          localau.b(localObject3, 0);
        } else {
          throw new Exception(jdField_b_of_type_ArrayOfJavaLangString[5] + (String)localObject2);
        }
      }
    }
    localObject1 = a(paramString);
    if ((localObject2 = this.jdField_b_of_type_JavaUtilHashtable.get(localObject1)) != null)
    {
      i = ((al)localObject2).a;
      return a(localau, i);
    }
    for (int i = 0; i < this.jdField_a_of_type_Au.a; i++)
    {
      int j;
      if ((j = (localObject2 = (an)this.jdField_a_of_type_Au.a(i)).a((String)localObject1)) >= 0) {
        return ((an)localObject2).a(this, localau, j);
      }
    }
    throw new Exception(jdField_b_of_type_ArrayOfJavaLangString[3]);
  }
  
  private au a(String paramString, Hashtable paramHashtable)
  {
    au localau = new au();
    paramString = paramString.substring(paramString.indexOf('['));
    StringBuffer localStringBuffer = new StringBuffer();
    for (int i = 0; i < paramString.length(); i++)
    {
      int j;
      if ((j = paramString.charAt(i)) != '[')
      {
        Object localObject;
        if (j == 93)
        {
          if (!((localObject = b(localStringBuffer.toString(), paramHashtable)) instanceof al)) {
            throw new Exception(jdField_b_of_type_ArrayOfJavaLangString[2]);
          }
          localau.a(localObject);
          localStringBuffer.setLength(0);
        }
        else
        {
          localStringBuffer.append(localObject);
        }
      }
    }
    return localau;
  }
  
  private void a(String paramString, Hashtable paramHashtable)
  {
    Object localObject1;
    Object localObject2;
    String str = a(localObject2 = (String)b(localObject1 = a(paramString))).toLowerCase();
    int[] arrayOfInt;
    for (int j = (arrayOfInt = new int[(localObject2 = a((String)localObject2, paramHashtable)).a]).length - 1; j >= 0; j--) {
      arrayOfInt[j] = ((al)a((au)localObject2)).a;
    }
    Object localObject3;
    if ((((au)localObject1).a == 0) || ((((au)localObject1).a != 0) && (((String)b((au)localObject1)).charAt(0) == ':')))
    {
      localObject3 = new ai(arrayOfInt);
      paramHashtable.put(str, localObject3);
      return;
    }
    if (((localObject3 = paramHashtable.get(str)) != null) && ((localObject3 instanceof ai)))
    {
      paramString = paramString.substring(paramString.indexOf('=') + 1);
      localObject1 = b(paramString, paramHashtable);
      paramHashtable = arrayOfInt;
      paramString = (ai)localObject3;
      for (int i = 0; i < paramHashtable.length; i++) {
        if (paramString.jdField_a_of_type_Byte == 1) {
          paramString.jdField_a_of_type_ArrayOfAk[paramHashtable[i]] = ((ak)localObject1);
        } else {
          paramString = (ai)paramString.jdField_a_of_type_ArrayOfAk[paramHashtable[i]];
        }
      }
    }
  }
  
  private Object d(String paramString, Hashtable paramHashtable)
  {
    String str = a(paramString).toLowerCase();
    int[] arrayOfInt;
    for (int j = (arrayOfInt = new int[(paramString = a(paramString, paramHashtable)).a]).length - 1; j >= 0; j--) {
      arrayOfInt[j] = ((al)a(paramString)).a;
    }
    Object localObject;
    if (((localObject = a(str, paramHashtable)) != null) && ((localObject instanceof ai)))
    {
      paramHashtable = arrayOfInt;
      paramString = (ai)localObject;
      for (int i = 0; i < paramHashtable.length; i++)
      {
        if (paramString.jdField_a_of_type_Byte == 1) {
          return paramString.jdField_a_of_type_ArrayOfAk[paramHashtable[i]];
        }
        paramString = (ai)paramString.jdField_a_of_type_ArrayOfAk[paramHashtable[i]];
      }
      return paramString;
    }
    return null;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\am.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */