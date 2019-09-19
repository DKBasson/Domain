package za.ac.cput.domain.users;

public class University {
    private String universityID, universityName, universityDisc, universityLevel;

    public University(Builder builder) {
        this.universityID = builder.universityID;
        this.universityName = builder.universityName;
        this.universityDisc = builder.universityDisc;
        this.universityLevel = builder.universityLevel;
    }

    public University(){

    }

    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public String getUniversityDisc() {
        return universityDisc;
    }

    public void setUniversityDisc(String universityDisc) {
        this.universityDisc = universityDisc;
    }

    public String getUniversityLevel() {
        return universityLevel;
    }

    public void setUniversityLevel(String universityLevel) {
        this.universityLevel = universityLevel;
    }
    public static class Builder{
        private String universityID, universityName, universityDisc, universityLevel;

        public Builder universityID(String universityID){
            this.universityID = universityID;
            return this;
        }

        public Builder universityName(String universityName){
            this.universityName = universityName;
            return this;
        }

        public Builder universityDisc(String universityDisc){
            this.universityDisc = universityDisc;
            return this;
        }

        public Builder universityLevel(String universityLevel){
            this.universityLevel = universityLevel;
            return this;
        }

        public University.Builder copy(University university){
            this.universityID = university.universityID;
            this.universityName = university.universityName;
            this.universityDisc = university.universityDisc;
            this.universityLevel = university.universityLevel;
            return this;
        }

        public University build(){
            return new University(this);
        }
    }

    @Override
    public String toString() {
        return "UniversityRepository{" +
                "universityID='" + universityID + '\'' +
                ", universityName='" + universityName + '\'' +
                ", universityDisc='" + universityDisc + '\'' +
                ", universityLevel='" + universityLevel + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof University)) return false;

        University university = (University) o;

        if (getUniversityID() != null ? !getUniversityID().equals(university.getUniversityID()) : university.getUniversityID() != null) return false;
        if (getUniversityName() != null ? !getUniversityName().equals(university.getUniversityName()) : university.getUniversityName() != null)
            return false;
        if (getUniversityDisc() != null ? !getUniversityDisc().equals(university.getUniversityDisc()) : university.getUniversityDisc() != null)
            return false;
        return getUniversityLevel() != null ? getUniversityLevel().equals(university.getUniversityLevel()) : university.getUniversityLevel() == null;
    }

    @Override
    public int hashCode() {
        int result = getUniversityID() != null ? getUniversityID().hashCode() : 0;
        result = 31 * result + (getUniversityName() != null ? getUniversityName().hashCode() : 0);
        result = 31 * result + (getUniversityDisc() != null ? getUniversityDisc().hashCode() : 0);
        result = 31 * result + (getUniversityLevel() != null ? getUniversityLevel().hashCode() : 0);
        return result;
    }
}


