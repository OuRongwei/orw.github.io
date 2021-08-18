import java.io.PrintStream;
import java.util.Random;

public final class ao
  extends an
{
  private static String[] a;
  public static Random a;
  
  public final String[] a()
  {
    return jdField_a_of_type_ArrayOfJavaLangString;
  }
  
  public final ak a(am paramam, au paramau, int paramInt)
  {
    switch (paramInt)
    {
    case 0: 
      paramau = ((ak)am.a(paramau)).a();
      System.out.print(paramau);
      return null;
    case 1: 
      paramau = ((al)am.a(paramam = paramau)).a;
      paramInt = ((al)am.a(paramam)).a;
      return new al(paramau <= paramInt ? paramau : paramInt);
    case 2: 
      paramau = ((al)am.a(paramam = paramau)).a;
      paramInt = ((al)am.a(paramam)).a;
      return new al(paramau <= paramInt ? paramInt : paramau);
    case 3: 
      paramau = (ai)am.a(paramau);
      return new al(paramau.a.length);
    case 4: 
      paramau = ((al)am.a(paramau)).a;
      return new al(Math.abs(paramau));
    case 5: 
      return new al(jdField_a_of_type_JavaUtilRandom.nextInt());
    case 6: 
      paramau = ((al)am.a(paramam = paramau)).a;
      paramInt = ((al)am.a(paramam)).a;
      return new al(paramau % paramInt);
    case 7: 
      if ((paramInt = (paramau = (ak)am.a(paramau)) != null ? paramau.a() : null) == null) {
        System.out.println();
      } else {
        System.out.println(paramInt);
      }
      return null;
    case 8: 
      paramau = ((ak)am.a(paramau)).a();
      return new al(paramau.length());
    case 9: 
      paramau = ((ap)am.a(paramam = paramau)).a;
      paramInt = ((ap)am.a(paramam)).a;
      return new aj(paramau.equals(paramInt));
    case 10: 
      paramau = paramau;
      paramam = paramam;
      paramInt = ((ap)am.a(paramau)).a;
      ak localak = (ak)am.a(paramau);
      paramam.a(paramInt, localak);
      return null;
    case 11: 
      paramau = paramau;
      paramam = paramam;
      paramInt = ((ap)am.a(paramau)).a;
      if (paramam.b(paramInt) == null) {
        return new aj(false);
      }
      return new aj(true);
    case 12: 
      paramau = (ak)am.a(paramau);
      return new ap(paramau.a());
    case 13: 
      paramau = ((ap)am.a(paramam = paramau)).a;
      paramInt = ((ap)am.a(paramam)).a;
      if ((paramau != null) && (paramInt != null)) {
        return new al(paramau.indexOf(paramInt));
      }
      return new al(-1);
    case 14: 
      paramau = ((ap)am.a(paramam = paramau)).a;
      paramInt = ((al)am.a(paramam)).a;
      int i = ((al)am.a(paramam)).a;
      paramam = new StringBuffer();
      while (paramInt < i)
      {
        if (paramInt < paramau.length()) {
          paramam.append(paramau.charAt(paramInt));
        }
        paramInt++;
      }
      return new ap(paramam.toString());
    case 15: 
      return a(paramau);
    }
    return null;
  }
  
  private static al a(au paramau)
  {
    paramau = ((ap)am.a(paramau)).a;
    try
    {
      return new al(Integer.parseInt(paramau));
    }
    catch (Exception localException) {}
    return new al(0);
  }
  
  static
  {
    jdField_a_of_type_ArrayOfJavaLangString = new String[] { "print", "min", "max", "asize", "abs", "random", "mod", "println", "ssize", "equals", "def", "isDef", "valueOf", "idxOf", "substr", "parseInt" };
    jdField_a_of_type_JavaUtilRandom = new Random();
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\ao.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */