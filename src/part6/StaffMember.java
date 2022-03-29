package part6;

public class StaffMember {
    protected String name;
    protected String surname;
    protected String phone;

    StaffMember(String _name, String _surname, String _phone){
        name = _name;
        surname = _surname;
        phone = _phone;
    }

    public String toString(){
        String data = "";
        data+= name + " " + surname + " " + phone + "\n";
        data+="Sumokėta: " + pay();
        return data;
    }

    public double pay(){
        return 0;
    }
}
