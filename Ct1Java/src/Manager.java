class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String position, double salary, int teamSize) {
        super(name, position, salary);

        if (teamSize >= 0) {
            this.teamSize = teamSize;
        } else {
            this.teamSize = 0;
        }
    }

    public int getTeamSize() {
        return teamSize;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.15 + teamSize * 1000;
    }

    @Override
    public String toString() {
        return super.toString() + ", размер команды: " + teamSize;
    }
}