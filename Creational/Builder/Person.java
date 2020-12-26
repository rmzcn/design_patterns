package Creational.Builder;

public class Person {

    private String identityNumber;
    private String name;
    private String surname;
    private Integer age;

    public String getIdentityNumber() {
        return identityNumber;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getGender() {
        return gender;
    }

    private Integer gender;

    public Person(Builder personBuilder) {
        this.identityNumber = personBuilder.identityNumber;
        this.name = personBuilder.name;
        this.surname = personBuilder.surname;
        this.age = personBuilder.age;
        this.gender = personBuilder.gender;
    }

    public static class Builder {
        private String identityNumber;
        private String name;
        private String surname;
        private Integer age;
        private Integer gender;

        public Builder() {
        }

        public Builder(String identityNumber, String name) {
            this.identityNumber = identityNumber;
            this.name = name;
        }

        public Builder identityNumber(String identityNumber) {
            this.identityNumber = identityNumber;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder surname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder gender(Integer gender) {
            this.gender = gender;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}