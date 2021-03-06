package projet.poo;

import java.util.ArrayList;

public class ProjetPOO {
    static ArrayList<Client> clients = new ArrayList<>();
    
    //public static void getData(){
      //  String text = GUI.getjTextField1();
    //}

    public static Client constructClient(String firstName, String lastName, boolean isStudent){
        Client c = new Client(firstName, lastName, isStudent);
        clients.add(c);
        return c;
    }
    
    public static String showClients(){
        String s = "";
        for (int i = 0; i < clients.size(); i++)
            s.concat(clients.get(i).toString());
        return s;
    }
    
    public static void createTicket(Client c){
        Ticket t;
        if (c.isStudent() == true)
            t = new StudentTicket(c);
        else
            t = new NormalTicket(c);
        
        c.addTicket(t);
    }
    
}
