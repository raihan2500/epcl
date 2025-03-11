import java.util.*;

class TaskList {
  static Scanner scanner = new Scanner(System.in);
  static List<String> list = new ArrayList<>();

  static final int ADD = 1;
  static final int REMOVE = 2;
  static final int SHOW = 3;
  static final int EXIT = 4;
  public static void main(String[] a) {
    while (true) {
      System.out.println("1: Add 2: Remove 3: Show 4: Exit");
      int choice = scanner.nextInt();
      if (choice == ADD) {
        System.out.print("N: ");
        scanner.nextLine();
        list.add(scanner.nextLine());
      } else if (choice == REMOVE) {
        System.out.print("I: ");
        int i = scanner.nextInt();
        if (i >= 0 && i < list.size())
          list.remove(i);
      } else if (choice == SHOW) {
        for (int j = 0; j < list.size(); j++) {
          System.out.println(j + ": " + list.get(j));
        }
      } else if (choice == EXIT)
        break;
    }
  }
}
