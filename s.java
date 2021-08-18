import java.io.EOFException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.microedition.io.Connection;
import javax.microedition.io.Connector;
import javax.microedition.io.ContentConnection;
import javax.microedition.io.HttpConnection;
import javax.microedition.io.InputConnection;
import javax.microedition.io.OutputConnection;
import javax.microedition.io.SocketConnection;

public final class s
  extends Thread
{
  private InputStream jdField_a_of_type_JavaIoInputStream;
  private OutputStream jdField_a_of_type_JavaIoOutputStream;
  private byte jdField_a_of_type_Byte;
  public boolean a;
  private SocketConnection jdField_a_of_type_JavaxMicroeditionIoSocketConnection;
  private static volatile int jdField_a_of_type_Int;
  private o jdField_a_of_type_O;
  
  public s(o paramo)
  {
    this.jdField_a_of_type_O = paramo;
    if (paramo.jdField_a_of_type_JavaLangString.startsWith("http")) {
      this.jdField_a_of_type_Byte = 2;
    } else if (paramo.jdField_a_of_type_JavaLangString.startsWith("socket")) {
      this.jdField_a_of_type_Byte = 3;
    } else if (!paramo.jdField_a_of_type_JavaLangString.startsWith("sms")) {
      throw new RuntimeException("invaild type!");
    }
    this.jdField_a_of_type_Boolean = true;
  }
  
  private s(s params, byte paramByte)
  {
    this.jdField_a_of_type_O = params.jdField_a_of_type_O;
    this.jdField_a_of_type_Byte = paramByte;
    if (paramByte == 0)
    {
      this.jdField_a_of_type_JavaIoOutputStream = params.jdField_a_of_type_JavaIoOutputStream;
      this.jdField_a_of_type_JavaIoInputStream = params.jdField_a_of_type_JavaIoInputStream;
      this.jdField_a_of_type_JavaxMicroeditionIoSocketConnection = params.jdField_a_of_type_JavaxMicroeditionIoSocketConnection;
    }
    else
    {
      this.jdField_a_of_type_JavaIoInputStream = params.jdField_a_of_type_JavaIoInputStream;
    }
    this.jdField_a_of_type_Boolean = true;
  }
  
  public final void run()
  {
    try
    {
      while (this.jdField_a_of_type_Boolean)
      {
        s locals;
        Object localObject1;
        switch (this.jdField_a_of_type_Byte)
        {
        case 2: 
          locals = this;
          InputStream localInputStream = null;
          try
          {
            String str = null;
            HttpConnection localHttpConnection;
            int k;
            n localn;
            if (((k = (localHttpConnection = (HttpConnection)Connector.open(((r)locals.jdField_a_of_type_O).jdField_a_of_type_JavaLangString, 3, true)).getResponseCode()) >= 200) && (k < 300)) {
              if ((((str = localHttpConnection.getHeaderField("Content-Type")) != null) && (str.startsWith("sky")) ? 1 : 0) != 0)
              {
                e.t();
                localInputStream = localHttpConnection.openInputStream();
                int j;
                if ((j = (int)localHttpConnection.getLength()) > 0)
                {
                  localn = locals.jdField_a_of_type_O.a(j);
                  int m = 0;
                  while (m < j)
                  {
                    int i;
                    if ((i = localn.a(localInputStream, j)) < 0) {
                      throw new EOFException();
                    }
                    m += i;
                  }
                  locals.jdField_a_of_type_O.a();
                  locals.jdField_a_of_type_O.b();
                }
                localInputStream.close();
                break;
              }
            }
            throw new Exception("invaild responsecode:" + localn);
          }
          catch (Exception localException2)
          {
            try
            {
              if (localInputStream != null) {
                localInputStream.close();
              }
            }
            catch (Exception localException3) {}
            Object localObject2 = null;
            locals.jdField_a_of_type_Boolean = false;
            locals.jdField_a_of_type_O.a(localException2);
          }
        case 0: 
          locals = this;
          if ((this.jdField_a_of_type_O.jdField_a_of_type_Boolean) && ((localObject1 = locals.jdField_a_of_type_O.a()) != null))
          {
            locals.jdField_a_of_type_O.a((n)localObject1, ((n)localObject1).b());
            ((n)localObject1).a(locals.jdField_a_of_type_JavaIoOutputStream);
            locals.jdField_a_of_type_JavaIoOutputStream.flush();
            jdField_a_of_type_Int += ((n)localObject1).b() + 54;
          }
          break;
        case 1: 
          a();
          break;
        case 3: 
          locals = this;
          (localObject1 = (q)this.jdField_a_of_type_O).a(0);
          locals.jdField_a_of_type_JavaxMicroeditionIoSocketConnection = ((SocketConnection)Connector.open(((o)localObject1).jdField_a_of_type_JavaLangString, 3, true));
          locals.jdField_a_of_type_JavaxMicroeditionIoSocketConnection.setSocketOption((byte)2, 0);
          locals.jdField_a_of_type_JavaxMicroeditionIoSocketConnection.setSocketOption((byte)0, 1);
          locals.jdField_a_of_type_JavaxMicroeditionIoSocketConnection.setSocketOption((byte)1, 5);
          locals.jdField_a_of_type_JavaIoOutputStream = locals.jdField_a_of_type_JavaxMicroeditionIoSocketConnection.openOutputStream();
          locals.jdField_a_of_type_JavaIoInputStream = locals.jdField_a_of_type_JavaxMicroeditionIoSocketConnection.openInputStream();
          ((q)localObject1).a = new s(locals, (byte)0);
          ((q)localObject1).a.start();
          ((q)localObject1).b = new s(locals, (byte)1);
          ((q)localObject1).b.start();
          locals.jdField_a_of_type_Boolean = false;
        }
        try
        {
          Thread.sleep(30L);
        }
        catch (Exception localException4) {}
      }
    }
    catch (Exception localException1)
    {
      System.gc();
      ((q)this.jdField_a_of_type_O).d();
      System.gc();
      q.b(1);
      this.jdField_a_of_type_O.a(localException1);
    }
    try
    {
      if (this.jdField_a_of_type_Byte == 0)
      {
        this.jdField_a_of_type_JavaIoInputStream.close();
        this.jdField_a_of_type_JavaIoOutputStream.close();
        this.jdField_a_of_type_JavaxMicroeditionIoSocketConnection.close();
        this.jdField_a_of_type_JavaIoInputStream = null;
        this.jdField_a_of_type_JavaIoOutputStream = null;
        this.jdField_a_of_type_JavaxMicroeditionIoSocketConnection = null;
      }
      return;
    }
    catch (Exception localException5) {}
  }
  
  private void a()
  {
    q localq = (q)this.jdField_a_of_type_O;
    int i;
    if ((i = this.jdField_a_of_type_JavaIoInputStream.read()) < 0)
    {
      localq.d();
      System.gc();
      q.b(1);
      return;
    }
    int j = this.jdField_a_of_type_JavaIoInputStream.read();
    int k = localq.a();
    j = (i = ((i ^ k) & 0xFF) << 8 | (j ^ k) & 0xFF) / 1460;
    jdField_a_of_type_Int += i + (j == 0 ? 1 : j) * 54;
    if (i <= 0) {
      return;
    }
    n localn = localq.a(i);
    k = 0;
    while (k < i)
    {
      int m;
      if ((m = localn.a(this.jdField_a_of_type_JavaIoInputStream, i)) < 0) {
        throw new EOFException();
      }
      k += m;
    }
    localq.b(localn, localn.a());
    localq.a();
  }
}


/* Location:              H:\FileRecv\846526022\FileRecv\xiyou.jar!\s.class
 * Java compiler version: 1 (45.3)
 * JD-Core Version:       0.7.1
 */