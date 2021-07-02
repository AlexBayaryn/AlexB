package task5.box;

import task5.SweetGift;

import static task5.box.TypeBox.*;

public class GiftInBox {
    TypeBox typeBox;
    SweetGift sweetGift;
    double totalCost;

    public GiftInBox(SweetGift sweetGift) {
        this.sweetGift = sweetGift;
        this.typeBox = completeBox();
        this.totalCost = typeBox.getCostBox() + sweetGift.getTotalSumForSweetness();
    }

    public TypeBox completeBox() {
        double wightInKilo = sweetGift.getTotalWeight() / 1000;
        if (wightInKilo <= SMALL_BOX.getMaxWeightKilogram()) {
            return SMALL_BOX;
        }
        if (wightInKilo > SMALL_BOX.getMaxWeightKilogram() && wightInKilo <= MIDDLE_BOX.getMaxWeightKilogram()) {
            return MIDDLE_BOX;
        } else {
            return BIG_BOX;
        }
    }

    @Override
    public String toString() {
        return typeBox.name() + " cost:" + typeBox.getCostBox() +
                "\n " + sweetGift +
                "\n total cost=" + String.format("%.2f", totalCost);
    }
}
