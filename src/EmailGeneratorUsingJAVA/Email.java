package EmailGeneratorUsingJAVA;

public class Email{
    private String firstName;
    private String lastName;
    private String department;
    private int batch;
    private String password;
    private String email;
    private String collegeDomain = "qct.sa.com";
    private int defaultPasswordLength = 8;

    private int mailboxCapacity;
    private String alternateEmail;
    //Constructor to Receive the Firstname and Lastname
    public Email(String fName,String lName,int deptChoice,int batch){
        this.firstName = fName;
        this.lastName = lName;
        this.department = setDepartment(deptChoice);
        this.batch = batch;
        this.password = randomPassword(defaultPasswordLength);
        this.email = firstName.toLowerCase() + lastName.toLowerCase() + "@" + batch + department + "." + collegeDomain;
    }

    //Asking for Department
    private String setDepartment(int deptChoice){
        switch (deptChoice) {
            case 1:
                return "ae";
            case 2:
                return "bt";
            case 3:
                return "cs";
            case 4:
                return "ci";
            case 5:
                return "mc";
            case 6:
                return "me";
            case 7:
                return "tt";
            case 8:
                return "ee";
            case 9:
                return "ec";
            case 10:
                return "ei";
            default:
                return "";
        }
    }

    //Generate a random password
    private String randomPassword(int length){
        String passwordLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@$&!#";
        char[] passArray = new char[length];

        for(int i=0;i<length;i++){
            int random = (int)(Math.random() * passwordLetters.length());
            passArray[i] = passwordLetters.charAt(random);
        }
        return new String(passArray);
    }

    //Set the Mailbox Capacity
    public void setMailboxCapacity(int Capacity){
        this.mailboxCapacity = Capacity;
    }

    //Set the alternate email
    public void setAlternateEmail(String email){
        this.alternateEmail = email;
    }

    //Change the password
    public void changePassword(String password){
        this.password = password;
    }

    public String getPassword(){return password;}
    public int getMailBoxCapacity(){return mailboxCapacity;}
    public String getAlternateEmail(){return alternateEmail;}

    public String showInfo(){
        return "Name : " + firstName + " " + lastName + "\nEmail : " + email ;
    }
}
