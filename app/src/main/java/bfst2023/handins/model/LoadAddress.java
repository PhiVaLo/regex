package bfst2023.handins.model;

public class LoadAddress {
    private String[] addressCollection;

    public void setAddress() {
        //! temporary hard-coded addresses (used for autofill) 
        addressCollection = new String[] {
                "Bjerggården 16, st. th, 2635 Ishøj",
                "Bjerggården 17, 1. tv, 2635 Ishøj",
                "Bjerggården 18, 2. th, 2635 Ishøj",
                "Rued Langgaards Vej 7, 2300 København S",
                "Vigerslev Allé 158P, Hf. Danshøj, 2500 Valby"
        };
    }

    public String[] getAddress() {
        return addressCollection;
    }

}
