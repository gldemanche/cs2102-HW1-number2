class SoccerResult implements IResults {
    SoccerTeam team1;
    SoccerTeam team2;
    double team1Points;
    double team2points;

    public SoccerResult(SoccerTeam team1, SoccerTeam team2, double team1Points, double team2points) {
        this.team1 = team1;
        this.team2 = team2;
        this.team1Points = team1Points;
        this.team2points = team2points;
    }

    public boolean isValid(){

        return team1Points < 150 && team2points < 150;
    }
}