import java.util.ArrayList;
import java.util.List;

public class InsuranceClaimRegistry {
    private List<Insured> insuredList;

    public InsuranceClaimRegistry() {
        insuredList = new ArrayList<>();
    }

    public void addInsured(Insured insured) {
        insuredList.add(insured);
    }

    /**
     * @return
     */
    public String getAllInsureds() {
        StringBuilder sb = new StringBuilder();
        for (Insured insured : insuredList) {
            sb.append(insured.toString()).append("\n");
        }
        return sb.toString();
    }

    /**
     * @param name
     * @return
     */
    public String searchByName(String name) {
        StringBuilder sb = new StringBuilder();
        for (Insured insured : insuredList) {
            if (insured.getFullName().equalsIgnoreCase(name)) {
                sb.append(insured.toString()).append("\n");
            }
        }
        return sb.toString();
    }
}
