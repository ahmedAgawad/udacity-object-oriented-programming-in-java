public class Main {
    public static void main(String args[]) {
            ContactsManager cm = new ContactsManager();

            Contact c1 = new Contact();
            c1.name = "first";
            c1.email = "test1@gmail.com";
            c1.phoneNum = "01111111";

            Contact c2 = new Contact();
            c2.name = "second";
            c2.email = "test2@gmail.com";
            c2.phoneNum = "01010101";

            Contact c3 = new Contact();
            c3.name = "third";
            c3.email = "test3@gmail.com";
            c3.phoneNum = "02334445";

            cm.addContact(c1);
            cm.addContact(c2);
            cm.addContact(c3);

            System.out.println(cm.searchContact("third").phoneNum);
    }
}
