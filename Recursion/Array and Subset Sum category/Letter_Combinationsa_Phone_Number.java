import java.util.*;
public class Letter_Combinationsa_Phone_Number{
     public static void main(String[] args){
        String s="23";
        List<String> ans =letterCombinations(s);
        System.out.println("ans-->"+ans);
     }

    public static List<String> letterCombinations(String digits) {
        List<String> st = new ArrayList<>();
      if(digits.length()==0)
      return st;
        HashMap<Character,String>map= new HashMap<>();
       map.put('2',"abc");
       map.put('3',"def");
       map.put('4',"ghi");
       map.put('5',"jkl");
       map.put('6',"mno");
       map.put('7',"pqrs");
       map.put('8',"tuv");
       map.put('9',"wxyz");
       StringBuilder sb = new StringBuilder();
       fun(digits,st,0,sb,map);
       return st;
    //    System.out.println(map);
       
    }
    public static void fun(String digits,List<String> st,int idx,StringBuilder temp,HashMap<Character,String>map)
    {
   
        // Base case
        if(idx==digits.length())
        {
            st.add(temp.toString());
            return ;
        }
        char c= digits.charAt(idx);
        String mapValue=map.get(c);//"abc"
        for(int i=0;i<mapValue.length();i++)
        {
            //Recursive calls
            temp.append(mapValue.charAt(i));
            fun(digits,st,idx+1,temp,map);//idx-->represent index that is working on given string
             temp.deleteCharAt(temp.length() - 1);

             //T.C =O(N*4^N)
             //S.C =O(N*4^N)
        }
    }

}