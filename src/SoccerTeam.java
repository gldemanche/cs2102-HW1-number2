class SoccerTeam implements IContestant{
    String country;
    String jerseyColor;
    boolean hasRitual;
    int wins;
    int losses;

    public SoccerTeam(String country, String jerseyColor, boolean hasRitual, int wins, int losses){
        this.country = country;
        this.jerseyColor = jerseyColor;
        this.hasRitual = hasRitual;
        this.wins = wins;
        this.losses = losses;
    }

    public boolean expectToBeat(SoccerTeam team2){
        if(this.hasRitual && !team2.hasRitual)
            return true;
        else if(!this.hasRitual && team2.hasRitual)
            return false;
        else
            return (this.wins - this.losses) > (team2.wins - team2.losses);
    }

}
