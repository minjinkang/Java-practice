package pac;

import java.sql.*;
import java.util.ArrayList;

public class SearchDAO {

    java.sql.Connection conn = null;
      
    Statement statement = null;
      
    ResultSet rsBlous = null;		//블라우스
    ResultSet rsShotT = null;		//반팔티
    ResultSet rsLongT = null;		//긴팔티
    ResultSet rsShirt = null;		//셔츠
    
    ResultSet rsShotP = null;		//반바지
    ResultSet rsLongP = null;		//긴바지
    ResultSet rsShotS = null;		//숏치마
    ResultSet rsLongS = null;		//롱치마
    
    ResultSet rsCadigan = null;		//가디건
    ResultSet rsTweed = null;		//트위드
    ResultSet rsShotJ = null;		//숏자켓
    ResultSet rsLongJ = null;		//롱자켓
    
    ResultSet rsEar = null;			//귀걸이
    ResultSet rsNeck = null;		//목걸이
    ResultSet rsRing = null;		//반지
    ResultSet rsHairBand = null;	//머리끈
    
    ResultSet rsTshirts = null;		//티셔츠
    ResultSet rsPants = null;		//바지
    ResultSet rsSkirt = null;		//치마
    ResultSet rsJacket = null;		//자켓
    
    public SearchDAO() {
       
    	String url = "jdbc:oracle:thin:@127.0.0.1:1521:XE";
         
        String user = "shop";
         
        String pwd = "1846";
         
         try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         
         try {
               conn = DriverManager.getConnection(url, user, pwd);
               
               
            } catch (SQLException e) {
               // TODO Auto-generated catch block
               e.printStackTrace();
                }
      } catch (ClassNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
    }
    
    public void dbClose() {
         try {
            if (rsBlous != null)
               rsBlous.close();
            
            if (rsShotT != null)
            	rsShotT.close();
            
            if (rsLongT != null)
            	rsLongT.close();
            
            if (rsShirt != null)
            	rsShirt.close();
            
            if (rsShotP != null)
            	rsShotP.close();
            
            if (rsLongP != null)
            	rsLongP.close();
            
            if (rsShotS != null)
            	rsShotS.close();
            
            if (rsLongS != null)
            	rsLongS.close();
            
            if (rsCadigan != null)
               rsCadigan.close();
            
            if (rsTweed != null)
            	rsTweed.close();
            
            if (rsShotJ != null)
            	rsShotJ.close();
            
            if (rsLongJ != null)
            	rsLongJ.close();
            
            if (rsEar != null)
               rsEar.close();
        
            if (rsNeck != null)
            	rsNeck.close();
            
            if (rsEar != null)
            	rsEar.close();
            
            if (rsHairBand != null)
            	rsHairBand.close();
            
            if (rsTshirts != null)
            	rsTshirts.close();
            
            if (rsPants  != null)
            	rsPants.close();
            
            if (rsTshirts != null)
            	rsTshirts.close();
            
            if (rsJacket  != null)
            	rsJacket.close();
            
            if (statement != null)
               statement.close();
         } 
         catch (Exception e) {
            e.printStackTrace();
         }
      }
   
    public ArrayList<SearchData> readDataBlous() {
       
       ArrayList<SearchData> arrBlous = new ArrayList<SearchData>();
       try {
          statement = conn.createStatement();
          rsBlous = statement.executeQuery("select * from Top where category = '블라우스' ");
          
          while(rsBlous.next()) {
        	  arrBlous.add(new SearchData(rsBlous.getString(1), rsBlous.getInt(2), rsBlous.getString(3),
        			  rsBlous.getString(4), rsBlous.getString(5)));
          }
       }
       catch (SQLException e) {
              e.printStackTrace();
           }
           finally {
              dbClose();
           }
           return arrBlous;
    }
    public ArrayList<SearchData> readDataShortT() {
        
        ArrayList<SearchData> arrShortT = new ArrayList<SearchData>();
        try {
           statement = conn.createStatement();
           rsShotT = statement.executeQuery("select * from Top where category = '반팔티' ");
           
           while(rsShotT.next()) {
        	   arrShortT.add(new SearchData(rsShotT.getString(1), rsShotT.getInt(2), rsShotT.getString(3),
        			   rsShotT.getString(4), rsShotT.getString(5)));
           }
        }
        catch (SQLException e) {
               e.printStackTrace();
            }
            finally {
               dbClose();
            }
            return arrShortT;
     }
    
