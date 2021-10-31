class LegoRobotTeam implements IContestant{
    String school;
    String feature;
    int previousScore;

    public LegoRobotTeam(String school, String feature, int previousScore){
        this.school = school;
        this.feature = feature;
        this.previousScore = previousScore;
    }

    public boolean expectToBeat(LegoRobotTeam team2){
        return this.previousScore > team2.previousScore;
    }
}
