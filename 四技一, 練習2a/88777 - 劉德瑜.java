=======================================================================================
請按規定格式回傳, 改好後再上傳.
=======================================================================================
(1)
class Main {
    public static void main(String[] args) {
        String s="aaaaa";
        
        boolean flag=false;
        
          for(int i=0;i<s.length();i++)  {
          char c=s.charAt(i);//是取字符串中的第 i ?字符
        //老師我想問一夏這裡沒加(char c=s.charAt(i);)是否有影響
               
          if(i>=1){
               flag=true;          }
        }  
        System.out.println(flag);
    }
}
(2)
class Main {
    public static void main(String[] args) {
        String s="aA7777a";
       
        boolean flag=false;
        char char_first = '0';//?��???
        
          for(int i=0;i<s.length();i++)  {
            if( i == 0 ){
              char_first = s.charAt(i);
              //System.out.println(char_first);
            }
               //char c=s.charAt(i);
            //if(i>=1){
               //flag=true;//敺??�甇餉�?
               //System.out.println("A");//
            //}
            if(i == s.length()-1){
              System.out.println(s.charAt(i));
              //System.out.println(char_first);
              if( char_first == s.charAt(i) ){
                flag = true;
              }
            }
          }
          
        System.out.println(flag);
    }
}
(3)class Main {
    public static void main(String[] args) {
        String s="aabaaa";
        boolean flag=true;
       
        if (s.length()>=5 && s.length()<=10){
          char char_first =s.charAt(0);
          System.out.println(char_first);
          for(int i=0;i<s.length();i++){
            if(s.charAt(i)==char_first){
      
            }else{
              flag = false;
            }
          }
          System.out.println(flag);
          
        }else{
          flag = false;
          System.out.println(flag);
        }
    }
}
(4)
class Main {
    public static void main(String[] args) {
      String s="77777";
      boolean flag=false;
      
      if ( s.length()%2!=0) {
        //flag = true;
        for (int i=0;i<s.length();i++){
          if (s.charAt(i)>=48 && s.charAt(i)<=57)
           flag = true;
        }
      }
        
        
        
        System.out.println(flag);
    }
    
    
}
(5)
class Main {
    public static void main(String[] args) {
      String s="77..77";
      boolean flag=true;
      int counter =0;
      
      if ( s.length()>=5) {
        
        for (int i=0;i<s.length();i++){
          if (s.charAt(i)=='.')
            counter++;
          if (i == s.length()-1){
            if(s.charAt(i)=='.')
              flag = false;
          }
          if ((s.charAt(i)>=48 && s.charAt(i)<=57) || s.charAt(i)== '.') {
            
          }else{
            flag = false;
          }
          
          
           
        }
        if (counter>1){
          flag = false;
        
          
        }
        
      }
      
        
        
        
        System.out.println(flag);
    }
}
    