       public ArrayList<SearchData> readDataLongT() {
          
          ArrayList<SearchData> arrLongT = new ArrayList<SearchData>();
          try {
             statement = conn.createStatement();
             rsLongT = statement.executeQuery("select * from Top where category = '긴팔티' ");
             
             while(rsLongT.next()) {
            	 arrLongT.add(new SearchData(rsLongT.getString(1), rsLongT.getInt(2), rsLongT.getString(3),
            			 rsLongT.getString(4), rsLongT.getString(5)));
             }
          }
          catch (SQLException e) {
                 e.printStackTrace();
              }
              finally {
                 dbClose();
              }
              return arrLongT;
       }
       
       public ArrayList<SearchData> readDataShirts() {
    	   
    	   ArrayList<SearchData> arrShirts = new ArrayList<SearchData>();
    	   try {
    		   statement = conn.createStatement();
    		   rsShirt = statement.executeQuery("select * from Top where category = '셔츠' ");
    		   
    		   while(rsShirt.next()) {
    			   arrShirts.add(new SearchData(rsShirt.getString(1), rsShirt.getInt(2), rsShirt.getString(3),
    					   rsShirt.getString(4), rsShirt.getString(5)));
    		   }
    	   }
    	   catch (SQLException e) {
    		   e.printStackTrace();
    	   }
    	   finally {
    		   dbClose();
    	   }
    	   return arrShirts;
       }
       public ArrayList<SearchData> readDataShotP() {
    	   
    	   ArrayList<SearchData> arrShortP = new ArrayList<SearchData>();
    	   try {
    		   statement = conn.createStatement();
    		   rsShotP = statement.executeQuery("select * from Bottoms where category = '반바지' ");
    		   
    		   while(rsShotP.next()) {
    			   arrShortP.add(new SearchData(rsShotP.getString(1), rsShotP.getInt(2), rsShotP.getString(3),
    					   rsShotP.getString(4), rsShotP.getString(5)));
    		   }
    	   }
    	   catch (SQLException e) {
    		   e.printStackTrace();
    	   }
    	   finally {
    		   dbClose();
    	   }
    	   return arrShortP;
       }
       public ArrayList<SearchData> readDataLongP() {
    	   
    	   ArrayList<SearchData> arrLongP = new ArrayList<SearchData>();
    	   try {
    		   statement = conn.createStatement();
    		   rsLongP = statement.executeQuery("select * from Bottoms where category = '긴바지' ");
    		   
    		   while(rsLongP.next()) {
    			   arrLongP.add(new SearchData(rsLongP.getString(1), rsLongP.getInt(2), rsLongP.getString(3),
    					   rsLongP.getString(4), rsLongP.getString(5)));
    		   }
    	   }
    	   catch (SQLException e) {
    		   e.printStackTrace();
    	   }
    	   finally {
    		   dbClose();
    	   }
    	   return arrLongP;
       }
       public ArrayList<SearchData> readDataShotS() {
    	   
    	   ArrayList<SearchData> arrShotS = new ArrayList<SearchData>();
    	   try {
    		   statement = conn.createStatement();
    		   rsShotS = statement.executeQuery("select * from Bottoms where category = '숏치마' ");
    		   
    		   while(rsShotS.next()) {
    			   arrShotS.add(new SearchData(rsShotS.getString(1), rsShotS.getInt(2), rsShotS.getString(3),
    					   rsShotS.getString(4), rsShotS.getString(5)));
    		   }
    	   }
    	   catch (SQLException e) {
    		   e.printStackTrace();
    	   }
    	   finally {
    		   dbClose();
    	   }
    	   return arrShotS;
       }
       public ArrayList<SearchData> readDataLongS() {
    	   
    	   ArrayList<SearchData> arrLongS = new ArrayList<SearchData>();
    	   try {
    		   statement = conn.createStatement();
    		   rsLongS = statement.executeQuery("select * from Bottoms where category = '롱치마' ");
    		   
    		   while(rsLongS.next()) {
    			   arrLongS.add(new SearchData(rsLongS.getString(1), rsLongS.getInt(2), rsLongS.getString(3),
    					   rsLongS.getString(4), rsLongS.getString(5)));
    		   }
    	   }
    	   catch (SQLException e) {
    		   e.printStackTrace();
    	   }
    	   finally {
    		   dbClose();
    	   }
    	   return arrLongS;
       }
      public ArrayList<SearchData> readDataCadigan() {
    	   
    	   ArrayList<SearchData> arrCadigan = new ArrayList<SearchData>();
    	   try {
    		   statement = conn.createStatement();
    		   rsCadigan = statement.executeQuery("select * from Outer where category = '가디건' ");
    		   
    		   while(rsCadigan.next()) {
    			   arrCadigan.add(new SearchData(rsCadigan.getString(1), rsCadigan.getInt(2), rsCadigan.getString(3),
    					   rsCadigan.getString(4), rsCadigan.getString(5)));
    		   }
    	   }
    	   catch (SQLException e) {
    		   e.printStackTrace();
    	   }
    	   finally {
    		   dbClose();
    	   }
    	   return arrCadigan;
       }
      public ArrayList<SearchData> readDataTweed() {
   	   
   	   ArrayList<SearchData> arrTweed = new ArrayList<SearchData>();
   	   try {
   		   statement = conn.createStatement();
   		   rsTweed = statement.executeQuery("select * from Outer where category = '트위드' ");
   		   
   		   while(rsTweed.next()) {
   			arrTweed.add(new SearchData(rsTweed.getString(1), rsTweed.getInt(2), rsTweed.getString(3),
   					rsTweed.getString(4), rsTweed.getString(5)));
   		   }
   	   }
   	   catch (SQLException e) {
   		   e.printStackTrace();
   	   }
   	   	finally {
   		   dbClose();
   	   }
   	   	return arrTweed;
     }
      public ArrayList<SearchData> readDataShotJ() {
   	   
   	   ArrayList<SearchData> arrShotJ = new ArrayList<SearchData>();
   	   try {
   		   statement = conn.createStatement();
   		   rsShotJ = statement.executeQuery("select * from Outer where category = '반팔자켓' ");
   		   
   		   while(rsShotJ.next()) {
   			arrShotJ.add(new SearchData(rsShotJ.getString(1), rsShotJ.getInt(2), rsShotJ.getString(3),
   					rsShotJ.getString(4), rsShotJ.getString(5)));
   		   }
   	   }
   	   catch (SQLException e) {
   		   e.printStackTrace();
   	   }
   	   finally {
   		   dbClose();
   	   }
   	   return arrShotJ;
   }
      public ArrayList<SearchData> readDataLongJ() {
   	   
   	   ArrayList<SearchData> arrLongJ = new ArrayList<SearchData>();
   	   try {
   		   statement = conn.createStatement();
   		   rsLongJ = statement.executeQuery("select * from Outer where category = '긴팔자켓' ");
   		   
   		   while(rsLongJ.next()) {
   			arrLongJ.add(new SearchData(rsLongJ.getString(1), rsLongJ.getInt(2), rsLongJ.getString(3),
   					rsLongJ.getString(4), rsLongJ.getString(5)));
   		   }
   	   }
   	   catch (SQLException e) {
   		   e.printStackTrace();
   	   }
   	   finally {
   		   dbClose();
   	   }
   	   return arrLongJ;
   }
      public ArrayList<SearchData> readDataEar() {
    	  
    	  ArrayList<SearchData> arrEar = new ArrayList<SearchData>();
    	  try {
    		  statement = conn.createStatement();
    		  rsEar = statement.executeQuery("select * from Acc where category = '귀걸이' ");
    		  
    		  while(rsEar.next()) {
    			  arrEar.add(new SearchData(rsEar.getString(1), rsEar.getInt(2), rsEar.getString(3),
    					  rsEar.getString(4), rsEar.getString(5)));
    		  }
    	  }
    	  catch (SQLException e) {
    		  e.printStackTrace();
    	  }
    	  finally {
    		  dbClose();
    	  }
    	  return arrEar;
      }
      public ArrayList<SearchData> readDataNeck() {
    	  
    	  ArrayList<SearchData> arrNeck = new ArrayList<SearchData>();
    	  try {
    		  statement = conn.createStatement();
    		  rsNeck = statement.executeQuery("select * from Acc where category = '목걸이' ");
    		  
    		  while(rsNeck.next()) {
    			  arrNeck.add(new SearchData(rsNeck.getString(1), rsNeck.getInt(2), rsNeck.getString(3),
    					  rsNeck.getString(4), rsNeck.getString(5)));
    		  }
    	  }
    	  catch (SQLException e) {
    		  e.printStackTrace();
    	  }
    	  finally {
    		  dbClose();
    	  }
    	  return arrNeck;
      }
      public ArrayList<SearchData> readDataRing() {
    	  
    	  ArrayList<SearchData> arrRing = new ArrayList<SearchData>();
    	  try {
    		  statement = conn.createStatement();
    		  rsRing = statement.executeQuery("select * from Acc where category = '반지' ");
    		  
    		  while(rsRing.next()) {
    			  arrRing.add(new SearchData(rsRing.getString(1), rsRing.getInt(2), rsRing.getString(3),
    					  rsRing.getString(4), rsRing.getString(5)));
    		  }
    	  }
    	  catch (SQLException e) {
    		  e.printStackTrace();
    	  }
    	  finally {
    		  dbClose();
    	  }
    	  return arrRing;
      }
      public ArrayList<SearchData> readDataHairBand() {
    	  
    	  ArrayList<SearchData> arrHairBand = new ArrayList<SearchData>();
    	  try {
    		  statement = conn.createStatement();
    		  rsHairBand = statement.executeQuery("select * from Acc where category = '머리끈' ");
    		  
    		  while(rsHairBand.next()) {
    			  arrHairBand.add(new SearchData(rsHairBand.getString(1), rsHairBand.getInt(2), rsHairBand.getString(3),
    					  rsHairBand.getString(4), rsHairBand.getString(5)));
    		  }
    	  }
    	  catch (SQLException e) {
    		  e.printStackTrace();
    	  }
    	  finally {
    		  dbClose();
    	  }
    	  return arrHairBand;
      }
      public ArrayList<SearchData> readDataTshirts() {
    	  
    	  ArrayList<SearchData> arr = new ArrayList<SearchData>();
    	  try {
    		  statement = conn.createStatement();
    		  rsTshirts = statement.executeQuery("select * from Top where category2 = '티셔츠' ");
    		  
    		  while(rsTshirts.next()) {
    			  arr.add(new SearchData(rsTshirts.getString(1), rsTshirts.getInt(2), rsTshirts.getString(3),
    					  rsTshirts.getString(4), rsTshirts.getString(5)));
    		  }
    	  }
    	  catch (SQLException e) {
    		  e.printStackTrace();
    	  }
    	  finally {
    		  dbClose();
    	  }
    	  return arr;
      }
      public ArrayList<SearchData> readDataPants() {
    	  
    	  ArrayList<SearchData> arr = new ArrayList<SearchData>();
    	  try {
    		  statement = conn.createStatement();
    		  rsPants = statement.executeQuery("select * from Bottoms where category2 = '바지' ");
    		  
    		  while(rsPants.next()) {
    			  arr.add(new SearchData(rsPants.getString(1), rsPants.getInt(2), rsPants.getString(3),
    					  rsPants.getString(4), rsPants.getString(5)));
    		  }
    	  }
    	  catch (SQLException e) {
    		  e.printStackTrace();
    	  }
    	  finally {
    		  dbClose();
    	  }
    	  return arr;
      }
      public ArrayList<SearchData> readDataSkirt() {
    	  
    	  ArrayList<SearchData> arr = new ArrayList<SearchData>();
    	  try {
    		  statement = conn.createStatement();
    		  rsSkirt = statement.executeQuery("select * from Bottoms where category2 = '치마' ");
    		  
    		  while(rsSkirt.next()) {
    			  arr.add(new SearchData(rsSkirt.getString(1), rsSkirt.getInt(2), rsSkirt.getString(3),
    					  rsSkirt.getString(4), rsSkirt.getString(5)));
    		  }
    	  }
    	  catch (SQLException e) {
    		  e.printStackTrace();
    	  }
    	  finally {
    		  dbClose();
    	  }
    	  return arr;
      }
      public ArrayList<SearchData> readDataJacket() {
    	  
    	  ArrayList<SearchData> arr = new ArrayList<SearchData>();
    	  try {
    		  statement = conn.createStatement();
    		  rsJacket = statement.executeQuery("select * from Outer where category2 = '자켓' ");
    		  
    		  while(rsJacket.next()) {
    			  arr.add(new SearchData(rsJacket.getString(1), rsJacket.getInt(2), rsJacket.getString(3),
    					  rsJacket.getString(4), rsJacket.getString(5)));
    		  }
    	  }
    	  catch (SQLException e) {
    		  e.printStackTrace();
    	  }
    	  finally {
    		  dbClose();
    	  }
    	  return arr;
      }
}