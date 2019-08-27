package ro.itschool.mvnbase.curs21.PreJava8;

class EqualPredicate implements ListPredicate {

    private final String template;

    public EqualPredicate(String template) {
        this.template = template;
    }

    @Override
    public boolean applyCondition(String name) {
        return this.template.equals(name);
    }

}
