package part6;

public class Staff {
    StaffMember[] staffList;
    
    Staff(){
        staffList = new StaffMember[10];
    }

    void addStaffMember(StaffMember staff){
        for (int i=0; i<staffList.length; i++){
            if(staffList[i] == null) {
                staffList[i] = staff;
                break;
            }
        }
    }

    double payDay(){
        double allPaid = 0;
        for (StaffMember person:staffList) {
            if(person!=null) {
                System.out.println(person.toString());
                System.out.println();
                allPaid += person.pay();
            }
            else continue;
        }
        return allPaid;
    }
}
