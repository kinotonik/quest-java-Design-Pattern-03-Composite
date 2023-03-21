import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private List<Person> descendants;

    public Person(String name) {
        this.name = name;
        this.descendants = new ArrayList<>();
    }

    public void addDescendant(Person descendant) {
        descendants.add(descendant);
    }

    @Override
    public String toString() {
/*        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" (");
        for (int i = 0; i < descendants.size(); i++) {
            sb.append(descendants.get(i).toString());
            if (i != descendants.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();*/
        StringBuilder sb = new StringBuilder();
        sb.append(name);
        sb.append(" (");
        for (Person descendant : descendants) {
            sb.append(descendant.toString());
            if (!descendant.equals(descendants.get(descendants.size() - 1))) {
                sb.append(", ");
            }
        }
        sb.append(")");
        return sb.toString();
    }

    public static void main(String[] args) {
        Person genitor = new Person("Genitor");
        Person enfant1 = new Person("Paul");
        Person enfant2 = new Person("Louise");
        Person petitFils1 = new Person("Hector");
        Person petitFils2 = new Person("Maurice");
        Person petitFille3 = new Person("Francoise");
        Person petitFille4 = new Person("Joséphine");
        enfant1.addDescendant(petitFils1);
        enfant1.addDescendant(petitFils2);
        enfant2.addDescendant(petitFille3);
        enfant2.addDescendant(petitFille4);
        genitor.addDescendant(enfant1);
        genitor.addDescendant(enfant2);
        System.out.println(genitor.toString());
        System.out.println(enfant2.toString());
    }
}
