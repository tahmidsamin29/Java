package Problem4;

public class Problem4_2 {
    public static void main(String[] args) {
        String a="electronics";
        String b="fashion";
        String c="Apple";
        boolean dummy=true;
        String d="Nike";
        // filterProducts(a);
        // filterProducts(b);
        // filterProducts(c, dummy);
        // filterProducts(d, dummy);
        // filterProducts(100, 600);
        filterProducts(a, 100, 376, c);
        
    }

static void filterProducts(String category){
   if(category=="electronics"){
    System.out.println("1. Ipad");
    System.out.println("2. Iphone");
    System.out.println("3. Mac");
   } 
   else if(category=="fashion"){
    System.out.println("1. Air Force 1");
    System.out.println("2. Air Max");
    System.out.println("3. Nike Dunk");
   }
   else{
    System.out.println("No available items in this category.");  
    }
}
static void filterProducts(int range_start, int range_end){
if(range_start>=100 && range_end<=250){
System.out.println("1. Ipad");
System.out.println("2. Air Force 1");
}
else if(range_start>=251 && range_end<=350){
System.out.println("1. Iphone");
System.out.println("2. Air Max"); 
}
else if(range_start>=351){
System.out.println("1. Mac");
System.out.println("2. Nike Dunk"); 
}
else if(range_start>=100 && range_end>=500){
System.out.println("1. Ipad");
System.out.println("2. Air Force 1");
System.out.println("3. Iphone");
System.out.println("4. Air Max");
System.out.println("5. Mac");
System.out.println("6. Nike Dunk"); 
}
else if(range_start>=100 && range_end>=350){
System.out.println("1. Mac");
System.out.println("2. Nike Dunk");
System.out.println("3. Iphone");
System.out.println("4. Air Max");  
}
else if(range_start>=251 && range_end>=500){
System.out.println("1. Iphone");
System.out.println("2. Air Max");
System.out.println("3. Mac");
System.out.println("4. Nike Dunk"); 
}
else if(range_start<100){
System.out.println("No available items in the given price range.");
}


}
static void filterProducts(String brand, boolean a){
    if(brand=="Apple"){
    System.out.println("1. Ipad");
    System.out.println("2. Iphone");
    System.out.println("3. Mac");
    }
    else if(brand=="Nike"){
    System.out.println("1. Air Force 1");
    System.out.println("2. Air Max");
    System.out.println("3. Nike Dunk");
    }
    else{
    System.out.println("No available items in the given price range.");  
    }

}
static void filterProducts(String category, int range_start, int range_end){
if(category=="electronics"){
if(range_start>=100 && range_end<=250){
System.out.println("1. Ipad");
}
else if(range_start>=251 && range_end<=350){
System.out.println("1. Iphone");
}
else if(range_start>=351){
System.out.println("1. Mac");
}
else if(range_start>=100 && range_end>=500){
System.out.println("1. Mac");
System.out.println("2. Iphone");
System.out.println("3. Mac");
}
else if(range_start>=100 && range_end>=350){
System.out.println("1. Mac");
System.out.println("2. Iphone");
}
else if(range_start>=251 && range_end>=500){
System.out.println("1. Iphone");
System.out.println("2. Mac");
}
else if(range_start<100){
    System.out.println("No available items in the given price range.");
}
}

else if(category=="fashion"){
if(range_start>=100 && range_end<=250){
System.out.println("1. Air Force 1");
}
else if(range_start>=251 && range_end<=350){
System.out.println("1. Air Max"); 
}
else if(range_start>=351){
System.out.println("1. Nike Dunk"); 
}
else if(range_start>=100 && range_end>=500){
System.out.println("1. Nike Dunk");
System.out.println("2. Air Max");
System.out.println("3. Nike Dunk"); 
}
else if(range_start>=100 && range_end>=350){
System.out.println("1. Nike Dunk");
System.out.println("2. Air Max");  
}
else if(range_start>=251 && range_end>=500){
System.out.println("1. Air Max");
System.out.println("2. Nike Dunk"); 
}
else if(range_start<100){
    System.out.println("No available items in the given price range.");
}
}

else{
System.out.println("No available items in this category.");
}
}
static void filterProducts(String category, int range_start, int range_end, String brand){
if(category=="electronics"){
    if(brand=="Nike"){
    System.out.println("No available items in this brand for given category.");
    }
    else if(brand=="Apple"){
        if(range_start>=100 && range_end<=250){
System.out.println("1. Ipad");
}
else if(range_start>=251 && range_end<=350){
System.out.println("1. Iphone");
}
else if(range_start>=351){
System.out.println("1. Mac");
}
else if(range_start>=100 && range_end>=500){
System.out.println("1. Mac");
System.out.println("2. Iphone");
System.out.println("3. Mac");
}
else if(range_start>=100 && range_end>=350){
System.out.println("1. Mac");
System.out.println("2. Iphone");
}
else if(range_start>=251 && range_end>=500){
System.out.println("1. Iphone");
System.out.println("2. Mac");
}
else if(range_start<100){
    System.out.println("No available items in the given price range.");
}
    }
else{
  System.out.println("No available items in this brand for given category.");  
}
}

else if(category=="fashion"){
    if(brand=="Apple"){
    System.out.println("No available items in this brand for given category.");
    }
    else if(brand=="Nike"){
        if(range_start>=100 && range_end<=250){
System.out.println("1. Air Force 1");
}
else if(range_start>=251 && range_end<=350){
System.out.println("1. Air Max"); 
}
else if(range_start>=351){
System.out.println("1. Nike Dunk"); 
}
else if(range_start>=100 && range_end>=500){
System.out.println("1. Nike Dunk");
System.out.println("2. Air Max");
System.out.println("3. Nike Dunk"); 
}
else if(range_start>=100 && range_end>=350){
System.out.println("1. Nike Dunk");
System.out.println("2. Air Max");  
}
else if(range_start>=251 && range_end>=500){
System.out.println("1. Air Max");
System.out.println("2. Nike Dunk"); 
}
else if(range_start<100){
    System.out.println("No available items in the given price range.");
}
}
}
else{
 System.out.println("No available items in this category.");   
}
}}

