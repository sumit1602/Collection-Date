package com.company;
  import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.String;
public class Athlete implements Comparable<Athlete>{
    String name;
    String sport;
    String country;
    int world_rank;

    public Athlete(String name, String sport, String country, int world_rank) {
        this.name = name;
        this.sport = sport;
        this.country = country;
        this.world_rank = world_rank;
    }
   public int compareTo(Athlete wr){
        return this.world_rank - wr.world_rank;
    }
}
class main{
    public static void main(String[] args) {
        ArrayList<Athlete> medals = new ArrayList<>();

        medals.add(new Athlete("pt usha","atheletes","india",1));
        medals.add(new Athlete("saniya nehwal","badminton","india",4));
        medals.add(new Athlete("pv sindhu","badminton","india",3));
        medals.add(new Athlete("jwala gutta","badminton","india",2));
        Collections.sort(medals);
        for(Athlete m: medals) {
            System.out.println(m.world_rank);
        }
    }
}