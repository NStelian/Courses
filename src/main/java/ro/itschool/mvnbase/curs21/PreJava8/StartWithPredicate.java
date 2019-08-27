package ro.itschool.mvnbase.curs21.PreJava8;

class StartWithPredicate implements ListPredicate {

    private final String prefix;

    public StartWithPredicate(String prefix) {
        this.prefix = prefix;
    }

    @Override
    public boolean applyCondition(String name) {
        return name.startsWith(prefix);
    }
}
