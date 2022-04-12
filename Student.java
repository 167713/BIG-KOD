public class Student {

  private String Name;
  private String Sname;
  private int Age;
  private String Dat;

  public Student(String name, String sname, int age, String dat){
    Name = name;
    Sname = sname;
    Age = age;
    Dat = dat;
  }

  public String GetName() {return Name;}
  public String GetSname() {return Sname;}
  public int GetAge() {return Age;}
  public String GetDat() {return Dat;}

  public String ToString() {
    return Name + " " + Sname + " " + Integer.toString(Age) + " " + Dat;
  }

  public static Student Parse(String str) {
    String[] data = str.split(" ");
    if(data.length != 4) 
      return new Student("Parse Error", "Parse Error", -1, "Parse Error");
    return new Student(data[0], data[1], Integer.parseInt(data[2]), data[3]);
  }
}