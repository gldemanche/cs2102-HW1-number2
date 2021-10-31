public class LegoRobotResult implements IResults{
    LegoRobotTeam team1;
    LegoRobotTeam team2;
    double team1points;
    double team2points;
    int team1tasks;
    int team2tasks;
    boolean team1fell;
    boolean team2fell;

    public LegoRobotResult(LegoRobotTeam team1, LegoRobotTeam team2,
                           double team1points, int team1tasks, boolean team1fell,
                           double team2points, int team2tasks, boolean team2fell){
        this.team1 = team1;
        this.team2 = team2;
        this.team1points = team1points;
        this.team2points = team2points;
        this.team1tasks = team1tasks;
        this.team2tasks = team2tasks;
        this.team1fell = team1fell;
        this.team2fell = team2fell;
    }

    //determines if team 1 has a valid score
    public boolean isTeam1Valid(){
        return team1tasks < 8 && team1points <= 16;
    }

    //determines if team 2 has valid score
    public boolean isTeam2Valid(){
        return team2tasks < 8 && team2points <= 16;

    }
    public boolean isValid() {
        return isTeam1Valid() && isTeam2Valid();
    }
}
