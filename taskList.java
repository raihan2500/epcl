import java.util.*;

class TaskList {
  static Scanner scanner = new Scanner(System.in);
  static List<String> list = new ArrayList<>();

  static final int ADD = 1;
  static final int REMOVE = 2;
  static final int SHOW = 3;
  static final int EXIT = 4;

  static void add() {
    System.out.print("N: ");
    scanner.nextLine();
    list.add(scanner.nextLine());  }

  static void remove() {
    System.out.print("I: ");
        int i = scanner.nextInt();
        if (i >= 0 && i < list.size())
          list.remove(i);
  }

  static void show() {
    for (int i = 0; i < list.size(); i++) {
      System.out.println(i + ": " + list.get(i));
    }
  }

  public static void main(String[] a) {
    while (true) {
      System.out.println("1: Add 2: Remove 3: Show 4: Exit");
      int choice = scanner.nextInt();
      if (choice == ADD) {
        add();        
      } else if (choice == REMOVE) {
        remove();
      } else if (choice == SHOW) {
        show();
      } else if (choice == EXIT)
        break;
    }
    scanner.close();
  }
}
