package com.deb.practice;

public class StringConcatenateExercise {
    
    private String OK = "OK";
    
     public static void main(String args[]) {
         
         String[] values = {"turkey", "us", "india", "thailand"}; 
         
         for (String str: values)
         {
        	 System.out.print(str+" ");
         }
         StringConcatenateExercise exercise = new StringConcatenateExercise();
     
         StringBuffer buffer = exercise.concatanateStrings(values);
         
         System.out.println(buffer.toString());
         
     }
     
     private StringBuffer concatanateStrings(String[] strings) {
         
         StringBuffer buffer = new StringBuffer();
         int next = strings.length;
         for (String str : strings)
         {
        	 str = str + " ";
        	 if (buffer.length() != 0)
        		 buffer.insert(0, str);
        	 if (buffer.length() == 0)
        		 buffer.append(str);
        	 
         }
     
         buffer.append(OK);
         // write code here. result should be "thailand india us turkey OK"
         
         return buffer;
     }

}
