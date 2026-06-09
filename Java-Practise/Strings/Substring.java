public class Substring {
    public static String subString(String str,int si,int ei) {
        String newStr = "";
   for(int i = si;i<ei;i++) {
       newStr += str.charAt(i);
       }
      return newStr;
    }
    public static void main(String[] args) {
        String str = "HelloWorld";
        System.out.print(subString(str,0,4));
    }
}
