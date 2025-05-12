public class Reduce {
   public static void main(String[] args) {
      int i = 0;
      int j = 100;
         while(j > 0){
            if(j % 2 == 0){
                j = j / 2;
            } else {
                j = j -1;
            }
            i++;
         }
         System.out.println(i);
   }
}
