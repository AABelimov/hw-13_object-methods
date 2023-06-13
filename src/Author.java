public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname){
        this.name = name;
        this.surname = surname;
    }

    public String getName(){
        return this.name;
    }

    public String getSurname(){
        return this.surname;
    }

    @Override
    public String toString(){
        return name + " " + surname;
    }

    @Override
    public boolean equals(Object other){
        if(this.getClass() != other.getClass()) return false;
        Author otherAuthor = (Author) other;
        return (otherAuthor.name.equals(name) && otherAuthor.surname.equals(surname));
    }

    @Override
    public int hashCode(){
        return java.util.Objects.hash(name, surname);
    }
}