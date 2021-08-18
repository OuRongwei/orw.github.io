import javax.microedition.lcdui.TextBox;

public final class bf
  extends an
{
  private bb jdField_a_of_type_Bb = null;
  private static String[] jdField_a_of_type_ArrayOfJavaLangString = { "back", "setNum", "getNum", "disap", "getField", "action", "setText", "setPic", "setCol", "remove", "setOpe", "getFocusName", "getText", "getCmd", "setVal", "getVal", "getIS", "setIS", "setTitle", "setCmd", "popForm", "setField", "getPic", "setFocus", "setInType", "clearCmd", "inputNull", "setVisible", "setCover", "getFocus", "getLen", "setLen", "getInputSl", "setName", "cancelAll", "setHexCol", "existForm", "setEq", "setInput", "setOption", "setRun", "getRms", "readUTF", "closeLock", "addLock", "notice", "clearControl", "indexOf", "getPubV", "setPubV", "toInt", "addUI", "openForm", "setTip", "shotTag", "linkIS" };
  
  public bf(bb parambb)
  {
    this.jdField_a_of_type_Bb = parambb;
  }
  
  public final String[] a()
  {
    return jdField_a_of_type_ArrayOfJavaLangString;
  }
  
  public final ak a(am paramam, au paramau, int paramInt)
  {
    Object localObject1;
    Object localObject3;
    Object localObject2;
    boolean bool;
    switch (paramInt)
    {
    case 0: 
      paramau = paramau;
      paramam = this;
      if ((paramInt = am.a(paramau)) != null) {
        for (int i = ((al)paramInt).a; i > 0; i--) {
          paramam.jdField_a_of_type_Bb.jdField_a_of_type_Bc.j();
        }
      } else {
        paramam.jdField_a_of_type_Bb.jdField_a_of_type_Bc.j();
      }
      return null;
    case 1: 
      paramau = paramau;
      paramam = this;
      if (paramau.a == 2)
      {
        String str1 = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
        paramInt = paramam.a(str1);
        localObject1 = am.a(paramau);
      }
      else
      {
        localObject1 = am.a(paramau);
        paramInt = paramam.jdField_a_of_type_Bb.b;
      }
      int k;
      if (((localObject1 instanceof al)) && ((paramInt instanceof av)))
      {
        k = ((al)localObject1).a;
        ((av)paramInt).a(k);
      }
      if (((localObject1 instanceof al)) && ((paramInt instanceof ay)))
      {
        k = ((al)localObject1).a;
        ((ay)paramInt).a(k);
      }
      return null;
    case 2: 
      paramau = paramau;
      paramam = this;
      localObject1 = null;
      if (paramau.a > 0)
      {
        localObject1 = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
        paramInt = paramam.a((String)localObject1);
      }
      else
      {
        paramInt = paramam.jdField_a_of_type_Bb.b;
      }
      if ((paramInt instanceof av))
      {
        localObject1 = (av)paramInt;
        return new al(((ba)localObject1).c);
      }
      if ((paramInt instanceof ay))
      {
        localObject1 = (ay)paramInt;
        return new al(((ba)localObject1).c);
      }
      return new al(-1);
    case 3: 
      return null;
    case 4: 
      paramau = ((ap)am.a(paramam = paramau)).jdField_a_of_type_JavaLangString;
      paramInt = ((al)am.a(paramam)).a;
      return new ap(bc.a(paramau, paramInt));
    case 5: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      paramam.jdField_a_of_type_Bb.a(paramInt);
      return null;
    case 6: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject1 = am.a(paramau);
      localObject3 = "";
      if ((localObject1 instanceof ap)) {
        localObject3 = ((ap)localObject1).jdField_a_of_type_JavaLangString;
      } else if ((localObject1 instanceof al)) {
        localObject3 = Integer.toString(((al)localObject1).a);
      }
      if ((paramau = paramam.a(paramInt)) != null) {
        paramau.h = ((String)localObject3);
      }
      return null;
    case 7: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      int j = ((al)am.a(paramau)).a;
      if ((localObject3 = paramam.a(paramInt)) != null) {
        ((ba)localObject3).c(j);
      }
      return null;
    case 8: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = (ap)am.a(paramau);
      if ((localObject3 = paramam.a(paramInt)) != null) {
        ((ba)localObject3).jdField_b_of_type_Int = Integer.parseInt(((ap)localObject2).jdField_a_of_type_JavaLangString, 16);
      }
      return null;
    case 9: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if ((localObject2 = paramam.a(paramInt)) != null) {
        ((ba)localObject2).a().b((ba)localObject2);
      }
      return null;
    case 10: 
      return null;
    case 11: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if ((localObject2 = paramam.jdField_a_of_type_Bb.b(paramInt)) != null) {
        return new ap(((bb)localObject2).b.g);
      }
      return null;
    case 12: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.a(paramInt);
      if ((localObject3 = new ap(((ba)localObject2).h)).jdField_a_of_type_JavaLangString == null) {
        ((ap)localObject3).jdField_a_of_type_JavaLangString = "";
      }
      if (localObject2 != null) {
        return (ak)localObject3;
      }
      return null;
    case 13: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.a(paramInt);
      localObject3 = null;
      if ((localObject2 instanceof av)) {
        localObject3 = new ap(((av)localObject2).b);
      }
      return (ak)localObject3;
    case 14: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.a(paramInt);
      localObject3 = (ak)am.a(paramau);
      if ((localObject2 instanceof bd)) {
        ((bd)localObject2).jdField_a_of_type_JavaLangString = ((ak)localObject3).a();
      } else if ((localObject2 instanceof av)) {
        ((av)localObject2).jdField_a_of_type_JavaLangString = ((ak)localObject3).a();
      }
      return null;
    case 15: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.a(paramInt);
      localObject3 = null;
      if ((localObject2 instanceof av)) {
        localObject3 = new ap(((av)localObject2).jdField_a_of_type_JavaLangString);
      } else if ((localObject2 instanceof bd)) {
        localObject3 = new ap(((bd)localObject2).jdField_a_of_type_JavaLangString);
      }
      return (ak)localObject3;
    case 16: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.a(paramInt);
      localObject3 = null;
      if ((localObject2 instanceof bd)) {
        localObject3 = new ap(((bd)localObject2).jdField_a_of_type_JavaLangString);
      }
      return (ak)localObject3;
    case 17: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if (((localObject2 = paramam.a(paramInt)) instanceof bd))
      {
        if (((bd)localObject2).jdField_a_of_type_JavaLangString.equals("")) {
          ((bd)localObject2).b = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
        } else {
          ((bd)localObject2).b = ((bd)localObject2).jdField_a_of_type_JavaLangString;
        }
        ((bd)localObject2).jdField_a_of_type_JavaLangString = ((bd)localObject2).b;
        if (((bd)localObject2).c == 112) {
          ((bd)localObject2).b = bd.a(((bd)localObject2).b);
        }
      }
      return null;
    case 18: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if ((localObject2 = paramam.jdField_a_of_type_Bb.b(paramInt)) != null) {
        ((bb)localObject2).jdField_c_of_type_JavaLangString = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      }
      return null;
    case 19: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.a(paramInt);
      localObject3 = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if ((localObject2 != null) && ((localObject2 instanceof av))) {
        ((av)localObject2).b = ((String)localObject3);
      }
      return null;
    case 20: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.jdField_a_of_type_Bb.b(paramInt);
      localObject3 = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      paramau = ((bb)localObject2).a((String)localObject3);
      paramam.jdField_a_of_type_Bb.c(paramau);
      paramau.jdField_c_of_type_Boolean = true;
      bb.g();
      return null;
    case 21: 
      paramau = ((ap)am.a(paramam = paramau)).jdField_a_of_type_JavaLangString;
      paramInt = ((al)am.a(paramam)).a;
      localObject2 = ((ap)am.a(paramam)).jdField_a_of_type_JavaLangString;
      return new ap(bc.a(paramau, paramInt, (String)localObject2));
    case 22: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if ((localObject2 = paramam.a(paramInt)) != null)
      {
        int m = ((ba)localObject2).a();
        return new al(m);
      }
      return null;
    case 23: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.jdField_a_of_type_Bb.b(paramInt);
      String str2 = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      paramau = paramam.a(str2);
      ((bb)localObject2).c(paramau);
      return null;
    case 24: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.a(paramInt);
      bool = ((aj)am.a(paramau)).jdField_a_of_type_Boolean;
      if ((localObject2 instanceof bd)) {
        ((bd)localObject2).jdField_a_of_type_Boolean = bool;
      }
      return null;
    case 25: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if (((localObject2 = paramam.a(paramInt)) != null) && ((localObject2 instanceof av))) {
        ((av)localObject2).b = null;
      }
      return null;
    case 26: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if ((((localObject2 = paramam.a(paramInt)) instanceof bd)) && (!((bd)localObject2).d())) {
        return new aj(false);
      }
      return new aj(true);
    case 27: 
      paramau = paramau;
      paramam = this;
      paramInt = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      localObject2 = paramam.a(paramInt);
      bool = ((aj)am.a(paramau)).jdField_a_of_type_Boolean;
      ((ba)localObject2).jdField_b_of_type_Boolean = bool;
      return null;
    case 28: 
      return null;
    case 29: 
      return p(paramau);
    case 30: 
      return i(paramau);
    case 31: 
      return k(paramau);
    case 32: 
      return j(paramau);
    case 33: 
      return g(paramau);
    case 34: 
      bc.i();
      return null;
    case 35: 
      return null;
    case 36: 
      return s(paramau);
    case 37: 
      return null;
    case 38: 
      return h(paramau);
    case 39: 
      return n(paramau);
    case 40: 
      return o(paramau);
    case 41: 
      return f(paramau);
    case 42: 
      return a();
    case 43: 
      e.w();
      return null;
    case 44: 
      e.v();
      return null;
    case 45: 
      e.c(((ap)am.a(paramau)).jdField_a_of_type_JavaLangString);
      return null;
    case 46: 
      return e(paramau);
    case 47: 
      return q(paramau);
    case 48: 
      return a(paramau);
    case 49: 
      return r(paramau);
    case 50: 
      return d(paramau);
    case 51: 
      return c(paramau);
    case 52: 
      return b(paramau);
    case 53: 
      return a(paramau);
    case 54: 
      return m(paramau);
    case 55: 
      return l(paramau);
    }
    return null;
  }
  
  private ak a(au paramau)
  {
    String str = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    a(str).b(paramau);
    return null;
  }
  
  private ak b(au paramau)
  {
    this.jdField_a_of_type_Bb.jdField_a_of_type_Bc.j();
    Object localObject = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    localObject = this.jdField_a_of_type_Bb.b((String)localObject);
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    paramau = ((bb)localObject).a(paramau);
    this.jdField_a_of_type_Bb.c(paramau);
    paramau.jdField_c_of_type_Boolean = true;
    bb.g();
    return null;
  }
  
  private ak c(au paramau)
  {
    Object localObject = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    if ((localObject = (ax)a((String)localObject)) != null) {
      ((ax)localObject).a(ba.a(bc.a(paramau), (ba)localObject));
    }
    return null;
  }
  
  private static ak d(au paramau)
  {
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    return new al(Integer.parseInt(paramau));
  }
  
  private ak e(au paramau)
  {
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    if (((paramau = a(paramau)) != null) && ((paramau instanceof ax))) {
      ((ax)paramau).a = 0;
    }
    return null;
  }
  
  private static ak f(au paramau)
  {
    String str = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    paramau = ((al)am.a(paramau)).a;
    e.a.a();
    return new aj(u.a(str, paramau, e.a));
  }
  
  private static ak a()
  {
    try
    {
      return new ap(e.a.a());
    }
    catch (Exception localException) {}
    return new ap("");
  }
  
  private ba a(String paramString)
  {
    int i;
    if ((i = paramString.indexOf('.')) >= 0)
    {
      bb localbb;
      if ((localbb = this.jdField_a_of_type_Bb.b(paramString.substring(0, i))) != null) {
        return localbb.a(paramString.substring(i + 1));
      }
      return null;
    }
    return this.jdField_a_of_type_Bb.a(paramString);
  }
  
  private ak g(au paramau)
  {
    Object localObject = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    localObject = a((String)localObject);
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    if (localObject != null) {
      ((ba)localObject).g = paramau;
    }
    return null;
  }
  
  private ak h(au paramau)
  {
    Object localObject = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    localObject = a((String)localObject);
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    if ((localObject instanceof bd)) {
      ((bd)localObject).a(paramau);
    }
    return null;
  }
  
  private ak i(au paramau)
  {
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    paramau = a(paramau);
    al localal = null;
    if ((paramau instanceof bd)) {
      if (((bd)paramau).c == 110) {
        localal = new al((int)((bd)paramau).jdField_a_of_type_Long);
      } else {
        localal = new al(((bd)paramau).jdField_a_of_type_JavaxMicroeditionLcduiTextBox.getMaxSize());
      }
    }
    return localal;
  }
  
  private ak j(au paramau)
  {
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    paramau = a(paramau);
    al localal = null;
    if ((paramau instanceof bd)) {
      localal = new al(((bd)paramau).b.length());
    }
    return localal;
  }
  
  private ak k(au paramau)
  {
    Object localObject = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    localObject = a((String)localObject);
    paramau = ((al)am.a(paramau)).a;
    if ((localObject instanceof bd)) {
      if (((bd)localObject).c == 110) {
        ((bd)localObject).jdField_a_of_type_Long = paramau;
      } else {
        ((bd)localObject).jdField_a_of_type_JavaxMicroeditionLcduiTextBox.setMaxSize(paramau);
      }
    }
    return null;
  }
  
  private ak l(au paramau)
  {
    Object localObject = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    if (((localObject = a((String)localObject)) instanceof bd))
    {
      paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
      if (((bd)localObject).b.length() + paramau.length() > 30)
      {
        e.c("本次表达的信息过长!");
        return null;
      }
      if (((bd)localObject).jdField_a_of_type_JavaLangString.equals("")) {
        ((bd)localObject).b = paramau;
      } else {
        ((bd)localObject).b = (((bd)localObject).jdField_a_of_type_JavaLangString + paramau);
      }
      ((bd)localObject).jdField_a_of_type_JavaLangString = ((bd)localObject).b;
      if (((bd)localObject).c == 112) {
        ((bd)localObject).b = bd.a(((bd)localObject).b);
      }
    }
    return null;
  }
  
  private ak m(au paramau)
  {
    if (this.jdField_a_of_type_Bb.jdField_a_of_type_Bj != null)
    {
      int i = Integer.parseInt(((ap)am.a(paramau)).jdField_a_of_type_JavaLangString);
      (paramau = this.jdField_a_of_type_Bb.jdField_a_of_type_Bj).d = i;
      ((bb)paramau.a).a(((bb)paramau.a).c(((av)paramau.a(paramau.d)).jdField_a_of_type_JavaLangString));
    }
    return null;
  }
  
  private ak n(au paramau)
  {
    String str1 = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    String str2 = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    if (((paramau = a(str1)) != null) && ((paramau instanceof ay))) {
      ((ay)paramau).a(str2);
    }
    return null;
  }
  
  private ak o(au paramau)
  {
    Object localObject = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    localObject = this.jdField_a_of_type_Bb.b((String)localObject);
    paramau = ((aj)am.a(paramau)).jdField_a_of_type_Boolean;
    ((bb)localObject).jdField_c_of_type_Boolean = paramau;
    bb.g();
    return null;
  }
  
  private ak p(au paramau)
  {
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    if (this.jdField_a_of_type_Bb.b(paramau).b == null) {
      return new aj(false);
    }
    return new aj(true);
  }
  
  private static ak q(au paramau)
  {
    String str = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    paramau = str.indexOf(paramau);
    return new aj(paramau != -1);
  }
  
  private static ak r(au paramau)
  {
    int i = ((al)am.a(paramau)).a;
    paramau = (ak)am.a(paramau);
    bc.jdField_a_of_type_ArrayOfJavaLangString[i] = paramau.a();
    return null;
  }
  
  private static ap a(au paramau)
  {
    return new ap(bc.jdField_a_of_type_ArrayOfJavaLangString[((al)am.a(paramau)).a]);
  }
  
  private ak s(au paramau)
  {
    paramau = ((ap)am.a(paramau)).jdField_a_of_type_JavaLangString;
    if (this.jdField_a_of_type_Bb.b(paramau) != null) {
      return new aj(true);
    }
    return new aj(false);
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\bf.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */