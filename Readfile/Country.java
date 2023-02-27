package Readfile;

public class Country {
    private int id;
    private String acronym;
    private String name;

    public Country() {

    }

    public Country(int id, String acronym, String name) {
        this.id = id;
        this.acronym = acronym;
        this.name = name;
    }

    public Country(String[] result) {
        this.id= Integer.parseInt(result[0]);
        this.acronym= result[1];
        this.name = result[2];
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", acronym='" + acronym + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
