// Source code is decompiled from a .class file using FernFlower decompiler.
package university.management.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Conn {
   Connection c;
   Statement s;

   Conn() {
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         this.c = DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem", "my-sql-id", "my-sql-password");
         this.s = this.c.createStatement();
      } catch (Exception var2) {
         var2.printStackTrace();
      }

   }
}
