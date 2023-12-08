package com.app.sam.interview.array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;

public class TournamentWinnerArray {

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results) {
        Hashtable<String, Integer> winners = new Hashtable<>();
        String winner = "";
        int winningScore = 0;
        for (int i = 0; i < competitions.size(); i++) {
            String team = "";
            if (results.get(i) == 1) {
                team = competitions.get(i).get(0);
                winners.put(team, winners.containsKey(team) ? winners.get(team) + 3 : 3);
            } else {
                team = competitions.get(i).get(1);
                winners.put(team, winners.containsKey(team) ? winners.get(team) + 3 : 3);
            }

            if (winners.get(team) > winningScore) {
                winner = team;
                winningScore = winners.get(team);
            }
        }
        return winner;
    }

    public static void main(String args[]) {
        String winningTeam = tournamentWinner(
                new ArrayList<ArrayList<String>>() {{
                    add(new ArrayList<String>() {{
                        add("HTML");
                        add("C#");
                    }});
                    add(new ArrayList<String>() {{
                        add("C#");
                        add("Python");
                    }});
                    add(new ArrayList<String>() {{
                        add("Python");
                        add("HTML");
                    }});
                }},
                new ArrayList<Integer>() {{
                    add(0);
                    add(0);
                    add(1);
                }});
        System.out.println(winningTeam);
    }
}
