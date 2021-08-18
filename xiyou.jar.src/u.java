import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordStore;

public final class u
{
  public a a;
  public int a;
  public int b;
  public int c;
  public int d;
  public String a;
  
  public u(n paramn)
  {
    this.jdField_a_of_type_A = t.a(paramn.a());
    this.jdField_a_of_type_Int = paramn.a();
    switch (this.jdField_a_of_type_Int)
    {
    case 0: 
      this.b = paramn.a();
      this.c = paramn.c();
      this.d = paramn.a();
      return;
    case 1: 
      this.b = paramn.a();
      this.c = paramn.c();
      this.d = paramn.a();
      return;
    case 2: 
      this.b = paramn.a();
      return;
    case 3: 
      this.b = paramn.a();
      this.c = paramn.a();
      this.d = paramn.d();
      return;
    case 4: 
      this.jdField_a_of_type_JavaLangString = paramn.a();
      return;
    case 5: 
      if ((this.b = paramn.a()) >= 0)
      {
        this.c = paramn.a();
        this.d = paramn.d();
        return;
      }
      break;
    case 6: 
      paramn.a();
    }
  }
  
  public u() {}
  
  public static void a(String paramString, n paramn)
  {
    a(paramString, paramn.a());
  }
  
  private static boolean a(String paramString, byte[] paramArrayOfByte)
  {
    RecordStore localRecordStore = null;
    try
    {
      paramString = (localRecordStore = RecordStore.openRecordStore(paramString, true)).enumerateRecords(null, null, false);
      label18:
      int j;
      for (int i = -1; paramString.hasNextElement(); i = j)
      {
        j = paramString.nextRecordId();
        byte[] arrayOfByte;
        if (((arrayOfByte = localRecordStore.getRecord(j)).length <= 0) || (arrayOfByte[0] != paramArrayOfByte[0])) {
          break label18;
        }
      }
      paramString.destroy();
      if (i == -1) {
        localRecordStore.addRecord(paramArrayOfByte, 0, paramArrayOfByte.length);
      } else {
        localRecordStore.setRecord(i, paramArrayOfByte, 0, paramArrayOfByte.length);
      }
      if (localRecordStore != null) {
        try
        {
          localRecordStore.closeRecordStore();
        }
        catch (Exception localException1) {}
      }
      return true;
    }
    catch (Exception localException2)
    {
      if (localRecordStore != null) {
        try
        {
          localRecordStore.closeRecordStore();
        }
        catch (Exception localException3) {}
      }
    }
    return false;
  }
  
  private static byte[] a(String paramString, int paramInt)
  {
    RecordStore localRecordStore = null;
    Object localObject = null;
    try
    {
      paramString = (localRecordStore = RecordStore.openRecordStore(paramString, false)).enumerateRecords(null, null, false);
      byte[] arrayOfByte;
      while (paramString.hasNextElement()) {
        if (((arrayOfByte = paramString.nextRecord()).length > 0) && (arrayOfByte[0] == paramInt)) {
          localObject = arrayOfByte;
        }
      }
      paramString.destroy();
      if (localObject != null)
      {
        arrayOfByte = new byte[localObject.length - 1];
        System.arraycopy(localObject, 1, arrayOfByte, 0, localObject.length - 1);
        localObject = arrayOfByte;
      }
      paramString = (String)localObject;
      if (localRecordStore != null) {
        try
        {
          localRecordStore.closeRecordStore();
        }
        catch (Exception localException1) {}
      }
      return paramString;
    }
    catch (Exception localException2)
    {
      if (localRecordStore != null) {
        try
        {
          localRecordStore.closeRecordStore();
        }
        catch (Exception localException3) {}
      }
    }
    return null;
  }
  
  public static boolean a(String paramString, int paramInt, n paramn)
  {
    if ((paramString = a(paramString, paramInt)) == null) {
      return false;
    }
    if (paramString.length > paramn.a.length) {
      paramn.a = paramString;
    } else {
      System.arraycopy(paramString, 0, paramn.a, 0, paramString.length);
    }
    return true;
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\u.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */