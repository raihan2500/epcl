import java.util.*;
class TaskList {
static Scanner scanner = new Scanner(System.in);
static List<String> list = new ArrayList<>();
public static void main(String[] a){
  while(true){
System.out.println("1: Add 2: Remove 3: Show 4: Exit");
int choice = scanner.nextInt();
 if(choice==1){
 System.out.print("N: ");
 scanner.nextLine();
   list.add(scanner.nextLine());
   }
else if(choice==2){
System.out.print("I: ");
int i = scanner.nextInt();
   if(i>=0&&i<list.size())list.remove(i);
 }
 else if(choice==3){
for(int j=0;j<list.size();j++)
 {System.out.println(j+": "+list.get(j));}
}
  else if(choice==4)break;}}}
