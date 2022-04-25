import java.io.DataInputStream;
import java.io.IOException;
import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int opt;
    Scanner s = new Scanner(System.in);
    while(true){
      System.out.println("1. Dodaj studenta");
      System.out.println("2. Wyswietl wszystkich studentow");
      System.out.println("3. Wyszukaj studenta");
      opt=s.nextInt();
        switch(opt){
        case 1:
        dodaj(); break;
        case 2:
        wyswietl(); break;
        case 3:
        szukaj(); break;
        default: System.out.println("Brak opcji"); break;
    }
  }
}
    public static void dodaj() {
    try {
      Scanner st = new Scanner(System.in);
      String im="", naz="", dat="";
      int wiek;
      System.out.println("Podaj imie studenta: ");
      im=st.nextLine();
      System.out.println("Podaj nazwisko studenta: ");
      naz=st.nextLine();
      System.out.println("Podaj wiek studenta: ");
      wiek=st.nextInt();
      System.out.println("Podaj date urodzenia studenta: ");
      st.nextLine();
      dat=st.nextLine();
      Service1 s = new Service1();
      s.addStudent(new Student(im, naz, wiek, dat));
      System.out.println("Dodano studenta.");
      System.out.println("");
    } catch (IOException e) {

    }
  }
  
  public static void wyswietl() {
    try {
      Service1 s = new Service1();
      var students = s.getStudents();
      for(Student current : students) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }

  public static void szukaj() {
    try{
      int dan;
      String dana;
      Scanner st = new Scanner(System.in);
      System.out.println("Wyszukaj: ");
      dana=st.nextLine();
      Service1 scn = new Service1();
      var wysz = scn.findStudentByName(dana);
      for(Student current : wysz) {
        System.out.println(current.ToString());
      }
    } catch (IOException e) {

    }
  }

  
}