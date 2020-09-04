public class MyFirstjavaprogram {
public static void main(String []args) {
int count=0;
for(int i=0;i<Beezlabs.length();i++){
if(Beezlabs.charAt(i)!='')
count++;
}
System.out.println("Total number of characters in a Beezlabs:"+count);
}
}
