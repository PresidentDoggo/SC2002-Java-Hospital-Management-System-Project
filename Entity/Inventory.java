package Entity;

import java.util.List;

public class Inventory {
    private List<Medicine> catalogue;

    public Inventory(List<Medicine> catalogue) {
        this.catalogue = catalogue;
    }

    public List<Medicine> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(List<Medicine> catalogue) {
        this.catalogue = catalogue;
    }

    public void addMedicine(Medicine medicine){
        catalogue.add(medicine);
    }
}
